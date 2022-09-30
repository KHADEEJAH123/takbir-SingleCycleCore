package LAB2
import chisel3._
import chisel3.util._
// Mux IO interface class
class Mux_2to1_IO extends Bundle {
val in_A = Input ( UInt (32. W))
val in_B = Input ( UInt (32.W))
val select = Input (Bool())
val out = Output ( UInt ())
}
// 2 to 1 Mux implementation
class Mux_2to1 extends Module {
val io = IO(new Mux_2to1_IO )
//val newA =Fill(32,io.select.asUInt)
// update the output
//io. out := io. in_A & ~(newA) | io. in_B &  newA
io. out := io. in_A & ~(Fill(32,io.select.asUInt)) | io. in_B &  Fill(32,io.select.asUInt)
}
//println (( new chisel3 . stage . ChiselStage ). emitVerilog ( new Mux_2to1 ()))