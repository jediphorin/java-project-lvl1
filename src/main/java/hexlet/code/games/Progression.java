package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void theProgression() {
        final String rulesProgression = "What number is missing in the progression?";
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            //  массив прогрессирующих значений рандомной длины
            final int upperLengthLimit = 10;
            final int lowerLengthLimit = 5;
            int lengthProgression = Engine.randomNumber(upperLengthLimit, lowerLengthLimit);
            int[] progression = new int[lengthProgression];

            //  первое значение в прогрессии
            final int upperStartPositionRandomLimit = 14;
            final int lowerStartPositionRandomLimit = 2;
            int startProgression = Engine.randomNumber(upperStartPositionRandomLimit, lowerStartPositionRandomLimit);

            //  прогрессия прогрессии
            final int upperProgressionShiftRandomLimit = 6;
            final int lowerProgressionShiftRandomLimit = 2;
            int shift = Engine.randomNumber(upperProgressionShiftRandomLimit, lowerProgressionShiftRandomLimit);

            //  элемент для вопроса
            final int elementsInProgression = progression.length - 1;
            int indexForQuestion = Engine.randomNumber(elementsInProgression);

            //  заполнение прогрессии
            for (int j = 0, k = startProgression; j < progression.length; j++, k += shift) {
                progression[j] = k;
            }

            //  заполнение ответов
            result[i][1] = String.valueOf(progression[indexForQuestion]);

            //  заполнение вопросов
            for (int j = 0; j < progression.length; j++) {
                if (indexForQuestion != j) {
                    if (j != 0) {
                        result[i][0] += (" " + progression[j]);
                    } else {
                        result[i][0] = String.valueOf(progression[j]);
                    }
                } else {
                    if (j != 0) {
                        result[i][0] += " ..";
                    } else {
                        result[i][0] = "..";
                    }
                }
            }
        }
        Engine.theGame(result, rulesProgression);
    }
}
