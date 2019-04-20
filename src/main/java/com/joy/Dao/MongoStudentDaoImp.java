package com.joy.Dao;

import com.joy.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

import static com.sun.tools.internal.xjc.reader.Ring.add;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImp implements StudentDao{

//    Connection mongoConnection;
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
        {
            add(new Student(1, "mongo", "mango"));
        }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }

    @Override
    public int size() {

        return this.size();
    }
}
