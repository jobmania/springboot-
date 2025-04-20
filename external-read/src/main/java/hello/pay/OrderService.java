package hello.pay;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    public final PayClient payClient;

    public void order(int money){
        payClient.pay(money);
    }
}
