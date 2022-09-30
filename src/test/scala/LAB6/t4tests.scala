package LAB6
import chisel3._
import org.scalatest._
import chiseltest._
class up_down_LAB6 extends FreeSpec with ChiselScalatestTester{
    "COUNTER_TASK4" in {
        test(new up_down_counter()){ c =>
        c.io.up_down.poke(0.B)
        c.clock.step(20)
        c.io.out.expect(1.B)
        }
    }
}