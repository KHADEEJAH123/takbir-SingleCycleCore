package LAB6
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class Counter_task1_LAB6  extends FreeSpec with ChiselScalatestTester {
    "counter_LAB6" in {
        test(new counter_task1(13,4)){c=>
        c.clock.step(4)
        c.io.out.expect(8.U)


        }
    }
}