

import java.util.*;
public class  files{
 public static void main(String[]args)
 {
    ArrayList<String>a=new ArrayList<>();
    a.add("file1\n");
    a.add("\tfile2\n");
    a.add("\tfile3\n");
    a.add("\t\tfile4\n");
    a.add("\tfile5\n");
    System.out.println(a);
    System.out.println("file name"+"\t\t\t"+"parentfile");
 for(int i=0;i<a.size();i++)
 {
     int t=a.get(i).lastIndexOf("\t");
     
     if(t==-1)
     {
        System.out.println(a.get(i).trim()+"\t\t\t\t"+"null");
     }
 }  for(int k=0;k<a.size();k++){
  if(a.get(k).lastIndexOf("\t")==1)
          {
              System.out.println(a.get(k).trim()+"\t\t\t\t"+a.get(k-1).trim());
          }}
 for(int j=0;j<a.size();j++)
 {
    for(int h=0;h<a.size();h++)
    { 
         
           if((a.get(h).lastIndexOf("\t"))-1==a.get(j).lastIndexOf("\t"))
        {
          
           if(j!=1&&j!=4&&h!=2)
           System.out.println(a.get(h).trim()+"\t\t\t\t"+a.get(j).trim());
        }}

    }
 }
 }    
