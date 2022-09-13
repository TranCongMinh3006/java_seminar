package callback_pattern;

public class GPAPredictor implements IPredictor {
    private double gpa;

    public GPAPredictor(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean test(Student student) {
        return student.getGpa() >= this.gpa;
    }

//    @Override
//    public void test() {
//        System.err.println("test");
//    }
}
