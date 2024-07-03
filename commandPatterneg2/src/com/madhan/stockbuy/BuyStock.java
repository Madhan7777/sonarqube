package com.madhan.stockbuy;

import com.madhan.order.Order;
import com.madhan.stock.Stock;

public class BuyStock implements Order{

	 private Stock abcStock;

	   public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.buy();
	   }
}
