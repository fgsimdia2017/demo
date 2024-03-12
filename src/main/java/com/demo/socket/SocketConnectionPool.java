package com.demo.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author huangfeng
 * @Date 2024/3/12 11:23
 * @description
 * @Version 1.0
 */
public class SocketConnectionPool {
    private static final String SERVER_IP = "127.0.0.1"; // C语言服务器的IP地址
    private static final int SERVER_PORT = 8080; // C语言服务器的端口号
    private static final int MAX_POOL_SIZE = 10; // 最大连接数

    private static BlockingQueue<Socket> connectionPool = new ArrayBlockingQueue<>(MAX_POOL_SIZE);

    static {
        try {
            // 初始化连接池
            for (int i = 0; i < MAX_POOL_SIZE; i++) {
                Socket socket = new Socket(SERVER_IP, SERVER_PORT);
                connectionPool.offer(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Socket getConnection() {
        Socket socket = null;
        try {
            socket = connectionPool.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return socket;
    }

    public static void releaseConnection(Socket socket) {
        if (socket != null) {
            connectionPool.offer(socket);
        }
    }
}
