import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testfind(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItemsDao itemsDao = ac.getBean("itemsDao", ItemsDao.class);
        Items item = itemsDao.findItems(1);
        System.out.println(item);
    }
}
