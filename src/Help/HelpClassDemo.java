package Help;

import Help.Help1;

class HelpClassDemo {
    public static void main(String args[]) throws java.io.IOException {
        char choice;
        Help1 object = new Help1();

        for(;;) {
            do {
                object.showmenu();
                do {
                    choice = (char) System.in.read();
                } while(choice == '\n');
            } while(!object.isvalid(choice));

            if(choice == 'q') break;

            System.out.println("\n");

            object.helpon(choice);
        }
    }
}
