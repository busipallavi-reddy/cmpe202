Java Lambda Assignment

Strategy

In the original strategy implementation, I have 3 classes namely LandStrategy, RiverStrategy and SkyStrategy which implement the IStrategy interface to display the scenary.
From the main scenary class I have to invoke these 3 classes to call the respective scenaries.

But with Lambda implementation, it becomes more easily understandable as now there is no such need for the 3 different classes of the startegies. From the main class itself, I invoke the scenary as:
Istrategy river = () -> { System.out.println("---River Scenary!!! ---"); };
river.scenary();

Thus with lambda, it becomes easier as the person who is trying to understand the code, the definition is now inline.

I have also implemented the Observer(Pessimist and Optimist) pattern in a similar manner.
