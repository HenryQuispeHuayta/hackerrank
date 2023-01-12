package week01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {
  public static void main(String[] args) {
    // List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
    // List<String> queries = Arrays.asList("aba", "xzxb", "ab");
    // List<String> strings = Arrays.asList("abcde", "sdaklfj", "asdjf", "na",
    // "basdn", "sdaklfj", "asdjf", "na", "asdjf",
    // List<String> queries = Arrays.asList("abcde", "sdaklfj", "asdjf", "na",
    // "basdn");
    List<String> strings = Arrays.asList("zwdlukjjxrmmryn", "ztparplhdjqmx", "pwrktdxteanqiote", "stsgbjuaoi",
        "xwhxwbbsnbnszkzr", "ujqeywqoyy", "stsgbjuaoi", "fzpfxiqislyhjwjthm", "bmkvzwhdcn", "fqaolimodeltugrnml",
        "gtacutjrvlrkcdwh", "gtacutjrvlrkcdwh", "nwppsvalds", "acuipzdhhxersdioxyx", "xwhxwbbsnbnszkzr", "nyriolszpp",
        "yhtqrgkiphgia", "hxuuunormsfwk", "ujqeywqoyy", "avkbbuadcbjgldumnuw", "mgxzkootgluwh", "jniqcuseavwlduybebl",
        "muomxznwldwmtjqkbj", "knqsaylytwvimzevpmr", "zyfjdawxvf", "npxrjevibwzb", "fwutfdncbc", "iddtebvipkrgxpov",
        "mqboxwcylwyi", "jniqcuseavwlduybebl", "ztparplhdjqmx", "vpxrkpujwjsll", "ujqeywqoyy", "fqaolimodeltugrnml",
        "hxuuunormsfwk", "avkbbuadcbjgldumnuw", "acuipzdhhxersdioxyx", "dlihpuvmrakvnzduzrt", "izgjffpzixghnm",
        "jniqcuseavwlduybebl", "tmpikikmxm", "hxuuunormsfwk", "gxhoxjbwuscaqg", "zwdlukjjxrmmryn", "fwlcdmgvfsp",
        "fpczqlqfpdhbrdknklg", "yhtqrgkiphgia", "dgbwzxdaqfsqvtdk", "krpsihiwhxf", "krpsihiwhxf", "iddtebvipkrgxpov",
        "fqaolimodeltugrnml", "jniqcuseavwlduybebl", "ddabxrvudlelfqzh", "dlihpuvmrakvnzduzrt", "zyfjdawxvf",
        "gtacutjrvlrkcdwh", "pwrktdxteanqiote", "gtacutjrvlrkcdwh", "qcpmpufaczmqd", "fqaolimodeltugrnml", "nwppsvalds",
        "stsgbjuaoi", "vpxrkpujwjsll", "vpxrkpujwjsll", "zyfjdawxvf", "ujqeywqoyy", "npxrjevibwzb",
        "fqaolimodeltugrnml", "fwutfdncbc", "yoagmjlovdydjzwoe", "fpczqlqfpdhbrdknklg", "tmpikikmxm",
        "fpczqlqfpdhbrdknklg", "exvudbqadokf", "gxhoxjbwuscaqg", "yhtqrgkiphgia", "ztparplhdjqmx",
        "qvnrmsrmsvyzjcllecn", "xwhxwbbsnbnszkzr", "mgxzkootgluwh", "vpxrkpujwjsll", "pwrktdxteanqiote", "nawiywmhkjso",
        "qvnrmsrmsvyzjcllecn", "pwrktdxteanqiote", "iddtebvipkrgxpov", "xwhxwbbsnbnszkzr", "dlihpuvmrakvnzduzrt",
        "qcpmpufaczmqd", "echyrevqro", "tmpikikmxm", "qcpmpufaczmqd", "fzpfxiqislyhjwjthm", "qcpmpufaczmqd",
        "muomxznwldwmtjqkbj", "mgxzkootgluwh", "nwppsvalds", "mqboxwcylwyi", "fpczqlqfpdhbrdknklg",
        "qvnrmsrmsvyzjcllecn", "fpczqlqfpdhbrdknklg", "gtacutjrvlrkcdwh", "ddabxrvudlelfqzh", "ztparplhdjqmx",
        "zwdlukjjxrmmryn", "jniqcuseavwlduybebl", "yhtqrgkiphgia", "ztparplhdjqmx", "zyfjdawxvf", "knqsaylytwvimzevpmr",
        "nyriolszpp", "yoagmjlovdydjzwoe", "pwrktdxteanqiote", "krpsihiwhxf", "exvudbqadokf", "gxhoxjbwuscaqg",
        "hqoutawqnlpepuaya", "jniqcuseavwlduybebl", "dgbwzxdaqfsqvtdk", "fwlcdmgvfsp", "fzpfxiqislyhjwjthm",
        "qcpmpufaczmqd", "nyriolszpp", "izgjffpzixghnm", "ztparplhdjqmx", "fpczqlqfpdhbrdknklg", "tmpikikmxm",
        "qvnrmsrmsvyzjcllecn", "ukkfiooakyaos", "avkbbuadcbjgldumnuw", "krpsihiwhxf", "ddabxrvudlelfqzh",
        "xwhxwbbsnbnszkzr", "muomxznwldwmtjqkbj", "zyfjdawxvf", "xwhxwbbsnbnszkzr", "jniqcuseavwlduybebl",
        "krpsihiwhxf", "gtacutjrvlrkcdwh", "mqboxwcylwyi", "yoagmjlovdydjzwoe", "exvudbqadokf", "npxrjevibwzb",
        "fqaolimodeltugrnml", "vpxrkpujwjsll", "pwrktdxteanqiote", "vpxrkpujwjsll", "nawiywmhkjso", "yhtqrgkiphgia",
        "acuipzdhhxersdioxyx", "dgbwzxdaqfsqvtdk", "fqaolimodeltugrnml", "xwhxwbbsnbnszkzr", "echyrevqro",
        "krpsihiwhxf", "yhtqrgkiphgia", "ujqeywqoyy", "mqboxwcylwyi", "mgxzkootgluwh", "nawiywmhkjso",
        "knqsaylytwvimzevpmr", "tmpikikmxm", "xwhxwbbsnbnszkzr", "uvbuyhmxepxlvqq", "hxuuunormsfwk", "ddabxrvudlelfqzh",
        "mqboxwcylwyi", "fpczqlqfpdhbrdknklg", "avkbbuadcbjgldumnuw", "ukkfiooakyaos", "mqboxwcylwyi", "mgxzkootgluwh",
        "xwhxwbbsnbnszkzr", "qcpmpufaczmqd", "mgxzkootgluwh", "dlihpuvmrakvnzduzrt", "fqaolimodeltugrnml", "fwutfdncbc",
        "fwlcdmgvfsp", "nyriolszpp", "stsgbjuaoi", "yoagmjlovdydjzwoe", "npxrjevibwzb", "pwrktdxteanqiote",
        "qvnrmsrmsvyzjcllecn", "pwrktdxteanqiote", "hxuuunormsfwk", "zwdlukjjxrmmryn", "xwhxwbbsnbnszkzr", "tmpikikmxm",
        "ujqeywqoyy", "fwutfdncbc", "knqsaylytwvimzevpmr", "fwutfdncbc", "pwrktdxteanqiote", "yoagmjlovdydjzwoe",
        "iddtebvipkrgxpov", "fwutfdncbc", "bmkvzwhdcn", "fzpfxiqislyhjwjthm", "zwdlukjjxrmmryn", "vpxrkpujwjsll",
        "uvbuyhmxepxlvqq", "mqboxwcylwyi", "dlihpuvmrakvnzduzrt", "qcpmpufaczmqd", "bmkvzwhdcn", "dlihpuvmrakvnzduzrt",
        "knqsaylytwvimzevpmr", "dgbwzxdaqfsqvtdk", "fzpfxiqislyhjwjthm", "gxhoxjbwuscaqg", "nyriolszpp",
        "qvnrmsrmsvyzjcllecn", "izgjffpzixghnm", "exvudbqadokf", "stsgbjuaoi", "qvnrmsrmsvyzjcllecn",
        "iddtebvipkrgxpov", "bmkvzwhdcn", "fwlcdmgvfsp", "gxhoxjbwuscaqg", "krpsihiwhxf", "echyrevqro", "npxrjevibwzb",
        "mgxzkootgluwh", "npxrjevibwzb", "mqboxwcylwyi", "qvnrmsrmsvyzjcllecn", "nyriolszpp", "nawiywmhkjso",
        "gtacutjrvlrkcdwh", "dlihpuvmrakvnzduzrt", "jniqcuseavwlduybebl", "ddabxrvudlelfqzh", "echyrevqro",
        "xwhxwbbsnbnszkzr", "fwutfdncbc", "nwppsvalds", "jniqcuseavwlduybebl", "zwdlukjjxrmmryn", "fzpfxiqislyhjwjthm",
        "echyrevqro", "ddabxrvudlelfqzh", "jniqcuseavwlduybebl", "muomxznwldwmtjqkbj", "ztparplhdjqmx", "nyriolszpp",
        "izgjffpzixghnm", "pwrktdxteanqiote", "ujqeywqoyy", "uvbuyhmxepxlvqq", "dlihpuvmrakvnzduzrt", "echyrevqro",
        "jniqcuseavwlduybebl", "yhtqrgkiphgia", "jniqcuseavwlduybebl", "muomxznwldwmtjqkbj", "xwhxwbbsnbnszkzr",
        "nwppsvalds", "vpxrkpujwjsll", "vpxrkpujwjsll", "ukkfiooakyaos", "npxrjevibwzb", "mqboxwcylwyi", "npxrjevibwzb",
        "mqboxwcylwyi", "avkbbuadcbjgldumnuw", "izgjffpzixghnm", "fwlcdmgvfsp", "echyrevqro", "hqoutawqnlpepuaya",
        "acuipzdhhxersdioxyx", "vpxrkpujwjsll", "fwutfdncbc", "exvudbqadokf", "fzpfxiqislyhjwjthm",
        "fpczqlqfpdhbrdknklg", "nawiywmhkjso", "dgbwzxdaqfsqvtdk", "stsgbjuaoi", "hqoutawqnlpepuaya",
        "avkbbuadcbjgldumnuw", "uvbuyhmxepxlvqq", "dgbwzxdaqfsqvtdk", "xwhxwbbsnbnszkzr", "zyfjdawxvf",
        "pwrktdxteanqiote", "qvnrmsrmsvyzjcllecn", "yoagmjlovdydjzwoe", "ztparplhdjqmx", "ztparplhdjqmx",
        "knqsaylytwvimzevpmr", "nwppsvalds", "qvnrmsrmsvyzjcllecn", "fwutfdncbc", "npxrjevibwzb", "mgxzkootgluwh",
        "ddabxrvudlelfqzh", "iddtebvipkrgxpov", "exvudbqadokf", "qcpmpufaczmqd", "gxhoxjbwuscaqg",
        "avkbbuadcbjgldumnuw", "vpxrkpujwjsll", "gxhoxjbwuscaqg", "ztparplhdjqmx", "ujqeywqoyy", "muomxznwldwmtjqkbj",
        "npxrjevibwzb", "npxrjevibwzb", "gtacutjrvlrkcdwh", "fwutfdncbc", "krpsihiwhxf", "dlihpuvmrakvnzduzrt",
        "nwppsvalds", "krpsihiwhxf", "tmpikikmxm", "stsgbjuaoi", "avkbbuadcbjgldumnuw", "hxuuunormsfwk",
        "hxuuunormsfwk", "echyrevqro", "echyrevqro", "bmkvzwhdcn", "bmkvzwhdcn", "nwppsvalds", "krpsihiwhxf",
        "ddabxrvudlelfqzh", "fwutfdncbc", "nyriolszpp", "dlihpuvmrakvnzduzrt", "izgjffpzixghnm", "vpxrkpujwjsll",
        "tmpikikmxm", "zwdlukjjxrmmryn", "vpxrkpujwjsll", "fwutfdncbc", "bmkvzwhdcn", "yhtqrgkiphgia", "nawiywmhkjso",
        "vpxrkpujwjsll", "xwhxwbbsnbnszkzr", "fwlcdmgvfsp", "yoagmjlovdydjzwoe", "fwlcdmgvfsp", "bmkvzwhdcn",
        "avkbbuadcbjgldumnuw", "fwlcdmgvfsp", "dlihpuvmrakvnzduzrt", "ujqeywqoyy", "uvbuyhmxepxlvqq",
        "fqaolimodeltugrnml", "xwhxwbbsnbnszkzr", "zwdlukjjxrmmryn", "ukkfiooakyaos", "tmpikikmxm", "mgxzkootgluwh",
        "pwrktdxteanqiote", "echyrevqro", "xwhxwbbsnbnszkzr", "nyriolszpp", "fwutfdncbc", "vpxrkpujwjsll",
        "xwhxwbbsnbnszkzr", "yoagmjlovdydjzwoe", "avkbbuadcbjgldumnuw", "fwlcdmgvfsp", "zyfjdawxvf",
        "qvnrmsrmsvyzjcllecn", "zwdlukjjxrmmryn", "yhtqrgkiphgia", "nwppsvalds", "muomxznwldwmtjqkbj", "mqboxwcylwyi",
        "muomxznwldwmtjqkbj", "yhtqrgkiphgia", "fwlcdmgvfsp", "hxuuunormsfwk", "echyrevqro", "exvudbqadokf",
        "uvbuyhmxepxlvqq", "pwrktdxteanqiote", "pwrktdxteanqiote", "nyriolszpp", "gtacutjrvlrkcdwh", "mqboxwcylwyi",
        "gtacutjrvlrkcdwh", "echyrevqro", "stsgbjuaoi", "pwrktdxteanqiote", "krpsihiwhxf", "fwlcdmgvfsp",
        "pwrktdxteanqiote", "tmpikikmxm", "muomxznwldwmtjqkbj", "gxhoxjbwuscaqg", "xwhxwbbsnbnszkzr", "izgjffpzixghnm",
        "knqsaylytwvimzevpmr", "echyrevqro", "pwrktdxteanqiote", "qvnrmsrmsvyzjcllecn", "avkbbuadcbjgldumnuw",
        "zwdlukjjxrmmryn", "fwlcdmgvfsp", "ddabxrvudlelfqzh", "jniqcuseavwlduybebl", "ujqeywqoyy", "xwhxwbbsnbnszkzr",
        "vpxrkpujwjsll", "krpsihiwhxf", "muomxznwldwmtjqkbj", "yhtqrgkiphgia", "acuipzdhhxersdioxyx", "yhtqrgkiphgia",
        "ukkfiooakyaos", "yhtqrgkiphgia", "yoagmjlovdydjzwoe", "pwrktdxteanqiote", "fzpfxiqislyhjwjthm", "echyrevqro",
        "krpsihiwhxf", "izgjffpzixghnm", "mgxzkootgluwh", "nyriolszpp", "nawiywmhkjso", "npxrjevibwzb", "echyrevqro",
        "pwrktdxteanqiote", "iddtebvipkrgxpov", "nwppsvalds", "iddtebvipkrgxpov", "zwdlukjjxrmmryn", "fwlcdmgvfsp",
        "knqsaylytwvimzevpmr", "zwdlukjjxrmmryn", "yoagmjlovdydjzwoe", "dlihpuvmrakvnzduzrt", "nwppsvalds",
        "krpsihiwhxf", "acuipzdhhxersdioxyx", "echyrevqro");
    List<String> queries = Arrays.asList("stsgbjuaoi", "yoagmjlovdydjzwoe", "exvudbqadokf", "pwrktdxteanqiote",
        "ztparplhdjqmx", "hxuuunormsfwk", "fwlcdmgvfsp", "yhtqrgkiphgia", "iddtebvipkrgxpov", "ukkfiooakyaos",
        "qcpmpufaczmqd", "qcpmpufaczmqd", "echyrevqro", "exvudbqadokf", "fwlcdmgvfsp", "gtacutjrvlrkcdwh",
        "xwhxwbbsnbnszkzr", "hxuuunormsfwk", "fwlcdmgvfsp", "izgjffpzixghnm", "izgjffpzixghnm", "ztparplhdjqmx",
        "yoagmjlovdydjzwoe", "stsgbjuaoi", "fzpfxiqislyhjwjthm", "exvudbqadokf", "qcpmpufaczmqd", "mqboxwcylwyi",
        "knqsaylytwvimzevpmr", "knqsaylytwvimzevpmr", "tmpikikmxm", "mqboxwcylwyi", "muomxznwldwmtjqkbj",
        "hxuuunormsfwk", "zwdlukjjxrmmryn", "ukkfiooakyaos", "qvnrmsrmsvyzjcllecn", "vpxrkpujwjsll", "gxhoxjbwuscaqg",
        "gtacutjrvlrkcdwh", "xwhxwbbsnbnszkzr", "iddtebvipkrgxpov", "hxuuunormsfwk", "avkbbuadcbjgldumnuw",
        "qvnrmsrmsvyzjcllecn", "mqboxwcylwyi", "hxuuunormsfwk", "nyriolszpp", "vpxrkpujwjsll", "stsgbjuaoi",
        "xwhxwbbsnbnszkzr", "xwhxwbbsnbnszkzr", "qcpmpufaczmqd", "mgxzkootgluwh", "ukkfiooakyaos", "nwppsvalds",
        "fpczqlqfpdhbrdknklg", "gxhoxjbwuscaqg", "mqboxwcylwyi", "yoagmjlovdydjzwoe", "ukkfiooakyaos",
        "hqoutawqnlpepuaya", "xwhxwbbsnbnszkzr", "exvudbqadokf", "xwhxwbbsnbnszkzr", "qcpmpufaczmqd",
        "qvnrmsrmsvyzjcllecn", "tmpikikmxm", "nawiywmhkjso", "fpczqlqfpdhbrdknklg", "fzpfxiqislyhjwjthm",
        "dlihpuvmrakvnzduzrt", "muomxznwldwmtjqkbj", "nwppsvalds", "zwdlukjjxrmmryn", "fwutfdncbc", "ztparplhdjqmx",
        "gxhoxjbwuscaqg", "fzpfxiqislyhjwjthm", "xwhxwbbsnbnszkzr", "fqaolimodeltugrnml", "fqaolimodeltugrnml",
        "zwdlukjjxrmmryn", "avkbbuadcbjgldumnuw", "ztparplhdjqmx", "ukkfiooakyaos", "ujqeywqoyy", "zyfjdawxvf",
        "izgjffpzixghnm", "krpsihiwhxf", "hxuuunormsfwk", "mgxzkootgluwh", "izgjffpzixghnm", "nawiywmhkjso",
        "muomxznwldwmtjqkbj", "zwdlukjjxrmmryn", "bmkvzwhdcn", "hqoutawqnlpepuaya", "fpczqlqfpdhbrdknklg",
        "iddtebvipkrgxpov", "fwlcdmgvfsp", "nwppsvalds", "krpsihiwhxf", "bmkvzwhdcn", "jniqcuseavwlduybebl",
        "vpxrkpujwjsll", "ztparplhdjqmx", "ztparplhdjqmx", "gtacutjrvlrkcdwh", "bmkvzwhdcn", "fzpfxiqislyhjwjthm",
        "qvnrmsrmsvyzjcllecn", "krpsihiwhxf", "hxuuunormsfwk", "pwrktdxteanqiote", "nyriolszpp", "hxuuunormsfwk",
        "muomxznwldwmtjqkbj", "tmpikikmxm", "uvbuyhmxepxlvqq", "hqoutawqnlpepuaya", "dgbwzxdaqfsqvtdk", "nyriolszpp",
        "ujqeywqoyy", "fqaolimodeltugrnml", "dlihpuvmrakvnzduzrt", "hxuuunormsfwk", "bmkvzwhdcn", "fzpfxiqislyhjwjthm",
        "fzpfxiqislyhjwjthm", "yhtqrgkiphgia", "jniqcuseavwlduybebl", "zyfjdawxvf", "zwdlukjjxrmmryn", "gxhoxjbwuscaqg",
        "uvbuyhmxepxlvqq", "fzpfxiqislyhjwjthm", "nyriolszpp", "iddtebvipkrgxpov", "iddtebvipkrgxpov", "qcpmpufaczmqd",
        "qcpmpufaczmqd", "zyfjdawxvf", "dlihpuvmrakvnzduzrt", "yhtqrgkiphgia", "acuipzdhhxersdioxyx",
        "avkbbuadcbjgldumnuw", "gxhoxjbwuscaqg", "nyriolszpp", "ujqeywqoyy", "qvnrmsrmsvyzjcllecn", "iddtebvipkrgxpov",
        "jniqcuseavwlduybebl", "nyriolszpp", "dlihpuvmrakvnzduzrt", "ddabxrvudlelfqzh", "zyfjdawxvf",
        "avkbbuadcbjgldumnuw", "ztparplhdjqmx", "tmpikikmxm", "exvudbqadokf", "stsgbjuaoi", "krpsihiwhxf",
        "izgjffpzixghnm", "nyriolszpp", "muomxznwldwmtjqkbj", "gtacutjrvlrkcdwh", "yhtqrgkiphgia", "bmkvzwhdcn",
        "uvbuyhmxepxlvqq", "uvbuyhmxepxlvqq", "qvnrmsrmsvyzjcllecn", "mqboxwcylwyi", "iddtebvipkrgxpov",
        "zwdlukjjxrmmryn", "pwrktdxteanqiote", "exvudbqadokf", "knqsaylytwvimzevpmr", "nawiywmhkjso", "echyrevqro",
        "krpsihiwhxf", "nawiywmhkjso", "pwrktdxteanqiote", "tmpikikmxm", "uvbuyhmxepxlvqq", "zyfjdawxvf",
        "knqsaylytwvimzevpmr", "muomxznwldwmtjqkbj", "jniqcuseavwlduybebl", "exvudbqadokf", "qcpmpufaczmqd",
        "izgjffpzixghnm", "mgxzkootgluwh", "dgbwzxdaqfsqvtdk", "fwlcdmgvfsp", "qvnrmsrmsvyzjcllecn", "nwppsvalds",
        "yoagmjlovdydjzwoe", "izgjffpzixghnm", "ujqeywqoyy", "dgbwzxdaqfsqvtdk", "dgbwzxdaqfsqvtdk", "nawiywmhkjso",
        "iddtebvipkrgxpov", "pwrktdxteanqiote", "dgbwzxdaqfsqvtdk", "hqoutawqnlpepuaya", "acuipzdhhxersdioxyx",
        "knqsaylytwvimzevpmr", "nawiywmhkjso", "ukkfiooakyaos", "ukkfiooakyaos", "nawiywmhkjso", "fpczqlqfpdhbrdknklg",
        "zwdlukjjxrmmryn", "ukkfiooakyaos", "acuipzdhhxersdioxyx", "dlihpuvmrakvnzduzrt", "hqoutawqnlpepuaya",
        "ujqeywqoyy", "zwdlukjjxrmmryn", "nyriolszpp", "avkbbuadcbjgldumnuw", "tmpikikmxm", "gxhoxjbwuscaqg",
        "dlihpuvmrakvnzduzrt", "zwdlukjjxrmmryn", "xwhxwbbsnbnszkzr", "nwppsvalds", "yoagmjlovdydjzwoe", "nwppsvalds",
        "xwhxwbbsnbnszkzr", "qvnrmsrmsvyzjcllecn", "echyrevqro", "yhtqrgkiphgia", "fwutfdncbc", "muomxznwldwmtjqkbj",
        "izgjffpzixghnm", "krpsihiwhxf", "bmkvzwhdcn", "pwrktdxteanqiote", "ztparplhdjqmx", "zwdlukjjxrmmryn",
        "yhtqrgkiphgia", "yhtqrgkiphgia", "zwdlukjjxrmmryn", "dlihpuvmrakvnzduzrt", "krpsihiwhxf", "nwppsvalds",
        "ukkfiooakyaos", "dlihpuvmrakvnzduzrt", "fwutfdncbc", "fwlcdmgvfsp", "fwlcdmgvfsp", "dgbwzxdaqfsqvtdk",
        "fwlcdmgvfsp", "dgbwzxdaqfsqvtdk", "tmpikikmxm", "pwrktdxteanqiote", "xwhxwbbsnbnszkzr", "vpxrkpujwjsll",
        "tmpikikmxm", "echyrevqro", "ukkfiooakyaos", "hqoutawqnlpepuaya", "nwppsvalds", "knqsaylytwvimzevpmr",
        "xwhxwbbsnbnszkzr", "hxuuunormsfwk", "stsgbjuaoi", "iddtebvipkrgxpov", "fwlcdmgvfsp", "dlihpuvmrakvnzduzrt",
        "fwlcdmgvfsp", "qvnrmsrmsvyzjcllecn", "jniqcuseavwlduybebl", "izgjffpzixghnm", "zyfjdawxvf", "dgbwzxdaqfsqvtdk",
        "zyfjdawxvf", "jniqcuseavwlduybebl", "pwrktdxteanqiote", "nawiywmhkjso", "dgbwzxdaqfsqvtdk", "fwutfdncbc",
        "ddabxrvudlelfqzh", "gtacutjrvlrkcdwh", "ujqeywqoyy", "yhtqrgkiphgia", "mgxzkootgluwh", "bmkvzwhdcn",
        "izgjffpzixghnm", "mqboxwcylwyi", "fzpfxiqislyhjwjthm", "avkbbuadcbjgldumnuw", "gtacutjrvlrkcdwh",
        "acuipzdhhxersdioxyx", "tmpikikmxm", "qcpmpufaczmqd", "npxrjevibwzb", "izgjffpzixghnm", "nyriolszpp",
        "fzpfxiqislyhjwjthm", "exvudbqadokf", "jniqcuseavwlduybebl", "gxhoxjbwuscaqg", "ujqeywqoyy", "ztparplhdjqmx",
        "vpxrkpujwjsll", "tmpikikmxm", "tmpikikmxm", "ztparplhdjqmx", "gtacutjrvlrkcdwh", "mqboxwcylwyi",
        "gtacutjrvlrkcdwh", "fzpfxiqislyhjwjthm", "gxhoxjbwuscaqg", "mgxzkootgluwh", "knqsaylytwvimzevpmr",
        "avkbbuadcbjgldumnuw", "mgxzkootgluwh", "npxrjevibwzb", "dgbwzxdaqfsqvtdk", "acuipzdhhxersdioxyx", "zyfjdawxvf",
        "gtacutjrvlrkcdwh", "gxhoxjbwuscaqg", "fzpfxiqislyhjwjthm", "ujqeywqoyy", "zwdlukjjxrmmryn", "ddabxrvudlelfqzh",
        "exvudbqadokf", "yoagmjlovdydjzwoe", "bmkvzwhdcn", "vpxrkpujwjsll", "fwlcdmgvfsp", "uvbuyhmxepxlvqq",
        "dgbwzxdaqfsqvtdk", "knqsaylytwvimzevpmr", "mqboxwcylwyi", "pwrktdxteanqiote", "jniqcuseavwlduybebl",
        "gxhoxjbwuscaqg", "ztparplhdjqmx", "hqoutawqnlpepuaya", "fwlcdmgvfsp", "yhtqrgkiphgia", "dlihpuvmrakvnzduzrt",
        "xwhxwbbsnbnszkzr", "ztparplhdjqmx", "ztparplhdjqmx", "qvnrmsrmsvyzjcllecn", "jniqcuseavwlduybebl",
        "iddtebvipkrgxpov", "avkbbuadcbjgldumnuw", "fzpfxiqislyhjwjthm", "gxhoxjbwuscaqg", "mgxzkootgluwh",
        "mqboxwcylwyi", "exvudbqadokf", "ddabxrvudlelfqzh", "avkbbuadcbjgldumnuw", "hqoutawqnlpepuaya", "zyfjdawxvf",
        "vpxrkpujwjsll", "pwrktdxteanqiote", "qcpmpufaczmqd", "pwrktdxteanqiote", "gxhoxjbwuscaqg", "izgjffpzixghnm",
        "npxrjevibwzb", "krpsihiwhxf", "xwhxwbbsnbnszkzr", "fwlcdmgvfsp", "exvudbqadokf", "ztparplhdjqmx",
        "mgxzkootgluwh", "hxuuunormsfwk", "zwdlukjjxrmmryn", "stsgbjuaoi", "ukkfiooakyaos", "ddabxrvudlelfqzh",
        "nawiywmhkjso", "avkbbuadcbjgldumnuw", "avkbbuadcbjgldumnuw", "iddtebvipkrgxpov", "uvbuyhmxepxlvqq",
        "iddtebvipkrgxpov", "ztparplhdjqmx", "fwutfdncbc", "iddtebvipkrgxpov", "hxuuunormsfwk", "fqaolimodeltugrnml",
        "acuipzdhhxersdioxyx", "xwhxwbbsnbnszkzr", "avkbbuadcbjgldumnuw", "iddtebvipkrgxpov", "krpsihiwhxf",
        "exvudbqadokf", "fwutfdncbc", "dgbwzxdaqfsqvtdk", "hqoutawqnlpepuaya", "muomxznwldwmtjqkbj",
        "dlihpuvmrakvnzduzrt", "ddabxrvudlelfqzh", "dlihpuvmrakvnzduzrt", "xwhxwbbsnbnszkzr", "gtacutjrvlrkcdwh",
        "gtacutjrvlrkcdwh", "fwlcdmgvfsp", "npxrjevibwzb", "xwhxwbbsnbnszkzr", "xwhxwbbsnbnszkzr", "pwrktdxteanqiote",
        "iddtebvipkrgxpov", "fzpfxiqislyhjwjthm", "qcpmpufaczmqd", "uvbuyhmxepxlvqq", "ztparplhdjqmx", "stsgbjuaoi",
        "vpxrkpujwjsll", "zyfjdawxvf", "echyrevqro", "ddabxrvudlelfqzh", "dlihpuvmrakvnzduzrt", "dgbwzxdaqfsqvtdk",
        "vpxrkpujwjsll", "nwppsvalds", "fwutfdncbc", "stsgbjuaoi", "mqboxwcylwyi", "pwrktdxteanqiote",
        "ddabxrvudlelfqzh", "krpsihiwhxf", "mqboxwcylwyi", "izgjffpzixghnm", "dgbwzxdaqfsqvtdk", "izgjffpzixghnm",
        "muomxznwldwmtjqkbj", "xwhxwbbsnbnszkzr", "ujqeywqoyy", "bmkvzwhdcn", "hqoutawqnlpepuaya", "stsgbjuaoi",
        "tmpikikmxm", "mqboxwcylwyi", "izgjffpzixghnm", "muomxznwldwmtjqkbj", "exvudbqadokf", "qcpmpufaczmqd",
        "hxuuunormsfwk", "jniqcuseavwlduybebl", "vpxrkpujwjsll", "exvudbqadokf", "xwhxwbbsnbnszkzr", "nwppsvalds",
        "nwppsvalds", "fwlcdmgvfsp", "nyriolszpp", "ztparplhdjqmx", "fpczqlqfpdhbrdknklg", "hxuuunormsfwk",
        "dlihpuvmrakvnzduzrt", "iddtebvipkrgxpov", "vpxrkpujwjsll", "gxhoxjbwuscaqg", "dlihpuvmrakvnzduzrt",
        "iddtebvipkrgxpov", "vpxrkpujwjsll", "dlihpuvmrakvnzduzrt", "fqaolimodeltugrnml", "ztparplhdjqmx",
        "fqaolimodeltugrnml", "mqboxwcylwyi", "echyrevqro", "vpxrkpujwjsll", "uvbuyhmxepxlvqq", "muomxznwldwmtjqkbj",
        "yoagmjlovdydjzwoe", "knqsaylytwvimzevpmr", "fqaolimodeltugrnml", "nwppsvalds", "vpxrkpujwjsll",
        "xwhxwbbsnbnszkzr", "fpczqlqfpdhbrdknklg", "gtacutjrvlrkcdwh", "gtacutjrvlrkcdwh", "fqaolimodeltugrnml",
        "zyfjdawxvf", "dgbwzxdaqfsqvtdk", "krpsihiwhxf", "dlihpuvmrakvnzduzrt", "xwhxwbbsnbnszkzr", "nwppsvalds",
        "vpxrkpujwjsll", "fpczqlqfpdhbrdknklg", "iddtebvipkrgxpov", "ukkfiooakyaos", "echyrevqro", "stsgbjuaoi",
        "mqboxwcylwyi", "xwhxwbbsnbnszkzr", "exvudbqadokf", "fqaolimodeltugrnml", "qcpmpufaczmqd", "ztparplhdjqmx",
        "gxhoxjbwuscaqg", "zyfjdawxvf", "gtacutjrvlrkcdwh", "zwdlukjjxrmmryn", "echyrevqro", "gxhoxjbwuscaqg",
        "mgxzkootgluwh", "fqaolimodeltugrnml", "uvbuyhmxepxlvqq", "uvbuyhmxepxlvqq", "echyrevqro", "echyrevqro",
        "bmkvzwhdcn", "npxrjevibwzb", "nawiywmhkjso", "fzpfxiqislyhjwjthm", "gxhoxjbwuscaqg", "nawiywmhkjso",
        "fpczqlqfpdhbrdknklg", "yoagmjlovdydjzwoe", "krpsihiwhxf", "acuipzdhhxersdioxyx", "acuipzdhhxersdioxyx",
        "ztparplhdjqmx", "nwppsvalds", "izgjffpzixghnm", "mqboxwcylwyi", "npxrjevibwzb", "zyfjdawxvf", "ztparplhdjqmx",
        "ddabxrvudlelfqzh", "fwlcdmgvfsp", "npxrjevibwzb", "krpsihiwhxf", "knqsaylytwvimzevpmr", "fqaolimodeltugrnml",
        "fwutfdncbc", "exvudbqadokf", "nyriolszpp", "dlihpuvmrakvnzduzrt", "fwutfdncbc", "zyfjdawxvf", "exvudbqadokf",
        "fqaolimodeltugrnml", "hxuuunormsfwk", "acuipzdhhxersdioxyx", "tmpikikmxm", "ujqeywqoyy", "gtacutjrvlrkcdwh",
        "hqoutawqnlpepuaya", "dlihpuvmrakvnzduzrt", "ddabxrvudlelfqzh", "exvudbqadokf", "gtacutjrvlrkcdwh",
        "nwppsvalds", "ukkfiooakyaos", "muomxznwldwmtjqkbj", "nawiywmhkjso", "nawiywmhkjso", "zyfjdawxvf",
        "avkbbuadcbjgldumnuw", "jniqcuseavwlduybebl", "vpxrkpujwjsll", "vpxrkpujwjsll", "yoagmjlovdydjzwoe",
        "hxuuunormsfwk", "hqoutawqnlpepuaya", "zwdlukjjxrmmryn", "krpsihiwhxf", "yhtqrgkiphgia", "avkbbuadcbjgldumnuw",
        "echyrevqro", "dlihpuvmrakvnzduzrt", "iddtebvipkrgxpov", "krpsihiwhxf", "nwppsvalds", "fwlcdmgvfsp",
        "gxhoxjbwuscaqg", "iddtebvipkrgxpov", "avkbbuadcbjgldumnuw", "bmkvzwhdcn", "dlihpuvmrakvnzduzrt", "echyrevqro",
        "ujqeywqoyy", "izgjffpzixghnm", "exvudbqadokf", "qvnrmsrmsvyzjcllecn", "fzpfxiqislyhjwjthm",
        "avkbbuadcbjgldumnuw", "knqsaylytwvimzevpmr", "ddabxrvudlelfqzh", "gtacutjrvlrkcdwh", "zyfjdawxvf",
        "vpxrkpujwjsll", "ukkfiooakyaos", "knqsaylytwvimzevpmr", "yhtqrgkiphgia", "knqsaylytwvimzevpmr",
        "iddtebvipkrgxpov", "pwrktdxteanqiote", "dlihpuvmrakvnzduzrt", "ujqeywqoyy", "xwhxwbbsnbnszkzr", "zyfjdawxvf",
        "zwdlukjjxrmmryn", "acuipzdhhxersdioxyx", "yhtqrgkiphgia", "nawiywmhkjso", "ukkfiooakyaos",
        "acuipzdhhxersdioxyx", "knqsaylytwvimzevpmr", "ukkfiooakyaos", "echyrevqro", "ukkfiooakyaos", "gxhoxjbwuscaqg",
        "ztparplhdjqmx", "fwutfdncbc", "knqsaylytwvimzevpmr", "zwdlukjjxrmmryn", "qcpmpufaczmqd", "izgjffpzixghnm",
        "npxrjevibwzb", "qvnrmsrmsvyzjcllecn", "acuipzdhhxersdioxyx", "krpsihiwhxf", "dlihpuvmrakvnzduzrt",
        "yoagmjlovdydjzwoe", "dgbwzxdaqfsqvtdk", "mqboxwcylwyi", "knqsaylytwvimzevpmr", "izgjffpzixghnm",
        "xwhxwbbsnbnszkzr", "hxuuunormsfwk", "nwppsvalds", "nyriolszpp", "acuipzdhhxersdioxyx", "fzpfxiqislyhjwjthm",
        "ujqeywqoyy", "hqoutawqnlpepuaya", "jniqcuseavwlduybebl", "yhtqrgkiphgia", "fwutfdncbc", "npxrjevibwzb",
        "fpczqlqfpdhbrdknklg", "mqboxwcylwyi", "zwdlukjjxrmmryn", "mqboxwcylwyi", "fzpfxiqislyhjwjthm", "fwutfdncbc",
        "ddabxrvudlelfqzh", "fwlcdmgvfsp", "xwhxwbbsnbnszkzr", "fwutfdncbc", "uvbuyhmxepxlvqq", "yoagmjlovdydjzwoe",
        "krpsihiwhxf", "dlihpuvmrakvnzduzrt", "muomxznwldwmtjqkbj", "krpsihiwhxf", "echyrevqro", "npxrjevibwzb",
        "krpsihiwhxf", "hxuuunormsfwk", "dgbwzxdaqfsqvtdk", "fwlcdmgvfsp", "pwrktdxteanqiote", "muomxznwldwmtjqkbj",
        "qvnrmsrmsvyzjcllecn", "yhtqrgkiphgia", "pwrktdxteanqiote", "qcpmpufaczmqd", "krpsihiwhxf",
        "fzpfxiqislyhjwjthm", "nawiywmhkjso", "echyrevqro", "krpsihiwhxf", "stsgbjuaoi", "zwdlukjjxrmmryn",
        "yhtqrgkiphgia", "acuipzdhhxersdioxyx", "ujqeywqoyy", "dlihpuvmrakvnzduzrt", "hqoutawqnlpepuaya",
        "fpczqlqfpdhbrdknklg", "qvnrmsrmsvyzjcllecn", "fwutfdncbc", "nwppsvalds", "izgjffpzixghnm", "nwppsvalds",
        "exvudbqadokf", "jniqcuseavwlduybebl", "zyfjdawxvf", "hxuuunormsfwk", "iddtebvipkrgxpov", "yhtqrgkiphgia",
        "acuipzdhhxersdioxyx", "nawiywmhkjso", "nyriolszpp", "qvnrmsrmsvyzjcllecn", "fqaolimodeltugrnml",
        "knqsaylytwvimzevpmr", "fpczqlqfpdhbrdknklg", "acuipzdhhxersdioxyx", "xwhxwbbsnbnszkzr", "avkbbuadcbjgldumnuw",
        "krpsihiwhxf", "ztparplhdjqmx", "ztparplhdjqmx", "npxrjevibwzb", "ukkfiooakyaos", "avkbbuadcbjgldumnuw",
        "gtacutjrvlrkcdwh", "npxrjevibwzb", "qcpmpufaczmqd", "fqaolimodeltugrnml", "mqboxwcylwyi", "xwhxwbbsnbnszkzr",
        "tmpikikmxm", "jniqcuseavwlduybebl", "fzpfxiqislyhjwjthm", "exvudbqadokf", "hqoutawqnlpepuaya",
        "fpczqlqfpdhbrdknklg", "fwutfdncbc", "izgjffpzixghnm", "uvbuyhmxepxlvqq", "dlihpuvmrakvnzduzrt",
        "uvbuyhmxepxlvqq", "nyriolszpp", "pwrktdxteanqiote", "dlihpuvmrakvnzduzrt", "qcpmpufaczmqd", "ddabxrvudlelfqzh",
        "iddtebvipkrgxpov", "ujqeywqoyy", "nyriolszpp", "acuipzdhhxersdioxyx", "dgbwzxdaqfsqvtdk",
        "knqsaylytwvimzevpmr", "echyrevqro", "fpczqlqfpdhbrdknklg", "nawiywmhkjso", "qcpmpufaczmqd", "nwppsvalds",
        "nyriolszpp", "dgbwzxdaqfsqvtdk", "xwhxwbbsnbnszkzr", "fzpfxiqislyhjwjthm", "gxhoxjbwuscaqg",
        "fzpfxiqislyhjwjthm", "muomxznwldwmtjqkbj", "ujqeywqoyy", "hxuuunormsfwk", "pwrktdxteanqiote", "tmpikikmxm",
        "knqsaylytwvimzevpmr", "dgbwzxdaqfsqvtdk", "hqoutawqnlpepuaya", "zyfjdawxvf", "fzpfxiqislyhjwjthm",
        "iddtebvipkrgxpov", "avkbbuadcbjgldumnuw", "qcpmpufaczmqd", "ukkfiooakyaos", "krpsihiwhxf", "fwlcdmgvfsp",
        "gxhoxjbwuscaqg", "ukkfiooakyaos", "dlihpuvmrakvnzduzrt", "izgjffpzixghnm", "nawiywmhkjso", "xwhxwbbsnbnszkzr",
        "yoagmjlovdydjzwoe", "hqoutawqnlpepuaya", "stsgbjuaoi", "gxhoxjbwuscaqg", "pwrktdxteanqiote", "ujqeywqoyy",
        "jniqcuseavwlduybebl", "vpxrkpujwjsll", "nwppsvalds", "jniqcuseavwlduybebl", "muomxznwldwmtjqkbj", "tmpikikmxm",
        "mgxzkootgluwh", "acuipzdhhxersdioxyx", "ztparplhdjqmx", "echyrevqro", "fwutfdncbc", "gxhoxjbwuscaqg",
        "gtacutjrvlrkcdwh", "nwppsvalds", "gtacutjrvlrkcdwh", "zwdlukjjxrmmryn", "dlihpuvmrakvnzduzrt",
        "knqsaylytwvimzevpmr", "qcpmpufaczmqd", "nwppsvalds", "zwdlukjjxrmmryn", "fzpfxiqislyhjwjthm", "ujqeywqoyy",
        "avkbbuadcbjgldumnuw", "avkbbuadcbjgldumnuw", "ujqeywqoyy", "gtacutjrvlrkcdwh", "iddtebvipkrgxpov",
        "echyrevqro", "nawiywmhkjso", "izgjffpzixghnm", "fqaolimodeltugrnml", "dgbwzxdaqfsqvtdk", "yhtqrgkiphgia",
        "fzpfxiqislyhjwjthm", "dlihpuvmrakvnzduzrt", "fwutfdncbc", "avkbbuadcbjgldumnuw", "zwdlukjjxrmmryn",
        "knqsaylytwvimzevpmr", "muomxznwldwmtjqkbj", "zwdlukjjxrmmryn", "nwppsvalds", "iddtebvipkrgxpov",
        "uvbuyhmxepxlvqq", "nyriolszpp", "dgbwzxdaqfsqvtdk", "gtacutjrvlrkcdwh", "gtacutjrvlrkcdwh", "hxuuunormsfwk",
        "yhtqrgkiphgia", "uvbuyhmxepxlvqq", "hqoutawqnlpepuaya", "fwutfdncbc", "acuipzdhhxersdioxyx", "zwdlukjjxrmmryn",
        "jniqcuseavwlduybebl", "tmpikikmxm", "fwlcdmgvfsp", "fzpfxiqislyhjwjthm", "vpxrkpujwjsll", "hqoutawqnlpepuaya",
        "fqaolimodeltugrnml", "qcpmpufaczmqd", "fpczqlqfpdhbrdknklg", "fqaolimodeltugrnml", "nyriolszpp",
        "dgbwzxdaqfsqvtdk", "izgjffpzixghnm", "zyfjdawxvf", "fwutfdncbc", "fwlcdmgvfsp", "mqboxwcylwyi", "mqboxwcylwyi",
        "hqoutawqnlpepuaya", "nyriolszpp", "mqboxwcylwyi", "dgbwzxdaqfsqvtdk", "nyriolszpp", "izgjffpzixghnm",
        "nyriolszpp", "nyriolszpp", "gxhoxjbwuscaqg", "iddtebvipkrgxpov", "vpxrkpujwjsll", "xwhxwbbsnbnszkzr",
        "avkbbuadcbjgldumnuw", "stsgbjuaoi", "yhtqrgkiphgia", "zwdlukjjxrmmryn", "zwdlukjjxrmmryn", "dgbwzxdaqfsqvtdk",
        "npxrjevibwzb", "npxrjevibwzb", "ujqeywqoyy", "ztparplhdjqmx", "bmkvzwhdcn", "xwhxwbbsnbnszkzr",
        "dgbwzxdaqfsqvtdk", "gxhoxjbwuscaqg", "fpczqlqfpdhbrdknklg", "ujqeywqoyy", "zyfjdawxvf", "knqsaylytwvimzevpmr");

    List<Integer> result = SparseArraysResult.matchingStrings(strings, queries);

    List<Integer> result2 = Arrays.asList(8, 10, 7, 19, 10, 8, 13, 13, 8, 5, 8, 8, 16, 7, 13, 10, 19, 8, 13, 8, 8, 10,
        10, 8, 8, 7, 8, 12, 8, 8, 10, 12, 10, 8, 12, 5, 12, 16, 8, 10, 19, 8, 8, 11, 12, 12, 8, 11, 16, 8, 19, 19, 8,
        10, 5, 11, 8, 8, 12, 10, 5, 3, 19, 7, 19, 8, 12, 10, 7, 8, 8, 12, 10, 11, 12, 13, 10, 8, 8, 19, 9, 9, 12, 11,
        10, 5, 10, 7, 8, 14, 8, 10, 8, 7, 10, 12, 8, 3, 8, 8, 13, 11, 14, 8, 13, 16, 10, 10, 10, 8, 8, 12, 14, 8, 19,
        11, 8, 10, 10, 6, 3, 6, 11, 10, 9, 12, 8, 8, 8, 8, 13, 13, 7, 12, 8, 6, 8, 11, 8, 8, 8, 8, 7, 12, 13, 6, 11, 8,
        11, 10, 12, 8, 13, 11, 12, 9, 7, 11, 10, 10, 7, 8, 14, 8, 11, 10, 10, 13, 8, 6, 6, 12, 12, 8, 12, 19, 7, 8, 7,
        16, 14, 7, 19, 10, 6, 7, 8, 10, 13, 7, 8, 8, 10, 6, 13, 12, 11, 10, 8, 10, 6, 6, 7, 8, 19, 6, 3, 6, 8, 7, 5, 5,
        7, 8, 12, 5, 6, 12, 3, 10, 12, 11, 11, 10, 8, 12, 12, 19, 11, 10, 11, 19, 12, 16, 13, 13, 10, 8, 14, 8, 19, 10,
        12, 13, 13, 12, 12, 14, 11, 5, 12, 13, 13, 13, 6, 13, 6, 10, 19, 19, 16, 10, 16, 5, 3, 11, 8, 19, 8, 8, 8, 13,
        12, 13, 12, 13, 8, 7, 6, 7, 13, 19, 7, 6, 13, 9, 10, 10, 13, 10, 8, 8, 12, 8, 11, 10, 6, 10, 8, 12, 8, 11, 8, 7,
        13, 8, 10, 10, 16, 10, 10, 10, 10, 12, 10, 8, 8, 10, 8, 11, 10, 12, 6, 6, 7, 10, 8, 8, 10, 12, 9, 7, 10, 8, 16,
        13, 6, 6, 8, 12, 19, 13, 8, 10, 3, 13, 13, 12, 19, 10, 10, 12, 13, 8, 11, 8, 8, 10, 12, 7, 9, 11, 3, 7, 16, 19,
        8, 19, 8, 8, 12, 14, 19, 13, 7, 10, 10, 8, 12, 8, 5, 9, 7, 11, 11, 8, 6, 8, 10, 13, 8, 8, 9, 6, 19, 11, 8, 14,
        7, 13, 6, 3, 10, 12, 9, 12, 19, 10, 10, 13, 12, 19, 19, 19, 8, 8, 8, 6, 10, 8, 16, 7, 16, 9, 12, 6, 16, 11, 13,
        8, 12, 19, 9, 14, 12, 8, 6, 8, 10, 19, 10, 8, 3, 8, 10, 12, 8, 10, 7, 8, 8, 13, 16, 7, 19, 11, 11, 13, 11, 10,
        8, 8, 12, 8, 16, 8, 12, 8, 16, 12, 9, 10, 9, 12, 16, 16, 6, 10, 10, 8, 9, 11, 16, 19, 8, 10, 10, 9, 7, 6, 14,
        12, 19, 11, 16, 8, 8, 5, 16, 8, 12, 19, 7, 9, 8, 10, 8, 7, 10, 12, 16, 8, 10, 9, 6, 6, 16, 16, 8, 12, 7, 8, 8,
        7, 8, 10, 14, 6, 6, 10, 11, 8, 12, 12, 7, 10, 9, 13, 12, 14, 8, 9, 13, 7, 11, 12, 13, 7, 7, 9, 8, 6, 10, 10, 10,
        3, 12, 9, 7, 10, 11, 5, 10, 7, 7, 7, 11, 13, 16, 16, 10, 8, 3, 12, 14, 13, 11, 16, 12, 8, 14, 11, 13, 8, 8, 11,
        8, 12, 16, 10, 8, 7, 12, 8, 11, 8, 9, 10, 7, 16, 5, 8, 13, 8, 8, 19, 12, 10, 19, 7, 12, 6, 13, 7, 5, 6, 8, 5,
        16, 5, 8, 10, 13, 8, 12, 8, 8, 12, 12, 6, 14, 12, 10, 6, 12, 8, 8, 19, 8, 11, 11, 6, 8, 10, 3, 13, 13, 13, 12,
        8, 12, 12, 12, 8, 13, 9, 13, 19, 13, 6, 10, 14, 12, 10, 14, 16, 12, 14, 8, 6, 13, 19, 10, 12, 13, 19, 8, 14, 8,
        7, 16, 14, 8, 12, 13, 6, 10, 12, 3, 8, 12, 13, 11, 8, 11, 7, 13, 7, 8, 8, 13, 6, 7, 11, 12, 9, 8, 8, 6, 19, 11,
        14, 10, 10, 12, 5, 11, 10, 12, 8, 9, 12, 19, 10, 13, 8, 7, 3, 8, 13, 8, 6, 12, 6, 11, 19, 12, 8, 9, 8, 10, 11,
        6, 6, 8, 16, 8, 7, 8, 11, 11, 6, 19, 8, 8, 8, 10, 10, 8, 19, 10, 8, 6, 3, 7, 8, 8, 11, 8, 5, 14, 13, 8, 5, 12,
        8, 7, 19, 10, 3, 8, 8, 19, 10, 13, 16, 11, 13, 10, 10, 10, 6, 10, 16, 13, 8, 10, 11, 10, 12, 12, 8, 8, 11, 12,
        8, 10, 11, 11, 10, 10, 8, 16, 7, 8, 9, 6, 13, 8, 12, 13, 11, 12, 8, 10, 12, 11, 8, 6, 11, 6, 10, 10, 8, 13, 6,
        3, 13, 6, 12, 13, 10, 13, 8, 16, 3, 9, 8, 8, 9, 11, 6, 8, 7, 13, 13, 12, 12, 3, 11, 12, 6, 11, 8, 11, 11, 8, 8,
        16, 19, 11, 8, 13, 12, 12, 6, 12, 12, 10, 10, 8, 19, 6, 8, 8, 10, 7, 8);

    for (int i = 0; i < result.size(); i++) {
      if (result.get(i) != result2.get(i))
        System.out.println(i + " " + result.get(i) + " : " + result2.get(i));
    }

    // System.out.println(result +" " +result2);

    // System.out.println(strings);
    // for (String string : strings) {
    // System.out.println(queries.contains(string));
    // }
  }
}

class SparseArraysResult {

  public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // List<Integer> result = new ArrayList<>();
    // for (String str : queries) {
    // result.add(count(str, strings));
    // }
    // return result;
    // }

    // public static int count(String str, List<String> list) {
    // int count = 0;
    // for (String s : list) {
    // if (s.equals(str)) {
    // count++;
    // }
    // }
    // return count;
    // }

    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    for (String querie : queries)
      map.put(querie, 0);

    for (String string : strings) {
      if (queries.contains(string)) {
        // int count = map.get(string) == null ? 0 : map.get(string);
        int count = map.get(string);
        map.put(string, count + 1);
      }
    }

    List<Integer> result = new ArrayList<>(map.values());
    return result;
  }
}
