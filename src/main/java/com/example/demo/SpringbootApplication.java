package com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringbootApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringbootApplication.class, args);
//    }
//
//}



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.example.demo.mapper")//使用MapperScan批量扫描所有的Mapper接口
@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}