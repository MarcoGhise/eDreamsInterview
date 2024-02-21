# eDreamsInterview
Realtime coding during eDreams technical interview. 

## _Matrix unraveling_ 

Given an m x n matrix of characters, write a method that returns a String which
contains the concatenation of all the matrix’s diagonals, from top to bottom,
right to left.

For example, input
```
1 A 5 7 B N
2 B 6 8 K R
5 Q N 3 B 1
```

Output has to be: 
```
1 A2 5B5 76Q B8N NK3 RB 1
```
as a result (with or without spaces, doesn’t matter)

## _Solution_

By padding the matrix's rows shifting the first item to the right, we get an array like this
```
1 A 5 7 B N ˚ ˚
˚ 2 B 6 8 K R ˚
˚ ˚ 5 Q N 3 B 1
```

Reading the rows with the same column position, we get the desired outcome.
```
--------ˇ
1 A 5 7 B N ˚ ˚
˚ 2 B 6 8 K R ˚
˚ ˚ 5 Q N 3 B 1
```
