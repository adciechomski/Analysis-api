package io.adam.boot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.adam.boot.model.Stock;
import io.adam.boot.model.StockCollection;

@RestController
public class HomeController {

@RequestMapping(value = "/c/{param}", method=RequestMethod.GET)
	public ResponseEntity<Stock> get(@PathVariable("param") Long param) {
	StockCollection stockCollection = new StockCollection();
	return new ResponseEntity<Stock>(stockCollection.getStock(param), HttpStatus.OK);
}

@RequestMapping(value = "/c", method=RequestMethod.POST)
public ResponseEntity<Stock> postStock(@RequestBody Stock stock) {
	Stock stock1 = new Stock();
	stock1.setName(stock.getName());
	stock1.setPrice(stock.getPrice());	
	StockCollection stockCollection = new StockCollection();
	stockCollection.setStock(stock1);	
	return new ResponseEntity<Stock>(stockCollection.getStock((Long)stockCollection.getListSize()), HttpStatus.OK);
}

@RequestMapping(value="/b", method = RequestMethod.GET)
public List<Stock> getStockList() {
	return StockCollection.list();
}

@RequestMapping(value="/b/{param}/{n}", method = RequestMethod.PUT)
public Stock updateStock(@PathVariable(value = "n") Long n, @PathVariable(value = "param") int price) {
	StockCollection stockCollection = new StockCollection();
	stockCollection.getStock(n).setPrice(price);
	return stockCollection.getStock(n);
}
//-------------------------------------------------
@RequestMapping(value = "/a", method = RequestMethod.GET)
public String getBook(@RequestParam("data") String itemid) {
 return "!Wprowadzono parameter: " + itemid;
}

@RequestMapping(value = "/newStock/{name}", method = RequestMethod.GET)
public String getRequest(@PathVariable("name") String name) {
	
	Stock stock = new Stock();
	
 return "!!Wprowadzono parametr w URL dla GET: " + stock.toString();
}
@RequestMapping(value = "/newStock/{name}", method = RequestMethod.POST)
public String postRequest(@PathVariable("name") String name) {
	
	Stock stock = new Stock();
	
 return "!!Wprowadzono parametr w URL dla POST: " + stock.toString();
}


@RequestMapping(value = "/a/{param}", method = RequestMethod.GET)
public String getRequestSec(@PathVariable(value="param") String itemid, @RequestParam(value="data", required=false) String cParam) {
 return "!!! Wprowadzono parametr w URL: " + itemid + " " + cParam;
}

}
