public class Recursion{
    
    //Write and run the recursive factorial routine we wrote in class.
    public int factorial( int n ) {
        if ( n < 0 ) {
	    return -1;
	} else if ( n <= 1 ) {
	    return 1;
	} else {
	    return n * factorial( n - 1 );
	}
    }

    
    //Write these recursive functions as defined in class:
    //fib(n) –> returns the nth fib number
    public int fibonacci( int n ) {
	if ( n < 1 ) {
	    return -1;
	} else if ( n <= 2 ) {
	    return 1;
	} else {
	    return fibonacci( n - 2 ) + fibonacci( n - 1 );
	}
    }


    //len(s) –> returns the length of a string
    public int length( String s ) {
	if (s.equals("")) {
	    return 0;
	} else {
	    return 1 + length( s.substring(1) );
	}
    }


    //count(s,c) –> counts the number of times character c occurs in String s.
    public int count( String s , char c ) {
	if ( s.length() == 0 ) {
	    return 0;
	}
	if ( s.charAt(0) == c ) {
	    return 1 + count( s.substring(1),c );
	} else {
	    return 0 + count( s.substring(1),c );
	}
    }


    //Do these coding bat problems:
    //codingbat.com/prob/p120015
    //See fibonacci


    //codingbat.com/prob/p107330
    public int bunnyEars2(int bunnies) {
	if ( bunnies == 0 ) {
	    return 0;
	}
	if ( bunnies % 2 == 0 ) {
	    return 3 + bunnyEars2( bunnies - 1 );
	} else {
	    return 2 + bunnyEars2( bunnies - 1 );
	}
    }



    //codingbat.com/prob/p186177
    public int strCount(String str, String sub) {
	if ( str.length() < sub.length() ) {
	    return 0;
	}
	if ( str.substring(0,sub.length()).equals(sub) ) {
	    return 1 + strCount( str.substring(sub.length()),sub );
	}
	return strCount( str.substring(1),sub );
    }



    //codingbat.com/prob/p163932
    public int sumDigits(int n) {
	if ( n < 10 ) {
	    return n;
	} else { 
	    return n % 10 + sumDigits( n / 10 );
	}
    }



    //codingbat.com/prob/p183394
    public String allStar(String str) {
	if ( str.length() <= 1 ) {
	    return str;
	}
	return str.substring(0,1) + "*" + allStar( str.substring(1) );
    }



}
