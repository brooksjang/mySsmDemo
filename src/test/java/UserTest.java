import com.alibaba.fastjson.JSON;
import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config/spring-config.xml")
public class UserTest {

    private static Logger logger = Logger.getLogger(UserTest.class);

    @Autowired
    private IUserService userService;

    @Autowired
    private UserDao userDao;

    @Test
    public void selectAllByDao(){
        List<User> users = userDao.selectAll();
        for (User user : users){
            logger.error(JSON.toJSONString(user));
        }
    }

    @Test
    public void selectAllByService(){
        List<User> users = userService.selectAll();
        for (User user : users){
            logger.error(JSON.toJSONString(user));
        }
    }

    @Test
    public void selectById(){
        List<User> users = userService.selectById(2);
        for (User user : users){
            logger.error(JSON.toJSONString(user));
        }
    }

    @Test
    public void insert(){
        User user = new User();
        user.setName("郝子健");
        user.setAge(35);
        user.setBornDate(new Date());
        int i = userService.insertBySelective(user);
        logger.error("添加行数：" + i);
    }

}
