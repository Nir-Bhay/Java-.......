public class muatabele {
    // public class MutableImmutableExample {
        public static void main(String[] args) {
            // Mutable Example: StringBuilder
            StringBuilder mutableStr = new StringBuilder("Mutable");
            mutableStr.append(" Example");
            System.out.println("Mutable String: " + mutableStr);

            // Immutable Example: String
            String immutableStr = "Immutable";
            immutableStr = immutableStr.concat(" Example");
            System.out.println("Immutable String: " + immutableStr);
        }
    }

// }
