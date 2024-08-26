import com.badlogic.gdx.math.MathUtils;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch2;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpireReturn;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.dungeons.TheBeyond;
import com.megacrit.cardcrawl.unlock.UnlockTracker;
import java.util.Collections;
import java.util.Random;

public class BossPatch {
    @SpirePatch2(clz=TheBeyond.class, method="initializeBoss")
    public static class patch {
        @SpirePrefixPatch
        public static SpireReturn<Void> patch(TheBeyond __instance) {
            AbstractDungeon.bossList.clear();
            if (Settings.isDailyRun) {
                AbstractDungeon.bossList.add("Awakened One");
                AbstractDungeon.bossList.add("Time Eater");
                AbstractDungeon.bossList.add("Donu and Deca");
                Collections.shuffle(AbstractDungeon.bossList, new Random(AbstractDungeon.monsterRng.randomLong()));
            } else if (!UnlockTracker.isBossSeen((String)"CROW")) {
                AbstractDungeon.bossList.add("Awakened One");
            } else if (!UnlockTracker.isBossSeen((String)"DONUT")) {
                AbstractDungeon.bossList.add("Donu and Deca");
            } else if (!UnlockTracker.isBossSeen((String)"WIZARD")) {
                AbstractDungeon.bossList.add("Time Eater");
            } else {
                // AbstractDungeon.bossList.add("Time Eater");
                // AbstractDungeon.bossList.add("Awakened One");
                AbstractDungeon.bossList.add("Donu and Deca");
                Collections.shuffle(AbstractDungeon.bossList, new Random(AbstractDungeon.monsterRng.randomLong()));
            }
            if (AbstractDungeon.bossList.size() == 1) {
                AbstractDungeon.bossList.add(AbstractDungeon.bossList.get(0));
            } else if (AbstractDungeon.bossList.isEmpty()) {
                AbstractDungeon.bossList.add("Awakened One");
                AbstractDungeon.bossList.add("Time Eater");
                AbstractDungeon.bossList.add("Donu and Deca");
                Collections.shuffle(AbstractDungeon.bossList, new Random(AbstractDungeon.monsterRng.randomLong()));
            }
            return SpireReturn.Return();
        }
    }
}

