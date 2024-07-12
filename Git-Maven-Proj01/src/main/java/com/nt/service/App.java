package com.nt.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbean.ArthematicOpration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
        ArthematicOpration ar=ctx.getBean("sum",ArthematicOpration.class);
        double sum1=ar.sumOftwoNum(40, 50);
        System.out.println(sum1);
    }
}
