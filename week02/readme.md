# Lab tasks

# Collections
Before starting your task create a package named *bg.uni.fmi.lab02.collections*

When you are working on your solution you can create a single class Exercise where you can write your function solutions, or create class for each task (it's up to you).

## Task 0
Write a method to insert an element into the array list at the first position

## Task 1
Write a method to retrieve an element (at a specified index) from a given list.

## Task 2
Write a method to remove the third element from an array list.

## Task 3
Write a method to search an element in a list.

## Task 4
Write a method to sort a given array list. (list of String/Integer/Dog).
Implement Dog class with attribute breed and weight, sort the array by weight property.
Tip: implement the task with Comparator and Comparable

## Task 5
Write a method to replace the second element of a ArrayList with the specified element.

## Task 6 
Write a Java program to count the number of key-value (size) mappings in a map.

## Task 7
Write the following structure against aircraft tail number (9H-VCA) associate a list of leg information (fromAirport["LBSF"], toAirport["EBBR"], date).
Fill test information
Extract legs inside list/set that have from/to airport for a specific airport
(Example: All flight legs for airport LBSF)

FlightLeg {
    private String fromAirport;
    private String toAirport;
    private LocalDate date;
}

Map<String, Flightleg>

# Streams

Before starting your task create a package named *bg.uni.fmi.lab02.streams*

Imagine you need to design a simple shop with a bascket. The following structure is used

```
User {List<Order>}
    Order {enum Status ; List<OrderLine> ; LocalDate ; enum PaymentMethod}
        OrderLine { enum ; Item ;  }
            Item { String }
        PaymentMethod
```

User will have a list of orders. An order will be a combination of status (enum), list of order items, date of order (LocalDate) and payment method (enum)

Order of implementation: Item -> OrderList -> PaymentMethod -> Order -> User

* Create a class named Item inside *entity* package which consists of description:String and price:BigDecimal.

* Create OrderLine which holds information for product, enum for status, boolean specialOffer and count
Implement setters/getters/constructor

* Create class Order that holds information for id, status:OrderStatus, creationDate, totalPrice, paymentMethod, deliveryDueDate, user.
  * Write constructors: default by status, by id, by array of lines (use ...), getters, setters, toString, isActive

* Create a class User with list of orders

Write your enums in VO (value object) package;

```
package ....streams.vo;

public enum OrderLineStatus {
    IN_STOCK, OUT_OF_STOCK, WAITING_FOR_STOCK
}
```

```
package ....streams.vo;

public enum OrderStatus {
    DRAFT, ACTIVE, INACTIVE
}
```

```
package ....streams.vo;

public enum PaymentMethod {
    CARD,
    CASH_ON_SITE,
    CASH_ON_DELIVERY
}
```

Write all your business logic inside *service* package (bg.uni.fmi.lab02.streams.service)

```
public class SearchExercise {

    /**
     * extract all active orders
     * @param user
     * @return List<Order>
     */
    public List<Order> getActiveOrders(User user) {
        return null;
    }

    public List<Order> getActiveOrdersByIteration(User user) {
        return null;
    }

    /**
     * Return order by a specific id
     * @param orders
     * @param orderId
     * @return Order
     */
    public Order getOrderById(List<Order> orders, long orderId) {
        return null;
    }

    public Order getOrderByIdIteration(List<Order> orders, long orderId) {
        return null;
    }

    /**
     * Return orders that have specific description for item
     * @param user
     * @param description
     * @return List<Order>
     */
    public List<Order> getOrdersThatHaveItemDescription(User user, String description) {
        return null;
    }

    /**
     * @return true if customer has at least one order with status ACTIVE
     */
    public boolean hasActiveOrders(User user) {
        return null;
    }

    /**
     * Return true if inside the Order we don't have OrderLine with special offer
     */
    public boolean canBeReturned(Order order) {
        return null;
    }

    /**
     * Return the order with maximum total price
     * @param user
     * @return
     */
    public Optional<Order> getMaxPriceOrder(User user) {
        return null;
    }
}
```

## Task 9
Obtain a list of products belongs to category “Books” with price > 100

## Task 10
Obtain a list of order with products belong to category “Baby”

## Task 11
 Obtain a list of product with category = “Toys” and then apply 10% discount

## Task 12
Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
