package org.example.orderservice;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class MyHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String resp = "Hello World!";
        exchange.sendResponseHeaders(200, resp.length());
        OutputStream os = exchange.getResponseBody();
        os.write(resp.getBytes());
        os.close();
    }
}
