import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;

@Entity
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    private String projectname;

    @Enumerated(EnumType.STRING)
    private String Area_area;


    @ManyToOne
    @Column(name =" managedDepartment")
    private Department department;
}
