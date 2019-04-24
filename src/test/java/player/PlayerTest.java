package player;

import org.junit.jupiter.api.Test;
import player.piece.TypePiece;

import java.util.ArrayList;
import java.util.List;    

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void createOnePlayer() {
        Player p1 = new Player("Rafael", TypePiece.BOTTE);

        assertEquals(p1.getName(), "Rafael");
        assertEquals(p1.getPiece().toString(), "Botte");
    }

    @Test
    void createListOfPlayers() {
        List<Player> listPlayers = new ArrayList<>();
        TypePiece[] tabTypePieces = TypePiece.values();

        for (int i = 0; i < 8; ++i) {
            listPlayers.add((new Player("Player" + (i + 1), tabTypePieces[i])));
            assertEquals("Player" + (i+1), listPlayers.get(i).getName());
            assertEquals(tabTypePieces[i].toString(), listPlayers.get(i).getPiece().toString());
        }
    }
}