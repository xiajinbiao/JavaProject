package com.bjpowernode.javase.array;

import java.util.Objects;

public class HotelSystem {
    private Room[][] rooms;

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public HotelSystem(Room[][] rooms) {
        this.rooms = rooms;
    }

    public HotelSystem() {
    }

    public  void generateHotel() {

        System.out.println("欢迎使用酒店管理系统");
        System.out.println("初始化酒店中，请稍后......");
        System.out.println("================================================");
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0){
                    rooms[i][j] = new Room(((i + 1)*100+j+1) , "single bed room", true);
                }else if (i == 1){
                    rooms[i][j] = new Room(((i + 1)*100+j+1) , "standard room", true);
                }else if (i == 2) {
                    rooms[i][j] = new Room(((i + 1)*100+j+1), "deluxe  room", true);
                }else {
                    System.out.println("out of range!!!");
                    return;
                }
            }
        }
        System.out.println("酒店初始化完毕！");
        System.out.println("================================================");

//        booking(3, 10);
//        System.out.println(rooms[2][9]);

//        checkOut(3, 5);
//        System.out.println(rooms[2][4]);
    }

    public void booking(int floorNum, int roomNum) {
        if (floorNum <= 0 || floorNum > rooms.length || roomNum <= 0 || roomNum > rooms[floorNum-1].length){
            System.out.println("您输入的房间号有误，订房失败！");
        }else if (!(rooms[floorNum-1][roomNum-1].getFalg())){
            System.out.println("该房间已经被预定，请重新选择！");
        }else {
            rooms[floorNum-1][roomNum-1].setFalg(false);
            if (roomNum <= 9){
                System.out.println("您已成功预定" + floorNum + "0" + roomNum + "房间！" + rooms[floorNum-1][roomNum-1].getRoomModel());
            }else {
                System.out.println("您已成功预定" + floorNum + roomNum + "房间！"+ rooms[floorNum-1][roomNum-1].getRoomModel());
            }

        }
    }

    public void checkOut (int floorNum, int roomNum){
        if (floorNum <= 0 || floorNum > rooms.length || roomNum <= 0 || roomNum > rooms[floorNum-1].length){
            System.out.println("您输入的房间号有误，订房失败！");
        }else if (rooms[floorNum-1][roomNum-1].getFalg()){
            System.out.println("该房间尚未预定，无法退房，请重新输入！");
        }else {
            rooms[floorNum-1][roomNum-1].setFalg(true);
            if (roomNum <= 9){
                System.out.println("您已成功退订" + floorNum + "0" + roomNum + "房间！");
            }else {
                System.out.println("您已成功退定" + floorNum + roomNum + "房间！");
            }
        }


    }
    public void checkSingleRoom(int floorNum, int roomNum){
        if (floorNum <= 0 || floorNum > rooms.length || roomNum <= 0 || roomNum > rooms[floorNum-1].length){
            System.out.println("您输入的房间号有误，查询失败！");
        }else {
            System.out.println(rooms[floorNum-1][roomNum-1]);
        }
    }

    public void checkWholeRooms(){
        System.out.println("酒店状态");
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("================================================");
            System.out.println("||" + "当前楼层：" + (i + 1) + "                                   ||");
            System.out.println("================================================");
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.println(rooms[i][j]);
            }
        }
    }


}

class Room {
    private int roomNum;
    private String roomModel;
    private Boolean falg;

    public Room(int roomNum, String roomModel, Boolean falg) {
        this.roomNum = roomNum;
        this.roomModel = roomModel;
        this.falg = falg;
    }

    public Room() {
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomModel() {
        return roomModel;
    }

    public void setRoomModel(String roomModel) {
        this.roomModel = roomModel;
    }

    public Boolean getFalg() {
        return falg;
    }

    public void setFalg(Boolean falg) {
        this.falg = falg;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNum='" + roomNum + '\'' +
                ", roomModel='" + roomModel + '\'' +
                ", falg=" + falg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(roomNum, room.roomNum) &&
                Objects.equals(roomModel, room.roomModel) &&
                Objects.equals(falg, room.falg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNum, roomModel, falg);
    }
}