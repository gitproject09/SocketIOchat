package com.sopan.socket_io.chat.model;

/**
 * Created by Sopan on 1/17/2018.
 */

public class JoinRoom {
    private long userId;
    private long roomId;

    private String userName;
    private String roomName;

    private JoinRoom() {}

    public long getUserId() {return userId;};

    public long getRoomId() { return roomId;};

    public String getUserName() {
        return userName;
    };

    public String getRoomName() {
        return roomName;
    };

    public static class Builder {
        private long userId;
        private long roomId;
        private String userName;
        private String roomName;

        public Builder(long roomId) {
            this.roomId = roomId;
        }

        public JoinRoom.Builder username(String username) {
            this.userName = username;
            return this;
        }

        public JoinRoom.Builder userId(long userId) {
            this.userId = userId;
            return this;
        }

        public JoinRoom.Builder roomName(String roomName) {
            this.roomName = roomName;
            return this;
        }

        public JoinRoom build() {
            JoinRoom roomJoin = new JoinRoom();
            roomJoin.userId = userId;
            roomJoin.roomId = roomId;
            roomJoin.userName = userName;
            roomJoin.roomName = roomName;
            return roomJoin;
        }
    }
}
