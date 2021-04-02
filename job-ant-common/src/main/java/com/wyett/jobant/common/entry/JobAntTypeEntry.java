package com.wyett.jobant.common.entry;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 14:12
 * @description: TODO
 */

public class JobAntTypeEntry implements Serializable {


    private static final long serialVersionUID = -3478591556271129342L;

    public static enum RunMode {

        /** 嵌入式 */
        EMBEDDED,
        /** 服务式 */
        SERVICE;

        public boolean isEmbedded() {
            return this.equals(RunMode.EMBEDDED);
        }

        public boolean isService() {
            return this.equals(RunMode.SERVICE);
        }
    }

    public static enum ClusterMode {

        /** 嵌入式 */
        STANDALONE,
        /** 冷备 */
        STANDBY,
        /** 热备 */
        ACTIVE;

        public boolean isStandalone() {
            return this.equals(ClusterMode.STANDALONE);
        }

        public boolean isStandby() {
            return this.equals(ClusterMode.STANDBY);
        }

        public boolean isActive() {
            return this.equals(ClusterMode.ACTIVE);
        }
    }

    public static enum HAMode {

        /** 心跳检测 */
        HEARTBEAT,
        /** otter media */
        MEDIA;

        public boolean isHeartBeat() {
            return this.equals(HAMode.HEARTBEAT);
        }

        public boolean isMedia() {
            return this.equals(HAMode.MEDIA);
        }

    }

    public static enum MetaMode {
        /** 内存存储模式 */
        MEMORY,
        /** 文件存储模式 */
        ZOOKEEPER,
        /** 混合模式，内存+文件 */
        MIXED,
        /** 本地文件存储模式 */
        LOCAL_FILE;

        public boolean isMemory() {
            return this.equals(MetaMode.MEMORY);
        }

        public boolean isZookeeper() {
            return this.equals(MetaMode.ZOOKEEPER);
        }

        public boolean isMixed() {
            return this.equals(MetaMode.MIXED);
        }

        public boolean isLocalFile() {
            return this.equals(MetaMode.LOCAL_FILE);
        }
    }

    public static enum NodeType {
        /**manager node */
        MANAGER_NODE,
        /**agent node*/
        CLIENT_NODE;

        public boolean isManager() {return this.equals(NodeType.MANAGER_NODE);}

        public boolean isAgent() {return this.equals(NodeType.CLIENT_NODE);}

    }
}
