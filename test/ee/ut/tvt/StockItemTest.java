package ee.ut.math.tvt.ollepalavik_limited;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ee.ut.math.tvt.salessystem.domain.data.StockItem;

public class StockItemTest {
	private StockItem testItem;
	
	@Before
	public void setUp() {
		testItem = new StockItem((long) 100, "testItem", "", 100.0, 10);
	}
	
	@Test
	public void testClone() {
		StockItem testItem2 = (StockItem) testItem.clone();
		if(testItem.getId().equals(testItem2.getId())) {
			Assert.assertTrue(true);}	
		if(testItem.getName().equals(testItem2.getName())) {
			Assert.assertTrue(true);}
		if(testItem.getDescription().equals(testItem2.getDescription())) {
			Assert.assertTrue(true);}
		if(testItem.getPrice() == testItem2.getPrice()) {
			Assert.assertTrue(true);}
		if(testItem.getQuantity() == testItem2.getQuantity()){
			Assert.assertTrue(true);}
		}
							
	}
	
	@Test
	public void testGetColumn() {
		if((long) testItem.getColumn(0) == 100){
			Assert.assertTrue(true);}
		
		if(((String) testItem.getColumn(1)).equals("testItem")){
			Assert.assertTrue(true);}
		
		if((double) testItem.getColumn(2) == 100.0){
			Assert.assertTrue(true);}
		
		if((int) testItem.getColumn(3) == 10){
			Assert.assertTrue(true);}					
	}
}