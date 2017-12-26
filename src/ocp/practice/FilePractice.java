package ocp.practice;

import java.io.*;

/**
 * Created by iulia on 12/9/2017.
 */
public class FilePractice {

    public static void main(String[] args) {
        File file = new File("src\\ocp\\practice\\FormatNumbers.java");
        System.out.println(file.exists());
        System.out.println(System.getProperty("user.dir"));
        File joinedFilePath = new File(System.getProperty("user.dir"), "src\\ocp\\practice\\FormatNumbers.java");
        System.out.println(joinedFilePath.exists());
        System.out.println(joinedFilePath.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(joinedFilePath.getAbsolutePath());
        System.out.println(joinedFilePath.isDirectory());
        System.out.println(joinedFilePath.isFile());
        System.out.println(joinedFilePath.length());
        System.out.println(joinedFilePath.lastModified());
        System.out.println(joinedFilePath.renameTo(new File("src\\ocp\\practice\\animalWorld\\FormatNumbers.java")));
        System.out.println(new File("src\\ocp\\practice\\animalWorld\\pumas").mkdirs());
        System.out.println(new File("src\\ocp\\practice\\animalWorld\\pumas").delete());

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\ocp\\practice\\animalWorld\\FormatNumbers.java"))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src\\ocp\\practice\\animalWorld\\puma.txt")));
//             ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src\\ocp\\practice\\animalWorld\\puma.txt")))) {
//            String s = "pumaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//            objectOutputStream.writeObject(s);
//            objectOutputStream.flush();
//            System.out.println(objectInputStream.readObject());
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        try (InputStream inputStream = new FileInputStream("src\\ocp\\practice\\animalWorld\\puma.txt");
             OutputStream outputStream = new FileOutputStream("src\\ocp\\practice\\animalWorld\\puma2.txt")) {
            int b;
            while ((b = inputStream.read()) != -1) {
                outputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputStream = new BufferedInputStream(new FileInputStream("src\\ocp\\practice\\animalWorld\\puma.txt"));
             OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("src\\ocp\\practice\\animalWorld\\puma2.txt"))) {
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, lengthRead);
                outputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("src\\ocp\\practice\\animalWorld\\puma.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\ocp\\practice\\animalWorld\\puma3.txt"))) {
            String s;
            while((s = reader.readLine()) != null) {
                writer.write(s);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
