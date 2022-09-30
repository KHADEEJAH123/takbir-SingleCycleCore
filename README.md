# RISC-V Single Cycle Core
<div align='center'><img src="https://readme-typing-svg.demolab.com?font=Arial&size=22&pause=1000&color=F7F7F7&multiline=true&width=435&lines=RISC-V+Single+Cycle+Core" alt="Typing SVG" /><br>
<img src="https://readme-typing-svg.demolab.com?font=Arial&size=18&pause=1000&color=F7F7F7&multiline=true&width=435&lines=Designed+by+Khadeejah+Ashraf" alt="Typing SVG" />
</div>
<br>
\
![alt text](https://github.com/merledu/RISC-V-single-cycle-core/blob/master/Single%20Cycle%20RISC-V%20Core.PNG)
\
\
First of all get started by cloning this repository on your machine.  
```ruby
git clone https://github.com/KHADEEJAH123/SINGLE-CYCLE.git
```
Create a .txt file and place the ***hexadecimal*** code of your instructions simulated on ***Venus*** (RISC-V Simulator)\
Each instruction's hexadecimal code must be on seperate line as following. This program consists of 9 instructions.
```
00500113
00500193
014000EF
00120293
00502023
00002303
00628663
00310233
00008067
```
Then perform the following step
```ruby
cd SINGLE-CYCLE/src/main/Singlecycle/
```
Open **InstructionMem.scala** with this command. You can also manually go into the above path and open the file in your favorite text editor.
```ruby
open InstructionMem.scala
```
Find the following line
``` python
loadMemoryFromFile(mem, "SINGLE-CYCLE/src/main/Singlecycle/mem1.txt")
```
Change the .txt file path to match your file that you created above storing your own program instructions.\
After setting up the InstructionMem.scala file, go inside the SINGLE-CYCLE folder.
```ruby
cd root/SINGLE-CYCLE
```
And enter
```ruby
sbt
```
When the terminal changes to this type
```ruby
sbt:SINGLE-CYCLE>
```
Enter this command
```ruby
sbt:SINGLE-CYCLEi> test:runMain datapath.Launcher Top
```
After you get success
```ruby
sbt:SINGLE-CYCLE> test:runMain datapath.Launcher Top --backend-name verilator
```
After success you will get a folder ***test_run_dir*** on root of your folder. Go into the examples folder inside.\
There you will find the folder named Top. Enter in it and you can find the Top.vcd file which you visualise on **gtkwave** to\
see your program running.
