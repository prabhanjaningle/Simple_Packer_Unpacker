# 📦 File Packer & Unpacker (Java)

A Java-based console application that allows you to **pack multiple files from a directory into a single custom file** and later **unpack** them back to original files. This project demonstrates the use of **Java Packages, File Handling, Streams, Custom Headers, and OOP**.

---

## 🚀 Features

### 🗂️ Pack Files
- Packs every file inside a directory into one single packed file.
- Creates a 100-byte header for each file (filename + filesize).
- Writes raw file data after each header.
- Ensures accurate restoration during unpacking.

### 📤 Unpack Files
- Extracts every file stored inside the packed file.
- Reads custom headers and recreates files exactly.
- Reconstructs filenames, sizes, and binary data safely.

### 🧱 Technology Stack
- Java
- FileInputStream / FileOutputStream
- Packages & Modular Code
- Exception Handling
- Byte Stream Manipulation

---

## 📁 Project Structure

FilePackerUnpacker/
│
├── SimplePacker.java # Packs directory files into one file
├── SimpleUnPacker.java # Unpacks the file back to original files
├── PackerMain.java # Main program for packing
└── UnpackerMain.java # Main program for unpacking


---

## 🏃‍♂️ How to Run

### 1️⃣ Compile all Java files
```bash
javac FilePackerUnpacker/*.java

2️⃣ Run Packer

java FilePackerUnpacker.PackerMain

Example input:

Enter directory name to pack:
sample
Enter packed file name:
output.pak

3️⃣ Run Unpacker

java FilePackerUnpacker.UnpackerMain

Example input:

Enter packed file name:
output.pak

📝 Example Outputs
Packing:

--------------------------------------------------
                 Packing Process                  
--------------------------------------------------
Directory Found: sample
Packed: a.txt
Packed: b.txt
Packed: notes.docx
Packing Completed.
Total Files Packed: 3

Unpacking:

--------------------------------------------------
                Unpacking Process                 
--------------------------------------------------
Unpacked: a.txt (Size: 12)
Unpacked: b.txt (Size: 5)
Unpacked: notes.docx (Size: 2048)
Unpacking Completed.
Total Files Unpacked: 3

🧠 Concepts Demonstrated

    Java Packages

    File Handling (read/write)

    Directory Traversal

    Metadata generation (100-byte header)

    Byte-level I/O operations

    Exception Handling

    Modular OOP design

⭐ Future Enhancements

    Add GUI (Swing/JavaFX)

    Add ZIP/GZIP compression

    Add password-protected packed files

    Add progress bar during packing/unpacking

🤝 Contributions

Contributions, issues, and pull requests are welcome.
Feel free to fork and enhance the project.
⭐ Support

If you found this project helpful, please give the repository a star ⭐!


---


---

# 🎉 Done  
Just copy–paste the above block into your GitHub README.md.

If you want **badges**, **screenshots**, or a **project logo**, tell me and I will add them!
