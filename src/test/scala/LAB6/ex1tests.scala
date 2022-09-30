package LAB6
import chisel3._
import org.scalatest._
import chiseltest._

class LAB6_EX1 extends FreeSpec with ChiselScalatestTester{
    "Parallel Load" in {
        test(new shift_register()){c=>
        c.io.in.poke(4.U)
        c.clock.step(10)
        c.io.out.expect(0.U)

        }
    }
}