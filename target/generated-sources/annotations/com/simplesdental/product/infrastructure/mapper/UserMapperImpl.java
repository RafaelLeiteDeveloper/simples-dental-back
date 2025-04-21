package com.simplesdental.product.infrastructure.mapper;

import com.simplesdental.product.domain.model.User;
import com.simplesdental.product.infrastructure.dto.UserContextOutput;
import com.simplesdental.product.infrastructure.dto.UserLoginOutput;
import com.simplesdental.product.infrastructure.dto.UserOutput;
import com.simplesdental.product.infrastructure.dto.request.UserRegisterRequest;
import com.simplesdental.product.infrastructure.dto.response.UserContextResponse;
import com.simplesdental.product.infrastructure.dto.response.UserLoginResponse;
import com.simplesdental.product.infrastructure.dto.response.UserRegisterResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-21T07:33:47-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserRegisterRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setName( request.getName() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );
        user.setRole( request.getRole() );

        return user;
    }

    @Override
    public UserOutput toOutput(User savedUser) {
        if ( savedUser == null ) {
            return null;
        }

        UserOutput userOutput = new UserOutput();

        userOutput.setId( savedUser.getId() );
        userOutput.setName( savedUser.getName() );
        userOutput.setEmail( savedUser.getEmail() );
        userOutput.setPassword( savedUser.getPassword() );
        userOutput.setRole( savedUser.getRole() );

        return userOutput;
    }

    @Override
    public UserRegisterResponse toResponse(UserOutput registerRequest) {
        if ( registerRequest == null ) {
            return null;
        }

        UserRegisterResponse userRegisterResponse = new UserRegisterResponse();

        userRegisterResponse.setId( registerRequest.getId() );
        userRegisterResponse.setName( registerRequest.getName() );
        userRegisterResponse.setEmail( registerRequest.getEmail() );
        userRegisterResponse.setRole( registerRequest.getRole() );

        return userRegisterResponse;
    }

    @Override
    public UserContextOutput toContextOutput(User user) {
        if ( user == null ) {
            return null;
        }

        UserContextOutput userContextOutput = new UserContextOutput();

        userContextOutput.setId( user.getId() );
        userContextOutput.setEmail( user.getEmail() );
        userContextOutput.setRole( user.getRole() );

        return userContextOutput;
    }

    @Override
    public UserContextResponse toContextResponse(UserContextOutput userContextOutput) {
        if ( userContextOutput == null ) {
            return null;
        }

        UserContextResponse userContextResponse = new UserContextResponse();

        userContextResponse.setId( userContextOutput.getId() );
        userContextResponse.setEmail( userContextOutput.getEmail() );
        userContextResponse.setRole( userContextOutput.getRole() );

        return userContextResponse;
    }

    @Override
    public UserLoginResponse toLoginResponse(UserLoginOutput output) {
        if ( output == null ) {
            return null;
        }

        UserLoginResponse userLoginResponse = new UserLoginResponse();

        userLoginResponse.setToken( output.getToken() );

        return userLoginResponse;
    }
}
