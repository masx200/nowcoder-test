package  com.github.masx200.nowcoder_test.坐标移动

import com.github.masx200.nowcoder_test.utils.MockTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun test1() {

        assertEquals(
            ("10,-10" + "\n").trim(),
            MockTest("A10;S20;W10;D30;X;A1A;B10A11;;A10;" + "\n") { main(arrayOf()) }[0].trim()
        )
    }


}