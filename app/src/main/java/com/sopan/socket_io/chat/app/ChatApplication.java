package com.sopan.socket_io.chat.app;

import android.app.Application;
import android.util.Log;

import com.sopan.socket_io.chat.model.Constants;

import io.socket.client.IO;
import io.socket.client.Socket;

import java.net.URISyntaxException;

public class ChatApplication extends Application {

    private Socket mSocket; {
        try {
            Log.i("socket connecting : ", Constants.CHAT_SERVER_URL);
            mSocket = IO.socket(Constants.CHAT_SERVER_URL);
            Log.i("socket connected : ", Constants.CHAT_SERVER_URL);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public Socket getSocket() {
        return mSocket;
    }
}
