package com.tiger.freecode.designpattern.blackhorse.factory.factory_method;

/**
 * @version v1.0
 * @ClassName: CoffeeFactory
 * @Description: CoffeeFactory ： 抽象工厂
 * @Author: 黑马程序员
 */
public interface CoffeeFactory {

    //创建咖啡对象的方法
    Coffee createCoffee();
}
