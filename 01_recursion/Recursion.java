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



    //count(s,c) –> counts the number of times character c occurs in String s.



    //Do these coding bat problems:
    //codingbat.com/prob/p120015



    //codingbat.com/prob/p107330



    //codingbat.com/prob/p186177



    //codingbat.com/prob/p163932



    //codingbat.com/prob/p107330



    //codingbat.com/prob/p183394



}
