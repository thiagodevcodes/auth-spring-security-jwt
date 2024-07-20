// package com.sos.auth.auth_sos.config;

// import java.util.Set;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// import com.sos.auth.auth_sos.models.Role;
// import com.sos.auth.auth_sos.models.User;
// import com.sos.auth.auth_sos.repository.RoleRepository;
// import com.sos.auth.auth_sos.repository.UserRepository;

// import jakarta.transaction.Transactional;

// @Configuration
// public class AdminUserConfig implements CommandLineRunner {
    
//     @Autowired
//     private RoleRepository roleRepository;

//     @Autowired
//     private UserRepository userRepository;

//     @Autowired
//     private BCryptPasswordEncoder passwordEncoder;

//     @Override
//     @Transactional
//     public void run(String... args) throws Exception {
//         var roleAdmin = roleRepository.findByName(Role.Values.ADMIN.name());
//         System.out.println(Role.Values.ADMIN.name());
//         var userAdmin = userRepository.findByUsername("admin");

//         if(userAdmin != null) {
//             userAdmin.ifPresentOrElse(
//                 (user) -> {
//                     System.out.println("Admin já existe");
//                 },
//                 () -> {
//                     var user = new User();
//                     user.setUsername("admin");
//                     user.setPassword(passwordEncoder.encode("123"));
//                     user.setRoles(Set.of(roleAdmin));
//                     userRepository.save(user);
//                 });
//         }

//     }
// }
