package com.core.banking.core.service.internetbankingcoreservice.service;

import com.core.banking.core.service.internetbankingcoreservice.model.dto.User;
import com.core.banking.core.service.internetbankingcoreservice.model.entity.UserEntity;
import com.core.banking.core.service.internetbankingcoreservice.model.mapper.UserMapper;
import com.core.banking.core.service.internetbankingcoreservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserMapper userMapper = new UserMapper();

    private final UserRepository userRepository;

    public User readUser(String identification) {
        UserEntity userEntity = userRepository.findByIdentificationNumber(identification).get();
        return userMapper.convertToDto(userEntity);
    }

    public List<User> readUsers(Pageable pageable) {
        return userMapper.convertToDtoList(userRepository.findAll(pageable).getContent());
    }
}
