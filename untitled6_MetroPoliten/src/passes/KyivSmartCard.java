package passes;

import java.time.YearMonth;
import java.util.ArrayList;

public class KyivSmartCard {

    private static final int COUNT_OF_SCHOOL_TRIP_PER_MONTH = 50;
    private static final int FARE = 8;
    private static ArrayList<MetroPass> internalCardStorage = new ArrayList<>();
    private static int countOfPermitions = 0;
    private static int countOfProhibitions = 0;

    public static MetroPass createPass(PassType passType) {

        MetroPass metroPass = new MetroPass();
        switch (passType) {
            case SCHOOL_PASS:
                metroPass = new SchoolPass(COUNT_OF_SCHOOL_TRIP_PER_MONTH);
                break;
            case STUDENT_PASS:
                metroPass = new StudentPass();
                break;
            case REGULAR_PASS:
                metroPass = new MetroPass();
                break;
        }
        internalCardStorage.add(metroPass);
        metroPass.setUid(metroPass.getUid() + 1);
        return metroPass;
    }

    public static void addPermitions() {
        countOfPermitions++;
    }

    public static void addProhibitions() {
        countOfProhibitions++;
    }

    public static void addFouds(RegularPass regularPass, int money) {
        regularPass.setAmountOfMoney(regularPass.getAmountOfMoney() + money);
    }

    public static int getTotalCountOfOverdueAndEmptyPass() {

        int count = 0;
        for (MetroPass metroPass : internalCardStorage) {
            if (metroPass instanceof SchoolPass schoolPass) {
                if (schoolPass.getCountOfTrip() == 0 || schoolPass.getMonth().isBefore(YearMonth.now())) {
                    count++;

                } else if (metroPass instanceof StudentPass studentPass) {
                    if (studentPass.getMonth().isBefore(YearMonth.now())) {
                        count++;
                    }
                }

            }

        }
        return count;
    }

    public static void subtractFair(RegularPass regularPass) {
        regularPass.setAmountOfMoney(regularPass.getAmountOfMoney() - FARE);
    }


}
