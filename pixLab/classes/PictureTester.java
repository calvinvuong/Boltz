/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("beach.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("beach.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

    // activity 5 exercise 3
    // method to test keepOnlyBlue()
    public static void testKeepOnlyBlue() {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.keepOnlyBlue();
	beach.explore();
    }

    // activity 5 exercise 4
    // method to test negate()
    public static void testNegate() {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.negate();
	beach.explore();
    }

    // activity 5 exercise 5
    // method to test grayscale()
    public static void testGrayscale() {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.grayscale();
	beach.explore();
    }

    // activity 5 exercise 6
    // method to test fixUnderwater()
    public static void testFixUnderwater() {
	Picture water = new Picture("water.jpg");
	water.explore();
	water.fixUnderwater();
	water.explore();
    }

    // activity 6 exercise 1
    public static void testMirrorVerticalRightToLeft() {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorVerticalRightToLeft();
	caterpillar.explore();
    }

    // activity 6 exercise 2
    public static void testMirrorHorizontal() {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontal();
	caterpillar.explore();
    }

    // activity 6 exercise 3
    public static void testMirrorHorizontalBotToTop() {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontalBotToTop();
	caterpillar.explore();
    }

    // activity 6 challenge
    public static void testMirrorDiagonal() {
  Picture caterpillar = new Picture("caterpillar.jpg");
  caterpillar.explore();
  caterpillar.mirrorDiagonal();
  caterpillar.explore();
    }



 public static void testMirrorArms()
 {
   Picture snowman = new Picture("snowman.jpg");
   snowman.explore();
   snowman.mirrorArms();
   snowman.explore();
 }

 public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }




  public static void testCopy()
  {
    Picture canvas = new Picture("beach.jpg");
    canvas.createCollage();
    canvas.explore();
  }



  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //  testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
