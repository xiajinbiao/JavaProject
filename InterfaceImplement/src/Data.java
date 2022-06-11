public class Data {

    public void detail(){
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }

    private int year;
    private int month;
    private int day;

    public Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Data() {
//        this.year = 1970;
//        this.month = 1;
//        this.day = 1;
        this(1970, 1, 1);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Data{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
