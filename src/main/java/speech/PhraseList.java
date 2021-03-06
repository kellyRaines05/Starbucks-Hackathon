package speech;

import com.microsoft.cognitiveservices.speech.PhraseListGrammar;
import com.microsoft.cognitiveservices.speech.Recognizer;

public class PhraseList {

    public static PhraseListGrammar getPhraseList(Recognizer recognizer)
    {
        PhraseListGrammar phraseList = PhraseListGrammar.fromRecognizer(recognizer);

        String[] phrases = {"Short", "Tall", "Grande", "Venti", "Trenta", "Pike Place Roast", "Dark Roast", "Blonde Roast",
                "Pour Over", "Iced Coffee", "Iced Coffee with Milk", "Iced Coffee Refill", "Cold Brew", "Cold Brew with Milk",
                "Vanilla Sweet Cream Cold Brew", "Cold Brew with Cold Foam", "Salted Caramel Cream Cold Brew",
                "Cold Brew Refill", "Caffe Misto", "Hot Coffee Refill", "Draft", "Nitro Cold Brew",
                "Vanilla Sweet Cream Nitro Cold Brew", "Honey Almondmilk Nitro Cold Brew", "Latte",
                "Chocolate Almondmilk Shaken Espresso", "Toasted Vanilla Shaken Espresso",
                "Cinnamon Dolce Latte", "Flat White", "Honey Almondmilk Flat White", "Caramel Macchiato",
                "Mocha", "White Mocha", "Pistachio Latte", "Peppermint Mocha", "Peppermint White Mocha",
                "Irish Creme", "Caramel Brulee", "Pumpkin Spice Latte", "Americano", "Espresso", "Espresso Con Panna",
                "Cappuccino", "Iced Shaken Espresso", "Frappuccino", "Coffee", "Espresso", "Caramel", "Java Chip",
                "Caffé Vanilla", "White Chocolate Mocha", "Caramel Ribbon Crunch", "Mocha Cookie Crumble", "Chai Crème",
                "Double Chocolaty Chip Crème", "Vanilla Bean Crème", "Crème", "Matcha", "Syrup", "Strawberry",
                "Caramel Ribbon Crunch", "Chocolate Cookie Crumble Crème", "Blended Strawberry Lemonade", "Pistachio",
                "Pistachio Crème", "Tea Latte", "Chai", "Classic Chai", "Matcha Green Tea", "Royal English Breakfast",
                "Custom", "Iced Tea", "Black Iced Tea", "Green Iced Tea", "Passion Tango", "Peach Green Iced Tea",
                "Tea Lemonade", "Custom Tea", "Black Tea Lemonade", "Green Tea Lemonade", "Passion Tango Tea Lemonade",
                "Peach Green Tea Lemonade", "Custom Tea", "Emperor's Cloud", "Jade Citrus Mint", "Earl Grey",
                "Peach Tranquility", "Honey Citrus Mint", "Iced Tea Refill", "Tea Refill", "Hot Tea Refill",
                "Add Tea Bag", "Hot Chocolate", "White Hot Chocolate", "Cold Milk", "Steamed Milk", "Vanilla Crème",
                "Lemonade", "Matcha Lemonade", "Cold Apple Juice", "Steamed Apple Juice", "Caramel Apple Spice",
                "Strawberry Acai", "Mango Dragonfruit", "Kiwi Starfruit", "Refresher", "Pink speech.Drink", "Dragon speech.Drink",
                "Star speech.Drink", "speech.Drink", "Cup of", "Water", "Ice", "Pup Cup", "Puppuccino", "Cold Brew Malt",
                "Cold Brew Float", "Nitro Cold Brew Float", "Add Scoop Vanilla Ice Cream", "Espresso Affogato",
                "Dirty Chai", "Dirty Chai Cold Brew Malt", "Earl Grey Mocha Malt", "Single Scoop Vanilla Ice Cream",
                "Tropic Like It's Hot", "In the Dark", "Lavender Chai Oatmilk Latte", "Rose Blossom Berry Infusion",
                "Golden Ice", "Blue Tropic", "Iced", "Blonde", "Decaf", "2/3 Decaf", "1/2 Decaf",
                "Single", "Doppio", "Triple", "Quad", "More Shots", "Affogato Shots", "Frappuccino Roast Coffee",
                "Kids", "Updosed", "Long Shot", "Ristretto", "Caramel Syrup", "Cinnamon Dolce Syrup", "Hazelnut Syrup",
                "Toffee Nut Syrup", "Vanilla Syrup", "Classic Syrup", "Peppermint Syrup", "Raspberry Syrup",
                "Toasted Vanilla Syrup", "Brown Sugar Syrup", "Chai", "Honey Blend", "Liquid Cane Sugar",
                "Sugar Free Vanilla Syrup", "Mocha Sauce", "White Chocolate Mocha Sauce", "Caramel Sauce",
                "Dark Caramel Sauce", "Caramel Brulee Sauce", "Pistachio Sauce", "Pumps", "Extra", "Light", "No", "Sub",
                "with", "Nonfat Milk", "2% Milk", "Whole Milk", "Soy Milk", "Oatmilk", "Coconut Milk",
                "Almondmilk", "Half & Half", "Breve", "Heavy Cream", "Add Dairy", "Ice", "Water", "Whipped Cream",
                "Vanilla Sweet Cream", "Agave", "Splenda", "Sugar", "Stevia", "Honey", "Raw Sugar", "Add Banana",
                "Add Blueberries", "Strawberry Puree", "Frappuccino Chips", "Vanilla Bean Powder", "Matcha",
                "Kiwi Inclusions", "Strawberry Inclusions", "Mango Dragonfruit Inclusions", "Lemonade",
                "Kiwi Starfruit Refresher Base", "Dragonfruit Refresher Base", "Foam", "Cold Foam",
                "Vanilla Sweet Cream Cold Foam", "Salted Caramel Cream Cold Foam", "With Room", "Extra Hot",
                "Mocha Drizzle", "Caramel Drizzle", "Cinnamon Powder", "Chocolate Malt Powder", "Apple Juice",
                "Peach Juice Blend", "Black Tea Base", "Green Tea Base", "Passion Tango Base", "Cinnamon Dolce Topping",
                "Cookie Crumble Topping", "Caramel Sugar Topping", "Caramel Crunch", "Salted Brown Butter Topping",
                "No Topping", "Warm", "Temperature", "Steamed", "Route to Reserve Bar", "Wet", "Dry", "Sparkling",
                "Alternate Handoff", "Short Cup", "Tall Cup", "Grande Cup", "Venti Cup", "Double Cup", "For Here Cup",
                "Flat Lid", "Dome Lid", "Nitro Lid", "Don't Make", "Pour on Top", "Upside Down", "Stirred", "Blended",
                "Panini", "on Ciabatta Bread", "Roasted Tomato and Mozzarella",
                "Turkey Provolone and Pesto", "Chicken Double Smoked Bacon", "Ham and Swiss", "Crispy Grilled Cheese",
                "Chicken Quinoa Protein Bowl", "Banana", "Avocado Spread", "Berry Trio",
                "Strawberry Overnight Grains", "Parfait", "Siggi's Vanilla Yogurt", "Soppressata & Cracker Snack Tray",
                "String Cheese", "Babybel Mini Cheese", "Protein Box", "Cheese and Fruit", "Egg and Cheddar",
                "PB and J", "Chickpea Bites and Avocado", "Grilled Chicken and Hummus", "Cook Open Faced",
                "Extra Toasted"
        };

        for (String phrase : phrases)
            phraseList.addPhrase(phrase);

        return phraseList;
    }
}
