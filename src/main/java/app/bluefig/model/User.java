package app.bluefig.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String id;
    private String username;
    private String firstname;
    private String lastname;
    private String fathername;
    private String email;
    private String passwordHash;
    private String roleId;
    private LocalDate birthday;
    private String sex;
}
