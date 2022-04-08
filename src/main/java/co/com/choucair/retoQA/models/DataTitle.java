package co.com.choucair.retoQA.models;

public class DataTitle {
    String option,message;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DataTitle{" +
                "option='" + option + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
