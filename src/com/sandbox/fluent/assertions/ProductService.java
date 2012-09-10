package com.sandbox.fluent.assertions;

import java.util.ArrayList;
import java.util.List;

import com.sandbox.fluent.assertions.builders.InventoryDetailsBuilder;
import com.sandbox.fluent.assertions.builders.ProductBuilder;

import static ch.lambdaj.Lambda.*;

import static org.hamcrest.Matchers.*;

public class ProductService {
	
	private List<Product> allProducts;
	
	public Product getProductByName(String name) {
		Product productForReturn = null;
		
		List<Product> productsWithThisName = 
			select(allProducts, having(on(Product.class).getName(), equalTo(name)));
		
		if (productsWithThisName.size() > 0) {
			productForReturn = productsWithThisName.get(0);
		}
		return productForReturn;
	}
	
	public List<Product> getAllProducts() {
		return allProducts;
	}

	/**
	 * Ok, so we're cheating here. 
	 * This isn't <i>really</i> a service.
	 * And we're not <i>actually</i> going to connect to a database.
	 * In the constructor for the product, we instead  
	 * build a list of dummy products, purely for demo purposes.
	 */
	public ProductService() {
		allProducts = new ArrayList<Product>();
		
		Product smallWidget = ProductBuilder.create()
			.withName("Small Widget")
			.withShortDescription("SMW001")
			.withLongDescription("A small widget to help make buttons in the button factory")
			.withInventoryDetails(InventoryDetailsBuilder.create()
									.withCategory(1)
									.withClass(1)
									.withFamily("Widgets"))
			.build();
		allProducts.add(smallWidget);
		
		Product mediumWidget = ProductBuilder.create()
		.withName("Medium Widget")
		.withShortDescription("MDW001")
		.withLongDescription("A medium widget to help make buttons in the button factory")
		.withInventoryDetails(InventoryDetailsBuilder.create()
								.withCategory(1)
								.withClass(2)
								.withFamily("Widgets"))
		.build();
		allProducts.add(mediumWidget);
		
		Product largeWidget = ProductBuilder.create()
		.withName("Large Widget")
		.withShortDescription("LGW001")
		.withLongDescription("A large widget to help make buttons in the button factory")
		.withInventoryDetails(InventoryDetailsBuilder.create()
								.withCategory(2)
								.withClass(3)
								.withFamily("Widgets"))
		.build();
		allProducts.add(largeWidget);

		Product buttonMachine = ProductBuilder.create()
		.withName("Button Machine")
		.withShortDescription("BTM001")
		.withLongDescription("A machine that makes buttons, believe it or not")
		.withInventoryDetails(InventoryDetailsBuilder.create()
								.withCategory(3)
								.withClass(5)
								.withFamily("Machines"))
		.build();
		allProducts.add(buttonMachine);
	}
	

}
