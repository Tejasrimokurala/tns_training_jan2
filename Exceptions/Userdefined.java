class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class Userdefined {
    public static void main(String[] args) {
        try {
            throw new MyException("This is my exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
