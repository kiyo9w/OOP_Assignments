public class TestScore {
    private double testScore1;
    private double testScore2;
    private double testScore3;

    TestScore(double testScore1, double testScore2, double testScore3) {
        if((testScore1 >= 0 && testScore2 >= 0 && testScore3 >= 0) && (testScore1 <= 10 && testScore2 <= 10 && testScore3 <= 10)) {
            this.testScore1 = testScore1;
            this.testScore2 = testScore2;
            this.testScore3 = testScore3;
        }
    }

    public double getTestScore1() {
        return testScore1;
    }
    public double getTestScore2() {
        return testScore2;
    }
    public double getTestScore3() {
        return testScore3;
    }

    public void setTestScore1(double testScore1) {
        if(testScore1 >= 0 && testScore1 <= 10) {
            this.testScore1 = testScore1;
        }
    }
    public void setTestScore2(double testScore2) {
        if(testScore2 >= 0 && testScore2 <= 10) {
            this.testScore2 = testScore2;
        }
    }
    public void setTestScore3(double testScore3) {
        if(testScore3 >= 0 && testScore3 <= 10) {
            this.testScore3 = testScore3;
        }
    }

    public double getAverageScore() {
        return (this.testScore1 + this.testScore2 + this.testScore3) / 3;
    }
}
