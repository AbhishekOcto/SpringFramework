package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") //prototype scope results in the creation of a new bean instance
// every time a request for the bean is made by application code.

public class Employee {
    /* @Component: It is a class-level annotation. It is used to mark a Java class as a bean.
     A Java class annotated with @Component is found during the classpath.
     The Spring Framework pick it up and configure it in the application context as a Spring Bean.*/
    private int id;
    private String name;
    private String tech;
    @Autowired //searches by type
    @Qualifier("lap1") //searches by name
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Employee() {
        super();
        System.out.println("he is employee");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show(){ //here we want to call laptop
        System.out.println("in show");
        laptop.compile();
    }
}
