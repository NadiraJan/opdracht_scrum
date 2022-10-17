package be.intecbrussel.opdracht_scrum.services;

import be.intecbrussel.opdracht_scrum.repositories.AccountRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Optional<User> findByEmail(String email){
        return accountRepository.findOneByEmail(email);
    }


}
