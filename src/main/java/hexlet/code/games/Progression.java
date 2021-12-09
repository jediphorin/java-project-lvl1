package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    public static void theProgression() {
        final String rulesProgression = "What number is missing in the progression?";
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            //  массив прогрессирующих значений рандомной длины
            final int upperLengthLimit = 10;
            final int lowerLengthLimit = 5;
            Random random = new Random();
            int lengthProgression = random.nextInt(upperLengthLimit - lowerLengthLimit) + lowerLengthLimit;
            int[] progression = new int[lengthProgression];

            //  первое значение в прогрессии
            final int upperStartPositionRandomLimit = 14;
            Random startPositionRandom = new Random();
            int startProgression = startPositionRandom.nextInt(upperStartPositionRandomLimit - 2) + 2;

            //  прогрессия прогрессии
            final int upperProgressionShiftRandomLimit = 6;
            Random progressionShiftRandom = new Random();
            int shiftProgression = progressionShiftRandom.nextInt(upperProgressionShiftRandomLimit - 2) + 2;

            //  элемент для вопроса
            Random elementForQuestionRandom = new Random();
            int indexForQuestion = elementForQuestionRandom.nextInt(progression.length - 1);

            //  заполнение прогрессии
            for (int j = 0, k = startProgression; j < progression.length; j++, k += shiftProgression) {
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
