package dev.east0.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(exclude = {"courses,department"})
@Entity
@ToString(exclude = {"courses,department"})
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String professorName;

    // ----------------------------
    //  Single-Valued Association
    // -----------------------------
    @ManyToOne
    @JoinColumn(name = "departmentId")
    Department department;


    /* *********************************
     *    Collection-Valued Association
     *********************************** */
    @JsonIgnore
    @OneToMany(mappedBy = "professor")
    List<Course> courses;
}
