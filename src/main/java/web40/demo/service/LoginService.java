 package web40.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web40.demo.model.User;
import web40.demo.repository.LoginRepository;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public void addUser(User user){
        loginRepository.save(user);
    }

    public boolean checkLogin(User user){
        User currentUser = loginRepository.findByMailUser(user.getMailUser());
        if ( currentUser != null){
            return user.getPasswordUser().equals(currentUser.getPasswordUser()) ;
        }
        else  return false;
    }
} 