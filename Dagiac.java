public class Dagiac {
    public int soCanh;
    public float Kt[]; //Kt: kích thước

    public Dagiac(int soCanh, float Kt[]) {
        this.soCanh = soCanh;
        this.Kt = Kt;
    }

    public void Tinhtoan(int soCanh, float[] Kt) {
        double CV, DT, p = 0;

        switch (soCanh) {
            case 0:
                CV = 2 * Math.PI * Kt[0];
                DT = Math.PI * Kt[0] * Kt[0];
                System.out.println("CV hình tròn là: " + Math.round(CV * 100.00) / 100.00);
                System.out.println("DT hình tròn là: " + Math.round(DT * 100.00) / 100.00);
                break;
            case 3:
                CV = Kt[0] + Kt[1] + Kt[2];
                p = CV / 2;
                DT = Math.sqrt(p * (p - Kt[0]) * (p - Kt[1]) * (p - Kt[2]));
                System.out.println("CV tam giac là: " + Math.round(CV * 100.00) / 100.00);
                System.out.println("DT tam giac là: " + Math.round(DT * 100.00) / 100.00);
                break;
            case 4:
                if (Kt[1] == 0) {
                    CV = 4 * Kt[0];
                    DT = Kt[0] * Kt[0];
                    System.out.println("CV hình vuông là: " + Math.round(CV * 100.00) / 100.00);
                    System.out.println("DT hình vuông là: " + Math.round(DT * 100.00) / 100.00);
                } else {
                    CV = 2 * (Kt[0] + Kt[1]);
                    DT = Kt[0] * Kt[1];
                    System.out.println("CV HCN là: " + Math.round(CV * 100.00) / 100.00);
                    System.out.println("DT HCN là: " + Math.round(DT * 100.00) / 100.00);
                }
                break;
        }

    }
}