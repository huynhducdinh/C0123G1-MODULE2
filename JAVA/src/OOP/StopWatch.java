package OOP;

import java.util.Scanner;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime(long startTime) {
        return this.startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime(long endTime) {
        return this.endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        getStartTime(startTime);
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        getEndTime(endTime);
    }

    public void getElapsedTime() {
        long ElaspedTime = endTime-startTime  ;
        System.out.println("Số mili giây đếm được:" + ElaspedTime);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 bắt đầu tính thời gian");
        int batDau = Integer.parseInt(sc.nextLine());
        StopWatch stopWatch = new StopWatch();
        if (batDau == 1) {
            stopWatch.start();
        }
        System.out.println("Đang đếm thời gian");
        System.out.println("Nhập 0 để kết thúc tời gian");
        int ketThuc = Integer.parseInt(sc.nextLine());
        if (ketThuc == 0) {
            stopWatch.stop();
        }
        stopWatch.getElapsedTime();
    }
}






