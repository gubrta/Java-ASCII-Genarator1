# ASCII Font Generator 
As a Trainee in an IT Company I received a task to create a Java Console Program, which generates a Text Input into an ASCII 
Font which I take from the Figlet database. Therefore I had to use developing tools like Java 21, Maven 3.9, Git and GitLab.

The Website [figlet.org](http://www.figlet.org/) gives you the possibility to choose a font, download it and use for your ASCII Generator.
More about how to insert and use this file will follow in this article. 

First I thought using a hashmap and arrays to type out all letters, numbers and characters. After many researches I decided to keep
this program simple, using the tools I got.
# Packages 
Maven gives you the opportunity to build Projects as plain as possible. I found a complete package of Java Figlet on [lalyos.github.io/figlet/](https://lalyos.github.io/jfiglet/).
From there I took the Maven dependency and added it to my pom.xml. Don't forget to update the versions of this dependency.
After I used the prepared method which initiates the ASCII art from the bracket. Almost done.

# Console
For using the Console we open the Scanner Class and create a next.Line() method for our String, I took the variable 
input, which I also placed in the variable asciiart in the brackets. So we can type our command in the console. 

# Path
Inserting a Path makes it easier to locate a file in a file system. Now we can insert our downloaded Font to the maven status 
file. Use this then in the Path.get brackets. The Path gives you also the chance to convert the String into a File. 
This ain't that necessary, just a chance to learn something new and improve your knowledge.  

That was my small Project of developing an ASCII Font Generator. Hope my article was helpful enough.
:joy: 