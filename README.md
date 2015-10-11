# Java 8 Features

If you are using maven and you get the error : **Error: java: javacTask: source release 8 requires target release 1.8**,add the maven compiler plugin for Java 8.
<code>
<build>
    <plugins>
        <plugin>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.2</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
    </plugins>
</build>
</code>


# Nashorn

- Navigate to JAVA_HOME executable directory 

For Mac: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/bin/jjs
For Windows: JAVA_HOME

Checkout REPL.md for Nashorn Java in javascript example using REPL.