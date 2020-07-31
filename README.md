# TameOfThrones
A geektrust problem with extensive Object model paradigm

# **Finding Alliance Problem**


### **Context**
<p>There is no ruler in the universe of Southeros and pandemonium reigns. Shan, the gorilla king of the Space kingdom
   wants to rule all Six Kingdoms in the universe of Southeros. He needs the support of 3 more kingdoms to be the ruler.</p>
   
### **Problem Statement**
<p>Once he wins 3 more kingdoms, he is the ruler! The secret message needs to contain the letters of the animal in their emblem.
   For example, secret message to the Land kingdom (emblem: Panda) needs to have the letter 'p','n','d' at-least once and 'a' at-
   least twice. If he sends "ahdvvnxxxautup" to the Land kingdom, he will win them over.
  
<p>
   King Shan wants to make sure his secret message is not found by his enemies easily. So he decides to use the oldest of the
   ciphers 'Seasar cipher’. A cipher is a type of secret code, where you swap the letters around so that no-one can read your
   message.</p>
 
<p>To make the secret message encrypted, King Shan uses a secret key, which is the number of characters in the emblem.
If King Shan wants to send a message to kingdom Air, he uses the number 3 as the cipher key, as emblem ‘owl’ has 3
characters. So, to encrypt the letter ‘a’, just move 3 letters clockwise on the message wheel, which will give the letter ‘d’.
</p>

So if King Shan, sends the message "rozo" to Air, King Shan will receive
the allegiance from Air. As "rozo" will decrypt to "olwl" and these letters
contain the emblem characters ‘o’, ’w’, ’l’.

### **Sample input & output**
<B>Sample Input</B><br>
AIR ROZO <br>
LAND FAIJWJSOOFAMAU<br>
ICE STHSTSTVSASOS<br>

<B>Sample Output</B><br>
SPACE AIR LAND ICE

### **How to run the project**

```
git clone https://github.com/anuragsachdeva28/TameOfThrones.git

cd TameOfThrones

./gradlew clean build
```

After this go inside build/libs folder and run the following command:
<br>
```
java -jar geektrust.jar <path to input file>
```

To run test:
```
./gradlew test
```
### **Authors**
Anurag Sachdeva
