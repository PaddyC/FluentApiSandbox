package com.sandbox.fluent.assertions;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

public class TestProductService {
	
	private ProductService productService;
	
	@Before
	public void setUp() {
		productService = new ProductService();
	}
	
	@Test
	public void testFindProductByName_NoProductFound() {
		Product returnedProduct = productService.getProductByName("A Magical Super Widget");
		assertNull(returnedProduct);
	}
	
	@Test
	public void testFindProductByName_HappyPath() {
		Product returnedProduct = productService.getProductByName("Small Widget");
		
		assertNotNull(returnedProduct);
		
		ProductAssert.assertThat(returnedProduct)
				.hasName("Small Widget")
				.hasShortDescription("SMW001")
				.hasLongDescription("A small widget to help make buttons in the button factory")
				.hasInventoryDetails();
		
		InventoryDetailsAssert.assertThat(returnedProduct.getInventoryDetails())
				.hasCategory(1)
				.hasProductClass(1)
				.hasProductFamily("Widgets");
		
	}

	@Test
	public void testGetAllProducts() {
		
		List<Product> allProducts = productService.getAllProducts();
		
		assertNotNull(allProducts);
		assertTrue(allProducts.size() > 0);
		
		Assertions.assertThat(allProducts)
				.hasSize(4)
				.onProperty("name")
					.contains("Small Widget", "Medium Widget", "Large Widget", "Button Machine")
					.excludes("A Magical Super Widget");
		
	}
	
}
