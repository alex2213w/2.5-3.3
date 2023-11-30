package passes;

import java.time.YearMonth;


public class SchoolPass extends MetroPass {
    private  int countOfTrip;
    private YearMonth month;


    public SchoolPass(int uid, int countOfTrip, YearMonth month) {
        super(uid);
        this.countOfTrip = countOfTrip;
        this.month = month;
    }

    public SchoolPass(int countOfTrip) {
        this.countOfTrip = countOfTrip;

    }

    public int getCountOfTrip() {
        return countOfTrip;
    }

    public YearMonth getMonth() {
        return month;
    }

    public void setMonth(YearMonth month) {
        this.month = month;
    }

    public void setCountOfTrip(int countOfTrip) {
        this.countOfTrip = countOfTrip;
    }
}
