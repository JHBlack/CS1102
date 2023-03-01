public class Quiz {
	
	static int nQuestions = 0;
	static int nCorrect = 0;

	public static void main(String[] args) {
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("How many Star Wars episodes are there? (cinematic canon)\n", "7\n", "3\n", 
        "6\n", "9\n", "5", "D");
        question1.check();

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What is the name of the 4th episode of Star Wars?\n", "A New Hope\n", "Revenge of the Sith\n","The Clone Wars\n",
        "Attack of the Clones\n", "The Rise of Skywalker", "A" );
        question2.check();
        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("Which character has appeared in every Star Wars episode?\n", "7\n", "3\n", 
        "6\n", "9\n", "5", "D");
        question3.check();
        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Which Star Wars character has 4 arms?\n", "Obi-wan Kenobi\n","Darth Vader\n","Luke Skywalker\n",
         "General Grievous\n","None" , "D");
        question4.check();
        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("Which Star Wars character was cloned to create a clone army?\n", "Anakin Skywalker\n",
         "Qui-gon Jinn\n", "Boba Fett\n", "Darth Vader\n", "Jango Fett", "E");
        question5.check();

        MultipleChoiceQuestion.showResults();
	
	}
}
