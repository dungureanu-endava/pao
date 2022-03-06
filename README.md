# Programare avansata pe obiecte

## 1. Java

### What is Java?
- JVM (Java Virtual Machine)
- JRE (Java Runtime Environment)
- JDK (Java Development Kit)
- [Differences between JDK, JRE and JVM](https://www.geeksforgeeks.org/differences-jdk-jre-jvm/)

### What versions of Java exist?
- [Java versions](https://www.java.com/releases/fullmatrix/)
- [Oracle roadmap](https://www.oracle.com/java/technologies/java-se-support-roadmap.html) - useful for checking LTS (Long Term Support) versions

## 2. Prerequisites

### 2.1. JDK

#### Download and Install Java Development Kit
- [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)
  - [Windows Installation Guide](https://docs.oracle.com/en/java/javase/17/install/installation-jdk-microsoft-windows-platforms.html)
  - [Linux Installation Guide](https://docs.oracle.com/en/java/javase/17/install/installation-jdk-linux-platforms.html)
- [Open JDK](https://adoptium.net/)
  - [Installation Guide](https://adoptium.net/installation.html)

#### Update Environment Variables to be able to run the Java commands:
-	Click on Start/Windows Icon and start typing “environment variables”
-	Select “Edit the system environment variables”

-	Click on “Environment Variables…”

-	Create a new variable “JAVA_HOME” and set the value to be the Installation path for Java JDK

-	Update the existing Path variable and add a new line with “%JAVA_HOME%\bin”

-	Test to see if it’s working (run “java --version” in the command line)


### 2.2. IDE for Java
- [IntelliJ](https://www.jetbrains.com/idea/)
- [Eclipse](https://www.eclipse.org/)

### 2.3. Version control

#### 2.3.1. [Git](https://git-scm.com/)
- Download from: https://git-scm.com/download/win
- While doing the installation, you may want to change the default text editor from Vim to something else

#### 2.3.2. [GitHub](https://github.com/)
- Create user: https://github.com/signup
- Create repository: https://github.com/new

#### 2.3.3. Git Bash
-	Open Git Bash and navigate to a folder where you want to store your code
-	Here clone your newly created repository
     o	git clone https://github.com/...

-	Copy the Java files in the generated folder
-	Check the status of the repository
     o	git status
-	 Select the files that you would want to commit/save to your repository
      o	git add .
-	Create a commit
     o	git commit -m "First commit"
-	Push the code
     o	git push
-	Check to see your if the code is available in GitHub


## 3. Evaluare

### [Project Requirements](/Project%20Requirements/Requirements.md)

## 4. Notes
- There are no stupid questions
- For any queries, first check [Stack Overflow](https://stackoverflow.com/)
- Good read: [Clean Code](https://www.goodreads.com/book/show/3735293-clean-code)
    - Interesting person to follow: Robert C. Martin a.k.a. Uncle Bob
