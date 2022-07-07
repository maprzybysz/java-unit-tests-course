package pl.mprzybysz.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
     void newAccountShouldNotBeActiveAfterCreation(){
        //given and when
        Account newAccount = new Account();
        assertFalse(newAccount.isActive(), "Check if new account is not active");
    }
    @Test
    void accountShouldBeActiveAfterActivation(){
        //given
        Account newAccount = new Account();

        //when
        newAccount.activate();

        //then
        assertTrue(newAccount.isActive());
    }

    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAddressSet(){
        //given
        Account account = new Account();
        //when
        Address address = account.getDefaultDeliveryAddress();
        //then
        assertNull(address);
    }

    @Test
    void defaultDeliveryAddressShouldNotBeNullAfterBeingSet(){
        //given
        Address address = new Address("Ulica", "55c");
        Account account = new Account();
        account.setDefaultDeliveryAddress(address);

        //when
        Address defaultAddress = account.getDefaultDeliveryAddress();

        //then
        assertNotNull(defaultAddress);
    }
}
