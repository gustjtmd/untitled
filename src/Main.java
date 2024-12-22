

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


//class Main{
//    public ArrayList<String> solution(int n, String[] str){
//
//        ArrayList<String> answer = new ArrayList<>();
//        for(String x : str){
//            char[] ch = x.toCharArray();
//            int lt = 0;
//            int rt = x.length()-1;
//
//            while(lt<rt){
//                char tmp = ch[lt];
//                ch[lt] = ch[rt];
//                ch[rt] = tmp;
//                lt++;
//                rt--;
//            }
//            String s = new String(ch);
//            answer.add(s);
//        }
//
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n =kb.nextInt();
//        String[] str = new String[n];
//        for(int i=0; i<n; i++){
//            str[i] =kb.next();
//        }
//        for(String x : T.solution(n, str)){
//            System.out.println(x);
//        }
//    }
//}
// * a#b!GE*T@S
// * 예시 출력 1
// *
// * S#T!EG*b@a
//
//
//

/**
 *
 설명

 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


 입력
 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


 출력
 첫 줄에 중복문자가 제거된 문자열을 출력합니다.


 예시 입력 1

 ksekkset
 예시 출력 1

 kset
 */


/**
 * 8. 유효한 팰린드롬
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들의 무시합니다.
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * 출력
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 * 예시 입력 1
 * found7, time: study; Yduts; emit, 7Dnuof
 * 예시 출력 1
 *
 * YES
 */


/**
 * 설명
 *
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 * 입력
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * 출력
 * 첫 줄에 자연수를 출력합니다.
 * 예시 입력 1
 * g0en2T0s8eSoft
 * 예시 출력 1
 * 208
 */

/**
 * 10. 가장 짧은 문자거리
 * 설명

 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * 예시 입력 1
 * teachermode e
 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
 */

/**
 * 11. 문자열 압축
 * 설명
 *
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 *
 *
 * 예시 입력 1
 *
 * KKHSSSSSSSE
 * 예시 출력 1
 *
 * K2HS7E
 * 예시 입력 2
 *
 * KSTTTSEEKFKKKDJJGG
 * 예시 출력 2
 *
 * KST3SE2KFK3DJ2G2
 */



public class Main {
    public String solution(String s){
        String answer = "";

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
            System.out.print(T.solution(str));

    }
}




