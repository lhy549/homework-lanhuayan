package com.nf.phone.dao;

import com.nf.phone.entity.Phone;

import java.util.List;


public interface phoneDao {
    public boolean delete(int id);
    public List<Phone> getList();
    public boolean add(Phone p);
    public boolean update(Phone phone);
    public Phone getPhoneById(int id);
}
