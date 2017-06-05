package com.zker;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.*;


public class VisitCountsListener implements ServletContextListener {

    /**
     * 容器启动时
     * @param sce
     */
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String path = context.getRealPath("/WEB-INF/temp/visit.txt");
        File file = new File(path);
        int count = 0;

        try {
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                count = Integer.valueOf(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        context.setAttribute("count", count);
    }

    /**
     * 容器关闭时
     * @param sce
     */
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String path = context.getRealPath("/WEB-INF/temp/visit.txt");
        File file = new File(path);

        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(context.getAttribute("count").toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
