package WArmup-1;

public class notString {
    public String notString(String str) {
  if(str.length() >= 3 && str.substring(0,3).equals("not")){
    return str;
  }
  else{
    return "not " + str;
  }
    
}
    public static void main(String[] args) {
        notString ns = new notString();
        System.out.println(ns.notString("candy")); // "not candy"
        System.out.println(ns.notString("x")); // "not x"
        System.out.println(ns.notString("not bad")); // "not bad"
    }
}
