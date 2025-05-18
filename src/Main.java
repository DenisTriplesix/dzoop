//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Printable бухгалтер =  new Бухгалтер() ;
Printable рабочий = new Рабочий() ;
Printable директор = new Директор();

бухгалтер.print();
рабочий.print();
директор.print();
    }
}