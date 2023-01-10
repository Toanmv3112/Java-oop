import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Option();
        int num = sc.nextInt();
        float Kt[] = Kt(num);
        int soCanh = soCanh(num);
        Dagiac DG = new Dagiac(soCanh, Kt);
        DG.Tinhtoan(soCanh, Kt);
    }

    public static void Option() {
        System.out.println("Lựa chọn hình cần tính: ");
        System.out.println("1. Hình tròn");
        System.out.println("2. Hình vuông");
        System.out.println("3. Hình chữ nhật");
        System.out.println("4. Hình tam giác");
    }

    public static int soCanh(int num) {
        int soCanh = 0;
        switch (num) {
            case 1:
                soCanh = 0;
                break;
            case 2:
            case 3:
                soCanh = 4;
                break;
            case 4:
                soCanh = 3;
                break;
        }
        return soCanh;
    }

    public static float[] Kt(int num) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, h, r = 0;
        float Kt[] = new float[3];
        switch (num) {
            case 1:
                do {
                    System.out.println("Nhập bán kình hình tròn: ");
                    System.out.println("r= ");
                    r = sc.nextFloat();
                } while (r <= 0);
                Kt[0] = r;
                break;
            case 2:
                do {
                    System.out.println("Nhập cạnh hình vuông: ");
                    System.out.println("a= ");
                    a = sc.nextFloat();
                } while (a <= 0);
                Kt[0] = a;
                break;
            case 3:
                do {
                    System.out.println("Nhập cạnh HCN: ");
                    System.out.println("Cạnh thứ nhất: a= ");
                    a = sc.nextFloat();
                    System.out.println("Cạnh thứ 2: b= ");
                    b = sc.nextFloat();
                } while (a <= 0 || b <= 0);
                Kt[0] = a;
                Kt[1] = b;
                break;
            case 4:
                do {
                    System.out.println("Chú ý ĐK 3 cạnh tam giác!");
                    System.out.println("Nhập các cạnh TG ");
                    System.out.println("Cạnh thứ nhất: a= ");
                    a = sc.nextFloat();
                    System.out.println("Cạnh thứ 2: b= ");
                    b = sc.nextFloat();
                    System.out.println("Cạnh thứ 3: c= ");
                    c = sc.nextFloat();
                } while (a + b <= c || a + c <= b || b + c <= a);
                Kt[0] = a;
                Kt[1] = b;
                Kt[2] = c;
                break;
        }
        return Kt;
    }

}