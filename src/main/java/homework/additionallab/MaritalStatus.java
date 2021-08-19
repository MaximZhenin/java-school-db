package homework.additionallab;

import lombok.Getter;

@Getter
public enum MaritalStatus {
    MARRIED(1, "ЖЕНАТ/ЗАМУЖЕМ"),
    SINGLE(2, "ХОЛОСТ/НЕЗАМУЖНЯЯ"),
    DIVORCED(3, "В РАЗВОДЕ"),
    WIDOW(4, "ВДОВЕЦ/ВДОВА");
    private final String value;
    private final int dbCode;

    MaritalStatus(int code, String value) {
        this.value = value;
        this.dbCode = code;
    }
}
