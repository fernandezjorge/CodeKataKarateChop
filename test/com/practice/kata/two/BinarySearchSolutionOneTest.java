package com.practice.kata.two;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchSolutionOneTest
{
   BinarySearchSolutionOne binarySearchSolutionOne;
   int[]                   arrayListZero  = {};
   int[]                   arrayListOne   = { 1 };
   int[]                   arrayListThree = { 1,
                                              3,
                                              5 };
   int[]                   arrayListFour  = { 1,
                                              3,
                                              5,
                                              7 };

   @Before
   public void setUp()
   {
      binarySearchSolutionOne = new BinarySearchSolutionOne();
   }

   @Test
   public void givenAnEmptyArrayShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 20,
                                                                 arrayListZero ) );
   }

   @Test
   public void givenALenghtOneArrayAndANonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 3,
                                                                 arrayListOne ) );
   }

   @Test
   public void givenALenghtOneArrayAndAExistingNumberShouldReturnZero()
   {
      assertEquals( 0,
                    binarySearchSolutionOne.searchNumberInArray( 1,
                                                                 arrayListOne ) );
   }

   @Test
   public void givenALenghtThreeArrayAndFirstExistingNumberShouldReturnZero()
   {
      assertEquals( 0,
                    binarySearchSolutionOne.searchNumberInArray( 1,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndSecondExistingNumberShouldReturnOne()
   {
      assertEquals( 1,
                    binarySearchSolutionOne.searchNumberInArray( 3,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndThirdExistingNumberShouldReturnTwo()
   {
      assertEquals( 2,
                    binarySearchSolutionOne.searchNumberInArray( 5,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndFirstNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 0,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndSecondNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 2,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndThirdNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 4,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndFourthNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 6,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFirstExistingNumberShouldReturnZero()
   {
      assertEquals( 0,
                    binarySearchSolutionOne.searchNumberInArray( 1,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndSecondExistingNumberShouldReturnOne()
   {
      assertEquals( 1,
                    binarySearchSolutionOne.searchNumberInArray( 3,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndThirdExistingNumberShouldReturnTwo()
   {
      assertEquals( 2,
                    binarySearchSolutionOne.searchNumberInArray( 5,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFourthExistingNumberShouldReturnThree()
   {
      assertEquals( 3,
                    binarySearchSolutionOne.searchNumberInArray( 7,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFirstNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 0,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndSecondNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 2,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndThirdNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 4,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFourthNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 6,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFifthNonExistingNumberShouldReturnNegative()
   {
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 8,
                                                                 arrayListFour ) );
   }
}
