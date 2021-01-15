package com.wyett.jobant.common.utils;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import org.apache.commons.lang3.StringUtils;

import java.io.*;


/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 16:01
 * @description: TODO
 */

public class SshCmdUtil {

    //字符编码默认是utf-8
    private static String DEFAULT_CHARSET ="UTF-8";
    private Connection conn;
    private Session interSession;
    private String ip;
    private String userName;
    private String userPwd;

    public SshCmdUtil(String ip, String userName, String userPwd) {
        this.ip = ip;
        this.userName = userName;
        this.userPwd = userPwd;
    }


    public SshCmdUtil() { }

    /**
     * 远程登录linux的主机
     * @return
     *      登录成功返回true，否则返回false
     */
    public Boolean login(){
        boolean flg = false;
        if(conn != null) {
            conn.close();
        }
        try {
            conn = new Connection(ip);
            conn.connect();//连接
            flg=conn.authenticateWithPassword(userName, userPwd);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flg;
    }

    public Session createSession() throws IOException {
        if (login()) {
            return conn.openSession();
        }
        return null;
    }
    /**
     * 远程执行shll脚本或者命令
     * @param cmd 即将执行的命令
     * @return 命令执行完后返回的结果值
     */
    public String execute(String cmd){
        String result="";
        try {
            if(login()){
                //打开一个会话
                Session session= conn.openSession();
                session.execCommand(cmd);
                result=processStdout(session.getStdout(), DEFAULT_CHARSET);
                //如果为得到标准输出为空，说明脚本执行出错了
                if(StringUtils.isBlank(result)){
                    result=processStdout(session.getStderr(), DEFAULT_CHARSET);
                }
                conn.close();
                session.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String executeWithSession(String cmd, Session session) throws IOException {
        session.execCommand(cmd);
        String result = processStdout(session.getStdout(), DEFAULT_CHARSET);
        //如果为得到标准输出为空，说明脚本执行出错了
        if(StringUtils.isBlank(result)){
            result=processStdout(session.getStderr(), DEFAULT_CHARSET);
        }
        return result;
    }
    /**
     * 远程执行shll脚本或者命令
     * @param cmd 即将执行的命令
     * @return 命令执行成功后返回的结果值，如果命令执行失败，返回空字符串，不是null
     */
    public String executeSuccess(String cmd){
        String result="";
        try {
            if(login()){
                Session session= conn.openSession();//打开一个会话
                session.execCommand(cmd);//执行命令
                result=processStdout(session.getStdout(), DEFAULT_CHARSET);
                conn.close();
                session.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 解析脚本执行返回的结果集
     * @param in 输入流对象
     * @param charset 编码
     * @return 以纯文本的格式返回
     */
    private String processStdout(InputStream in, String charset){
        InputStream stdout = new StreamGobbler(in);
        StringBuffer buffer = new StringBuffer();;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stdout,charset));
            String line=null;
            while((line=br.readLine()) != null){
                buffer.append(line+"\n");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    public static void setCharset(String charset) {
        DEFAULT_CHARSET = charset;
    }
    public Connection getConn() {
        return conn;
    }
    public void setConn(Connection conn) {
        this.conn = conn;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPwd() {
        return userPwd;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
