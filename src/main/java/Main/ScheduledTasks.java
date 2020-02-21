package Main;

import Exchange.ExchangeRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    private CurrenciesRepository currenciesRepository;

    @Scheduled(fixedRate = 10*60*1000)
    public void addNewCurrency () {
        ExchangeRate exchangeRate = new ExchangeRate();

        Currencies currencies = new Currencies();
        currencies.setUSD(Double.parseDouble(exchangeRate.getUSD()));
        currencies.setEUR(Double.parseDouble(exchangeRate.getEUR()));
        currencies.setRUB(Double.parseDouble(exchangeRate.getRUB()));

        currenciesRepository.save(currencies);
    }
}
