package online.ceshi100.dao;

import online.ceshi100.pojo.User;
import java.util.List;

/**
 * @author jinxq2008
 * @date 2021/2/4 - 19:39
 */
public interface UserDao {

   public  List<User>  getUserList();

   public  User getUserOne();

   public  int addUser();

   public  int deleteUser();

}
