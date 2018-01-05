package com.li;

@Monitorable
public class NaiveWaiter implements Waiter {
    public void greetTo(String clientName) {
        System.out.println("NaiveWaiter:greet to " + clientName + "...");
    }

    public void serveTo(String clientName) {
        System.out.println("NaiveWaiter:serving " + clientName + "...");
    }

    public void smile(String clientName, int times) {
        System.out.println("NaiveWaiter:smile to  " + clientName + times + "times...");
    }

    //    测试@annotation注解参数绑定
    @Animal(value = 10, name = "dog")
    public void atAnimal(String name) {
        System.out.println("NaiveWaiter#atAnimal:name:  " + name);
    }

}
