package com.example.przepisy;

public class RepozytoriumPrzepisow {
    private static final Przepis[] przepisy={
            new Przepis("Muffinki",
                    1,
                    R.drawable.muf,
                    "jajka, mąka, cukier, mleko, olej, kakao"),
            new Przepis("Gofry",
                    1,
                    R.drawable.gofr,
                    "jajka, mleko, mąka, cukier"),
            new Przepis("Pączki",
                    1,
                    R.drawable.pocz,
                    "drożdże, masło, mleko, cukier, mąka"),
            new Przepis("Kawa",
                    0,
                    R.drawable.kawa,
                    "kawa, woda"
                    )
    };
}
