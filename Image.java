package com.cow;




public class Image {

	
	StringBuffer sb;
	
	
	
	String[] menuPan={

		"\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
		"\n■■■        ■■■  ■  ■■■  ■■■■■■■■          ■  ■■■",
		"\n■■■  ■■  ■■■  ■  ■■■  ■■■■■■■■■  ■  ■■  ■■■",
		"\n■■■  ■■  ■■■  ■  ■■■            ■■■■  ■  ■■    ■■",
		"\n■■■  ■■  ■      ■  ■■■■■■■■■■■■■  ■  ■■  ■■■",
		"\n■■■  ■■  ■■■  ■  ■■                ■■          ■  ■■■",
		"\n■■■  ■■  ■■■  ■  ■■■■  ■■  ■■■■■■■■■■■■■■",
		"\n■■■  ■■  ■■■  ■  ■■■■  ■■  ■■■■■  ■■■■■■■■",
		"\n■■■        ■■■  ■  ■■■■  ■■  ■■■■■              ■■",
		"\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
		"\n                                                          ___",
		"\n                                                          [__]",
		"\n                                                          |  |",
		"\n                                                          |  |"	,		
		"\n         /)  (＼                                          |  |",
		"\n    .-._((,~~.))_.-,                                     /`-. \\",
		"\n     `-.   @@   ,-'              _.._..,_,_             /-._|  \\ ",
		"\n       / ,o--o. ＼              (          )     -'''-  |      |"  ,  
		"\n      ( ( .__. )  )              ]~, -.-~~[     |`-.-'| |`-... |",
		"\n       ) `----'  (             .=])' (;  ([     |     | |'` . ||",
		"\n      /          ＼            | ]:: '    [     |     | |`,'- ||",
		"\n     /             ＼          '=]): .)  ([     |     | |`-...||",
		"\n    /                ＼          |:: '    |     |     | |      | ",
		"\n                                  ~~----~~      `-...-'  `-..-'",
		"\n   한우          65,000원                 맥주 4,000원"  ,
		"\n   블랙앵거스    40,000원                 소주 4,000원",
		"\n                                        사이다 2,000원",
		"\n"	,
		"\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
		"\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
		       

	};
	
	
	String[] first={
	
    "\n     ,                ," ,
    "\n     |＼             /|",
    "\n     ＼  ＼/ ＼/＼.-' /",
    "\n      ＼_ /       ＼ _/",
    "\n   __.--/ __  __    ＼--.__",                           
    "\n  `＼__.| (.    .)   |.__/`                             *",
    "\n       |    /＼      |                        ___       ) *",
    "\n       ＼   | |      /              ___      /,--.＼    ( )",
    "\n        |__/   ＼_    |.......---''``   ``-./ |   \\____//",
    "\n       /          ＼                        ` |    '-----'",
    "\n       ＼  ^    ^   /                         ＼",
    "\n         ＼ .-''-._/  ,                        |",
    "\n        -.-'``''`` `'<_.-.           /         |",
    "\n        |                            |         ＼ ",
    "\n        |                ＼          |           |",
    "\n        ＼ ＼              ＼        ＼          |",
    "\n         `._ ＼             /         _＼        /",
    "\n           ＼  ＼           /'''---/````  '-.    ＼ ",
    "\n             ＼  ＼    ____/      ＼      /  ＼    |",
    "\n              (   (   |             ------     |   |",
    "\n               |   |  |               /  /     |   |",
    "\n               |   |  |             _/ .`      /   /",
    "\n              _|  _|  |            /   (     _/   /",
    "\n             /   /    (            ----`     /    (",
    "\n             ----|____(                      |____( ",
    "\n",
    "\n▣▣▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▣▣ ",
    "\n▣                                                        ▣ " ,                       	
    "\n▦          __     __                                     ▦ "  ,                
    "\n▦        .'  `...'  `.                                   ▦ "   ,   
    "\n▦      __|     |     |_                                  ▦ " , 
    "\n▦    .'   ＼   .   /    `.                               ▦ " ,  
    "\n▦    |      ./###＼.      |                              ▦ ",						
    "\n▦     >---- |######| ----<                               ▦ ",  
    "\n▦     >---- |######| ----<                               ▦ ",               	
    "\n▦    `.__ /     .    ＼__.'                              ▦ ",                         
    "\n▦         |     |     |                                  ▦ ",    
    "\n▦         `.___.^.___.'                                  ▦ " , 
    "\n▦                                                        ▦ ",
    "\n▦                                                        ▦ ",  
    "\n▦                     ■■■■                           ▦ ", 
    "\n▦                     ■                                 ▦ ", 
    "\n▦                     ■■■■                           ▦ " ,
    "\n▦                                                        ▦ " ,
    "\n▦                  ■■■■■■■                        ▦ " ,
    "\n▦                                                        ▦ " ,
    "\n▦                        ■■              ■      ■    ▦ " ,
    "\n▦                      ■    ■          ■  ■    ■    ▦ " ,
    "\n▦                        ■■          ■      ■  ■    ▦ " ,
    "\n▦                                                  ■    ▦ " ,
    "\n▦                                                        ▦ " ,
    "\n▦                                         ■■■■■     ▦ " ,
    "\n▦                                         ■      ■     ▦ " ,
    "\n▦                                         ■■■■■     ▦ " ,
    "\n▦                                                        ▦ " ,
    "\n▣                                                        ▣ "  ,   
    "\n▣▣▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▣▣ "  	

    		
	};
	
	
	String[] menuCow1={
			
			
			
			
        "\n     ■■■■■■■■■■■■■■■■■■■■■",
		"\n     ■■          ■■■        ■  ■■  ■■",
		"\n     ■■■■■■  ■■■■■■  ■  ■■  ■■",
		"\n     ■■■■■■  ■■■■■■  ■  ■■  ■■",
		"\n     ■■■■  ■■■■■■■■  ■  ■■  ■■",
		"\n     ■■■■  ■■■■■■■■■■  ■■■■■",
		"\n     ■■          ■■■■■■■■  ■■  ■■",
		"\n     ■■■■■■■■■■■■■■■■■■■■■",
		"\n     ■■■■■■■■■■■■■■■■■■■■■",
		"\n",
		"\n                       /)  (\\" ,
		"\n                  .-._((,~~.))_.-,  ", 
		"\n                   `-.   @@   ,-'   " ,
		"\n                     / ,o--o. \\    "  , 
		"\n                    ( ( .__. ) )    " ,
		"\n                     ) `----' (     " ,
		"\n                    /          \\   " ,
		"\n                   /            \\  " ,
		"\n                  /              \\ ", 
		"\n",
		"\n"
	};
	
	
	String[] menuCow2={
			"\n     ■■■■■■■■■■■■■■■■■■■■■",
			"\n     ■■■■■■■■■■■■■■■■■■■■■",
			"\n     ■  ■■■■    ■■  ■■■  ■        ■",
			"\n     ■  ■■■  ■■  ■  ■■■  ■  ■■■■",
			"\n     ■  ■■■  ■■  ■■  ■  ■■      ■■",
			"\n     ■  ■■■  ■■  ■■  ■  ■■  ■■■■",
			"\n     ■      ■■    ■■■■  ■■■        ■",
			"\n     ■■■■■■■■■■■■■■■■■■■■■",
			"\n     ■■■■■■■■■■■■■■■■■■■■■",
			"\n",
		    "\n                       /)  (\\",
		    "\n                   -._((,~~.))_.-,",
		    "\n                   `-.   @@   ,-' ",
		    "\n                     / ,n--n. \\         ",
		    "\n             (`'\\   ( ( .__. ) )  /`')   ",
		    "\n              `.''._ ) `----' (_,'`.'    ",
		    "\n                '._             _,'      ",
		    "\n                   /            \\        ",
		    "\n                  /              \\     ",
		    "\n",
		    "\n"
		
	};
	
