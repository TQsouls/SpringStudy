import com.tq.pojo.Hello;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring 上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //我们的对象都在Spring中管理了，我们要用直接取出来就好了
        Hello hello = (Hello) context.getBean("Hello");
        hello.toString();
        System.out.println(hello);
    }
}
