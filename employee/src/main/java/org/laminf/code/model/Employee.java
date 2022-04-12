package org.laminf.code.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String fullName;

    private String email;

    @Column(unique = true, name = "emp_no", length = 50)
    private String employeeNumber;

    @Column(name = "department_code")
    private String departmentCode;

    @Transient
    @Column(name = "department_id")
    private String departmentId;

    private boolean manager;

}
