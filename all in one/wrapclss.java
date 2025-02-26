public class wrapclss {
    // public class WrapperClassExample {
        public static void main(String[] args) {
            // Primitive data type: int
            char primitiveInt = 'a';

            // Wrapper class: Integer
            Integer wrapperInt = Integer.valueOf(primitiveInt);
            System.out.println("Wrapper Integer: " + wrapperInt);

            // Converting wrapper to primitive
            int backToPrimitive = wrapperInt.intValue();
            System.out.println("Back to primitive: " + backToPrimitive);
        }
    }
    
// }
