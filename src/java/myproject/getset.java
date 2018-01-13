/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kapil
 */
package myproject;
public class getset {
    public static String searched="iet";
    
    
    public static void setValue(String searched)

            
    {
       // System.out.println("value set=");
        getset.searched=searched;
    }
    
    public static String getValue()
    {
        return searched;
    }
    public static void callmain()
    {
       // System.out.println("called"+searched);
       TwitterSentimentAnalysis ts=new TwitterSentimentAnalysis();
       ts.callme(searched);
    }
         }

