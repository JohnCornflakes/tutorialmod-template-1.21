package net.johncornflakes.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.johncornflakes.tutorialmod.datagen.ModBlockTagProvider;
import net.johncornflakes.tutorialmod.datagen.ModItemTagProvider;
import net.johncornflakes.tutorialmod.datagen.ModLootTableProvider;
import net.johncornflakes.tutorialmod.datagen.ModModelProvider;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelProvider::new);
	}

    //run datageneration under fabric package in gradle menu
}
