package edu.ti.caih313.collections.dataobj;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;
import static org.junit.Assert.*;

public class EmailAddressTest {

    //These are worth 2 points each
    //TODO test that null email address is not valid
    @Test
    public void testValidateEmailAddressNull() {
        assertEquals(false, EmailAddress.validate(null));
    }

    //TODO test that a normal email address is valid
    @Test
    public void testValidateEmailAddressRegular() {
        EmailAddress email = new EmailAddress("Chumi@school.edu", EmailAddress.Type.SCHOOL);
        assertEquals("Chumi@school.edu",email.getEmailAddress());
    }

    //TODO test that missing '@' in address is not valid
    @Test
    public void testValidateEmailAddressNoAt() {
        assertEquals(false, EmailAddress.validate("chumiAtSchool.com"));
    }

    //TODO test that wrong ending of email address is not valid
    @Test
    public void testValidateEmailAddressWrongEnd() {
        assertEquals(false, EmailAddress.validate("Chumi@School"));


    }
}