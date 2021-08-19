package homework.enums.lab;

import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@Getter
public enum HttpCode {
    REDIRECTION("300-399","Redirection"), CLIENTERROR("400-499","Client Error"), SERVERERROR("500-599","Server Error");

    private final String value;
    private final String status;

    HttpCode(String status, String value) {
        this.status = status;
        this.value = value;
    }
    public static HttpCode findByStatus(int code) {
        HttpCode[] statuses = values();
        for (HttpCode status : statuses) {
            int left = Integer.parseInt(status.status.split("-")[0]);
            int right = Integer.parseInt(status.status.split("-")[1]);
            if (left <= code && code <= right) {
                status.logicWork();
                return status;
            }
        }
        throw new IllegalStateException(code+" not supported");

    }

    public void logicWork() {
        System.out.println("Start logic work with status = " + this.getValue());
    }

    @Override
    public String toString() {

        return getValue();
    }
}