	String[] service={
	        ".===================================================================.",
	        "||                                                                 ||",
	        "||                \\                                                ||",
			"||                 \\                                               ||",
			"||                  \\        ___                                  ||",
			"||         오예!!!!  \\     .'   '.                                ||",
			"||                         /       \\            oOoOo               ||",
			"||                        |  ^   ^  |       ,==|||||               ||",
			"||      ￣￣￣￣￣￣       \\   v  /       _|| |||||               ||",
			"||                          '.___.'    _.-'^|| |||||               ||",
			"||                        __/_______.-'     '==HHHHH               ||",
			"||                   _.-'` /                   '''''               ||",
			"||                .-'     /   oOoOo                                ||",
			"||                `-._   / ,==|||||                                ||",
			"||                    '-/._|| |||||          ===============       ||",
			"||                     /  ^|| |||||         ||  맥주 1병   ||      ||",
			"||                    /    '==HHHHH         ||             ||      ||",
			"||                   /________'''''         ||  서비스     ||      ||",
			"||                   \\        \\             ||             ||      ||",
			"||                    \\        \\   /         ===============       ||",
			"||                     \\        \\ /                                ||",
			"||                      /                                          ||",
			"||                     /                                           ||",
			"||                    /_____                                       ||",
			"||                                                                 ||",
			"'==================================================================='"
};
	
	String table [] = {
			
			"                                                    ",
			"       ,%;,               ,%;,                 ,%;,",
            " [1번] ,%%,         [2번] ,%%,           [3번] ,%%,",
            "  ______)(______     ______)(______       ______)(______",
            " /     (__)     \\   /     (__)     \\     /     (__)     \\",
            "[_______________]   [_______________]    [_______________]",
            "/_______________\\   /_______________\\    /_______________\\",
            "  \\\\   // \\   //      \\\\   // \\   //       \\\\   // \\   //",
            "   \\\\_//___\\ //        \\\\_//___\\ //         \\\\_//___\\ //",
            "  [/o//_____//o]      [/o//_____//o]       [/o//_____//o]",
            "    //\\    //\\_\\       //\\     //\\_\\         //\\    //\\_\\",
            "                                                                  ",
            "                                                                  ",
			"       ,%;,               ,%;,                 ,%;,",
            " [4번] ,%%,         [5번] ,%%,           [6번] ,%%,",
            "  ______)(______     ______)(______       ______)(______",
            " /     (__)     \\   /     (__)     \\     /     (__)     \\",
            "[_______________]   [_______________]    [_______________]",
            "/_______________\\   /_______________\\    /_______________\\",
            "  \\\\   // \\   //      \\\\   // \\   //       \\\\   // \\   //",
            "   \\\\_//___\\ //        \\\\_//___\\ //         \\\\_//___\\ //",
            "  [/o//_____//o]      [/o//_____//o]       [/o//_____//o]",
            "    //\\    //\\_\\       //\\     //\\_\\         //\\    //\\_\\",
            "                                                                  ",
            "                                                                  "
             };
	
