package io.adam.boot.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockCollection {

	
	private static Map<Long, Stock> stockList = new HashMap<Long, Stock>();
	private static Long listSize;
	private Stock stock;
	
	public Long getListSize() {
		return listSize;
	}

	public Stock getStock(Long i) {
		return stockList.get(i);
	}

	public void setStock(Stock stock) {
		listSize =	(long) stockList.size();
		stockList.put(listSize, stock);
	}

	public static List<Stock> list(){
		return new ArrayList<Stock>(stockList.values());
	}
	//public Stock getStock2(Long n) {
		//return stockList.get(n);
	//}
	
}
