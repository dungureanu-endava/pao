## Lab 6

### I. Implement a small project that simulates a pizza place. 
The shop will have customers that will be able to order one or more items from the menu bellow.

### Menu:
- Pizzas (https://www.tasteatlas.com/most-popular-pizzas-in-italy): 
  - Pizza ai Funghi: 
    - Price: 12$
    - Ingredients: Tomato Sauce, Champignon, Porcino, Mozzarella, Parsley, Olive Oil
  - Pizza Capricciosa:
    - Price: 15$
    - Ingredients: Tomato Sauce, Prosciutto Crudo, Champignon, Artichoke, Mozzarella, Olives
  - Pizza Napoletana: 
    - Price: 13.5$
    - Ingredients: Tomato, Mozzarella, Basil, Olive Oil, Oregano
- Drinks (https://www.toptenslist.com/worlds-most-consumed-beverages.html):
  - Cappuccino:
    - Price: 2.5$
  - Flat White:
    - Price: 2.7$
  - Pepsi Can:
    - Price: 1.2$
  - Pepsi Bottle:
    - Price: 2$
  - Fanta Can:
    - Price: 1.3$
  - Fanta Bottle:
    - Price: 2.2$

### Phase 1
Add one or two more pizzas to the menu. Examples:
- Pizza Bianca:
  - Price: 7$
  - Ingredients: Olive Oil
- Pizza Quattro Formaggi:
  - Price: 16.5$
  - Ingredients: Mozzarella, Fontina, Grana Padano, Gorgonzola, Tomato, Basil

### Phase 2
Add 2-4 more drinks to the menu. Examples:
- Timisoreana Bottle:
  - Price: 1.2$
- Timisoreana Pint:
  - Price: 0.8$
- Dr.Pepper Can:
  - Price: 1.5$
- Coca-Cola Can:
  - Price: 1.4$

### Phase 3
When finishing the order, besides displaying the ordered items, also display the total amount to pay.

### Phase 4
Add offers to your menu. Show the customer your offers the first time that you display the menu. 
All offers should be applied after the order is placed.
- Add a 2 for one pizza offer. The cheapest pizza should not be taken in consideration when calculating the total amount.
- Add a 20% discount to all soft drinks. User a Marker Interface to identify soft drinks. 

### Phase 5
Add salads to the menu. Examples:
- Salads (https://www.acouplecooks.com/best-salad-recipes/):
  - Kale Salad:
    - Price: 5$
    - Ingredients: Kale, Parmesan Cheese, Olive Oil
  - Caesar Salad:
    - Price: 7$
    - Ingredients: Romaine Salad, Croutons, Parmesan Cheese, Lemon Juice, Olive Oil

Add a menu offer. Any combination of pizza, salad and drink for 15$.

### Phase 6
When picking a pizza, give the customer the options of picking the size and crust type. Example:
- Sizes:
  - Small Size
    - Price modifier: -2$
  - Medium Size (Default)
    - Price modifier: 0$
  - Large Size
    - Price modifier: +3$
- Crust:
  - Classic Crust (Default)
    - Price modifier: 0$
  - Italian Crust
    - Price modifier: -0.5$
  - Stuffed Crust
    - Price modifier: +1.5$

Consider enhancing the Item interface to allow you to customize order items.

### Phase 7
As part of the main menu options, add one more option to allow the customer to remove items from the basket.
Example: '9. Remove items from basket'
