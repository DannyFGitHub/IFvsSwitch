# IF vs Switch (Java8)
An NTO (Not too official) test to help me make up my mind on IF and Switch speeds.

Feedback for optimising these tests are welcome. Also would like to graph the results with JavaFX eventually and perform the tests on other languages.

A series of timed stress tests for IF vs Switch statements accomplishing the same task.
Timed using System.nanoTime();

# Hypothesis
Switch is faster.

They (you know, they) say that up to 5 cases the switch will use a look up hash table and that the IF statement is slower.

## Observations
The IF statement may win more number of times sometimes, however, if we take a look at the accumulation of time elapsed
when the SWITCH wins, the difference is a considerable amount of time.

## Results
The Switch mostly always wins for cases under 5. There are times still that the IF statement will be faster.

Interestingly, the IF statement seems to be the fastest consistently for scenarios where case is over 5.
Including when the case is 15, IF statements seems to consistently win.

However, when running all tests at once, the SWITCH sometimes comes out winning by a substantial amount.

## Conclusions
I will use Switches for low cases or decision making not in a loop.
If statements for heavily looped conditions.

