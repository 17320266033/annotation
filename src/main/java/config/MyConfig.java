package config;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean("person")
    public Person person(){
        return new Person("张兵","18","天津大学");
    }
}
/*
* 组件注册
* 使用Spring 首先在 xml文件里面导入 Spring Context需要的依赖  -- 这就显示了使用maven 的作用
*
* 以前方法： 写一个配置文件（beans.xml）   ：
*           使用Bean标签的方式 注册组件   <bean id = "person", class = "D:\java\IntelIDEA-Project\annotation\src\main\java\bean\Person.java">
                                            <property name="name" value="Spring">
                                        </bean>



  现在方法： 使用注解式开发   写一个配置类（等同于以前的配置文件）
                                     在配置类上方 加 ：  @Configuration  告诉Spring这是一个配置类
                            注册组件：  用 @Bean 给容器中注册一个Bean  类型为返回值的类型  id 默认为方法名作为id
                                       写一个方法 让这个方法返回为 IOC 引用的对象


    引用IOC容器内容：

           以前方法：       ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("beans.xml");
                           Person person1 = applicationContext1.getBean("person");
                           *
           注解式：         ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
                           Person person = applicationContext.getBean(Person.class);
                           System.out.println(person);

* */