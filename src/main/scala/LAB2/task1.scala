package LAB2

import chisel3._
import chisel3.util._
class LM_IO_Interfacee extends Bundle {
    val s0 = Input ( Bool ())
    val s1 = Input ( Bool ())
    val s2 = Input ( Bool ())
    val out = Output ( UInt (32. W))
}
class Mux_5to1 extends Module {
val io = IO( new LM_IO_Interfacee )
// Start coding here
io.out := MuxCase (false.B,Array(
(io.s0 === 0.B && io.s1 === 0.B && io.s2 === 0.B) -> 0.U,
(io.s0 === 1.B && io.s1 === 0.B && io.s2 === 0.B) -> 8.U,
(io.s0 === 0.B && io.s1 === 1.B && io.s2 === 0.B) -> 16.U,
(io.s0 === 1.B && io.s1 === 1.B && io.s2 === 0.B) -> 24.U, 
(io.s2 === 1.B) -> 32.U   
 )
)
}
// End your code here

//println (( new chisel3 . stage . ChiselStage ). emitVerilog ( new Mux_5to1 ))