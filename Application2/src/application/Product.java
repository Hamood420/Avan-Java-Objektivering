package application;

public class Product {

	String Item;
	String Region;
	String Rep1;
	String Rep2;
	String OrderDate;
	String Units;
	String UnitCost;
	String Total;
		
		public Product(String item, String region, String rep1, String rep2, String orderDate,
				String units, String unitCost, String total) {
			
			
			super();
			Item = item;
			Region = region;
			Rep1 = rep1;
			Rep2 = rep2;
			OrderDate = orderDate;
			Units = units;
			UnitCost = unitCost;
			Total = total;
		}

		public String getItem() {
			return Item;
		}

		public void setItem(String item) {
			Item = item;
		}

		public String getRegion() {
			return Region;
		}

		public void setRegion(String region) {
			Region = region;
		}

		public String getRep1() {
			return Rep1;
		}

		public void setRep1(String rep1) {
			Rep1 = rep1;
		}

		public String getRep2() {
			return Rep2;
		}

		public void setRep2(String rep2) {
			Rep2 = rep2;
		}

		public String getOrderDate() {
			return OrderDate;
		}

		public void setOrderDate(String orderDate) {
			OrderDate = orderDate;
		}

		public String getUnits() {
			return Units;
		}

		public void setUnits(String units) {
			Units = units;
		}

		public String getUnitCost() {
			return UnitCost;
		}

		public void setUnitCost(String unitCost) {
			UnitCost = unitCost;
		}

		public String getTotal() {
			return Total;
		}

		public void setTotal(String total) {
			Total = total;
		}
		
		@Override
		public String toString() {
			return "[" + Item + "," + Region + "," + Rep1 + "," + Rep2 + "," + OrderDate + "," 
					+ Units + "," + UnitCost + "," + Total + "]";
		}
		
}
