package sk.upjs.paz;

import lombok.With;

@With
public record getGenderRatio(int male, int female, int mutant) {

    public double pomerChlapcovKuDievcatam() {
        return (double) male / (double) (female + male + mutant);
    }
    public double pomerDievcatKuChlapcom() {
        return (double) female / (double) (female + male + mutant);
    }

}
