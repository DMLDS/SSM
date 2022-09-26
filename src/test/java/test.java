import com.pojo.books;
import com.service.bookserviceimpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("application.xml");
        bookserviceimpl bookservice = Context.getBean("bookservice", bookserviceimpl.class);
        for (books books : bookservice.queryall()) {
            System.out.println(books);
        }


    }
}
