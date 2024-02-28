//package 프로그래머스.입문;
//
//public class 최빈값구하기 {
//    public static void main(String[] args) {
//        int[] array = new int[]{1, 2, 3, 3, 3, 4};
//        int count = 0;
//        int m = array[0];
//        int max = 0;
//        int max_num = 0;
//        int check = 0;
//        if(int i = 1; i<array.length; i++){
//            if(m==array[i]){
//                count++;
//            }
//            else {
//                if(max<count){
//                    max = count;
//                    max_num = array[i-1];
//                    count = 0;
//                    m = array[i];
//                }
//                else if(max==count){
//                    check = max;
//                }
//            }
//        }
//        int answer = max != check ? max_num : -1;
//        System.out.println(answer);
//    }
//}
