package ea_6_1;

public class MutableStringTest {
    public static void main(String[] args) {
        MutableString fileName = new MutableString("MutableString");
        System.out.println(fileName.length());
        fileName.append("T");
        fileName.append("e");
        System.out.println(fileName.length());
        fileName.append("s");
        fileName.append("t");
        System.out.println(fileName);
        System.out.println(fileName.length());
        
        MutableStringParallel fileNamePar1 = new MutableStringParallel("MutableString");
        MutableStringParallel fileNamePar2 = new MutableStringParallel("MutableString");

        
        fileNamePar1.start();
        fileNamePar2.start();

        
        fileNamePar1.append("T");
        fileNamePar2.append("e");
        fileNamePar1.append("s");
        fileNamePar2.append("t");
        System.out.println(fileNamePar1);
        System.out.println(fileName.length());
        
    }
}
