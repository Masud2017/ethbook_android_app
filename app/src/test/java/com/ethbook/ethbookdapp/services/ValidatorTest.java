package com.ethbook.ethbookdapp.services;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    @Test
    public void testIsUsernameValid() {
        // given
        String validUsername = "forbiddne_masud";
        String invalidUsernameLeading_ = "_forbidden_masud";
        String invalidUsernameLeadingNumber = "3forbidden_masud";
        String invalidUsernameWithSpace = "forbidden masud";


        // when
        boolean validUsernameResult = Validator.isUserNameValid(validUsername);
        boolean invalidUsernameLeading_Result = Validator.isUserNameValid(invalidUsernameLeading_);
        boolean invalidUsernameLeadingNumberResult = Validator.isUserNameValid(invalidUsernameLeadingNumber);
        boolean invalidUsernameWithSpaceResult = Validator.isUserNameValid(invalidUsernameWithSpace);

        // then
        Assert.assertEquals(true,validUsernameResult);
        Assert.assertEquals(false,invalidUsernameLeading_Result);
        Assert.assertEquals(false,invalidUsernameLeadingNumberResult);
        Assert.assertEquals(false,invalidUsernameWithSpaceResult);


    }
}
