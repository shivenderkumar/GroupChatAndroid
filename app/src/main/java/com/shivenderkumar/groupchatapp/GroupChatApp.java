package com.shivenderkumar.groupchatapp;

import android.app.Application;

import com.github.nkzawa.engineio.client.transports.WebSocket;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class GroupChatApp extends Application {

    private WebSocket mSocket;
    {
        try {
            IO.Options opt = new IO.Options();
            opt.hostname = "192.168.0.112";
            opt.port = 8080;
            opt.path = "/GroupChat/chat";

            mSocket = new WebSocket(opt);
            mSocket.open();

           // mSocket = IO.socket(Constants.CHAT_SERVER_URL);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public WebSocket getSocket() {
        return mSocket;
    }

}
