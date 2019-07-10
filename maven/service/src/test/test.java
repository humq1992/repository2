import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void findbyid(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("application-service.xml");

        ItemsService itemService = ac.getBean("itemsServiceImpl", ItemsService.class);
        Items item = itemService.findItems(1);
        System.out.println(item);
    }
}
