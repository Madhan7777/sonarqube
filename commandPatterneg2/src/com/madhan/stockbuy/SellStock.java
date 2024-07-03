package com.madhan.stockbuy;

import com.madhan.order.Order;
import com.madhan.stock.Stock;

public class SellStock implements Order {

	 private Stock abcStock;

	   public SellStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.sell();
	   }
}
