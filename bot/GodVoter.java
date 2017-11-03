//*************************************************************************
// 
// Author: Ashton Honeggar
// 
//
//*************************************************************************
package bot;
import java.util.ArrayList;

import org.pircbotx.hooks.events.MessageEvent;

public class GodVoter{

	static boolean voteActive;
	static ArrayList<String> godList = new ArrayList<String>();
	static ArrayList<String> modeList = new ArrayList<String>();
	static ArrayList<String> roleList = new ArrayList<String>();
	static int[] gods = new int[83];
	static int[] modes = new int[7];
	static int[] roles = new int[5];
	static String topGod;
	static String topRole;
	static String topMode;
	

	public static void startVote()
	{
		voteActive = true;
	}

	public static void endVote()
	{
		voteActive = false;
	}

	public static void resetVote()
	{
		for (int u = 0; u < gods.length; u++)
			gods[u] = 0;
		
		for (int u = 0; u < modes.length; u++)
			modes[u] = 0;
		
		for (int u = 0; u < roles.length; u++)
			roles[u] = 0;
		
		topGod = null;
		topRole = null;
		topMode = null;
	}
	
	public static void voteMode(String mode)
	{
		if (!voteActive)
			return;

		switch (mode.toLowerCase()) {
		case "conquest":
		case "conq":
			modes[0]++;
			break;
		case "joust":
			modes[1]++;
			break;
		case "motd":
			modes[2]++;
			break;
		case "siege":
		case "seige":
			modes[3]++;
			break;
		case "arena":
			modes[4]++;
			break;
		case "duel":
			modes[5]++;
			break;
		case "assault":
			modes[6]++;
			break;
		}
	}

	public static void voteRole(String role)
	{

		if (!voteActive)
			return;

		switch (role.toLowerCase()){
		case "sup":
		case "supp":
		case "support":
			roles[0]++;
			break;
		case "adc":
		case "adcarry":
			roles[1]++;
			break;
		case "jungle":
		case "jungler":
		case "jg":
		case "jgl":
		case "jglr":
			roles[2]++;
			break;
		case "mid":
		case "middle":
		case "midd":
			roles[3]++;
			break;
		case "solo":
			roles[4]++;
			break;
		}
	}
	
