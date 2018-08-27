package com.nf.phone.dao;

import com.nf.phone.entity.Phone;

import java.util.*;


public class Dao implements phoneDao {
    private static List<Phone> phones = new ArrayList<>();

    static {
        Phone p1 = new Phone(1, "vivo X9", 2999, 5.0, "前后拍照2000万像素", "北京", "中国移动官方旗舰店");
        Phone p2 =new Phone(2,"诺基亚",3599,5.5,"全方面高清四摄游戏手机","上海","诺基亚官方旗舰店");
        Phone p3 =new Phone(3,"OPPO",3599,5.5,"性价比高，运行流畅","北京","OPPO官方旗舰店");
        Phone p4 =new Phone(4,"三星",3599,5.5,"手感舒适，外观漂亮","郑州","三星官方旗舰店");
        Phone p5 =new Phone(5,"魅族",3599,5.5,"彩色1600万像素+黑白2400万像素","北京","魅族官方旗舰店");
        Phone p6 =new Phone(6,"中兴",3599,5.5,"前后拍照2000万像素","湖南","苏宁易购官方旗舰店");
        Phone p7 =new Phone(7,"美图",3599,5.5,"智能手机，拍照手机+快充手机","北京","美图官方旗舰店");
        Phone p8 =new Phone(8,"小米",3999,5.5,"不可拆卸式电池","广东","小米官方旗舰店");

        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        phones.add(p4);
        phones.add(p5);
        phones.add(p6);
        phones.add(p7);
        phones.add(p8);

    }
    @Override
    public boolean delete(int id) {
        for (Phone p:phones) {
            if (p.getId() == id) {
                phones.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Phone> getList() { return phones; }

    @Override
    public boolean add(Phone p) {
        if(phones.add(p)){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Phone p) {
        for (Phone phone: phones) {
            if(phone.getId()==p.getId()){
                phone.setBrand(p.getBrand());
                phone.setPrice(p.getPrice());
                phone.setInfo(p.getInfo());
                phone.setAddress(p.getAddress());
                phone.setSize(p.getSize());
                phone.setStore(p.getStore());
                return true;
            }
        }
        return false;
    }

    @Override
    public Phone getPhoneById(int id) {
        for (Phone phone:phones) {
            if(phone.getId()==id){
                return phone;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Dao dao = new Dao();
        Phone phone = dao.getPhoneById(1);
        System.out.println(phone);
    }
}
