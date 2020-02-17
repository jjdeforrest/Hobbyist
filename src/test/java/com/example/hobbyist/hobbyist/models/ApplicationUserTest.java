package com.example.hobbyist.hobbyist.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationUserTest {


    ApplicationUser applicationUser;

    @BeforeEach
    public void setUp() throws Exception {
        applicationUser = new ApplicationUser("TestName", "TestArtist", "hello", "example.com");
    }

    @Test
    public void getlastname() {

        assertEquals("TestName", applicationUser.lastName);
    }

    @Test
    public void getfirstname()
    {
        assertEquals("TestArtist", applicationUser.firstName);
    }

    @Test
    public void getusername() {
        assertEquals("hello", applicationUser.username);
    }


    @Test
    public void getpassword() {

        assertEquals("example.com", applicationUser.password);
    }


}