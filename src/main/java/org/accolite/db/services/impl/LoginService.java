package org.accolite.db.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.accolite.db.entities.Login;
import org.accolite.db.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Slf4j
@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepo;
    public Login getLoginRecordFromDb(String emailFromClient) {
        Optional<Login> loginRecordFromDbObj = Optional.ofNullable(loginRepo.findByEmail(emailFromClient));
        return loginRecordFromDbObj.orElse(null);
    }

    public String getEmail(long id){
        Optional<Login> loginFromDbObj = loginRepo.findByEmpId(id);
        if (loginFromDbObj.isPresent()) {
            Login loginFromDb = loginFromDbObj.get();
            return loginFromDb.getEmail();
        }
        else {
            log.info("This employee is not related to any Login");
            return null;
        }
    }
}
