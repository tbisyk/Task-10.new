package com.gmail.t.bisyk;

public class ShifrTwo extends ShifrFont {

	public ShifrTwo() {
		super();
	}

	@Override
	public StringBuilder shifr(int l) {
		StringBuilder[] lit = new StringBuilder[27];
		for (int i = 0; i < 27; i++) {
			lit[i] = new StringBuilder("");
		}
		lit[0].append(" _______ ").append(System.lineSeparator());
		lit[0].append("|   _   |").append(System.lineSeparator());
		lit[0].append("|  |_|  |").append(System.lineSeparator());
		lit[0].append("|       |").append(System.lineSeparator());
		lit[0].append("|       |").append(System.lineSeparator());
		lit[0].append("|   _   |").append(System.lineSeparator());
		lit[0].append("|__| |__|").append(System.lineSeparator());

		lit[1].append(" _______ ").append(System.lineSeparator());
		lit[1].append("|  _    |").append(System.lineSeparator());
		lit[1].append("| |_|   |").append(System.lineSeparator());
		lit[1].append("|       |").append(System.lineSeparator());
		lit[1].append("|  _   | ").append(System.lineSeparator());
		lit[1].append("| |_|   |").append(System.lineSeparator());
		lit[1].append("|_______|").append(System.lineSeparator());

		lit[2].append(" _______ ").append(System.lineSeparator());
		lit[2].append("|       |").append(System.lineSeparator());
		lit[2].append("|       |").append(System.lineSeparator());
		lit[2].append("|       |").append(System.lineSeparator());
		lit[2].append("|      _|").append(System.lineSeparator());
		lit[2].append("|     |_ ").append(System.lineSeparator());
		lit[2].append("|_______|").append(System.lineSeparator());

		lit[3].append(" ______  ").append(System.lineSeparator());
		lit[3].append("|      | ").append(System.lineSeparator());
		lit[3].append("|  _    |").append(System.lineSeparator());
		lit[3].append("| | |   |").append(System.lineSeparator());
		lit[3].append("| |_|   |").append(System.lineSeparator());
		lit[3].append("|       |").append(System.lineSeparator());
		lit[3].append("|______| ").append(System.lineSeparator());

		lit[4].append(" _______ ").append(System.lineSeparator());
		lit[4].append("|       |").append(System.lineSeparator());
		lit[4].append("|    ___|").append(System.lineSeparator());
		lit[4].append("|   |___ ").append(System.lineSeparator());
		lit[4].append("|    ___|").append(System.lineSeparator());
		lit[4].append("|   |___ ").append(System.lineSeparator());
		lit[4].append("|_______|").append(System.lineSeparator());

		lit[5].append(" _______ ").append(System.lineSeparator());
		lit[5].append("|       |").append(System.lineSeparator());
		lit[5].append("|    ___|").append(System.lineSeparator());
		lit[5].append("|   |___ ").append(System.lineSeparator());
		lit[5].append("|    ___|").append(System.lineSeparator());
		lit[5].append("|   |    ").append(System.lineSeparator());
		lit[5].append("|___|    ").append(System.lineSeparator());

		lit[6].append(" _______ ").append(System.lineSeparator());
		lit[6].append("|       |").append(System.lineSeparator());
		lit[6].append("|    ___|").append(System.lineSeparator());
		lit[6].append("|   | __ ").append(System.lineSeparator());
		lit[6].append("|   ||  |").append(System.lineSeparator());
		lit[6].append("|   |_| |").append(System.lineSeparator());
		lit[6].append("|_______|").append(System.lineSeparator());

		lit[7].append(" __   __ ").append(System.lineSeparator());
		lit[7].append("|  | |  |").append(System.lineSeparator());
		lit[7].append("|  |_|  |").append(System.lineSeparator());
		lit[7].append("|       |").append(System.lineSeparator());
		lit[7].append("|       |").append(System.lineSeparator());
		lit[7].append("|   _   |").append(System.lineSeparator());
		lit[7].append("|__| |__|").append(System.lineSeparator());

		lit[8].append("   ___   ").append(System.lineSeparator());
		lit[8].append("  |   |  ").append(System.lineSeparator());
		lit[8].append("  |   |  ").append(System.lineSeparator());
		lit[8].append("  |   |  ").append(System.lineSeparator());
		lit[8].append("  |   |  ").append(System.lineSeparator());
		lit[8].append("  |   |  ").append(System.lineSeparator());
		lit[8].append("  |___|  ").append(System.lineSeparator());

		lit[9].append("     ___ ").append(System.lineSeparator());
		lit[9].append("    |   |").append(System.lineSeparator());
		lit[9].append("    |   |").append(System.lineSeparator());
		lit[9].append("    |   |").append(System.lineSeparator());
		lit[9].append(" ___|   |").append(System.lineSeparator());
		lit[9].append("|       |").append(System.lineSeparator());
		lit[9].append("|_______|").append(System.lineSeparator());

		lit[10].append(" ___   _ ").append(System.lineSeparator());
		lit[10].append("|   | | |").append(System.lineSeparator());
		lit[10].append("|   |_| |").append(System.lineSeparator());
		lit[10].append("|      _|").append(System.lineSeparator());
		lit[10].append("|     |_ ").append(System.lineSeparator());
		lit[10].append("|    _  |").append(System.lineSeparator());
		lit[10].append("|___| |_|").append(System.lineSeparator());

		lit[11].append(" ___     ").append(System.lineSeparator());
		lit[11].append("|   |    ").append(System.lineSeparator());
		lit[11].append("|   |    ").append(System.lineSeparator());
		lit[11].append("|   |    ").append(System.lineSeparator());
		lit[11].append("|   |___ ").append(System.lineSeparator());
		lit[11].append("|       |").append(System.lineSeparator());
		lit[11].append("|_______|").append(System.lineSeparator());

		lit[12].append(" __   __ ").append(System.lineSeparator());
		lit[12].append("|  |_|  |").append(System.lineSeparator());
		lit[12].append("|       |").append(System.lineSeparator());
		lit[12].append("|       |").append(System.lineSeparator());
		lit[12].append("|       |").append(System.lineSeparator());
		lit[12].append("| ||_|| |").append(System.lineSeparator());
		lit[12].append("|_|   |_|").append(System.lineSeparator());

		lit[13].append(" __    _ ").append(System.lineSeparator());
		lit[13].append("|  |  | |").append(System.lineSeparator());
		lit[13].append("|   |_| |").append(System.lineSeparator());
		lit[13].append("|       |").append(System.lineSeparator());
		lit[13].append("|  _    |").append(System.lineSeparator());
		lit[13].append("| | |   |").append(System.lineSeparator());
		lit[13].append("|_|  |__|").append(System.lineSeparator());

		lit[14].append(" _______ ").append(System.lineSeparator());
		lit[14].append("|       |").append(System.lineSeparator());
		lit[14].append("|   _   |").append(System.lineSeparator());
		lit[14].append("|  | |  |").append(System.lineSeparator());
		lit[14].append("|  |_|  |").append(System.lineSeparator());
		lit[14].append("|       |").append(System.lineSeparator());
		lit[14].append("|_______|").append(System.lineSeparator());

		lit[15].append(" _______ ").append(System.lineSeparator());
		lit[15].append("|       |").append(System.lineSeparator());
		lit[15].append("|    _  |").append(System.lineSeparator());
		lit[15].append("|   |_| |").append(System.lineSeparator());
		lit[15].append("|    ___|").append(System.lineSeparator());
		lit[15].append("|   |    ").append(System.lineSeparator());
		lit[15].append("|___|    ").append(System.lineSeparator());

		lit[16].append(" _______ ").append(System.lineSeparator());
		lit[16].append("|       |").append(System.lineSeparator());
		lit[16].append("|   _   |").append(System.lineSeparator());
		lit[16].append("|  | |  |").append(System.lineSeparator());
		lit[16].append("|  |_|  |").append(System.lineSeparator());
		lit[16].append("|      | ").append(System.lineSeparator());
		lit[16].append("|____||_|").append(System.lineSeparator());

		lit[17].append(" _____   ").append(System.lineSeparator());
		lit[17].append("|   _ |  ").append(System.lineSeparator());
		lit[17].append("|  | ||  ").append(System.lineSeparator());
		lit[17].append("|  |_||_ ").append(System.lineSeparator());
		lit[17].append("|   __  |").append(System.lineSeparator());
		lit[17].append("|  |  | |").append(System.lineSeparator());
		lit[17].append("|__|  |_|").append(System.lineSeparator());

		lit[18].append(" _______ ").append(System.lineSeparator());
		lit[18].append("|       |").append(System.lineSeparator());
		lit[18].append("|  _____|").append(System.lineSeparator());
		lit[18].append("| |_____ ").append(System.lineSeparator());
		lit[18].append("|_____  |").append(System.lineSeparator());
		lit[18].append(" _____| |").append(System.lineSeparator());
		lit[18].append("|_______|").append(System.lineSeparator());

		lit[19].append(" _______ ").append(System.lineSeparator());
		lit[19].append("|       |").append(System.lineSeparator());
		lit[19].append("|_     _|").append(System.lineSeparator());
		lit[19].append("  |   |  ").append(System.lineSeparator());
		lit[19].append("  |   |  ").append(System.lineSeparator());
		lit[19].append("  |   |  ").append(System.lineSeparator());
		lit[19].append("  |___| ").append(System.lineSeparator());

		lit[20].append(" __   __ ").append(System.lineSeparator());
		lit[20].append("|  | |  |").append(System.lineSeparator());
		lit[20].append("|  | |  |").append(System.lineSeparator());
		lit[20].append("|  |_|  |").append(System.lineSeparator());
		lit[20].append("|       |").append(System.lineSeparator());
		lit[20].append("|       |").append(System.lineSeparator());
		lit[20].append("|_______|").append(System.lineSeparator());

		lit[21].append(" __   __ ").append(System.lineSeparator());
		lit[21].append("|  | |  |").append(System.lineSeparator());
		lit[21].append("|  |_|  |").append(System.lineSeparator());
		lit[21].append("|       |").append(System.lineSeparator());
		lit[21].append("|       |").append(System.lineSeparator());
		lit[21].append(" |     | ").append(System.lineSeparator());
		lit[21].append("  |___|  ").append(System.lineSeparator());

		lit[22].append(" _     _ ").append(System.lineSeparator());
		lit[22].append("| | _ | |").append(System.lineSeparator());
		lit[22].append("| || || |").append(System.lineSeparator());
		lit[22].append("|       |").append(System.lineSeparator());
		lit[22].append("|       |").append(System.lineSeparator());
		lit[22].append("|   _   |").append(System.lineSeparator());
		lit[22].append("|__| |__|").append(System.lineSeparator());

		lit[23].append(" __   __ ").append(System.lineSeparator());
		lit[23].append("|  |_|  |").append(System.lineSeparator());
		lit[23].append("|       |").append(System.lineSeparator());
		lit[23].append("|       |").append(System.lineSeparator());
		lit[23].append(" |     | ").append(System.lineSeparator());
		lit[23].append("|   _   |").append(System.lineSeparator());
		lit[23].append("|__| |__|").append(System.lineSeparator());

		lit[24].append(" __   __ ").append(System.lineSeparator());
		lit[24].append("|  | |  |").append(System.lineSeparator());
		lit[24].append("|  |_|  |").append(System.lineSeparator());
		lit[24].append("|       |").append(System.lineSeparator());
		lit[24].append("|_     _|").append(System.lineSeparator());
		lit[24].append("  |   |  ").append(System.lineSeparator());
		lit[24].append("  |___|  ").append(System.lineSeparator());

		lit[25].append(" _______ ").append(System.lineSeparator());
		lit[25].append("|       |").append(System.lineSeparator());
		lit[25].append("|____   |").append(System.lineSeparator());
		lit[25].append(" ____|  |").append(System.lineSeparator());
		lit[25].append("| ______|").append(System.lineSeparator());
		lit[25].append("| |_____ ").append(System.lineSeparator());
		lit[25].append("|_______|").append(System.lineSeparator());

		lit[26].append("         ").append(System.lineSeparator());
		lit[26].append("         ").append(System.lineSeparator());
		lit[26].append("         ").append(System.lineSeparator());
		lit[26].append("         ").append(System.lineSeparator());
		lit[26].append("         ").append(System.lineSeparator());
		lit[26].append("         ").append(System.lineSeparator());
		lit[26].append(" _______ ").append(System.lineSeparator());

		int out = ((int) l - 65);
		return lit[l - 65];
	}

}
