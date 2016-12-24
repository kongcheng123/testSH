package xy.test.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import xy.test.entity.User;

/**
 * Created by xy on 2016/12/24.
 */
@Repository
public class UserDao  {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(User u) {
        //System.out.println("++++++++++");
         sessionFactory.getCurrentSession().save(u);
    }
}
