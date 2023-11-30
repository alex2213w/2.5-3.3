package passes;

import java.time.YearMonth;

public class StudentPass extends MetroPass {
        private YearMonth month;
     public  StudentPass(){}

    public StudentPass(int uid, YearMonth month) {
        super(uid);
        this.month = month;
    }

    public StudentPass(YearMonth month) {
        this.month = month;
    }

    public YearMonth getMonth() {
        return month;
    }

    public void setMonth(YearMonth month) {
        this.month = month;
    }
}
