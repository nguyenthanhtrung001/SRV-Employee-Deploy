package com.example.employeeservice.client;



import com.example.employeeservice.dto.request.ApiResponse;
import com.example.employeeservice.dto.request.UserCreationRequest;
import com.example.employeeservice.dto.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "identity-service", url = "https://identity-service-qq5p.onrender.com")
public interface IdentityClient {
    @PostMapping(value = "/users/registration",produces = MediaType.APPLICATION_JSON_VALUE)
    ApiResponse<UserResponse> createUser(@RequestBody UserCreationRequest request);

}
