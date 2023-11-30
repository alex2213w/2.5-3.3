package exceptions;

import passes.StudentPass;

import java.time.YearMonth;

public class StudentPassOverdueException extends PassWithTermException{
private StudentPass pass;

    public StudentPassOverdueException(StudentPass pass) {
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
        return "StudentPassOverdueException the pass has been overdue " +calculateTermOfOverdue() +
                "mounts ago pass=" + pass +
                '}';
    }
}
