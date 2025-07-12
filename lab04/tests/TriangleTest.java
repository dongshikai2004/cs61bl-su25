import org.junit.Rule;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;
public abstract class TriangleTest {

    /** For autograding purposes; do not change this line. */
    abstract Triangle getNewTriangle();

    /* ***** TESTS ***** */

    // FIXME: Add additional tests for Triangle.java here that pass on a
    //  correct Triangle implementation and fail on buggy Triangle implementations.

    @Test
    public void test1() {
        // TODO: stub for first test
        Triangle t = getNewTriangle();
        // remember that you'll have to call on Triangle methods like
        // t.functionName(arguments), where t is a Triangle object
        assertThat(t.sidesFormTriangle(1,1,1)).isEqualTo(true);
        assertThat(t.sidesFormTriangle(1,2,1)).isEqualTo(false);
        assertThat(t.sidesFormTriangle(1,3,1)).isEqualTo(false);
        assertThat(t.sidesFormTriangle(1,2,2)).isEqualTo(true);
    }
    @Test
    public void test2(){
        Triangle t=getNewTriangle();
        assertThat(t.pointsFormTriangle(0,0,1,0,2,0)).isEqualTo(false);
        assertThat(t.pointsFormTriangle(0,0,1,0,-1,0)).isEqualTo(false);
        assertThat(t.pointsFormTriangle(0,0,0,0,1,0)).isEqualTo(false);
        assertThat(t.pointsFormTriangle(0,0,0,1,1,0)).isEqualTo(true);
    }
    @Test
    public void test3(){
        Triangle t=getNewTriangle();
        assertThat(t.triangleType(2,3,4)).isEqualTo("Scalene");
        assertThat(t.triangleType(2,2,2)).isEqualTo("Equilateral");
        assertThat(t.triangleType(2,2,1)).isEqualTo("Isosceles");
    }
    @Test
    public void test4(){
        Triangle t=getNewTriangle();
        assertThat(t.squaredHypotenuse(3,4)).isEqualTo(5);
        assertThat(t.squaredHypotenuse(5,12)).isEqualTo(13);
        assertThat(t.squaredHypotenuse(7,24)).isEqualTo(25);
    }
}
