package com.demo.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @Author huangfeng
 * @Date 2024/3/12 11:11
 * @description
 * @Version 1.0
 */
public class CommunicationDemo {
    private static final String SERVER_IP = "127.0.0.1"; // C语言服务器的IP地址
    private static final int SERVER_PORT = 8080; // C语言服务器的端口号

    public static void main(String[] args) {
        try {
            // 创建与C语言服务器的Socket连接
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            // 构建协议头数据
            byte protocolFlag = (byte) 170; // 协议标识
            int messageLength = calculateMessageLength(); // 消息长度
            int dataChecksum = calculateDataChecksum(); // 数据校验
            int messageType = 1; // 消息类型
            int messageIdentifier = 2; // 消息标识
            int reservedField = 0; // 保留字段

            // 发送协议头数据
            outputStream.writeByte(protocolFlag);
            outputStream.writeInt(messageLength);
            outputStream.writeShort(dataChecksum);
            outputStream.writeInt(messageType);
            outputStream.writeInt(messageIdentifier);
            outputStream.writeInt(reservedField);
            outputStream.flush();

            // 接收C语言服务器的响应
            byte[] responseData = new byte[1024];
            int bytesRead = inputStream.read(responseData);
            if (bytesRead > 0) {
                // 处理C语言服务器的响应数据
                // ...
            }

            // 关闭连接
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int calculateMessageLength() {
        // 根据实际情况计算消息头和消息体的总长度
        // ...
        return 0;
    }

    private static int calculateDataChecksum() {
        // 根据实际情况计算消息体的校验值
        // ...
        return 0;
    }
}
