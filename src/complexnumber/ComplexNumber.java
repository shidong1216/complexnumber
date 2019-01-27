package complexnumber;

public class ComplexNumber {
	 protected double real;
	 protected double image;
	 
	 public ComplexNumber(){
		 
	 }
	 public ComplexNumber(double real, double img) {
		 this.real= real;
		 this.image=img;
	 }
	
	 public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImage() {
		return image;
	}
	public void setImage(double image) {
		this.image = image;
	}
	
	public ComplexNumber add(ComplexNumber input) {
		ComplexNumber result = new ComplexNumber();
		result.real= this.real+ input.real;
		result.image= this.image+input.image;
		return result;
	}
	
	public ComplexNumber sub(ComplexNumber input) {
		ComplexNumber result = new ComplexNumber();
		result.real= this.real-input.real;
		result.image= this.image-input.image;
		return result;
	}
	
	//(a+bi)(c+di) = ac + adi + bci + bdi2
	public ComplexNumber times(ComplexNumber input) {
		ComplexNumber result = new ComplexNumber();
		result.real= this.real*input.real-this.image*input.image;
		result.image= this.real*input.image+ this.image*input.real;
		return result;
	}
	//
	public ComplexNumber div(ComplexNumber input) {
		ComplexNumber result = new ComplexNumber();
		double denomiator = input.real*input.real+input.image*input.image;
		result.real= (this.real*input.real+this.image*input.image)/denomiator;
		result.image=(input.real*this.image-this.real*input.image)/denomiator;
		return result;
	}
	
	@Override
	public String toString() {
		if(image >0) {
		return real + "+" + image + "i";
		}else {
			return real + (image + "i");
		}
	
	}
	
	
	 
}
	
	
	
