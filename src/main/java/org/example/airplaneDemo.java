package org.example;

import java.util.Scanner;

public class airplaneDemo {

    public static void main(String[] args) {
        //计算机票价格
        //录入 月份 机票原价 头等舱 or 经济舱
        Scanner sc = new Scanner(System.in);
        System.out.print("enter month:");
        int month = sc.nextInt();
        System.out.print("enter ticket price:");
        int ticket = sc.nextInt();
        System.out.print("enter 舱位类型 0:头等舱 1:经济舱 :");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        } else {
            System.out.println("输入的月份不合法！");
        }
        System.out.println("ticket:" + ticket);
    }
            private static int getTicket ( int seat, int ticket, double x, double x1){
            if (seat == 0) {
                //强制转换
                ticket = (int) (ticket * x);
            } else if (seat == 1) {
                ticket = (int) (ticket * x1);
            } else {
                System.out.println("输入舱位不合法！");
            }
            return ticket;
        }
    }

