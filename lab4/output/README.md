### CRC Cards

---

**Class** 

Customers

**Responsibility** 

Knows name, phone number, party size

Registers with Restaurant manager to wait in the queue

Receives messages from the restaurant manager

Reply to the message as "confirm" or "leave"

**Collaborators**

Restaurant Manager

---

**Class** 

Restaurant Manager

**Responsibility** 

Registers customer

Add/Remove customer in the waiting line

Send messages to customers

Take appropriate decision on customer reply(allocating table or removing customer)

Get notified by tables about status

Take action whether a table can satisfy the party size and send message to customer accordingly

**Collaborators**

Customers

Tables

---

**Class** 

Tables

**Responsibility** 

Provides table id

Provides table capacity

Knows current table state

Notify the restaurant manager about the availability 

**Collaborators**

Restaurant Manager





## Design

#### Observer pattern

In this design, I used the Observer pattern as each of the tables act as subjects, which notify the restaurant manager, who is an observer. When a table is available, it notifies the Restaurant manager who takes the action of sending messages to the appropriate customer. After a customer accepts the message/invitation, the table then becomes occupied.

#### Chain of Responsibility

In this design, chain of responsibility is implemented where a set of objects (customers) handle a request initiated by the client (restaurant manager).  Thus all the customer object acts as concrete handlers and the restaurant manager class acts as a client.

If the customer on the top of the queue cannot handle the request  (i.e. the condition of number of people in the party less than or equal  to available table capacity is not satisfied), it forwards the request to its successor (other customers in the queue).

When a particular handler (customer) handles a request or is able to  satisfy the condition, then a notification message is sent to that  customer that they are at the top of the queue and a table is available  for them.

If a customer replies “Confirm”, then that particular table is  allocated to that customer and that customer is deleted from the waiting  queue. Consequently, if a customer replies “Leave”, that customer is deleted from the queue and the chain of responsibility is run again to find the next appropriate customer fit for the available table size.