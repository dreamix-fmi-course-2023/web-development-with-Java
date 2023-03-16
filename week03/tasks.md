# Car Dealership Program
This is a Java program that simulates a car dealership. The program includes three classes: Car, Dealership, and Invoice.

## Class Descriptions
### Car Class
The Car class represents a car, and has the following properties:

- make (string)
- model (string)
- year (int)
- price (double)
The Car class has the following methods:

- A constructor that sets the make, model, year, and price of the car.
- Getters and setters for each property.


## CarRepository Class
The CarRepository class is responsible for managing the car data, and has the following methods:

- A method called addCar that takes a Car object and adds it to the car inventory.
- A method called removeCar that takes a Car object and removes it from the car inventory.
- A method called searchCars that takes a make, model, year, and price and returns a list of Car objects that match the search criteria.
- A method called getAllCars that returns a list of all the cars in the inventory.

## CarService Class
The CarService class is responsible for implementing the business logic of the car dealership, and has the following methods:

- A method called addCar that takes a Car object and adds it to the car inventory using the CarRepository object.
- A method called removeCar that takes a Car object and removes it from the car inventory using the CarRepository object.
- A method called searchCars that takes a make, model, year, and price and returns a list of Car objects that match the search criteria using the CarRepository object.
- A method called getAllCars that returns a list of all the cars in the inventory using the CarRepository object.
- A method called sellCar that takes a Car object and a customer name as parameters, and creates an Invoice object for the sale.
- A method called printInvoice that takes an Invoice object as a parameter and prints the invoice details, including the total price.

### Invoice Class
The Invoice class represents an invoice for a car sale, and has the following properties:

- customerName (string)
- purchaseDate (Date)
- car (Car object)
- salesPrice (double)
- taxRate (double)

#### The Invoice class has the following methods:

- A constructor that sets the customer name, purchase date, car, sales price, and tax rate of the invoice.
- A method called getTotalPrice that calculates and returns the total price of the invoice, including taxes.
- Getters and setters for each property.


## InvoiceRepository Class
The InvoiceRepository class is responsible for managing the invoice data, and has the following methods:

- A method called addInvoice that takes an Invoice object and adds it to the invoice history.
- A method called getInvoiceHistory that returns a list of all the invoices in the history.
## InvoiceService Class
The InvoiceService class is responsible for implementing the business logic of the car dealership related to invoices, and has the following methods:

- A method called addInvoice that takes an Invoice object and adds it to the invoice history using the InvoiceRepository object.
- A method called getInvoiceHistory that returns a list of all the invoices in the history using the InvoiceRepository object.
- A method called calculateTotalPrice that returns the total price of the invoice, including taxes.
### Dealership Class
The Dealership class represents a car dealership, and has the following properties:

- name (string)
- carService (CarService object)
- invoiceService (InvoiceService)
#### The Dealership class has the following methods:

- A constructor that sets the name of the dealership, a instance of CarService object and instance of InvoiceService.
- A method called addCar that takes a Car object and adds it to the dealership's inventory using the CarService object.
- A method called removeCar that takes a Car object and removes it from the dealership's inventory using the CarService object.
- A method called searchCars that takes a make, model, year, and price and returns a list of Car objects that match the search criteria using the CarService object.
- A method called sellCar that takes a Car object and a customer name as parameters, and creates an Invoice object for the sale using the - CarService object and the InvoiceService object.
- A method called printInvoice that takes an Invoice object as a parameter and prints the invoice details, including the total price using the InvoiceService object.
- A method called getSalesByMake returns a Map that shows the number of cars sold for each make.
- A method called getTotalRevenue calculates the total revenue of the dealership by summing the total price of all invoices.


