package sk.tempest.mockito.demo.proj.entity;

import java.util.List;
import sk.tempest.mockito.demo.proj.service.StockService;

public class Portfolio {
   //private StockService stockService;
   private List<Stock> stocks;
   
   public Portfolio(List<Stock> stocks){
        this.stocks = stocks;
   }

   public List<Stock> getStocks() {
        return stocks;
   }

   public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
   }
}