package LAB6
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import chisel3.experimental.BundleLiterals._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class LAB6_EX4 extends FreeSpec with ChiselScalatestTester {

  "LAB6_EX4_TESTS" in {
    test(new My_Queue1) { c =>
      c.io.in.bits.poke(8.U)
      c.io.in.valid.poke(1.B)
      c.clock.step(20)
      c.io.out.ready.poke(1.B)
      c.io.out.bits.expect(8.U)
    }
  }
}