export interface Question {
  title: string;
  option1: {
    value: string;
    isCorrect: boolean;
  };
  option2: {
    value: string;
    isCorrect: boolean;
  };
  option3: {
    value: string;
    isCorrect: boolean;
  };
  option4: {
    value: string;
    isCorrect: boolean;
  };
}
