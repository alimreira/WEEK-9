package com.feyi.roadtransport.service.serviceImpl;

import com.feyi.roadtransport.Dto.UserDto;
import com.feyi.roadtransport.model.User;
import com.feyi.roadtransport.repositories.BookingRepository;
import com.feyi.roadtransport.repositories.UserRepository;
import com.feyi.roadtransport.service.BookingService;
import com.feyi.roadtransport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//public class BookingServiceImpl implements BookingService {
//
//
//    private final BookingRepository bookingRepository;
//
//        @Autowired
//        public UserServiceImpl(UserRepository userRepository) {
//            this.userRepository = userRepository; //I initialised the userRepo class
//        }
//
//
//        @Override
//        public void saveUser(User user) {
//
//            userRepository.save(user);
//            System.out.println("Saved Successfully!!");
//        }
//
//        @Override
//        public void deleteUserByEmail(String email) {
//            User user = userRepository.findUserByEmail(email).orElse(null);
//            if (user == null) {
//                System.out.println("User email is invalid");
//            } else {
//                user.setDeleted(true);
//                user.setId(user.getId());
//                userRepository.save(user);
//                System.out.println("User has been successfully deleted");
//            }
//        }
//
//        @Override
//        public User getUserByEmail(String email) {
//            User user = userRepository.findUserByEmail(email).orElse(null);
//            if (user == null) {
//                System.out.println("Invalid user");
//            } else {
//                System.out.println("User found");
//            }
//            return user;
//        }

//        @Override
//        public User getUserById(Long Id) {
//            User user = userRepository.findUserById(Id).orElse(null);
//            if (user == null) {
//                System.out.println("Invalid user");
//            } else {
//                System.out.println("User found");
//            }
//            return user;
//        }
//
//        @Override
//        public List<User> getAllUsers() {
//            List<User> all = userRepository.findAll();
//            if (all.isEmpty()) {
//                System.out.println("No user in database");
//            } else {
//                System.out.println("Successfully retrieved all user");
//            }
//            return all;
//        }
//
//        @Override
//        public void EditUser(Long Id, UserDto userDto) {
//            User user = userRepository.findUserById(Id).orElse(null);
//            if (user == null) {
//                System.out.println("No such user exist");
//            } else {
//                System.out.println("Proceed to edit user");
//                user.setId(user.getId());
//                user.setNextOfKin(userDto.getNextOfKin());
//                user.setName(userDto.getName());
//                user.setNextOfKinMobile(userDto.getNextOfKinMobile());
//                user.setMobile(userDto.getMobile());
//                user.setNextOfKinAddress(userDto.getNextOfKinAddress());
//                userRepository.save(user);
//                System.out.println("User successfully edited");
//            }
//        }
//
//        @Override
//        public User loginUser(User user) {
//
//            User user1 = userRepository.findUserByEmail(user.getEmail()).orElse(null);
//            if(user1.getEmail() == user.getEmail() && user.getPassword() ==user1.getPassword()){
//                System.out.println("User successfully validated");
//            }else{
//                System.out.println("Incorrect user email or password");
//            }
//            return user1;
//        }
//    }
//
//}
