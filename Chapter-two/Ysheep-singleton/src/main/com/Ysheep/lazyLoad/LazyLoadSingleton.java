package com.Ysheep.lazyLoad;

public class LazyLoadSingleton {

    private static LazyLoadSingleton singleton;

    private  LazyLoadSingleton() {
    }

    public static LazyLoadSingleton getSingleton() {
        if(singleton == null) {
            singleton = new LazyLoadSingleton();
        }
        return singleton;
    }


    public static void main(String[] args) {
        LazyLoadSingleton singleton = LazyLoadSingleton.getSingleton();
        LazyLoadSingleton singleton2 = LazyLoadSingleton.getSingleton();
        System.out.println("singleton="+singleton.hashCode());
        System.out.println("singleton2="+singleton2.hashCode());
    }
}
