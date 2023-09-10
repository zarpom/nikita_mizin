package lesson11;

public class StringLesson {
    public static void main(String[] args) {
//        System.out.println(123); //int
//        System.out.println(100.5);// double
//        System.out.println("Hello i'm text"); // String

//        String text = "Звичка зверху нам дана, заміна щастю є вона.";
//        String[] words = text.split(" ");
//////        System.out.println(Arrays.toString(words));//ось так можна роздрукувати
////
//        String newTextAfterLoop = "";
//        for (int i = 0; i < words.length; i++) {// 0 1 2 3 4 5 6 7
//            if (words[i].equals("вона.")) { //cтроки порівнюються як equals а не ==
//                newTextAfterLoop += "смачна іржа" + " ";
//            } else {
//                newTextAfterLoop += words[i] + " ";
//            }
//
//        }
//        newTextAfterLoop += ".";
////
//        System.out.println(newTextAfterLoop);

//        String text2 = "Звичка зверху нам дана, заміна щастю є вона.....";
//        String textAfterReplace = text2.replace("вона", "смачненька пізда");
//
//        System.out.println("оріг text2=" + text2);
//        System.out.println("не оріг text2=" + textAfterReplace);
//
//        String text3 = "Звичка зверху нам дана, заміна щастю є вона.....";
//        String textUpperCase = text3.toUpperCase();
//
//        System.out.println(textUpperCase);

//        String text4 = "Звичка зверху нам дана, заміна щастю є вона.....";
//
//        if (text4.contains("Звичка")){
//            System.out.println(text4.replace("Звичка", "хуїчка"));
//        }

//        String name = "Микитос";
//        String name2 = "Микитос";
//
//        String name3 = new String("Микитос");
//
//        System.out.println(name3);
//        System.out.println(name2 == name);
//        System.out.println(name2 == name3);

//        String lastName = "Lytvynov";  // йду в  пулл строк і шукає чи є там вже така змінна
//        String lastName2 = "Lytvynov";//йду в  пулл строк і шукає чи є там вже така змінна
//
//        lastName = lastName + " Vitalii";// lastName -> [Lytvynov] =>  lastName -> [Lytvynov Vitalii]
//
//        lastName2+="!"; //створилась нова строка на основі старої + "!"
        //



//        System.out.println(lastName == lastName2);

        String name = "Лол";
        String name2 = "Лол";
        String name3 = new String("Лол");

        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name.equals(name3));





    }
}
