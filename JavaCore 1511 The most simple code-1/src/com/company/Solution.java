package com.company;

/*
1511. Level 15 Lection 6. The Most Simple Code-1
Simplify the code - remove all inheritances and implementations that will already be added automatically at compilation
PS: The relationship between me and zapp objects - Has-a (uses): http://ru.wikipedia.org/wiki/Has-a
Requirements:
1. The SpecificSerializable interface should extend the extends interface of the Serializable.
2. The JavaDev class must implement the SpecificSerializable interface.
3. The code should not explicitly inherit from Object (extends Object).
4. The JuniorJavaDev class should not explicitly inherit the SpecificSerializable interface.

 */

import java.io.Serializable;

/*
public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about level15.lesson06.task01?"));
        System.out.println(me.askZapp("When will be the next update?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev (забрати extends Object)implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev {  // (забрати 2 extends, 1 implements)
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
*/