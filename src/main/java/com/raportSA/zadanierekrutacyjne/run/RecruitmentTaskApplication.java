package com.raportSA.zadanierekrutacyjne.run;

import com.raportSA.zadanierekrutacyjne.service.DuplicatedWords;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecruitmentTaskApplication {
//{
//
//	public static void main(String[] args) {
//		SpringApplication.run(ZadanieRekrutacyjneApplication.class, args);
//	}
//
//}

    public static void main(String[] args) {
//        System.out.println(" METODA 1 : ");
//        RevertedSentence revertedSentence = new RevertedSentence();
//        revertedSentence.setRevertedSentence();
//
//        System.out.println(" METODA 2 :");
//        PercentageOfSignsInSentence percentageOfSignsInSentence = new PercentageOfSignsInSentence();
//        percentageOfSignsInSentence.countSignsUsePercentage();

        System.out.println(" METODA 3: ");
        DuplicatedWords duplicatedWords = new DuplicatedWords();
        duplicatedWords.fillDuplicatedWordsMap();

    }
}
