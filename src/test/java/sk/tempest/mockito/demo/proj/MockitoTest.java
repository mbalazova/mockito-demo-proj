package sk.tempest.mockito.demo.proj;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import sk.tempest.mockito.demo.proj.entity.Portfolio;
import sk.tempest.mockito.demo.proj.entity.Stock;
import sk.tempest.mockito.demo.proj.service.StockService;

public class MockitoTest {
    
    @Test
    public void getQuantityAllPortfolioTest(){
        StockService stockService = mock(StockService.class); 
        List<Stock> stocks = new ArrayList<Stock>();	        
        stocks.add(new Stock("1","Google", 10));
        stocks.add(new Stock("2","Microsoft",100));
        Portfolio portfolio = new Portfolio(stocks);
        
       when(stockService.getQuantityAllPortfolio(portfolio)).thenReturn(110); 
        
        assertEquals(110, stockService.getQuantityAllPortfolio(portfolio));
        
        
    }
    
    
}
