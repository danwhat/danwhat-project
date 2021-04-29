package com.danwhat.projeto.service;

import com.danwhat.projeto.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
}
