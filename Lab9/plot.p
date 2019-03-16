#set the common properties for all graphs
set grid
set ylabel "Time Taken (Seconds)"
set xlabel "Number of Elements Removed"

#plot the first graph in window 0
set term x11 0
set title "Time Taken to Remove Elements using removeRange(..)"
plot "versionOne.txt" with linespoints lt 2 pt 2 ps 2

#plot the second graph in window 1
set term x11 1
set title "Time Taken to Remove Elements using removeRangeV2(..)"
plot "versionTwo.txt" with linespoints lt 3 pt 2 ps 2