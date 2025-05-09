package com.tms.model.dto;

import com.tms.annotation.CustomAge;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Schema(description = "RegistrationDTO")
@Component
public class RegistrationRequestDto {
    @NotNull
    @Size(min = 2, max = 20)
    private String firstname;

    @NotNull
    @Size(min = 2, max = 20)
    private String secondName;

    @CustomAge
    private Integer age;

    @Email
    private String email;
    private String sex;

    @Pattern(regexp = "[0-9]{12}")
    private String telephoneNumber;

    @NotNull
    @NotBlank
    private String login;

    @NotNull
    @NotBlank
    private String password;
}
