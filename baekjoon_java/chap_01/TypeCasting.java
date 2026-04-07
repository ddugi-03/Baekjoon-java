package chap_01;

public class TypeCasting {
    //형변환
    //System.out.println( (원하는 타입) 변수)
    //int -> long -> float -> double (자동 형변환) 작은타입 -> 큰 타입
    //double -> flaot -> long -> int (수동 형변환) 큰 타입 -> 작은타입
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println((float)a);


        //숫자 -> 문자(String Class valueof사용)
        String s1 = String.valueOf(93);

        //문자 -> 숫자(Integer Class valueof사용) *문자는 숫자로 못바꿈*
        s1 = Integer.toString(93);
    }
}
