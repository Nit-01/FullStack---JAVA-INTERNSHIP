class StringDemo {
    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println(text.equals("Java Programming"));
        System.out.println(text.charAt(5));
        System.out.println(text.toUpperCase());

        String parts[] = text.split(" ");
        System.out.println(parts[0]);
        System.out.println(parts[1]);

    }
}
