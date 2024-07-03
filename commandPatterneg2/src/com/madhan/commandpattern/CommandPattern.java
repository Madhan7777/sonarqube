package com.madhan.commandpattern;

import com.madhan.broker.Broker;
import com.madhan.stock.Stock;
import com.madhan.stockbuy.BuyStock;
import com.madhan.stockbuy.SellStock;

public class CommandPattern {

	 public static void main(String[] args) {
	      Stock abcStock = new Stock();  //request object

	      BuyStock buyStockOrder = new BuyStock(abcStock); //command object
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Broker broker = new Broker(); //broker is invoker object
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);
	      broker.takeOrder(buyStockOrder);

	      

	      broker.placeOrders();
	   }
}
