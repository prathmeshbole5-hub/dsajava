
const { generateQuestionsBatch } = require('./api/lib/questionGenerator.js');
const { generateLiarsSummary } = require('./api/lib/liarsSummaryGenerator.js');
const path = require('path');
require('dotenv').config({ path: path.resolve(__dirname, '.env.local') });

async function test() {
  const context = {
    title: "Java Programming",
    duration: 120,
    contentText: "Java is an object-oriented programming language. It uses classes and objects. Methods are blocks of code that perform actions."
  };

  try {
    console.log("--- TESTING QUESTIONS ---");
    const questions = await generateQuestionsBatch(context);
    console.log("Question Count:", questions.length);
    console.log("First Q Feedback Fields:", {
      explanation: !!questions[0].explanation,
      wrong_answer_analysis: !!questions[0].wrong_answer_analysis,
      follow_up: !!questions[0].follow_up_question
    });

    console.log("\n--- TESTING LIARS SUMMARY ---");
    const summary = await generateLiarsSummary(context);
    console.log("Summary exists:", !!summary);
    console.log("Has summaryText:", !!summary.summaryText);
    console.log("Has lies array:", Array.isArray(summary.lies));
    if (summary.lies) console.log("Lies count:", summary.lies.length);

  } catch (err) {
    console.error("Test failed:", err);
  }
}

test();
