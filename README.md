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


![alt text](https://github.com/kanke/java8Features/src/common/images/maven-errror.png "Logo Title Text 1")
