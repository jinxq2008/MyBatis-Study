package online.ceshi100.dao;

import online.ceshi100.pojo.User;
import online.ceshi100.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author jinxq2008
 * @date 2021/2/4 - 20:27
 */
public class MyBatisTest {

    @Test
    public void test01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
//        System.out.println(userList);
        sqlSession.close();
    }
}
