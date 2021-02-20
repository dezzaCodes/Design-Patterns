package StrategyPattern;

public class Duck {
	//composed of of behaviour objects
	Swim swim;
	Quack quack;
	
	public Duck(Swim swim, Quack quack) {
		this.swim = swim;
		this.quack = quack;
	}
	
	// delegate to the objects
	// doesnt need to know of the implementation in duck class
	public void quack() {
		quack.quack();
	}
	
	public void swim() {
		swim.swim();
	}
	
	//adapt behaviour at run time
	public void setLoudQuack() {
		this.quack = new LoudQuack();
	}
	
	public void setSoftQuack() {
		this.quack = new SoftQuack();
	}
	
	public void setSlowSwim() {
		this.swim = new SlowSwim();
	}
	
	public void setFastSwim() {
		this.swim = new FastSwim();
	}
}
