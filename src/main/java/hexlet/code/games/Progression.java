package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;

public class Progression {

    private static final String RULES_PROGRESSION = "What number is missing in the progression?";
    private static final int UPPER_LENGTH_LIMIT = 10;
    private static final int LOWER_LENGTH_LIMIT = 5;
    private static final int UPPER_START_RANDOM_LIMIT = 14;
    private static final int LOWER_START_RANDOM_LIMIT = 2;
    private static final int UPPER_PROGRESSION_SHIFT_RANDOM_LIMIT = 6;
    private static final int LOWER_PROGRESSION_SHIFT_RANDOM_LIMIT = 2;

    public static void theProgression() {

        String[][] questionsToAnswers = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {

            //  массив прогрессирующих значений рандомной длины
            int lengthProgression = Utils.randomNumber(UPPER_LENGTH_LIMIT, LOWER_LENGTH_LIMIT);

            //  первое значение в прогрессии
            int startProgression = Utils.randomNumber(UPPER_START_RANDOM_LIMIT, LOWER_START_RANDOM_LIMIT);

            //  прогрессия прогрессии
            int shift = Utils.randomNumber(UPPER_PROGRESSION_SHIFT_RANDOM_LIMIT, LOWER_PROGRESSION_SHIFT_RANDOM_LIMIT);

            //  создание и заполнение прогрессии
            int[] progression = buildProgression(startProgression, shift, lengthProgression);

            //  элемент для вопроса
            int indexForQuestion = indexForQuestionSetting(progression);

            //  заполнение ОТВЕТОВ
            questionsToAnswers[i][1] = String.valueOf(progression[indexForQuestion]);

            //  заполнение вопросов
            questionsToAnswers[i][0] = fillTheQuestions(progression, indexForQuestion);
        }

        Engine.theGame(questionsToAnswers, RULES_PROGRESSION);
    }

    private static String fillTheQuestions(int[] progression, int indexForQuestion) {
        StringBuilder fullQuestion = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i != indexForQuestion) {
                if (i != 0) {
                    fullQuestion.append(" ").append(progression[i]);
                } else if (i == 0) {
                    fullQuestion = new StringBuilder(String.valueOf(progression[i]));
                }
            } else if (i == indexForQuestion) {
                fullQuestion.append(" ..");
            }
        }
        return fullQuestion.toString().trim();
    }

    private static int[] buildProgression(int startProgression, int shift, int lengthProgression) {
        int[] resultProgression = new int[lengthProgression];
        for (int j = 0, k = startProgression; j < resultProgression.length; j++, k += shift) {
            resultProgression[j] = k;
        }
        return resultProgression;
    }

    private static int indexForQuestionSetting(int[] progression) {
        final int elementsInProgression = progression.length - 1;
        return Utils.randomNumber(elementsInProgression);
    }
}
