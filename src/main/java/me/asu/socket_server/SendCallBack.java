package me.asu.socket_server;

public interface SendCallBack {

    void onComplete(boolean suc);

    void onError(Throwable throwable);
}
