package com.syntax.homework1906;
/*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
 Create a subclass  userInfo that will have user address variable and it also
  being initialized through constructor call. Print users name, mobile number
  and address in userDetails method. Test your code.
*/

public class User {
    String name;
    String mobileNumber;

    User(String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

}
class UserInfo extends User {
    UserInfo(String name, String mobileNumber){
        super(name, mobileNumber);
    }
    public void userDetail(){
        System.out.println(name+ " "+mobileNumber);
    }

}
