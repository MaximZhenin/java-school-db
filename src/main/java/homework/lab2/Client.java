package homework.lab2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Client {
    private final int debt; //todo you can't remove final
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(int debt, int bonus, String name, int salary) {
        this.debt = debt;
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }


    public Client(ProxyBuild content) {
        this.debt = content.getDebt();
        this.bonus = content.getBonus();
        this.name = content.getName();
        this.salary = content.getSalary();
    }
}

//на модификатор public ругсется ?!
@Getter
@Setter
class ProxyBuild {
    private int debt;
    private int bonus;
    private String name;
    private int salary;

    public Client fillTheContent() {
        return new Client(this);
    }
}