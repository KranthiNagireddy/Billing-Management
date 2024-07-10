package com.example.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.repository.Iwriter;
import com.example.service.Magazine;
//import com.example.service.MagazWriter;
import com.example.service.StoryWriter;
 
public class Demo1Application {
    public static void main(String[] args) {
         AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext (Config.class);
         //StoryWriter sw1 =(StoryWriter) ctx.getBean(StoryWriter.class); 
         Iwriter sw =(Iwriter ) ctx.getBean(Iwriter.class); 
         sw.msg();
         //sw1.msg();
         ctx.close(); 
    }
}