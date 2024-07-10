package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.Iwriter;
@Service
public class WriterService {
    @Autowired            // To initialize the Instance Variable
    Iwriter wrtr;        // Loose Coupling
    
    public void setWrtr(Iwriter wrtr) 
    {
        this.wrtr = wrtr;
    }
    
    public Iwriter getWrtr() {
        return wrtr;
    } 
}