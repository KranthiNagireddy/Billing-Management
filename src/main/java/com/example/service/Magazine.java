package com.example.service;

import com.example.repository.Iwriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.example.repository.Iwriter;
@Service
@Primary
public class Magazine implements Iwriter {

	@Override
	public void msg()
    {
        System.out.println("Magazine Writing");
    }

}
