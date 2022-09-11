package IfStatements;

public class WhatIf 
{

            public static void main( String[] args )
	{
		int people = 20;
		int cats = 15;
		int dogs = 30;

		if ( people < dogs )
		{
			System.out.println( "Too many dogs!  The world is doomed!" );
		}

		if ( people > dogs )
		{
			System.out.println( "Not many dogs!  The world is saved!" );
		}

		if ( people < cats )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > cats )
		{
			System.out.println( "The world is dry!" );
		}

		cats += 5;

		if ( people >= cats )
		{
			System.out.println( "People are greater than or equal to cats." );
		}

		if ( people <= cats )
		{
			System.out.println( "People are less than or equal to cats." );
		}

		if ( people == cats )
		{
			System.out.println( "People are cats." );
		}
	}
}
//The if under the code helps to simulate different scenario//
//curly braces can till the computer thart this scenario ended//