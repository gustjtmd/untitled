
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//
//class Main{
//    public int solution(String str, char t){
//        int answer=0;
//
//        String x = str.toUpperCase();
//
//        char[] arr = x.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//
//            if (Character.toUpperCase(t) == arr[i]){
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str=kb.next();
//        char c = kb.next().charAt(0);
//
//        System.out.print(T.solution(str,c));
//    }
//}

//class Main{
//    public String solution(String str){
//
//        StringBuilder sb = new StringBuilder();
//
//        char[] arr = str.toCharArray();
//
//        for(int i=0; i<str.length(); i++){
//            if(Character.isUpperCase(arr[i])) {
//                sb.append(Character.toLowerCase(arr[i]));
//            }
//            else {
//                sb.append(Character.toUpperCase(arr[i]));
//            }
//        }
//        String answer = sb.toString();
//
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//
//        System.out.println(T.solution(str));
//    }
//}
//
//
//class Main {
//    public String solution(String str){
//        String answer="";
//        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
//            else answer+=Character.toLowerCase(x);
//
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str=kb.next();
//        System.out.print(T.solution(str));
//    }
//}


class Main{
    public ArrayList<String> solution(int n, String[] str){

        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] ch = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;

            while(lt<rt){
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            String s = new String(ch);
            answer.add(s);
        }


        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] =kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}

