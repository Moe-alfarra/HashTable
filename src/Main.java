public class Main {

    public static void main(String[] args) {

        HashTable ht = new HashTable(15);

        String[] keyWords = {"abstract", "if", "else", "While", "this", "final", "void", "new", "break",
                "throws", "public", "private", "byte","extends","interface"};


        for (String s: keyWords) {
            ht.add(s);
        }
        System.out.println("The hash value for the word interface is: " + ht.hash("interface"));
        System.out.println("The hash value for the word break is: " +ht.hash("break"));
        ht.print();
    }
}
