package sk.tempest.mockito.demo.proj.service.impl;

import java.util.List;
import sk.tempest.mockito.demo.proj.entity.Portfolio;
import sk.tempest.mockito.demo.proj.entity.Stock;
import sk.tempest.mockito.demo.proj.service.StockService;

public class StockServiceImpl implements StockService {

    @Override
    public int getQuantityAllPortfolio(Portfolio portfolio) {
        int quantity = 0;
        for(Stock stock : portfolio.getStocks()){
            System.out.println(stock.getStockId() + " - " + stock.getQuantity());
            quantity += stock.getQuantity();
        }
        return quantity;
    }
    
}
