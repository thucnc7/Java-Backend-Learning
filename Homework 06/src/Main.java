
    public class Main{
        public static void main(String[] args) {
            Fraction phanso1 = new Fraction(1,4);
            Fraction phanso2 = new Fraction(4,3);
            phanso1.rutgon();
            Fraction phanso3 = new Fraction();
            Fraction phanso4 = new Fraction();
            Fraction phanso5 = new Fraction();
            Fraction phanso6 = new Fraction();
            phanso3 = Fraction.congphanso(phanso2,phanso1);
            phanso4 = Fraction.truphanso(phanso2,phanso1);
            phanso5 = Fraction.nhanphanso(phanso2,phanso1);
            phanso6 = Fraction.chiaphanso(phanso2,phanso1);
            System.out.printf("Phep cong : %s" ,phanso3.ShowString());
            System.out.printf("\n");
            System.out.printf("Phep tru : %s" ,phanso4.ShowString());
            System.out.printf("\n");
            System.out.printf("Phep nhan : %s", phanso5.ShowString());
            System.out.printf("\n");
            System.out.printf("Phep chia : %s ", phanso6.ShowString());
        }
}
œ