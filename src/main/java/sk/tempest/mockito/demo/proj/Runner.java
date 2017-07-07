package sk.tempest.mockito.demo.proj;

import java.util.ArrayList;
import java.util.List;
import sk.tempest.mockito.demo.proj.entity.Portfolio;
import sk.tempest.mockito.demo.proj.service.StockService;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import sk.tempest.mockito.demo.proj.entity.Stock;

public class Runner {
       
    //@Autowired
    StockService stockService;	   
   
   public static void main(String[] args){
   }
   
   /*
      Runner runner = new Runner();
      //runner.setUp();
      List<Stock> stocks = new ArrayList<Stock>();	        
      stocks.add(new Stock("1","Google", 14));
      stocks.add(new Stock("2","Microsoft",180));
      for(Stock stock : stocks){
          System.out.println(stock.getStockId() + " - " + stock.getQuantity());
      }
      Portfolio portfolio = new Portfolio(stocks);
      for(Stock stock : portfolio.getStocks()){
          System.out.println(stock.getStockId() + " - " + stock.getQuantity());
      }
      
      runner.result(portfolio);
   }
   
   public void result(Portfolio portfolio){
      int res = stockService.getQuantityAllPortfolio(portfolio);
      System.out.println("quantity " + res); 
   }
   
   /*
   public boolean testMarketValue(){
    	   
      //Creates a list of stocks to be added to the portfolio
      List<Stock> stocks = new ArrayList<Stock>();
      Stock googleStock = new Stock("1","Google", 10);
      Stock microsoftStock = new Stock("2","Microsoft",100);	
 
      stocks.add(googleStock);
      stocks.add(microsoftStock);

      //add stocks to the portfolio
      portfolio.setStocks(stocks);

      //mock the behavior of stock service to return the value of various stocks
      when(stockService.getPrice(googleStock)).thenReturn(50.00);
      when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);		

      double marketValue = portfolio.getMarketValue();		
      return marketValue == 100500.0;
   }
    */
}
