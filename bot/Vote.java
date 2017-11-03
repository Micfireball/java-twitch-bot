//*************************************************************************
// 
// Author: Ashton Honeggar
// 
//
//*************************************************************************
package bot;

public class Vote{

	static boolean voteActive;
	String nick;
	int godChoice;
	int modeChoice;
	int roleChoice;
	
	public Vote(String nick, String vote, String type)
	{
		this.nick = nick;
		if (type.equals("god"))
		{
			godChoice = voteGod(vote);
			modeChoice = -1;
			roleChoice = -1;
		}
		else if (type.equals("mode"))
		{
			godChoice = -1;
			modeChoice = voteMode(vote);
			roleChoice = -1;
		}
		else if (type.equals("role"))
		{
			godChoice = -1;
			modeChoice = -1;
			roleChoice = voteRole(vote);
		}
		else
		{
			godChoice = -1;
			modeChoice = -1;
			roleChoice = -1;
		}
	}

	public static void startVote()
	{
		voteActive = true;
	}

	public static void endVote()
	{
		voteActive = false;
	}
	
	public static int voteMode(String mode)
	{
		switch (mode.toLowerCase()) {
		case "conquest":
		case "conq": return 0;
		case "joust": return 1;
		case "motd": return 2;
		case "siege":
		case "seige": return 3;
		case "arena": return 4;
		case "duel": return 5;
		case "assault": return 6;
		default: return -1;
		}
	}

	public static int voteRole(String role)
	{
		switch (role.toLowerCase()){
		case "sup":
		case "supp":
		case "support": return 0;
		
		case "adc":
		case "carry":
		case "adcarry": return 1;
		
		case "jungle":
		case "jungler":
		case "jg":
		case "jgl":
		case "jglr": return 2;
		
		case "mid":
		case "middle":
		case "midd": return 3;
		
		case "solo": return 4;
		
		default: return -1;
		}
	}
	
	public static int voteGod(String god)
	{
		switch (god.toLowerCase()){
		case "agni":
			return 0;
		case "amc":
		case "ah muzen cab":
		case "ahmuzencab":
			return 1;
		case "ap":
		case "ah puch":
		case "ahpuch":
		case "puch":
			return 2;
		case "amaterasu":
		case "ama":
			return 3;
		case "anhur":
			return 4;
		case "anubis":
			return 5;
		case "ao":
		case "kuang":
		case "ao kuang":
		case "aokuang":
		case "ak":
			return 6;
		case "aphro":
		case "aphrodite":
		case "afro":
			return 7;
		case "apollo":
			return 8;
		case "arachne":
			return 9;
		case "ares":
			return 10;
		case "art":
		case "artemis":
			return 11;
		case "athena":
			return 12;
		case "awilix":
			return 13;
		case "bacchus":
		case "baccus":
			return 14;
		case "baka":
		case "bakasura":
			return 15;
		case "bastet":
			return 16;
		case "bell":
		case "bellona":
			return 17;
		case "cabra":
		case "cabraken":
		case "cabroken":
		case "cabrakan":
			return 18;
		case "chaac":
			return 19;
		case "change":
		case "chang'e":
			return 20;
		case "chiron":
			return 21;
		case "chronos":
			return 22;
		case "cupid":
			return 23;
		case "fenrir":
		case "fen":
			return 24;
		case "freya":
			return 25;
		case "geb":
			return 26;
		case "guan":
		case "guan yu":
		case "guanyu":
		case "gy":
			return 27;
		case "hades":
			return 28;
		case "hebo":
		case "he bo":
		case "hb":
			return 29;
		case "hel":
		case "hell":
			return 30;
		case "herc":
		case "hercule":
		case "hercules":
			return 31;
		case "hou":
		case "hou yi":
		case "houyi":
		case "hy":
			return 32;
		case "hun":
		case "batz":
		case "bats":
		case "hun batz":
		case "hunbatz":
			return 33;
		case "isis":
			return 34;
		case "janus":
		case "jan":
			return 35;
		case "jing":
		case "wei":
		case "jingwei":
		case "way":
		case "jing wei":
		case "jing way":
		case "jingway":
		case "jw":
			return 36;
		case "kali":
			return 37;
		case "khep":
		case "khepri":
			return 38;
		case "kkk":
		case "kuku":
		case "kukulkan":
			return 39;
		case "kumba":
		case "kumbha":
		case "kumbhakarna":
		case "kumbakarna":
			return 40;
		case "loki":
			return 41;
		case "med":
		case "medusa":
			return 42;
		case "merc":
		case "mer":
		case "mercury":
			return 43;
		case "ne":
		case "zha":
		case "nezha":
		case "ne zha":
		case "nz":
			return 44;
		case "neith":
		case "nieth":
			return 45;
		case "nem":
		case "nemesis":
			return 46;
		case "nox":
			return 47;
		case "nu":
		case "wa":
		case "nw":
		case "nuwa":
		case "nu wa":
			return 48;
		case "odin":
		case "brodin":
		case "oden":
			return 49;
		case "osiris":
			return 50;
		case "pos":
		case "pose":
		case "poseidon":
		case "posiedon":
		case "poseiden":
			return 51;
		case "ra":
			return 52;
		case "raij":
		case "raijin":
			return 53;
		case "ram":
		case "rama":
			return 54;
		case "rat":
		case "ratatoskr":
			return 55;
		case "ravan":
		case "rav":
		case "ravana":
			return 56;
		case "scylla":
			return 57;
		case "serq":
		case "serqet":
		case "serket":
			return 58;
		case "skadi":
		case "kaldr":
			return 59;
		case "sobek":
			return 60;
		case "sol":
			return 61;
		case "swk":
		case "sun":
		case "wukong":
		case "sunwukong":
		case "sun wukong":
		case "sun wu kong":
			return 62;
		case "sylv":
		case "sylvanus":
			return 63;
		case "than":
		case "thana":
		case "thanatos":
			return 64;
		case "thor":
			return 65;
		case "tyr":
			return 66;
		case "ullr":
			return 67;
		case "vaman":
		case "vam":
		case "vamana":
			return 68;
		case "vulcan":
			return 69;
		case "xbal":
		case "xbalanque":
			return 70;
		case "xing":
		case "tian":
		case "xt":
		case "xingtian":
		case "xing tian":
			return 71;
		case "ymir":
			return 72;
		case "zeus":
		case "zues":
			return 73;
		case "zk":
		case "zong":
		case "zhong":
		case "zhongkui":
		case "kui":
		case "zhong kui":
			return 74;
		case "susan":
		case "susanoo":
		case "susano":
		case "susano'o":
			return 75;
		case "cama":
		case "camasots":
		case "camazot":
		case "camaz":
		case "camazots":
		case "camazotz":
			return 76;
		case "es":
		case "erl":
		case "erlan":
		case "erlang":
		case "shen":
		case "erlang shen":
		case "erlangshen":
			return 77;
		case "iz":
		case "iza":
		case "izanamy":
		case "izanami":
		case "izi":
			return 78;
		case "nike":
			return 79;
		case "terra":
		case "tera":
		case "terre":
			return 80;
		case "toth":
		case "thot":
		case "thuth":
		case "thoth":
			return 81;
		case "faf":
		case "fafn":
		case "fafnir":
		case "dragon":
			return 82;
		default: return -1;
		}
	}

