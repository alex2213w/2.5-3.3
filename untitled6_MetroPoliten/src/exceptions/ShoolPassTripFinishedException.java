package exceptions;


import passes.SchoolPass;

public class ShoolPassTripFinishedException extends Exception  {

private SchoolPass pass;

    public ShoolPassTripFinishedException(SchoolPass pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "ShoolPassTripFinishedException: school pass with id 1 has no more trip"
                 + pass.getUid() +
                '}';
    }
}
