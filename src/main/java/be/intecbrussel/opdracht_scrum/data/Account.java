package be.intecbrussel.opdracht_scrum.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  //  @Column(nullable = false)
    private String firstName;
 //   @Column(unique = true, updatable = false)
    private String userName;
  //  @Column(nullable = true)
    private String lastName;
 //   @Column(nullable = false, unique = true)
    private String email;
 //   @Column(nullable = false, length = 2500)
    private String password;
    private String street;
    private int houseN;
    private String city;
    private Long zipCode;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,  orphanRemoval = true)
    private List<Post> posts = new ArrayList<>();


}
