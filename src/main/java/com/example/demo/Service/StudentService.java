package com.example.demo.Service;

import java.util.*;

import org.springframework.stereotype.Service;
import com.example.demo.Entity.Studentity;

@Service
public class StudentServiceImpl implements StudentService {

    private final Map<Long, StudentEntity> store = new HashMap<>();

    @Override
    public Studentity insertStudentity(StudentEntity st) {
        store.put(st.getId(), st);
        return st;
    }

    @Override
    public List<StudentEntity> getAllStudentity() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<StudentEntity> getOneStudent(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void deleteStudent(Long id) {
        store.remove(id);
    }
}