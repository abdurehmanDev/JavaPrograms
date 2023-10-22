package MyPackage;

public class userpackage {
    int num1, num2;

    public userpackage(int n, int m) {
        num1 = n;
        num2 = m;
    }

    public void getmax() {
        if (num1 > num2) {
            System.out.println("Maximum value of two numbers is " + num1);
        } else {
            System.out.println("Maximum value of two numbers is " + num2);
        }
    }

    public static void main(String args[]) {
        userpackage[] current = new userpackage[3];

        current[1] = new userpackage(5, 10);
        current[2] = new userpackage(123, 120);

        for (int i = 1; i < 3; i++) {
            current[i].getmax();
        }
    }
}