	public static String findGod(int i)
	{
		switch (i){
		case 0: return "Agni";
		case 1: return "Ah Muzen Cab";
		case 2: return "Ah Puch";
		case 3: return "Amaterasu";
		case 4: return "Anhur";
		case 5: return "Anubis";
		case 6: return "Ao Kuang";
		case 7: return "Aphrodite";
		case 8: return "Apollo";
		case 9: return "Arachne";
		case 10: return "Ares";
		case 11: return "Artemis";
		case 12: return "Athena";
		case 13: return "Awilix";
		case 14: return "Bacchus";
		case 15: return "Bakasura";
		case 16: return "Bastet";
		case 17: return "Bellona";
		case 18: return "Cabrakan";
		case 19: return "Chaac";
		case 20: return "Chang'e";
		case 21: return "Chiron";
		case 22: return "Chronos";
		case 23: return "Cupid";
		case 24: return "Fenrir";
		case 25: return "Freya";
		case 26: return "Geb";
		case 27: return "Guan Yu";
		case 28: return "Hades";
		case 29: return "He Bo";
		case 30: return "Hel";
		case 31: return "Hercules";
		case 32: return "Hou Yi";
		case 33: return "Hun Batz";
		case 34: return "Isis";
		case 35: return "Janus";
		case 36: return "Jing Wei";
		case 37: return "Kali";
		case 38: return "Khepri";
		case 39: return "Kukulkan";
		case 40: return "Kumbhakarna";
		case 41: return "Loki";
		case 42: return "Medusa";
		case 43: return "Mercury";
		case 44: return "Ne Zha";
		case 45: return "Neith";
		case 46: return "Nemesis";
		case 47: return "Nox";
		case 48: return "Nu Wa";
		case 49: return "Odin";
		case 50: return "Osiris";
		case 51: return "Poseidon";
		case 52: return "Ra";
		case 53: return "Raijin";
		case 54: return "Rama";
		case 55: return "Ratatoskr";
		case 56: return "Ravana";
		case 57: return "Scylla";
		case 58: return "Serqet";
		case 59: return "Skadi";
		case 60: return "Sobek";
		case 61: return "Sol";
		case 62: return "Sun Wukong";
		case 63: return "Sylvanus";
		case 64: return "Thanatos";
		case 65: return "Thor";
		case 66: return "Tyr";
		case 67: return "Ullr";
		case 68: return "Vamana";
		case 69: return "Vulcan";
		case 70: return "Xbalanque";
		case 71: return "Xing Tian";
		case 72: return "Ymir";
		case 73: return "Zeus";
		case 74: return "Zhong Kui";
		case 75: return "Susano";
		case 76: return "Camazotz";
		case 77: return "Erlang Shen";
		case 78: return "Izanami";
		case 79: return "Nike";
		case 80: return "Terra";
		case 81: return "Thoth";
		case 82: return "Fafnir";
		default: return "";
		}
	}

	public static String findMode(int i)
	{
		switch (i){
		case 0: return "Conquest";
		case 1: return "Joust";
		case 2: return "Mode of the Day";
		case 3: return "Siege";
		case 4: return "Arena";
		case 5: return "Duel";
		case 6: return "Assault";
		default: return "";
		}
	}

	public static String findRole(int i)
	{
		switch (i){
		case 0: return "Support";
		case 1: return "ADC";
		case 2: return "Jungler";
		case 3: return "Mid";
		case 4: return "Solo";
		default: return "";
		}
	}

	public void setGod(String god)
	{
		godChoice = voteGod(god);
	}
	
	public void setRole(String role)
	{
		roleChoice = voteRole(role);
	}
	
	public void setMode(String mode)
	{
		modeChoice = voteMode(mode);
	}

	public int getGod()
	{
		return godChoice;
	}
	
	public int getRole()
	{
		return roleChoice;
	}
	
	public int getMode()
	{
		return modeChoice;
	}
	
	public String getNick()
	{
		return nick;
	}


}

