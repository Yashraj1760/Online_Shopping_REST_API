package com.app.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@NotNull(message = "User Id can't be null...")
	@NotBlank(message = "User Id cannot be blank.")
	@NotEmpty(message = "User Id cannot be empty.")
	private String userId;
	
	//@Pattern(regexp = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[&!@#%$^]){8,16}$", message = "Password must contain atleast 1 uppercase, 1 lowercase, 1 special character from[&!@#%^$] and 1 digit")
	private String password;
	
	@NotNull(message = "Please, Enter your role!")
	@NotBlank(message = "Please, Enter your role!")
	@NotEmpty(message = "Please, Enter your role!")
	private String role;
	
	
}
