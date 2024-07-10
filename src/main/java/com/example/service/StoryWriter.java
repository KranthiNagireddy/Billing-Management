package com.example.service;
   import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.context.annotation.Primary;
    import org.springframework.stereotype.Service;
    import com.example.repository.Iwriter;
@Service

public class StoryWriter implements Iwriter
{
    public void msg()
    {
        System.out.println("Story telling");
    }
}