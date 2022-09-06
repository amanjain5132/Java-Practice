package ApnaCollege;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hellllooo");

        //1 method to reverse
//        sb.reverse();
//        System.out.println(sb);

        //2nd method to reverse

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 9 - 1 - 0 = 8

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}





//        sb.append("e");
//        sb.append("h");
//        sb.append("e");
//        System.out.println(sb);

////        //char at 0 index
////        System.out.println(sb.charAt(0)); // print the character at 0 index
////
////        sb.setCharAt(0,'M');
////        System.out.println(sb);
//
//        //insert character At any index
//        sb.insert(2,'a');
//        System.out.println(sb);
//
//        //delete the extra a in  Amaan
//        sb.delete(2,3);
//        System.out.println(sb);

