import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingTest {
    @Test
    fun test() {
        assertEquals("hoge", Greeting().greet())
    }
}
