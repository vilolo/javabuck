package com.example.ws;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

import java.time.LocalDateTime;

public class WebSocketHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    @Override
    protected void messageReceived(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress() + ": " + msg.text());
        ctx.channel().writeAndFlush(new TextWebSocketFrame("来自服务端: " + LocalDateTime.now()));
//        while (true){
//            Thread.sleep(5000);
//            ctx.channel().writeAndFlush(new TextWebSocketFrame("10"));
//        }
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        ctx.fireChannelRegistered();
        Thread.sleep(2000);

        MyThread myThread1 = new MyThread();
        myThread1.ctx = ctx;
        myThread1.start();
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("ChannelId" + ctx.channel().id().asLongText());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        System.out.println("用户下线: " + ctx.channel().id().asLongText());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.channel().close();
    }
}

class MyThread extends Thread {

    public ChannelHandlerContext ctx;

    @Override
    public void run() {
        while (true){
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ctx.channel().writeAndFlush(new TextWebSocketFrame("10"));
        }
    }
}
