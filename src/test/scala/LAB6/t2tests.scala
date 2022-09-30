package LAB6
import chisel3._
import org.scalatest._
import chiseltest._

class LAB6_TASK2  extends FreeSpec with ChiselScalatestTester {
    "counter_with_xor Test" in {
        test(new counter_with_xor()){c=>
        c.clock.step(30)
        }}}