package LAB5
import chisel3._
import org.scalatest._
import chiseltest._
class LAB5_EX2 extends FreeSpec with ChiselScalatestTester{
    "lab5_EX2_Test" in {
        test(new Mux(UInt(2.W))){ c =>
        c.io.in1.poke(2.U)
        c.io.in2.poke(1.U)
        c.io.sel.poke(1.B)
        c.clock.step(3)
        c.io.out.expect(2.U)
    }
}
}