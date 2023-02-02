package com.example.assignment1;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    private List<String> values = new ArrayList<>();
    void push(String value) {
        values.add(value);
    }
    boolean isOperator(String value) {
        return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/");
    }

    int calculate() {
        int firstNumber = 0;
        int i = 0;
        while (i < values.size() && !isOperator(values.get(i))) {
            firstNumber = firstNumber * 10 + Integer.parseInt(values.get(i));
            i++;
        }
        int answer = firstNumber;
        while (i < values.size()) {
            String operator = values.get(i);
            i++;
            int secondNumber = 0;
            while (i < values.size() && !isOperator(values.get(i))) {
                secondNumber = secondNumber * 10 + Integer.parseInt(values.get(i));
                i++;
            }
            if (operator.equals("+")) {
                answer += secondNumber;
            } else if (operator.equals("-")) {
                answer -= secondNumber;
            } else if (operator.equals("*")) {
                answer *= secondNumber;
            } else if (operator.equals("/")) {
                answer /= secondNumber;
            }
        }
        return answer;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String value : values) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }

    boolean checkOperationsValidation() {
        if (values.get(0).equals("+") || values.get(0).equals("-") || values.get(0).equals("*") || values.get(0).equals("/")) {
            return false;
        }
        if (values.get(values.size() - 1).equals("+") || values.get(values.size() - 1).equals("-") || values.get(values.size() - 1).equals("*") || values.get(values.size() - 1).equals("/")) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < values.size(); i++) {
            String value = values.get(i);
            if (value.equals("-") || value.equals("/") || value.equals("*") || value.equals("+")) {
                count++;
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }

    void clear() {
        values.clear();
    }

    public String calculateAnswer() {
        return String.valueOf(calculate());
    }
}