	public static void voteGod(String god)
	{
		if (!voteActive)
			return;
		
		switch (god.toLowerCase()){
		case "agni":
			gods[0]++;
			break;
		case "amc":
		case "ah muzen cab":
		case "ahmuzencab":
			gods[1]++;
			break;
		case "ap":
		case "ah puch":
		case "ahpuch":
		case "puch":
			gods[2]++;
			break;
		case "amaterasu":
		case "ama":
			gods[3]++;
			break;
		case "anhur":
			gods[4]++;
			break;
		case "anubis":
		case "goobis":
		case "noobis":
		case "nubis":
			gods[5]++;
			break;
		case "ao":
		case "kuang":
		case "ao kuang":
		case "aokuang":
		case "ak":
			gods[6]++;
			break;
		case "aphro":
		case "aphrodite":
		case "afro":
			gods[7]++;
			break;
		case "apollo":
			gods[8]++;
			break;
		case "arachne":
			gods[9]++;
			break;
		case "ares":
			gods[10]++;
			break;
		case "art":
		case "artemis":
			gods[11]++;
			break;
		case "athena":
			gods[12]++;
			break;
		case "awilix":
			gods[13]++;
			break;
		case "bacchus":
		case "baccus":
			gods[14]++;
			break;
		case "baka":
		case "bakasura":
			gods[15]++;
			break;
		case "bastet":
			gods[16]++;
			break;
		case "bell":
		case "bellona":
			gods[17]++;
			break;
		case "cabra":
		case "cabraken":
		case "cabroken":
		case "cabrakan":
			gods[18]++;
			break;
		case "chaac":
			gods[19]++;
			break;
		case "change":
		case "chang'e":
			gods[20]++;
			break;
		case "chiron":
			gods[21]++;
			break;
		case "chronos":
			gods[22]++;
			break;
		case "cupid":
			gods[23]++;
			break;
		case "fenrir":
		case "fen":
			gods[24]++;
			break;
		case "freya":
			gods[25]++;
			break;
		case "geb":
			gods[26]++;
			break;
		case "guan":
		case "guan yu":
		case "guanyu":
		case "gy":
			gods[27]++;
			break;
		case "hades":
			gods[28]++;
			break;
		case "hebo":
		case "he bo":
		case "hb":
			gods[29]++;
			break;
		case "hel":
		case "hell":
			gods[30]++;
			break;
		case "herc":
		case "hercule":
		case "hercules":
			gods[31]++;
			break;
		case "hou":
		case "hou yi":
		case "houyi":
		case "hy":
			gods[32]++;
			break;
		case "hun":
		case "batz":
		case "bats":
		case "hun batz":
		case "hunbatz":
			gods[33]++;
			break;
		case "isis":
			gods[34]++;
			break;
		case "janus":
		case "jan":
			gods[35]++;
			break;
		case "jing":
		case "wei":
		case "jingwei":
		case "way":
		case "jing wei":
		case "jing way":
		case "jingway":
		case "jw":
			gods[36]++;
			break;
		case "kali":
			gods[37]++;
			break;
		case "khep":
		case "khepri":
			gods[38]++;
			break;
		case "kkk":
		case "kuku":
		case "kukulkan":
			gods[39]++;
			break;
		case "kumba":
		case "kumbha":
		case "kumbhakarna":
		case "kumbakarna":
			gods[40]++;
			break;
		case "loki":
			gods[41]++;
			break;
		case "med":
		case "medusa":
			gods[42]++;
			break;
		case "merc":
		case "mer":
		case "mercury":
			gods[43]++;
			break;
		case "ne":
		case "zha":
		case "nezha":
		case "ne zha":
		case "nz":
			gods[44]++;
			break;
		case "neith":
		case "nieth":
			gods[45]++;
			break;
		case "nem":
		case "nemesis":
			gods[46]++;
			break;
		case "nox":
			gods[47]++;
			break;
		case "nu":
		case "wa":
		case "nw":
		case "nuwa":
		case "nu wa":
			gods[48]++;
			break;
		case "odin":
		case "brodin":
		case "oden":
			gods[49]++;
			break;
		case "osiris":
			gods[50]++;
			break;
		case "pos":
		case "pose":
		case "poseidon":
		case "posiedon":
		case "poseiden":
			gods[51]++;
			break;
		case "ra":
			gods[52]++;
			break;
		case "raij":
		case "raijin":
			gods[53]++;
			break;
		case "ram":
		case "rama":
			gods[54]++;
			break;
		case "rat":
		case "ratatoskr":
			gods[55]++;
			break;
		case "ravan":
		case "rav":
		case "ravana":
			gods[56]++;
			break;
		case "scylla":
			gods[57]++;
			break;
		case "serq":
		case "serqet":
		case "serket":
			gods[58]++;
			break;
		case "skadi":
		case "kaldr":
			gods[59]++;
			break;
		case "sobek":
			gods[60]++;
			break;
		case "sol":
			gods[61]++;
			break;
		case "swk":
		case "sun":
		case "wukong":
		case "sunwukong":
		case "sun wukong":
		case "sun wu kong":
			gods[62]++;
			break;
		case "sylv":
		case "sylvanus":
			gods[63]++;
			break;
		case "than":
		case "thana":
		case "thanatos":
			gods[64]++;
			break;
		case "thor":
			gods[65]++;
			break;
		case "tyr":
			gods[66]++;
			break;
		case "ullr":
			gods[67]++;
			break;
		case "vaman":
		case "vam":
		case "vamana":
			gods[68]++;
			break;
		case "vulcan":
			gods[69]++;
			break;
		case "xbal":
		case "xbalanque":
			gods[70]++;
			break;
		case "xing":
		case "tian":
		case "xt":
		case "xingtian":
		case "xing tian":
			gods[71]++;
			break;
		case "ymir":
			gods[72]++;
			break;
		case "zeus":
		case "zues":
			gods[73]++;
			break;
		case "zk":
		case "zong":
		case "zhong":
		case "zhongkui":
		case "kui":
		case "zhong kui":
			gods[74]++;
			break;
		case "susan":
		case "susanoo":
		case "susano":
		case "susano'o":
			gods[75]++;
			break;	
		case "cama":
		case "camasots":
		case "camazot":
		case "camaz":
		case "camazots":
		case "camazotz":
			gods[76]++;
			break;
		case "es":
		case "erl":
		case "erlan":
		case "erlang":
		case "shen":
		case "erlang shen":
		case "erlangshen":
			gods[77]++;
			break;
		case "iz":
		case "iza":
		case "izanamy":
		case "izanami":
		case "izi":
			gods[78]++;
			break;
		case "nike":
			gods[79]++;
			break;
		case "terra":
		case "tera":
		case "terre":
			gods[80]++;
			break;
		case "toth":
		case "thot":
		case "thuth":
		case "thoth":
			gods[81]++;
			break;
		case "faf":
		case "fafn":
		case "fafnir":
		case "dragon":
			gods[82]++;
			break;
		default:
			break;
		}
	}

