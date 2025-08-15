public class StringBui {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("himadri");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert
        sb.insert(2,'R');
        System.out.println(sb);

        //delete
        sb.delete(2,3);
        System.out.println(sb);

        //append
        sb.append("o");
        System.out.println(sb);

        //
        StringBuilder sbb=new StringBuilder("hello");
        for(int i=0;i<sbb.length()/2;i++)
        {
            int front=i;
            int back=sbb.length()-1-i;// 5-1-0 => 4

            char frontChar=sbb.charAt(front);
            char backChar=sbb.charAt(back);

            sbb.setCharAt(front, backChar);
            sbb.setCharAt(back, frontChar);

        }
        System.out.println(sbb);

    }
}
