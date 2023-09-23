package ladder;

import ladder.creator.NormalLadderCreator;
import ladder.creator.RandomLadderCreator;

public class LadderGameFactory {

    private final LadderGame ladderGame;

    public LadderGameFactory(LadderGame ladderGame) {
        this.ladderGame = ladderGame;
    }

    public static LadderGame createRandomLadderGame(NaturalNumber numberOfRow, NaturalNumber numberOfPerson) {
        return new LadderGame(new RandomLadderCreator(numberOfRow, numberOfPerson));
    }

    public static LadderGame createNormalLadderGame(NaturalNumber numberOfRow, NaturalNumber numberOfPerson) {
        return new LadderGame(new NormalLadderCreator(numberOfRow, numberOfPerson));
    }
}
