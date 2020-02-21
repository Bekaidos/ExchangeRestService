package Model;

import java.time.LocalDateTime;

public class ExchangeResponse {

    private Double KZTResponse;
    private LocalDateTime date_insert;

    public ExchangeResponse(Double KZTResponse, LocalDateTime date_insert){
        this.KZTResponse = KZTResponse;
        this.date_insert = date_insert;
    }

    public Double getKZTResponse() {
        return KZTResponse;
    }

    public LocalDateTime getDate_insert() {
        return date_insert;
    }

    public void setDate_insert(LocalDateTime date_insert) {
        this.date_insert = date_insert;
    }
}
