package com.joy.Service;

import com.joy.Dao.StudentDao;
import com.joy.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fakeData")
    //@Qualifier("mongoData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents()
    {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id)
    {
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id)
    {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student)
    {

        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    public int size()
    {
        return studentDao.size();
    }
}
