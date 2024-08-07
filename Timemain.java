class Time {
	
	int hours, min, sec;
	
	Time(){
	
		hours = min = sec = 0;		
	}
	
	Time(int h, int m, int s){
		
		hours = h; 
		min = m;
		sec = s;
	}
	
	public Time sum(Time t2){
		
		Time t3 = new Time();
		
		t3.sec = sec + t2.sec;
		t3.min = min + t2.min;
		t3.hours = hours + t2.hours;
		
		if(t3.sec >= 60){
		
			t3.min += t3.sec / 60;
			t3.sec = t3.sec % 60;
		}
	
		if(t3.min >= 60){
			
			t3.hours += t3.min / 60;
			t3.min = t3.min % 60;
		}
	
		return t3;
	}
	
	void display(){
		
		System.out.println("HH:MM:SS = " + hours + ":" + min + ":" + sec);		
	}	
	
}

class Timemain {
	
	public static void main(String args[]){
		
		Time t1 = new Time(4, 35, 55);
		Time t2 = new Time(5, 10, 15);
		
		t1.display();
		t2.display();
		
		Time t3 = t1.sum(t2);
		
		t3.display();	
	}
	
}