	String[] ending = {
		
"\n",
"\n",
"\n",
"\n",
"\n",
"\n",
"            (.,------...__         ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
"         _.''             `.        ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
"      . .'   .'/''--...__`.  \\     ■■■■      ■  ■■  ■■  ■■  ■■■  ■  ■  ■■■■",
"     . .--.`.  ' '-.     '.  |      ■■■■■  ■■  ■■  ■  ■  ■    ■■  ■    ■■■■■",
"     ''  .'  _.' .())  .--':/       ■■■■■  ■■        ■      ■  ■  ■  ■  ■■■■■■",
"     ''(  \\_\\      '   (()(       ■■■■■■  ■■  ■■  ■  ■  ■  ■■    ■    ■■■■■■",
"     ''._'          (   \\ '      ■■■■■■  ■■  ■■  ■  ■  ■  ■■■  ■  ■  ■■■■■",
"     ' `.            `--'  '           ■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
"      `.:    .   `-.___.'  '       ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
"       `.     .    _  _  .'          ■■■■■■  ■  ■■■  ■■  ■■  ■■  ■■■■■■■",
"         )       .____.-'        ■■■■■■■■  ■  ■■  ■  ■  ■■  ■■  ■■■■■■■",
"       .'`.        (--..             ■■■■■■■  ■■■  ■  ■  ■■  ■■  ■■■■■■■■",
"     .' \\  /\\      / /  `.         ■■■■■■■■  ■■■  ■  ■  ■■  ■■■■■■■■■",
"   .'   \\(  \\    /|/     `.          ■■■■■■■  ■■■■  ■■■    ■■■  ■■■■■■■■■",
" .'          \\__/          `.      ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
"/      |        o      |      \\      ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
"       |               |      |    ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",
"                                                                                                 ",
"          ★$박창진$★                              "
		
	};
	
	
	
	String[] bye ={
			
			"	.-. .-')                 ('-.        .-. .-')                 ('-.",   
			"	\\  ( OO )              _(  OO)      \\   ( OO )              _(  OO)",  
			"	 ;-----.\\   ,--.   ,--.(,------.       ;-----.\\   ,--.   ,--.(,------.", 
			"	 | .-.  |   \\   `.'  /  |  .---'       | .-.  |   \\   `.'  /  |  .---'", 
			"	 | '-' /_).-')      /   |  |           | '-' /_).-')      /   |  |",     
			"	 | .-. `.(OO  \\    /   (|  '--.        | .-. `.(OO  \\    /   (|  '--.",  
			"	 | |  \\   ||   /  /\\ _  |  .--'        | |  \\   ||   /  /\\_   |  .--'", 
			"	 | '--'  / `-./  /.__)  |  `---.       | '--'  / `-./  /.__)   |  `---.", 
			"	 `------'    `--'       `------'       `------'    `--'        `------'"
				};

	String by [] = 
		{
			
	   "\n___     _  _                     ___     _  _",        
	   "\n| _ )   | || |   ___      o O O  | _ )   | || |,   ___",
	   "\n| _ \\    \\_, |  / -_)    o       | _ \\    \\_, |  / -_)",  
	   "\n|___/   _|__/   \\___|   TS__[O]  |___/   _|__/   \\___|",  
	 "\n_|'''''|_| ''''|_|'''''| {======|_|'''''|_| ''''|_|'''''|", 
	 "\n'`-0-0-''`-0-0-''`-0-0-'./o--000''`-0-0-''`-0-0-''`-0-0-'"
	};

	String by2 [] =
		{
	   "\n___     _  _                     ___     _  _",        
	   "\n| _ )   | || |   ___      o O O  | _ )   | || |,   ___",
	   "\n| _ \\    \\_, |  / -_)    o       | _ \\    \\_, |  / -_)",  
	   "\n|___/   _|__/   \\___|   TS__[O]  |___/   _|__/   \\___|",  
	   "\n                                                        ",
	   "\n                                                        ",
	   "\n                                                        ",
	   "\n                                                        ",		   
	  "\n_|'''''|_| ''''|_|'''''| {======|_|'''''|_| ''''|_|'''''|", 
	  "\n'`-0-0-''`-0-0-''`-0-0-'./o--000''`-0-0-''`-0-0-''`-0-0-'"
			
			
			
		};
	
	

}
