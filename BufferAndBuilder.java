public class BufferAndBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //16
        StringBuffer sbb = new StringBuffer("Aditya");
        System.out.println(sbb.capacity()); //22
        System.out.println(sbb.length()); //6

        sbb.append(" Tiwari");
        System.out.println(sbb);

        String str = sb.toString(); // converting string buffer to string
        System.out.println(str);

        // Methods:-
        // 1- deleteCharAt()
        // 2- insert()
        // 3- setLength()
        // 4- ensureCapacity() --> to set minimum length

        // --> string buffer is thread safe and string builder is not.
        

    }
}
