package com.practice.kata.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchSolutionOneTest
{
   int[] arrayListZero  = {};
   int[] arrayListOne   = { 1 };
   int[] arrayListThree = { 1,
                            3,
                            5 };
   int[] arrayListFour  = { 1,
                            3,
                            5,
                            7 };

   @Test
   public void givenAnEmptyArrayShouldReturnNegative()
   {
      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 20,
                                                                 arrayListZero ) );
   }

   @Test
   public void givenALenghtOneArrayAndANonExistingNumberShouldReturnNegative()
   {
      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 3,
                                                                 arrayListOne ) );
   }

   @Test
   public void givenALenghtOneArrayAndAExistingNumberShouldReturnZero()
   {
      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( 0,
                    binarySearchSolutionOne.searchNumberInArray( 1,
                                                                 arrayListOne ) );
   }

   @Test
   public void givenALenghtThreeArrayAndFirstExistingNumberShouldReturnZero()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( 0,
                    binarySearchSolutionOne.searchNumberInArray( 1,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndSecondExistingNumberShouldReturnOne()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( 1,
                    binarySearchSolutionOne.searchNumberInArray( 3,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndThirdExistingNumberShouldReturnTwo()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( 2,
                    binarySearchSolutionOne.searchNumberInArray( 5,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndFirstNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 0,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndSecondNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 2,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndThirdNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 4,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtThreeArrayAndFourthNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 6,
                                                                 arrayListThree ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFirstExistingNumberShouldReturnZero()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( 0,
                    binarySearchSolutionOne.searchNumberInArray( 1,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndSecondExistingNumberShouldReturnOne()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( 1,
                    binarySearchSolutionOne.searchNumberInArray( 3,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndThirdExistingNumberShouldReturnTwo()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( 2,
                    binarySearchSolutionOne.searchNumberInArray( 5,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFourthExistingNumberShouldReturnThree()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( 3,
                    binarySearchSolutionOne.searchNumberInArray( 7,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFirstNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 0,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndSecondNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 2,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndThirdNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 4,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFourthNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 6,
                                                                 arrayListFour ) );
   }

   @Test
   public void givenALenghtFiveArrayAndFifthNonExistingNumberShouldReturnNegative()
   {

      BinarySearchSolutionOne binarySearchSolutionOne = new BinarySearchSolutionOne();
      assertEquals( -1,
                    binarySearchSolutionOne.searchNumberInArray( 8,
                                                                 arrayListFour ) );
   }

}
