package da2.jdac.u1;

import java.io.Serializable;

public class Values implements Serializable{
	private double v1;
	private double v2;
	private double res;
	public double getV1() {
		return v1;
	}
	public void setV1(double v1) {
		this.v1 = v1;
	}
	public double getV2() {
		return v2;
	}
	public void setV2(double v2) {
		this.v2 = v2;
	}
	public double getRes() {
		//res= (v1 - 3)*(v2 + 2);
		res=(v1 * v2) + (v1 * 2) - (3 * v2) - (3 *2);
		return res;
	}
	public void setRes(double res) {
		this.res = res;
	}
	
	

}
