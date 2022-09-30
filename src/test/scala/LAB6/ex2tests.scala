package LAB6
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class LAB6_EX2_Tests extends FreeSpec with ChiselScalatestTester {
  "LAB6_EX2" in {
    test(new counter_LAB6(10)) { c =>
      c.clock.step(20)
      c.io.out.expect(9.U)
    }
  }
}