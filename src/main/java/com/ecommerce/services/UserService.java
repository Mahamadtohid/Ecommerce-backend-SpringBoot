package com.ecommerce.services;

import com.ecommerce.exceptions.UserException;
import com.ecommerce.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    public User fingUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;

}
