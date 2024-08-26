# Definitely Not

> Out of all act 3 bosses, I DEFINITELY don't want to fight this one

…Is at least the goal of this mod, but currently it just hard codes the circle guy and the cube guy to always be the act 3 boss. \
In the future I plan to release this mod on the steam workshop, and add options to pick the bosses you don't want, in the BaseMod menu.

If that is exactly what you want anyway, you're in luck! Grab the `.jar` file and put it into `~/.local/share/Steam/steamapps/common/SlayTheSpire/mods/`. \
If the `mods` directory doesn't exist, that's okay; Just create it. \
To find this path on your system (if it isn't the one I specify), right click on Slay the spire on steam and click "Browse local files".

If you know how to look at code and edit it, you will have to change the `./DefinitelyNot/src/main/java/BossPatch.java` file and recompile.

How do you recompile? Oh boy...

First, grab `~/.local/share/Steam/steamapps/common/SlayTheSpire/desktop-1.0.jar` and put it into the `lib/` directory. \
Can't package it myself because it's illegal lmao. \
I hope me packaging the jars of mod the spire and basemod is okay.

You unfortunately need Intellij to compile this. \
As far as I know, at least, and I don't know very far because I'm not a java dev.

1. Open the project (the inner `DefinitelyNot` directory, not the repo root)
2. Click the maven icon on the right
3. Unfold `DefinitelyNot`
4. Unfold `Lifecycle`
5. Right click `package`
6. Click `Run Maven Build`
7. The jar is now in `DefinitelyNot/target/DefinitelyNot.jar`
8. Copy it into `~/.local/share/Steam/steamapps/common/SlayTheSpire/mods/`

Should work! If it doesn't, I have no clue :3

So you don't have to enter the immensely long paths to copy the compiled .jar into the mods directory, you can just run `./update.sh` from the `DefinitelyNot` directory. \
If you're also on linux and have the same paths as me, that is.
