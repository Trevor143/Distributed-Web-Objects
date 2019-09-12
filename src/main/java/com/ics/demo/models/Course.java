package com.ics.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "student_courses",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )

    private Set<Student> students = new HashSet<>();

    private Course(){ }

    public Course(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
