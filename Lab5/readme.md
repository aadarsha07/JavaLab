# Java FileWriter Class
Java FileWriter class is used to write character-oriented data to a file.
It is character-oriented class which is used for file handling in java.
### Constructors of FileWriter class are :
* FileWriter(String file)	Creates a new file.   
- FileWriter(File file)	Creates a new file.

#### Methods of FileWriter class are :


Method |	Description
------------ | -------------
void write(String text)	| It is used to write the string into FileWriter.
void write(char c)	| It is used to write the char into FileWriter.
void write(char[] c)	| It is used to write char array into FileWriter.
void flush() |	It is used to flushes the data of FileWriter.
void close() |	It is used to close the FileWriter.

# Java FileReader Class
Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
It is character-oriented class which is used for file handling in java.

### Constructors of FileReader class
Constructor	Description
FileReader(String file)	It gets filename in string. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.

FileReader(File file)	It gets filename in file instance. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.
### Methods of FileReader class

int read()	It is used to return a character in ASCII form. It returns -1 at the end of file.
void close()	It is used to close the FileReader class.
