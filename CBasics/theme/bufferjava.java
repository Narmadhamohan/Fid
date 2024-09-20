BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
reader.close();





BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
writer.write("Hello, World!");
writer.flush(); // Forces the buffer to write to the file
writer.close();

/*

Why Use a char[] Buffer?
Efficiency: By using a char[] buffer, Java classes can read or write large chunks of data at once. This reduces the number of I/O operations (disk reads or writes), which are typically much slower than memory operations.

Minimizing System Calls: When reading or writing small amounts of data, frequent system calls (e.g., read(), write()) can be expensive. A buffer allows the program to batch operations and only interact with the operating system when necessary (e.g., when the buffer is full or emptied).

Dynamic Resizing: In the case of StringBuilder and StringBuffer, the internal char[] buffer dynamically grows when more characters are added, avoiding the constant allocation of new memory for each append operation.
*/