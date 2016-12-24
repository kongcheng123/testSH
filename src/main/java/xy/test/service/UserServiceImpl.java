package xy.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xy.test.dao.UserDao;
import xy.test.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xy on 2016/12/24.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<String> getAllUsernames(){
        List<String> users = new ArrayList<String>();
        users.add("MarK");
        users.add("Ken");
        users.add("Fowafolo");
        return users;
    }
    public void saveUser(User u){
        //System.out.println("--------");
        userDao.save(u);

    }
}
