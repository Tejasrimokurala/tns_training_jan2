class Final {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("This always executes");
        }
    }
}
