import org.junit.jupiter.api.*;

public class JUnitExamples {
     @BeforeAll
    static void  beforeAll(){
        System.out.println("Before all");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("  Before each");
    }
    @AfterAll
    static void  afterAll(){
        System.out.println("After all");
    }
    @AfterEach
    void  afterEach(){
        System.out.println("After each");
    }
    @Test
    void firstTest() {
        System.out.println("   First Test()");
    }

    @Test
    void secondTest() {
        System.out.println("     Second Test()");
    }
}