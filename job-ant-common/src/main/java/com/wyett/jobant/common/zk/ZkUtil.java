package com.wyett.jobant.common.zk;

import com.wyett.jobant.common.log.JobAntLog;
import com.wyett.jobant.common.log.JobAntLogFactory;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 16:10
 * @description: zookeeper utils
 */

public class ZkUtil implements Watcher {
    private final static JobAntLog log = JobAntLogFactory.getLog(ZkUtil.class);

    private ZooKeeper zooKeeper;

    protected CountDownLatch countDownLatch = new CountDownLatch(1);

    public void connectByAuth(String hosts, String user, String pwd,
                              int sessiontime) throws IOException, InterruptedException {
        zooKeeper = new ZooKeeper(hosts, sessiontime, this);
        zooKeeper.addAuthInfo("digest", (user + ":" + pwd).getBytes());
        countDownLatch.await();
    }

    public void connect(String hosts, int sessiontime) throws IOException,
            InterruptedException {
        zooKeeper = new ZooKeeper(hosts, sessiontime, this);
        countDownLatch.await();
    }

    /**
     * 创建持久态的znode,比支持多层创建.比如在创建/parent/child的情况下,无/parent.无法通过.
     *
     * @param path
     * @param data
     * @throws InterruptedException
     * @throws KeeperException
     */
    public void create(String path, byte[] data) throws KeeperException,
            InterruptedException {
        this.zooKeeper.create(path, data, ZooDefs.Ids.CREATOR_ALL_ACL,
                CreateMode.PERSISTENT/* 此处创建的为持久态的节点,可为瞬态 */);
    }

    public void createByIds(String path, byte[] data, List<ACL> acls,
                            CreateMode mode) throws KeeperException, InterruptedException {
        this.zooKeeper.create(path, data, acls, mode);

    }

    public void setACL(String path,  List<ACL> acls, int version) throws KeeperException, InterruptedException{
        this.zooKeeper.setACL(path, acls, version);
    }


    /**
     * 获取节点的子节点信息
     *
     * @param path
     * @throws KeeperException
     * @throws InterruptedException
     */
    public void getChild(String path) throws KeeperException,
            InterruptedException {
        try {
            List<String> children = this.zooKeeper.getChildren(path, false);
            if (children.isEmpty()) {
                log.info("zk [" + path +"] not node.");
                return;
            } else {
                log.info("zk [" + path +"] node.");
                for (String child : children) {
                    System.out.println(child);
                }
            }
        } catch (KeeperException.NoNodeException e) {
            log.error("zk [" + path + "] NoNodeException.");
            throw e;
        }
    }

    public byte[] getData(String path) throws KeeperException,
            InterruptedException {
        return this.zooKeeper.getData(path, false, null);
    }

    public List<ACL> getAcl(String path) throws KeeperException,
            InterruptedException {
        return this.zooKeeper.getACL(path, new Stat());
    }

    @Override
    public void process(WatchedEvent event) {
        if (event.getState() == Watcher.Event.KeeperState.SyncConnected) {
            countDownLatch.countDown();
        }
    }

    public void close() throws InterruptedException {
        zooKeeper.close();
    }
}
