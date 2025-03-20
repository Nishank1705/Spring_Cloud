package com.example.funtions.web.funtions;

import com.example.funtions.payload.RequestData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class WebFuntions {

    @Bean
    public Supplier<String> sayHello() {
        return () -> {

            return "Hello, I am Pappu!";
        };
    }

    @Bean
    public Consumer<RequestData> inputData()
    {
        return (inputData)->{

            //processing..
            System.out.println(inputData.getName());
            System.out.println(inputData.getContact());
        };
    }

    @Bean
    public Function<RequestData,String> submitData(){
        return (inputData)->{
            return "Data Submitted "+inputData.getName();
        };
    }
}