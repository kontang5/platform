package me.kontango.platform.domain;

import me.kontango.platform.domain.user.User;
import me.kontango.platform.domain.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void shouldSaveAndLoadUser() {
        User user = new User();
        user.setName("John Doe");

        userRepository.save(user);

        List<User> users = new ArrayList<>(userRepository.findAll());
        assertThat(users).isNotEmpty();
        assertThat(users.get(0).getName()).isEqualTo("John Doe");
    }
}
