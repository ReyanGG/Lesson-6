class p {
    public int sum(int x, int y) {
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }
}

class w extends p {
    public int sum(int x, int y, int z) {
        return (x + y + z + x);
    }
}

public class Access {
    public static void main(String args[]) {
        p s = new p();
        w z = new w();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(z.sum(10, 20, 30));
    }
}
