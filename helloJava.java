
public class helloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        System.out.printf("byte      : range = %d ~ %d, size = %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
        System.out.printf("short     : range = %d ~ %d, size = %d%n", Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
        System.out.printf("int       : range = %d ~ %d, size = %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
        System.out.printf("long      : range = %d ~ %d, size = %d%n", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE);
        System.out.printf("float     : range = %d ~ %d, size = %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT, Float.SIZE);
        System.out.printf("double    : range = %d ~ %d, size = %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT, Double.SIZE);
        System.out.printf("char      : range = %h ~ %h, size = %d%n", Character.MIN_VALUE, Character.MAX_VALUE, Character.SIZE);
        System.out.printf("boolean   : range = %b ~ %b%n"           , Boolean.TRUE, Boolean.FALSE);
    }
}

