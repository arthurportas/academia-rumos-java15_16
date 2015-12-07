/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilizador
 */
public class TestContinue {

    public static void main(String[] args) {
        int passMark = 15;
        int passesReqd = 3;
        int[] score = {4, 6, 2, 8, 12, 34, 9};
        for (int unitScore : score) {
            if (unitScore < passMark) {
                continue;
            }
            passesReqd--;
            // Other processing
        }
        System.out.println("Units still reqd " + Math.max(0, passesReqd));

    }
}
