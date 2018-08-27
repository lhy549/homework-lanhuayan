package com.nf.phone.test;

import com.nf.phone.dao.Dao;
import com.nf.phone.entity.Phone;

public class Main {
    public static void main(String[] args) {
        Dao dao = new Dao();
        Phone phone = dao.getPhoneById(1);
        System.out.println(phone);

    }
}
