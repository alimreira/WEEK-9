package com.feyi.roadtransport.service;

import com.feyi.roadtransport.Dto.UserDto;
import com.feyi.roadtransport.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(UserDto user);

    String deleteUserByEmail(String email);

    User getUserByEmail(String email);

    User getUserById(Long Id);

    List<User> getAllUsers();

    User EditUser(Long Id, UserDto userDto);

    User loginUser(User user);


}
