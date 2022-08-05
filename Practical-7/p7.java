class Append{  
  public static void main(String args[]){  
  StringBuffer sb=new StringBuffer("HELLO ");  
  sb.append("Java");              //now original string is changed  
  System.out.println(sb);         // HELLO Java  
  }  
}  


class Insert{  
  public static void main(String args[]){  
  StringBuffer sb=new StringBuffer("HELLO");  
  sb.insert(1,"Java");          //now original string is changed  
  System.out.println(sb);     // HJavaELLo  
  }  
} 
 

class Replace{  
  public static void main(String args[]){  
  StringBuffer sb=new StringBuffer("HELLO");  
  sb.replace(1,3,"Java");         // replace from 1 to before 3 index
  System.out.println(sb);        // HJavaLO  
  }  
}  



class Delete{  
  public static void main(String args[]){  
  StringBuffer sb=new StringBuffer("HELLO");  
  sb.delete(1,3);                     // delete from 1 to before 3 index
  System.out.println(sb);        // HLO  
  }  
}  

class Reverse{  
  public static void main(String args[]){  
  StringBuffer sb=new StringBuffer("HELLO");  
  sb.reverse();  
  System.out.println(sb);      // OLLEH    
  }  
}  
