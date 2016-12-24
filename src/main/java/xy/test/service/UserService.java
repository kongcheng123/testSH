package xy.test.service;

import xy.test.entity.User;

import java.util.List;

/**
 * Created by xy on 2016/12/24.
 */
public interface UserService {
    public void saveUser(User u);
    public List<String> getAllUsernames();
}
