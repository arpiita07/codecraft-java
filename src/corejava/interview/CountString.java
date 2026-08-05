package corejava.interview;

public class CountString {
    public static void main(String[] args) {

    String s = "aaaabbccccdd";
    if(s ==null || s.isEmpty()){
        System.out.println( " ");
    }
    StringBuilder sb = new StringBuilder();
    int count =1;
    for(int i =1 ; i< s.length();i++){
        if(s.charAt(i) == s.charAt(i-1)){
            count++;
        }else{
            sb.append(s.charAt(i-1)).append(count);
            count =1;
        }
    }
    sb.append(s.charAt(s.length()-1)).append(count);
    //sb.append(s.charAt(s.length()-1)).append(count);
    System.out.println(sb);

    }
}
