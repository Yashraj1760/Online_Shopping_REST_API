package com.app.login;

import java.time.LocalDateTime;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentUserSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer currentSessionId;
	private Integer customerId;
	private String uuid;
	private LocalDateTime dateTime;
	
	public CurrentUserSession(Integer customerId, String uuid, LocalDateTime dateTime) {
		super();
		this.customerId = customerId;
		this.uuid = uuid;
		this.dateTime = dateTime;
	}
	
}
