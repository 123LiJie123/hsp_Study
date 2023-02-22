package com.hansunping_secondstage.thread_;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的CPU内核的数量
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);

    }
}
