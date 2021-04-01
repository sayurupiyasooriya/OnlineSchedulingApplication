package com.synotech.OnlineAppointmentScheduling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.synotech.OnlineAppointmentScheduling.dao.RoleRepo;
import com.synotech.OnlineAppointmentScheduling.dao.UserRepo;
import com.synotech.OnlineAppointmentScheduling.model.Role;
import com.synotech.OnlineAppointmentScheduling.model.User;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepoTests {

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private RoleRepo rrepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		
		Role role = new Role();
		role.setId(2);
		
		
		User user = new User();
		user.setEmail("snpiyasoor@gmail.com");
		user.setPassword("sd13895");
		user.setDob("1995-12-20");
		user.setAdress("paluwelgala road koswatta");
		user.setFirstName("Sayuru");
		user.setLastName("Piyasooriya");
		user.setNic("953553945V");
		user.setPhone("0777193251");
		user.setRole(role);
		
		
		
		User savedUser = repo.save(user);
		
		User existUser = entityManager.find(User.class, savedUser.getId());
		
		assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
		
		
	}
}
