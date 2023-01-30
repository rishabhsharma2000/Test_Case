package Testing;

public class Testclass {
public boolean pallindrome(int  number) {
	int sum=0,temp = number,ld;
	while(number !=0 ) {
		ld = number%10;
		sum = (sum*10)+ld;
		number /= 10;
	}
	
	if(sum == temp)
		return true;
	else
		return false;
}

public int charFrequency(String employeeName, char freqCharchater) {
	
	int count=0;
	for(int i=0; i<employeeName.length(); i++) {
		if(employeeName.charAt(i) == freqCharchater) {
			count++;
		}
		
	}
	return count;
}
}
