package sk.upjs.paz;

import lombok.With;

@With
public record PomerGenderov(int male, int female, int mutant) {

    public double pomerChlapcovKuDievcatam() {
        var celkovo = female + male + mutant;

        return (double) male / (double) celkovo;
    }
    public double pomerDievcatKuChlapcom() {
        return (double) female / (double) (female + male + mutant);
    }

}
