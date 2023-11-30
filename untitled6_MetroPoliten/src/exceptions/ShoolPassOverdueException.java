package exceptions;
import passes.SchoolPass;
import java.time.YearMonth;

public class ShoolPassOverdueException extends PassWithTermException {
    private SchoolPass pass;

    public ShoolPassOverdueException(SchoolPass pass) {
        this.pass = pass;
    }

    @Override
    int calculateTermOfOverdue() {
       int month= YearMonth.now().getMonthValue()-pass.getMonth().getMonthValue();
       int year = YearMonth.now().getYear()-pass.getMonth().getYear()*12;
        return year+month;
    }

    @Override
    public String toString() {
        return "ShoolPassOverdueException: the pass has been overdue" +calculateTermOfOverdue()+
                "mounths ago"+"pass" + pass +
                '}';
    }
}
