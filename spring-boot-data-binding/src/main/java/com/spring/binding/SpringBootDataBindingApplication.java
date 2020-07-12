package com.spring.binding;


import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.DataBinder;

@SpringBootApplication
public class SpringBootDataBindingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataBindingApplication.class, args);

//		MutablePropertyValues mpv = new MutablePropertyValues();
//		mpv.add("anInt", "10");
//
//		TestBean testBean = new TestBean();
//		DataBinder db = new DataBinder(testBean);
//
//		db.bind(mpv);
//		System.out.println(testBean);


//		MutablePropertyValues mpv = new MutablePropertyValues();
//        mpv.add("anInt", "10x"); // 10x cannot be converted to int type
//
//        TestBean testBean = new TestBean();
//        DataBinder db = new DataBinder(testBean);
//
//        db.bind(mpv);
//        db.getBindingResult().getAllErrors().stream().forEach(System.out::println);
//        System.out.println(testBean);
        

		MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("aString", "SomeString");
        mpv.add("anInt", "10x");

        BeanWrapper bw =  new BeanWrapperImpl(new TestBean());
        bw.setPropertyValues(mpv);
        System.out.println(bw.getWrappedInstance());

	
	}
	
}
