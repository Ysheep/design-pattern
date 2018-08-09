package com.Ysheep;

import com.Ysheep.lazyLoad.LazyLoadSingleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LazyLoadSingleton singleton = LazyLoadSingleton.getSingleton();
        LazyLoadSingleton singleton2 = LazyLoadSingleton.getSingleton();
        System.out.println("singleton="+singleton.hashCode());
        System.out.println("singleton2="+singleton2.hashCode());
    }
}
