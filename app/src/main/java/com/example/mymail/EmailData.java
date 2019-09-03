package com.example.mymail;

import java.util.ArrayList;
import java.util.Random;

public class EmailData {
    public static  String[][] data = new String[][]{
            {"Sam",
                "Weekend Adventure",
                    "Lets go fishing with John and Othe.We will do Anything",
                        "10:42 AM",


            },
            {"Facebook",
                    "#Iman,you have 1 new notification",
                        "A lot has happened on Facebook since",
                            "16:04 PM",

            },
            {"Google +",
                    "Top suggested Google+ pages for you",
                        "Top suggested Google+ pages for you",
                            "18:44 PM",

            },
            {"Twitter",
                    "Follow T-Mobile,Samsung Mobile U",
                        "James,Some people you may know",
                            "20:04 AM",

            },
            {"Pinterest Weekly",
                    "Pins you'll love!",
                        "Have you seen these Pins yet? Pinterest",
                            "09:04 AM",

            },
            {"Josh",
                    "Going Lunch",
                        "Don't Forget our lunch at 3 PM in Pizza hut",
                            "01:04 AM",

            },
            {"Josh",
                    "Going Lunch",
                    "Don't Forget our lunch at 3 PM in Pizza hut",
                    "01:04 AM",

            },
            {"Josh",
                    "Going Lunch",
                    "Don't Forget our lunch at 3 PM in Pizza hut",
                    "01:04 AM",

            },
            {"Josh",
                    "Going Lunch",
                    "Don't Forget our lunch at 3 PM in Pizza hut",
                    "01:04 AM",

            },
            {"Josh",
                    "Going Lunch",
                    "Don't Forget our lunch at 3 PM in Pizza hut",
                    "01:04 AM",

            },

    };
    public  static ArrayList<Email> getListEmail(){
        ArrayList<Email> list  = new ArrayList<>();
        String[] colors = {"#ff8a65","#9ccc65","#ffa726","#4dd0e1","#f06292","#e06055","#a1887f"};
        Random randomColor = new Random();
        for (String[] aData :data){
            int random = randomColor.nextInt(colors.length-1);
            Email email = new Email();
            email.setName(aData[0]);
            email.setTitle(aData[1]);
            email.setDesk(aData[2]);
            email.setTime(aData[3]);
            email.setColor(colors[random]);
            list.add(email);
        }
        return  list;
    }


}
