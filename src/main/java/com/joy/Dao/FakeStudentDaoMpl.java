package com.joy.Dao;

import com.joy.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoMpl implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Said", "Computer Science"));
                put(2, new Student(2, "Alex U", "Finance"));
                put(3, new Student(3, "Anna", "Maths"));

            }
        };
    }


    @Override
    public Collection<Student> getAllStudents()
    {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id)
    {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }


    @Override
    public void updateStudent(Student student)
    {
//        Student ss = students.get(student.getId());
//        ss.setCourse(student.getCourse());
//        ss.setName(student.getName());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudent(Student student) {
        this.students.put(student.getId(), student);
    }

    @Override
    public int size()
    {
        return this.students.size();
    }
}
