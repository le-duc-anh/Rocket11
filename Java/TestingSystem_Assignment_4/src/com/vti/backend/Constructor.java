package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import java.time.LocalDate;

public class Constructor {
    //  Question 1:
    //  Tạo constructor cho department:
    //  a) không có parameters
    //  b) Có 1 parameter là nameDepartment và default id của
    //  Department = 0
    //  Khởi tạo 1 Object với mỗi constructor ở trên

    public void Q1() {
        Department department = new Department();
        Department department1 = new Department("Sale");

        System.out.println(department);
        System.out.println(department1);
    }

    //  Question 2:
    //  Tạo constructor cho Account:
    //  a) Không có parameters
    //  b) Có các parameter là id, Email, Username, FirstName,
    //  LastName (với FullName = FirstName + LastName)
    //  c) Có các parameter là id, Email, Username, FirstName,
    //  LastName (với FullName = FirstName + LastName) và
    //  Position của User, default createDate = now
    //  d) Có các parameter là id, Email, Username, FirstName,
    //  LastName (với FullName = FirstName + LastName) và
    //  Position của User, createDate
    //  Khởi tạo 1 Object với mỗi constructor ở trên
    public void Q2() {
        Account account = new Account();
        System.out.println(account);
        Account account1 = new Account(1, "ducanh2606@gmail.com", "ducanh2606", "Lê Đức Anh", "Anh");
        System.out.println(account1);

        Position position1 = new Position(1, "Sale");
        Position position2 = new Position(2, "Marketing");
        Account account2 = new Account(2, "ducanh260601@gmail.com", "ducanh26601", "Lê Đức Anh", "Anh", position1);
        System.out.println(account2);

        Account account3 = new Account(3, "ducanh26062001@gmail.com", "ducanh26062001", "Lê Đức Anh", "Anh", position2,
                LocalDate.parse("2021-04-17"));
        System.out.println(account3);
    }
    // Question 3:
    // Tạo constructor cho Group:
    // a) không có parameters
    // b) Có các parameter là GroupName, Creator, array Account[]
    // accounts, CreateDate
    // c) Có các parameter là GroupName, Creator, array String[]
    // usernames , CreateDate
    // Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
    // username, các thông tin còn lại = null).
    // Khởi tạo 1 Object với mỗi constructor ở trên

    public void Q3() {
        // a
        Group group = new Group();
        System.out.println(group);

        // b
        Account creator = new Account(1, "dang1@gmail.com", "dangblack1", "Nguyễn Hải", "Đăng1");
        Account account2 = new Account(2, "dang2@gmail.com", "dangblack2", "Nguyễn Hải", "Đăng2");
        Account account3 = new Account(3, "dang3@gmail.com", "dangblack3", "Nguyễn Hải", "Đăng3");
        Account[] accounts = {creator, account2, account3};
        Group group1 = new Group(1, "Sale", creator, accounts, LocalDate.parse("2020-05-15"));
        System.out.println(group1);

        // c
        String[] usernames = {"dangblack1", "dangblack2", "dangblack3"};
        System.out.println(group1);
        Group group2 = new Group(2, "Boss of Director", creator, usernames, LocalDate.parse("2020-05-15"));
        System.out.println(group2);

    }

}
