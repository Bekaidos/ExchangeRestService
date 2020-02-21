package Main;

import Model.ExchangeRequest;
import Model.ExchangeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/exchange")

public class ExchangeController {

    @Autowired
    private CurrenciesRepository currenciesRepository;

    @PostMapping("/service")
    public ExchangeResponse GetKZT(@RequestBody ExchangeRequest exchangeRequest) {

        Integer id = currenciesRepository.getMaxId();
        Optional<Currencies> currenciesOpt = currenciesRepository.findById(id);
        Currencies currencies = currenciesOpt.get();
        Double response = null;

        if (exchangeRequest.getCurrency().equals("USD")) {
            response = currencies.getUSD();
        }
        else if (exchangeRequest.getCurrency().equals("EUR")) {
            response = currencies.getEUR();
        }
        else if (exchangeRequest.getCurrency().equals("RUB")) {
            response = currencies.getRUB();
        }
        return new ExchangeResponse(response, currencies.getDate_insert());
    }
}
