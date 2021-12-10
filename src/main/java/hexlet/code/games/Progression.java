package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void theProgression() {
        final String rulesProgression = "What number is missing in the progression?";
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();
        for (int i = 0; i < Engine.CYCLES; i++) {

            //  массив прогрессирующих значений рандомной длины
            int[] progression = initializeTheProgression();

            //  первое значение в прогрессии
            int startProgression = startValueProgression();

            //  прогрессия прогрессии
            int shift = shiftValueProgression();

            //  элемент для вопроса
            int indexForQuestion = indexForQuestionSetting(progression);

            //  заполнение прогрессии
            for (int j = 0, k = startProgression; j < progression.length; j++, k += shift) {
                progression[j] = k;
            }
            //  заполнение ответов
            result[i][1] = String.valueOf(progression[indexForQuestion]);

            //  заполнение вопросов
            fillTheQuestions(progression, indexForQuestion, result, i);
        }
        Engine.theGame(result, rulesProgression);
    }

    private static int[] initializeTheProgression() {
        final int upperLengthLimit = 10;
        final int lowerLengthLimit = 5;
        int lengthProgression = Engine.randomNumber(upperLengthLimit, lowerLengthLimit);
        return new int[lengthProgression];
    }

    private static int startValueProgression() {
        final int upperStartPositionRandomLimit = 14;
        final int lowerStartPositionRandomLimit = 2;
        return Engine.randomNumber(upperStartPositionRandomLimit, lowerStartPositionRandomLimit);
    }

    private static int shiftValueProgression() {
        final int upperProgressionShiftRandomLimit = 6;
        final int lowerProgressionShiftRandomLimit = 2;
        return Engine.randomNumber(upperProgressionShiftRandomLimit, lowerProgressionShiftRandomLimit);
    }

    private static int indexForQuestionSetting(int[] progression) {
        final int elementsInProgression = progression.length - 1;
        return Engine.randomNumber(elementsInProgression);
    }

    private static void fillTheQuestions(int[] progression, int indexForQuestion, String[][] result, int i) {
        for (int j = 0; j < progression.length; j++) {
            if (indexForQuestion != j) {
                ftqNotIndexForQuestion(j, result, i, progression);
//                if (j != 0) {
//                    result[i][0] = result[i][0] + (" " + progression[j]);
//                } else {
//                    result[i][0] = String.valueOf(progression[j]);
//                }
            } else {
                ftqIndexForQuestion(j, result, i);
//                if (j != 0) {
//                    result[i][0] = result[i][0] + " ..";
//                } else {
//                    result[i][0] = "..";
//                }
            }
        }
    }
    private static void ftqIndexForQuestion(int j, String[][] result, int i) {
        if (j != 0) {
            result[i][0] = result[i][0] + " ..";
        } else {
            result[i][0] = "..";
        }
    }
    private static void ftqNotIndexForQuestion(int j, String[][] result, int i, int[] progression) {
        if (j != 0) {
            result[i][0] = result[i][0] + (" " + progression[j]);
        } else {
            result[i][0] = String.valueOf(progression[j]);
        }
    }
}
