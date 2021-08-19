package homework.enums.lab;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HttpService {

    private HttpCode http;


    public void handleHttpCode(int httpCode) {
        //todo finish the enum and this method
        System.out.println("asfasgasgasgas");
        http.findByStatus(httpCode);

    }

    public static void main(String[] args) {
        HttpService lol = new HttpService();
        lol.handleHttpCode(500);

    }
}
