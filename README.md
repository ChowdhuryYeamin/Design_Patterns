# Design_Patterns: Strategy Pattern_HW1

## Shave Ice Point-of-Sale (POS) System

### Overview
This project is a Shave Ice POS System tailored for two different types of outlets: 
- **Kiosks**: A simple outlet where employees manually write orders on tickets and accept only cash payments.
- **Stores**: A well-equipped outlet with advanced computer systems, capable of generating automatic order numbers, and accepting both cash and credit card payments.

The system is designed utilizing the **Strategy Design Pattern** to dynamically change the behaviors (order numbering and payment processing) based on the type of outlet.

### Strategy Pattern Context

The Strategy Pattern allows defining a family of algorithms (or strategies) and makes them interchangeable. This pattern is particularly useful when there's a need to vary some aspect of an algorithm dynamically.

For the POS system:
1. **Order Numbering** is a strategy, with two concrete implementations:
    - Manual order numbering for Kiosks.
    - Automated order numbering for Stores.
2. **Payment Processing** is another strategy, with two concrete implementations:
    - Cash payment.
    - Credit card payment.

This design ensures that the system can easily be extended to accommodate more strategies in the future without changing the existing codebase.

### Project Structure

#### Interfaces
1. **OrderNumberStrategy**: Defines how order numbers are generated.
2. **PaymentStrategy**: Describes how payments are processed.

#### Concrete Strategies
1. **ManualOrderNumber**: Implements the `OrderNumberStrategy` for manual entry by kiosk employees.
2. **AutomatedOrderNumber**: Implements the `OrderNumberStrategy` for automatic generation by store systems.
3. **CashPayment**: Implements the `PaymentStrategy` for cash payments, catering to both kiosks and stores.
4. **CreditCardPayment**: Implements the `PaymentStrategy` for credit card payments, designed for stores.

#### Context
- **POS**: The context class that uses the strategies. It allows setting a specific strategy for order numbering and payment processing.

#### Driver Class
- **POSTest**: Demonstrates the usage of different strategies for kiosks and stores.

### Usage

1. For **Kiosks**: Employees manually input the order number from the ticket and process cash payments.
2. For **Stores**: Order numbers are auto-generated. Employees can choose between cash and credit card payment methods.

