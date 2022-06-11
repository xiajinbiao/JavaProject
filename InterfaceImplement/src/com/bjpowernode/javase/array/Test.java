package com.bjpowernode.javase.array;

public class Test {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("您输入的格式有误，请重新输入! 例如：zhangsan 123");
            System.exit(0);
        }
        if (!("admin".equals(args[0])) || !("12345".equals(args[1]))){
            System.out.println("您输入的账号或密码有误，请重新输入!");
            System.exit(0);
        }
        HotelSystem hotelSystem = new HotelSystem(new Room[3][15]);
        hotelSystem.generateHotel();
//        hotelSystem.checkWholeRooms();
        hotelSystem.booking(3, 9);
        hotelSystem.booking(2, 9);
        hotelSystem.booking(1, 9);
        hotelSystem.booking(2, 5);
        hotelSystem.booking(3, 15);
        hotelSystem.checkSingleRoom(3, 9);
//        hotelSystem.booking(3, 9);
//        hotelSystem.checkSingleRoom(3, 9);

        hotelSystem.checkOut(3, 9);
        hotelSystem.checkSingleRoom(3, 9);
//        hotelSystem.checkOut(3, 9);
//        hotelSystem.checkSingleRoom(3, 9);

        hotelSystem.booking(3,10);

        hotelSystem.checkWholeRooms();


    }
}
