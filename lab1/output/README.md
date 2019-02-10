# cmpe202 lab1
The idea is to extend the gumball machine pattern and typical projects to support all the 3 types of gumball machines. Discussing the commonality and variability of the 3 gumball machines -
Gumball machine 1 and 2 are similar in the type of coins they accept but vary in the cost of each gumball. Whereas, gumball machine 3 has the same cost as gumball machine 2 but accepts all kind of coins.
So, created a class whose constructor takes 3 arguments -
GumballMachine(number of gumballs, cost of each gumball, set of coins it accepts)
Implemented this concept for both the projects. 
In gumball java pattern project, renamed the HasQuarterState and NoQuarterState as HasCoinState and NoCoinState, ejected "Money" instead of Quarter and added 2 more methods similar to insertQuarter namely, insertDime, insertNickel. And all of these methods call insertMoney(int cents) to calculate the money inserted till now for this gumball object.
