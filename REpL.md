# Nashorn

- Navigate to JAVA_HOME executable directory 

For Mac: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/bin/jjs

For Windows: JAVA_HOME

<code>
bash: /Users/kanke/apache-maven-3.3.3: is a directory

Kankemwas-MBP:java8Features kanke$ cd /

Kankemwas-MBP:/ kanke$ /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/bin/jjs

jjs> 'Hello World'.length()

11

jjs> 'Hello World, this is Kanke'.length()

26

jjs> var example = new java.lang.String("Hello miss Kanke");

jjs> example

Hello miss Kanke

jjs> example.toUpperCase();

HELLO MISS KANKE

jjs> function add(n,m) { return n + m )}

ECMAScript Exception: SyntaxError: <shell>:1:33 Expected ; but found )

function add(n,m) { return n + m )}
                                 ^
jjs> function add(n,m) {return n+m}

function add(n,m) {return n+m}

jjs> add (10,5)

15

</code>
