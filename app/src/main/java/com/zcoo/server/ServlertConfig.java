package com.zcoo.server;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.zcoo.servlet.AppServlet;

public class ServlertConfig {

    public static void config(ServletContextHandler handler) {
        //handler.addServlet(new ServletHolder(new CategoryServlet()), "/category");
        //handler.addServlet(new ServletHolder(new ImageServlet()), "/image");
       // handler.addServlet(new ServletHolder(new RecommendServlet()), "/recommend");
//        handler.addServlet(new ServletHolder(new SubjectServlet()), "/subject");
//        handler.addServlet(new ServletHolder(new DetailServlet()), "/detail");
//        handler.addServlet(new ServletHolder(new HomeServlet()), "/home");
        handler.addServlet(new ServletHolder(new AppServlet()), "/app");
//        handler.addServlet(new ServletHolder(new GameServlet()), "/game");
//        handler.addServlet(new ServletHolder(new DownloadServlet()), "/download");
//        handler.addServlet(new ServletHolder(new UserServlet()), "/user");
//        handler.addServlet(new ServletHolder(new HotServlet()), "/hot");
    }
}
