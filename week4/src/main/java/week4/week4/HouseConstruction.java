package week4.week4;

public class HouseConstruction {
	public double cost(String standard_material,String fully_automated,double sq_feet) {
		double cost=0;
		if(standard_material=="yes" && fully_automated=="no") {
			cost=sq_feet*1200;
		}
		else if(standard_material=="above" && fully_automated=="no") {
			cost=sq_feet*1500;
		}
		else if(standard_material=="high" && fully_automated=="no") {
			cost=sq_feet*1800;
		}
		else if(standard_material=="high" && fully_automated=="yes") {
			cost=sq_feet*2500;
		}
		return cost;
	}

}
