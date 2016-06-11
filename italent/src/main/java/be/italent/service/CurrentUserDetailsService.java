package be.italent.service;

import be.italent.model.CurrentUser;
import be.italent.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Autowired
    public CurrentUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Retrieves the {@link CurrentUser} by its username
     *
     * @param username a {@link String} with the wanted user's username
     * @return the requested {@link CurrentUser}
     * @throws UsernameNotFoundException when username is not found
     */
    public CurrentUser loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(username);
        return new CurrentUser(user);
    }
}
