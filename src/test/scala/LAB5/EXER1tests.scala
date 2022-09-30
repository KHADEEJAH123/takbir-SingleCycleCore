package LAB5
import chisel3._
import org.scalatest._
import chiseltest._

class STAT_ALU extends FreeSpec with ChiselScalatestTester{
    "ALU Test" in { 
        test(new ALU_with_statements(4)){ c=>
        c.io.alu_oper.poke("b1111".U)
        c.io.arg_x.poke(3.U)
        c.io.arg_y.poke(0.B)
        c.clock.step(1)
        c.io.alu_out.expect(0.U)}
    }
}