	public static String getResults()
	{
		String str = "";
		int highest = 0, index = -1;
		
		if (topGod != null)
			str = str.concat(" The chosen god was " + topGod + ".");
		else
		{
			for (int i = 0; i < gods.length; i++)
			{
				if (gods[i] > highest)
				{
					highest = gods[i];
					index = i;
				}
			}
			
			if (highest != 0)
				str = str.concat(" The chosen god was " + (topGod = findGod(index)) + ".");
			
			highest = 0;
			index = -1;
		}
		
		if (topMode != null)
			str = str.concat(" The chosen mode was " + topMode + ".");
		else
		{
			for (int i = 0; i < modes.length; i++)
				if (modes[i] > highest)
				{
					highest = modes[i];
					index = i;
				}
			
			if (highest != 0)
				str = str.concat(" The chosen mode was " + (topMode = findMode(index)) + ".");
			
			highest = 0;
			index = -1;
		}
		
		if (topRole != null)
			str = str.concat(" The chosen role was " + topRole + ".");
		else
		{		
			for (int i = 0; i < roles.length; i++)
				if (roles[i] > highest)
				{
					highest = roles[i];
					index = i;
				}
			
			if (highest != 0)
				str = str.concat(" The chosen role was " + (topRole = findRole(index)) + ".");
		}
		
		return str;
	}

	public static boolean hasVoted(String nick, String type)
	{
		return false;
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

	public static boolean veto(MessageEvent event)
	{
		String message = event.getMessage();
		String veto = message.substring(message.indexOf("!veto") + 6, message.length());
		
		if (veto.split(" ").length == 1)
		{
			if (Vote.voteRole(veto) != -1)
			{
				topRole = findRole(Vote.voteRole(veto));
				return true;
			}
			else if (Vote.voteGod(veto) != -1)
			{
				topGod = findGod(Vote.voteGod(veto));
				return true;
			}
			return false;
		}
		else
		{
			if (Vote.voteRole(veto.split(" ")[0]) != -1)
			{
				topRole = findRole(Vote.voteRole(veto.split(" ")[0]));
				String str = veto.substring(veto.indexOf(veto.split(" ")[1]), veto.length() - 1);
				if (Vote.voteGod(str) != -1)
				{
					topGod = findGod(Vote.voteGod(str));
					return true;
				}
			}
			else if (Vote.voteRole(veto.split(" ")[veto.split(" ").length]) != -1)
			{
				topRole = findRole(Vote.voteRole(veto.split(" ")[veto.split(" ").length]));
				String str = veto.substring(0, veto.indexOf(veto.split(" ")[veto.split(" ").length]) - 1);
				if (Vote.voteGod(str) != -1)
				{
					topGod = findGod(Vote.voteGod(str));
					return true;
				}
			}
		}
		return false;
	}
}

