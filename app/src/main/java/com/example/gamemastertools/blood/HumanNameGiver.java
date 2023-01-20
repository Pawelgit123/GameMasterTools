package com.example.gamemastertools.blood;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanNameGiver {

    private final List<String> listOfNames = List.of("Abe","Akagawa","Akimasa","Akira","Amako","Amano","Anegakoji","Aoyama","Asai","Asano","Asayama","Ashikaga","Ashina",
            "Bessho","Chiba","Chikamune","Date","Dewa","Doi","Endo","Fujita","Godai","Goto","Hachisuka","Hajikano","Hara","Harada",
            "Haruhiro","Harumasa","Harunori","Harushige","Harutoshi","Hasekura","Hatakeyama","Hatano","Hatsuko","Hayashi","Hiraga","Hiroshi","Hisamatsu","Hisamitsu","Hisatake","Hisijima","Hojo","Honda","Honjo","Honma","Hosokawa","Ichijo","Ichikawa","Ii","Ijuin","Ikeda","Imagawa","Inaba","Inada","Inomata","Inoue","Ishin","Itakura","Ito","Jinbo","Kagekatsu","Kaisen","Kajiwara","Kamei","Kanamori","Kataharu","Katahiro","Katakura","Katamori","Katanobu","Kataoki","Katasada","Katataka","Kato","Kawai","Kennyo","Kikkawa","Kikuchi","Kimotsuki","Kishu","Kiso","Kitabatake","Kitajo","Kodama","Kojima","Kokushi","Komai","Kono","Korechika","Korekata","Koremasa","Koremi","Koremitsu","Korenao","Korenobu","Koretane","Koshiro","Kosokabe","Kuki","Kumagai","Kumu","Kuroda","Kyogoku","Maeda","Makino","Masakata","Masakuni","Masamune","Masanori","Masatake","Masatsune","Masayuki","Matsuda","Matsudaira","Matsui","Matsumae","Matsunaga","Matsuoka","Matsuura","Michihiro","Mitsuchika","Mitsuhisa","Mitsumasa","Mitsunao","Mitsuo","Mitsushige","Mitsutsune","Mitsutsura","Mitsuyasu","Mitsuyoshi","Mitsuyuki","Miura","Miyoshi","Mochiaki","Mochimasa","Mochinaga","Mochinori","Mochitsugu","Mochizuru","Mogami","Mori","Morihisa","Morinori","Motonori","Motoyama","Muneakira","Munefusa","Munehide","Munemasa","Munemura","Munenori","Muneshige","Munetada","Munetaka","Munetake","Murakami","Nabeshima","Nagahiro","Nagai","Nagamichi","Nagano","Nagatoko","Nagatomo","Naito","Nakagawa","Nanbu","Naoe","Naoko","Naonori","Naotaka","Narayama","Narihiro","Narikuni","Narimasa","Narimori","Narimune","Narinao","Narinori","Narisada","Narishige","Naritatsu","Naritoshi","Nariyasu","Nariyoshi","Niiro","Nitta","Nobuaki","Nobuakira","Nobuharu","Nobuhira","Nobuhiro","Nobuhisa","Nobumasa","Nobunori","Nobuoki","Nobuyasu","Nobuyasy","Nobuyoshi","Nobuyuki","Noda","Norihiro","Norikata","Norisada","Nraimura","Obata","Ogasawara","Ogata","Ogigayatsu","Oki","Okubo","Okunomiya","Oninawa","Ota","Otomo","Ouchi","Owari","Rusu","Ryoma","Ryuzoji","Sadaaki","Sadakatsu","Sadayasu","Sado","Sagara","Saigo","Saito","Sakai","Sakakibara","Sakamoto","Saku","Sanada","Sannomiya","Sano","Sasaki","Satake","Satomi","Satomura","Senoue","Shibata","Shigekata","Shigemochi","Shigemura","Shigenao","Shigenobu","Shigesada","Shigeto","Shiji","Shimazu","Shimizu","Shinsaku","Shoni","Shonyo","So","Sogo","Soma","Suda","Sukemasa","Sukemoto","Suketada","Suketsugu","Sukeyoshi","Tadaaki","Tadaakira","Tadafusa","Tadakata","Tadakatsu","Tadakuni","Tadamochi","Tadamoto","Tadamune","Tadanaga","Tadanao","Tadanobu","Tadanori","Tadashige","Tadasono","Tadataka","Tadatomo","Tadatoshi","Tadatsune","Tadatsura","Tadauji","Tadayori","Tadayoshi","Tadayuki","Taigen","Takaaki","Takaatsu","Takachika","Takaharu","Takahiro","Takahisa","Takakiyo","Takako","Takamori","Takanaga","Takanashi","Takaoka","Takasato","Takasawa","Takasugi","Takato","Takatora","Takatoshi","Takatsugu","Takayuki","Takeda","Tamenobu","Tanegashima","Tani","Toda","Todo","Toki","Tokugawa","Torii","Toshiakira","Toshiatsu","Toshihisa","Toshikatsu","Toshimasa","Toshimi","Toshimichi","Toshinao","Toshinori","Toshisato","Toshitada","Toshitomo","Toshitsura","Toshiyuki","Toyonori","Toyoshige","Tsuchiya","Tsugaru","Tsuginosuke","Tsuguakira","Tsugumasa","Tsunakatsu","Tsunamasa","Tsunamune","Tsunamura","Tsunanori","Tsunashige","Tsunatoshi","Tsuneko","Tsunemoto","Tsunetaka","Tsunetami","Tsutsui","Uemura","Uesugi","Ujiakira","Ujiharu","Ujihiko","Ujihisa","Ujimori","Ujimune","Ujinobu","Ujisada","Ujitaka","Ujitomo","Ujiyoshi","Ujiyuki","Urakami","Utsunomiya","Wakisaka","Yamakawa","Yamana","Yamaoka","Yamauchi","Yanagisawa","Yasawa","Yashiro","Yasuaki","Yasuatsu","Yasuaya","Yasuchika","Yasuda","Yasuhide","Yasumichi","Yasumoto","Yasumune","Yasuoki","Yasutake","Yasutoki","Yasutomi","Yasutoshi","Yasutsune","Yasuyuki","Yasuzumi","Yo","Yoshiakira","Yoshiatsu","Yoshichika","Yoshiharu","Yoshihiro","Yoshikatsu","Yoshikuni","Yoshimasa","Yoshimichi","Yoshimine","Yoshimura","Yoshinari","Yoshinobu","Yoshinori","Yoshishige","Yoshitada","Yoshitaka","Yoshitomo","Yoshitoshi","Yoshitsugu","Yoshiyasu","Yoshizane","Yoshizumi","Yuki","Yukihiro","Yukiko","Yukimichi","Yukinobu","Yukinori","Yukitaka","Yukitami","Yukitsugu","Yukitsura","Chikakazu","Chikamasu","Chikasada","Chikatada","Chikatake","Chikayasu","Chosokabe","Emura","Kanetsugu","Kira","Kunichika","Kuniyasu","Kuwana","Morichika","Morinobu","Moritaka","Moriyasu","Motochika","Nana","Naomi","Nobuchika","Okabayashi","Date","Goto","Harumune","Hidemune","Karu","Masamune","Munekatsu","Munekiyo","Munetaka","Munetsuna","Nakajima","Sanemoto","Shigezane","Shiroishi","Tadamune","Terumune","Watari","Yoshinori","Adachi","Daikakuji","Dewa","Fujiwara","Hidehira","Hoshi","Ichijo","Iefusa","Iwaki","Kagemori","Kiyohara","Konoe","Kujo","Kunihira","Masamitsu","Miken","Morifusa","Morinaga","Moroie","Motofusa","Motomichi","Munemasa","Nijo","Ouchi","Shoni","Tachibana","Tadahira","Tadataka","Takatsukasa","Tomomasa","Tomomistu","Watanabe","Yasuhira","Yorinari","Yoshinao","Yuki","Daidoji","Fujita","Hayashizaki","Hojo","Kasahara","Nagatoshi","Nagatsuna","Naoshige","Shigenobu","Totome","Tsunahige","Ujifusa","Ujihide","Ujikuni","Ujimasa","Ujimori","Ujinao","Ujinori","Ujisada","Ujiteru","Ujitsugu","Ujitsuna","Ujiyasu","Yuki","Abe","Arima","Fujiwara","Hanbe","Hanzo","Hata","Hattori","Ibuki","Iida","Ise","Ishitani","Izumo","Kanbe","Kaneko","Kanera","Kataoka","Kiku","Kimata","Kotani","Masanari","Minamoto","Mizuhari","Momochi","Narita","Ohkuni","Ooyama","Otsuka","Sakgami","Sawada","Shima","Shindo","Sue","Taira","Toda","Togakure","Toyata","Tozawa","Tsutsumi","Ueno","Watanabe","Yasunaga","Akagawa","Chuko","Hajikano","Jutsurai","Kennyo","Matsunaga","Nakayuki","Nyoenni","Sadayu","Shigehide","Shigetomo","Shiji","Shimozuma","Shonyo","Suzuki","Yokota","Acha","Achacha","Adachi","Ai","Akagawa","Akamatsu","Akane","Akara","Akebono","Akeha","Akemi","Aki","Akie","Akifusa","Akihide","Akihira","Akihiro","Akihisa","Akiie","Akikane","Akikuni","Akimasa","Akimori","Akimoto","Akimune","Akinaga","Akinao","Akinobu","Akinori","Akioki","Akisuke","Akitada","Akitane","Akitoki","Akitomo","Akitoshi","Akitsuna","Akiuji","Akiyasu","Akiyo","Akiyori","Akiyoshi","Akizuki","Akizumi","Ako","Amakasu","Amako","Amano","Ane","Anegakoji","Aoi","Arakabi","Ari","Arichika","Arifusa","Arihiro","Ariie","Arimasa","Arimitsu","Arimori","Arinaga","Arinobu","Arinori","Arisada","Arishige","Aritoki","Ariwara","Ariyasu","Ariyoshi","Asa","Asahi","Asai","Asami","Asayama","Ashikaga","Ashina","Atsu","Atsuari","Atsumori","Atsutada","Atsutaka","Atsuyo","Atsuyori","Aya","Ayaka","Ayame","Ayune","Bessho","Chiba","Chikaaki","Chikafusa","Chikaharu","Chikahide","Chikahira","Chikahiro","Chikaie","Chikakage","Chikakatsu","Chikakiyo","Chikakuni","Chikamasa","Chikamitsu","Chikamori","Chikamoto","Chikamune","Chikanaga","Chikanari","Chikanobu","Chikanori","Chikasada","Chikasue","Chikasuke","Chikataka","Chikatane","Chikatomo","Chikatoshi","Chikatsugu","Chikatsune","Chikayoshi","Chikayuki","Chikazane","Chisato","Chiyo","Chokei","Daisuke","Doi","Dosan","Edako","Edo","Emiko","Endo","Fude","Fuji","Fujifusa","Fujihiro","Fujiyori","Fumi","Fumiko","Fumitoki","Fumiyo","Fusa","Fusaaki","Fusae","Fusahira","Fusakage","Fusako","Fusamasa","Fusamoto","Fusanari","Fusasaki","Fusashige","Fusatsugu","Fusazane","Fushiyo","Fuyufusa","Fuyuhira","Fuyuie","Fuyumichi","Fuyunori","Fuyusuke","Fuyutsugu","Fuyuyasu","Gen'i","Gin","Godai","Gozen","Hagi","Hajikano","Hamaji","Hamako","Hamanari","Hanae","Hanawa","Hara","Harada","Harako","Haru","Haruda","Harue","Harufusa","Haruhiro","Haruhisa","Harukage","Harukiri","Harumichi","Harumoto","Harunaga","Harunobu","Harusada","Harutada","Harutomo","Haruuji","Haruyuki","Hasebe","Hasekura","Hata","Hatakeyama","Hatano","Hayashi","Hide","Hideaki","Hideharu","Hidehira","Hideie","Hidekane","Hidekazu","Hidekiyo","Hidemasa","Hidemichi","Hidemochi","Hidenaga","Hidenari","Hidenobu","Hidesato","Hidetaka","Hidetane","Hidetoki","Hidetomo","Hidetsugu","Hidetsuna","Hideuji","Hideyasu","Hideyoshi","Hideyuki","Hifumi","Hikaru","Hikogoro","Hikoyoshi","Hinako","Hiraga","Hirako","Hiroaki","Hirochika","Hiroe","mHirofusa","Hiroie","Hirokado","Hiroko","Hirokoto","Hiromasa","Hiromoto","Hirosada","Hiroshige","Hirotoshi","Hirotsugu","Hirotsuna","Hirotsune","Hiroyo","Hiroyoshi","Hirozumi","Hisahide","Hisakane","Hisako","Hisakuni","Hisamasa","Hisanaga","Hisanobu","Hisanori","Hisatake","Hisatoki","Hisatoyo","Hisatsuna","Hisatsune","Hisauji","Hisayoshi","Hisayuki","Hisijima","Hitoshi","Honda","Honma","Ichijo","Ichikawa","Iechika","Iefusa","Iehide","Iehira","Iekage","Iekane","Iekata","Iemasa","Iemichi","Iemitsu","Iemoto","Ienaga","Ienari","Ienori","Iesada","Ietada","Ietaka","Ietoki","Ietoyo","Ietsugu","Ietsune","Ietsura","Ieuji","Ieyoshi","Ieyuki","Iezane","Iezumi","Iha","Ii","Ijuin","Ima","Imagawa","Inomata","Inori","Inoue","Inuwaka","Isachi","Ishi","Ishikawa","Ishin","Isonokami","Ito","Itoito","Itsui","Itsuitsu","Iwa","Iyo","Izue","Jinbo","Joha","Joki","Junkei","Junko","Junsho","Kadoko","Kaede","Kagawa","Kagechika","Kageharu","Kagehira","Kagehiro","Kagehisa","Kageie","Kagekado","Kagekazu","Kagekiyo","Kagemasa","Kagemasu","Kagemitsu","Kagemochi","Kagemori","Kagemune","Kagenaga","Kagenaka","Kageshige","Kagesue","Kagesuke","Kagetada","Kagetaka","Kagetoki","Kagetomo","Kagetsugu","Kagetsuna","Kagetsune","Kageyasu","Kageyori","Kageyoshi","Kaisen","Kajiwara","Kamatari","Kanako","Kaneaki","Kaneatsu","Kanechika","Kanefumi","Kanefusa","Kanehira","Kaneie","Kanekata","Kanekuni","Kanemasa","Kanematu","Kanemichi","Kanemitsu","Kanemori","Kanemoto","Kanemune","Kanenaga","Kanenaka","Kanenobu","Kanenori","Kanera","Kaneshige","Kanesue","Kanesuke","Kanetada","Kanetaka","Kanetane","Kanetoki","Kanetomo","Kanetsuna","Kanetsune","Kanetsura","Kaneuji","Kaneyasu","Kaneyo","Kaneyori","Kaneyoshi","Kanezane","Kao","Kaori","Karu","Kasumi","Kataie","Katakura","Katsuhisa","Katsuie","Katsumasa","Katsumitsu","Katsumoto","Katsura","Katsutoshi","Katsutoyo","Katsuyoshi","Kawahide","Kazue","Kazuko","Kazumasa","Kazunari","Kazushige","Kazutada","Kazutoyo","Kazuuji","Kazuyoshi","Keiko","Kennyo","Kesa","Kibi","Kikkawa","Kiku","Kikuchi","Kimi","Kimiko","Kimimichi","Kiminari","Kimitomo","Kimotsuki","Kinu","Kinue","Kiri","Kishiko","Kiso","Kitabatake","Kitajo","Kiyo","Kiyofusa","Kiyohara","Kiyohide","Kiyohira","Kiyokata","Kiyokuni","Kiyomasa","Kiyomitsu","Kiyomori","Kiyomune","Kiyonaga","Kiyonari","Kiyonori","Kiyosada","Kiyoshige","Kiyosuke","Kiyotada","Kiyotaka","Kiyotane","Kiyotoki","Kiyotomo","Kiyotsuna","Kiyotsune","Kiyouji","Kiyoyuki","Kobayakawa","Kodama","Koide","Kojima","Kokushi","Kokyo","Koma","Komai","Koneneme","Kono","Konomi","Korechika","Korefusa","Korehira","Korehisa","Korekata","Koremasa","Koremichi","Koremochi","Koremori","Koremura","Korenao","Korenobu","Korenori","Koresada","Koresato","Koreshige","Koretada","Koretaka","Koretake","Koretoki","Koretsugu","Koretsuna","Koreyoshi","Korezumi","Kosa","Kosokabe","Kosugi","Kotau","Koto","Kuki","Kumagai","Kumako","Kumu","Kunie","Kunihira","Kunihisa","Kunika","Kunikiyo","Kunimichi","Kunimitsu","Kunimoto","Kuninaga","Kuninari","Kuninobu","Kunishige","Kunitoki","Kunitsuna","Kure","Kuri","Kusunoki","Kyogoku","Kyoko","Kyuzo","Ma","Machiko","Maeda","Makiko","Makoto","Mama","Manpukumaru","Mari","Mariko","Maru","Maruko","Masaari","Masachika","Masae","Masafusa","Masahide","Masahira","Masahiro","Masahisa","Masaie","Masakado","Masakage","Masakata","Masakatsu","Masakiyo","Masako","Masakuni","Masamichi","Masamitsu","Masamori","Masamoto","Masamune","Masanaga","Masanobu","Masanori","Masasada","Masashige","Masasue","Masasuke","Masatada","Masataka","Masatake","Masatane","Masato","Masatoki","Masatomo","Masatora","Masatoyo","Masatsugu","Masatsuna","Masatsune","Masatsura","Masauji","Masayasu","Masayo","Masayori","Masayoshi","Masayuki","Masazane","Masuda","Masuyuki","Matsuda","Matsuhime","Matsunaga","Matsuoka","Matsuyo","Mayumi","Megohime","Meiko","Michiaki","Michiari","Michiatsu","Michichika","Michifuyu","Michigane","Michiharu","Michihide","Michihira","Michihiro","Michihisa","Michiie","Michikata","Michikiyo","Michimasa","Michimasu","Michimitsu","Michimori","Michinaga","Michinao","Michinari","Michinobu","Michinori","Michio","Michisada","Michishige","Michisuke","Michitada","Michitaka","Michitane","Michitoki","Michitomo","Michitoshi","Michitou","Michitsugu","Michitsuna","Michitsune","Michiuji","Michiyori","Michiyoshi","Michiyuki","Michizane","Miiko","Miki","Mikiko","Mimi","Minato","Misako","Mitsu","Mitsuaki","Mitsuchika","Mitsufuji","Mitsuhide","Mitsuhiko","Mitsuie","Mitsukane","Mitsukazu","Mitsukuni","Mitsumasa","Mitsumori","Mitsumoto","Mitsumune","Mitsumura","Mitsunaga","Mitsunaka","Mitsunao","Mitsunari","Mitsunobu","Mitsunori","Mitsusada","Mitsusato","Mitsushige","Mitsusue","Mitsusuke","Mitsutada","Mitsutaka","Mitsutane","Mitsutoki","Mitsutomo","Mitsutsugu","Mitsutsuna","Mitsutsune","Mitsuuji","Mitsuyasu","Mitsuyori","Mitsuyoshi","Mitsuyuki","Mitsuzumi","Miura","Miyako","Miyo","Miyoshi","Mochifusa","Mochiharu","Mochiie","Mochikata","Mochikiyo","Mochikuni","Mochimasa","Mochimasu","Mochimichi","Mochimitsu","Mochimori","Mochimoto","Mochimune","Mochinaga","Mochinaka","Mochinobu","Mochinori","Mochisada","Mochitame","Mochitomo","Mochitoyo","Mochiuji","Mochiyo","Mochiyori","Mochiyuki","Mochizane","Mogami","Momo","Momoe","Momokawa","Moriakira","Morigane","Morihide","Morihiro","Morihisa","Moriie","Morikage","Morikane","Morikazu","Morikiyo","Morikuni","Morimasa","Morimitsu","Morimori","Morinaga","Morinaka","Morinao","Morishige","Moritaka","Moritoki","Moritomo","Moritoshi","Moritsugu","Moritsuna","Moritsura","Moriuji","Moriyoshi","Moroaki","Moroakira","Morochika","Morofusa","Morofuyu","Morohide","Morohira","Morohisa","Moroie","Morokage","Morokane","Morokata","Morokawa","Morokazu","Moromitsu","Moromochi","Moromori","Moromoto","Moronaga","Moronaka","Moronao","Moronatsu","Moronobu","Moronori","Moroshige","Morosuke","Morotada","Morotoki","Morotsugu","Morotsuna","Morotsune","Morotsura","Morouji","Moroyasu","Moroyori","Moroyoshi","Moroyuki","Morozane","Moto","Motofusa","Motoharu","Motohide","Motohira","Motohisa","Motoie","Motokane","Motokuni","Motomichi","Motomitsu","Motomori","Motomune","Motonaga","Motonobu","Motonori","Motoshige","Motosuke","Mototada","Mototaka","Mototane","Mototoki","Mototomo","Mototsugu","Mototsuna","Mototsune","Mototsura","Motouji","Motoyama","Motoyasu","Motoyori","Motoyoshi","Motoyuki","Motozane","Motsuzane","Mugiko","Muneaki","Muneatsu","Munechika","Munefuji","Munehide","Munehira","Munehiro","Munehisa","Muneie","Munekage","Munekata","Munemasa","Munemitsu","Munemori","Munemoto","Munenaga","Munenari","Munenobu","Munenori","Muneshige","Munesuke","Muneta","Munetada","Munetane","Munetoki","Munetsune","Munetô","Muneuji","Muneyasu","Muneyori","Muneyoshi","Muneyuki","Munezane","Mura","Murakami","Murasaki","Murashige","Muremune","Musu","Mutsu","Nabe","Nagachika","Nagafuji","Nagafusa","Nagaharu","Nagahide","Nagahira","Nagahiro","Nagahisa","Nagakane","Nagakata","Nagakatsu","Nagakiyo","Nagamasa","Nagamichi","Nagamitsu","Nagamochi","Nagamori","Nagamoto","Naganari","Nagano","Nagaoki","Nagasada","Nagashige","Nagasue","Nagataka","Nagatatsu","Nagateru","Nagatoki","Nagauji","Nagayasu","Nagayo","Nagayori","Nagayoshi","Nagayuki","Nagetane","Nahozane","Naito","Naiyori","Nakaaki","Nakabumi","Nakachika","Nakafusa","Nakahira","Nakaie","Nakajiro","Nakaki","Nakakuni","Nakamaro","Nakamitsu","Nakamoto","Nakamune","Nakanari","Nakasada","Nakatoki","Nakatsuna","Nakayori","Namie","Nana","Nanae","Nao","Naoaki","Naoe","Naoie","Naoko","Naomi","Naomitsu","Naomochi","Naonobu","Naosada","Naotane","Naotoki","Naotomo","Naotsune","Naouji","Naoyori","Naozane","Naozumi","Narichika","Narifusa","Nariharu","Nariie","Narikane","Narimasa","Narime","Narimori","Narinori","Narisada","Narishige","Narisue","Narisuke","Naritada","Naritane","Naritoki","Naritsuna","Naritsune","Naritsura","Nariuji","Nariyoshi","Narumi","Natsu","Nei","Nene","Neneme","Nichijo","Niiro","Nishikintoki","Nishikinyasu","Nishisanetaka","Nitta","Nobuaki","Nobuari","Nobuchika","Nobuhiro","Nobuhisa","Nobukata","Nobukimi","Nobumasa","Nobunori","Nobusada","Nobusaka","Nobusato","Nobusuke","Nobutake","Nobutane","Nobutatsu","Nobuto","Nobutoki","Nobutoshi","Nobutsugi","Nobutsugu","Nobutsuna","Nobutsura","Nobuyori","Nobuyoshi","Nobuyuki","Noda","Nohime","Noirkatsu","Noriaki","Norie","Norifuji","Norifuyu","Noriharu","Norihide","Norihiro","Noriie","Norikage","Norikane","Norikata","Norikatsu","Norikiyo","Noriko","Norikuni","Norimasa","Norimichi","Norimitsu","Norimori","Norimoto","Norimune","Norimura","Norinaga","Norinao","Norioki","Norisada","Norisaka","Norishige","Norisue","Norisuke","Noritada","Noritaka","Noritane","Noritoki","Noritomo","Noritoyo","Noritsugu","Noritsune","Noriuji","Noriyasu","Noriyori","Noriyoshi","Noriyuki","Norizane","Noyuri","Obata","Ochi","Ogasawara","Ogata","Ogigayatsu","Okihisa","Okikaze","Okitane","Okitsune","Okunomiya","Okura","Oninawa","Otomo","Otomuro","Ouchi","Raku","Rusu","Ryoko","Ryuzoji","Sachiko","Sadaaki","Sadachika","Sadafuji","Sadafusa","Sadagatsu","Sadahide","Sadahira","Sadahiro","Sadahisa","Sadaie","Sadakage","Sadakata","Sadakiyo","Sadakuni","Sadamasa","Sadamichi","Sadamitsu","Sadamori","Sadamu","Sadamune","Sadamura","Sadanaga","Sadanao","Sadanori","Sadashige","Sadasue","Sadasuke","Sadataka","Sadatane","Sadatoki","Sadatomo","Sadatoshi","Sadatsugu","Sadatsuna","Sadatsune","Sadatsura","Sadauji","Sadayasu","Sadayo","Sadayori","Sadayoshi","Sadayuki","Sadazane","Sae","Saeko","Sagara","Saito","Sakai","Sakakibara","Sakami","Sakie","Sakiyori","Sakuma","Sakura","Sanada","Saneatsu","Sanechika","Sanefusa","Sanefuyu","Sanehide","Sanehira","Sanehisa","Sanekane","Sanekatsu","Sanekazu","Sanekuni","Sanemasa","Sanemitsu","Sanemori","Sanemune","Sanenaga","Sanenaka","Sanenao","Sanenatsu","Sanenori","Sanesada","Saneshige","Sanetada","Sanetaka","Sanetoki","Sanetomo","Sanetoshi","Sanetsugu","Sanetsuna","Sanetsune","Saneuji","Saneyasu","Saneyori","Sannomiya","Saori","Sasaki","Satake","Satomi","Satomura","Sayo","Sen","Seno","Senoue","Sessai","Shiba","Shibata","Shigechika","Shigefusa","Shigeharu","Shigehira","Shigehiro","Shigehisa","Shigekatsu","Shigekiyo","Shigekuni","Shigemasa","Shigemitsu","Shigemochi","Shigemori","Shigemoto","Shigenaga","Shigenari","Shigenori","Shigesada","Shigetada","Shigetaka","Shigetake","Shigetane","Shigetoki","Shigetomo","Shigetsugu","Shigetsuna","Shigetsune","Shigeuji","Shigeyasu","Shigeyori","Shigeyoshi","Shigeyuki","Shigezumi","Shiji","Shimizu","Shinmen","Shioichimaru","Shiori","Shiro","Shitagau","Shizuka","Shoni","Shonyo","Soga","Sogo","Soma","Soren","Suda","Suden","Sugawara","Sukeak","Sukechika","Sukefuji","Sukefusa","Sukeharu","Sukehide","Sukehira","Sukehiro","Sukeie","Sukekage","Sukekata","Sukekazu","Sukekiyo","Sukekuni","Sukemasa","Sukemitsu","Sukemochi","Sukemori","Sukemoto","Sukemura","Sukena","Sukenaga","Sukenari","Sukenobu","Sukenori","Sukeomi","Sukesada","Sukeshige","Sukesue","Suketada","Suketaka","Suketane","Suketoki","Suketomo","Suketsuna","Suketsune","Sukeuji","Sukeyasu","Sukeyori","Sukeyoshi","Sukezane","Sumako","Sumi","Sumire","Sumitomo","Susumu","Suzu","Tadaaki","Tadafumi","Tadafusa","Tadafuyu","Tadahira","Tadahiro","Tadahisa","Tadaie","Tadakane","Tadakiyo","Tadakuni","Tadamasa","Tadamichi","Tadamitsu","Tadamori","Tadamoto","Tadanobu","Tadanori","Tadaoki","Tadasada","Tadashige","Tadasue","Tadato","Tadatoki","Tadatsugi","Tadatsugu","Tadatsuna","Tadauji","Tadayasu","Tadayori","Tadayoshi","Tadazane","Tadazumi","Tahe","Taigen","Takaaki","Takaatsu","Takachika","Takafusa","Takahashi","Takahide","Takahira","Takahiro","Takahisa","Takaie","Takakane","Takakazu","Takakiyo","Takakuni","Takamasa","Takami","Takamichi","Takamitsu","Takamochi","Takamori","Takamoto","Takamune","Takanaga","Takanaka","Takanao","Takanashi","Takanobu","Takanori","Takaoka","Takara","Takasada","Takashige","Takasue","Takasuke","Takatada","Takatoki","Takatomo","Takatora","Takatoshi","Takatsuna","Takatsune","Takatsura","Takauji","Takayoshi","Takeda","Takefusa","Takemasa","Takemitsu","Takeo","Takeshige","Taketoki","Taketomo","Taketoshi","Takeyoshi","Takezane","Takezo","Takezumi","Tameaki","Tamefuyu","Tamehide","Tamehiro","Tamehisa","Tameie","Tamekane","Tamekazu","Tamemitsu","Tamemori","Tamemoto","Tamenaga","Tamenobu","Tamenori","Tamesada","Tameshige","Tamesuke","Tametane","Tametoki","Tametomo","Tameuji","Tameyo","Tameyori","Tameyoshi","Tameyuki","Tamezane","Tamotsu","Tanefusa","Taneie","Tanemasa","Tanemichi","Tanemori","Tanemune","Tanemura","Tanenaga","Tanenao","Tanenobu","Taneshige","Tanesuke","Tanetomo","Tanetsugu","Tanetsuna","Taneyasu","Taneyori","Taneyoshi","Taneyuki","Tani","Tatara","Tatsuaki","Tatsuhisa","Tatsuko","Tei","Teishi","Terasu","Teruaki","Teruhiro","Terumi","Toji","Toki","Tokiaki","Tokiakira","Tokie","Tokifusa","Tokiharu","Tokihide","Tokihira","Tokihiro","Tokiie","Tokikane","Tokikiyo","Tokikuni","Tokimasa","Tokimasu","Tokimichi","Tokimochi","Tokimori","Tokimoto","Tokimune","Tokimura","Tokinaga","Tokinao","Tokinari","Tokinobu","Tokisada","Tokishige","Tokisuke","Tokitada","Tokitaka","Tokitsugu","Tokitsuna","Tokitsura","Tokiuji","Tokiyori","Tokiyoshi","Tokiyuki","Tokizane","Tokomatsu","Tomareyoshi","Tomie","Tomkio","Tomoe","Tomofuji","Tomofusa","Tomohiro","Tomohisa","Tomoie","Tomokage","Tomokata","Tomokatsu","Tomomasa","Tomomichi","Tomomitsu","Tomomori","Tomomune","Tomomura","Tomonaga","Tomonao","Tomonari","Tomonori","Tomooki","Tomosada","Tomoshige","Tomotada","Tomotoki","Tomotoshi","Tomotsuna","Tomotsune","Tomouji","Tomoyasu","Tomoyuki","Toramasa","Toramori","Toratane","Torayasu","Torii","Toru","Toshihide","Toshihira","Toshiie","Toshikage","Toshikane","Toshiki","Toshikiyo","Toshimasa","Toshimichi","Toshimitsu","Toshimoto","Toshinaga","Toshinari","Toshisuke","Toshitsuna","Toshitsune","Toshiyasu","Toshiyori","Toshiyuki","Toshizane","Toto","Totome","Toyofusa","Toyoharu","Toyohisa","Toyokuni","Toyomasa","Toyome","Toyomichi","Toyomitsu","Toyosada","Toyoyoshi","Tsuchiya","Tsugufusa","Tsugunobu","Tsugunori","Tsuma","Tsunamitsu","Tsuneaki","Tsunechika","Tsunefusa","Tsuneharu","Tsunehide","Tsunehira","Tsunehisa","Tsuneie","Tsunekage","Tsunekane","Tsunekuni","Tsunemasa","Tsunemi","Tsunemichi","Tsunemitsu","Tsunemori","Tsunemoto","Tsunemune","Tsunenaga","Tsunenaka","Tsunenari","Tsunenobu","Tsunenori","Tsuneshige","Tsunesue","Tsunesuke","Tsunetada","Tsunetaka","Tsunetane","Tsunetoki","Tsunetomo","Tsunetoshi","Tsunetsugu","Tsuneuji","Tsuneyasu","Tsuneyori","Tsuneyoshi","Tsunezumi","Tsurauji","Tsutsui","Uchitsune","Uchizane","Uemura","Ujiaki","Ujichika","Ujifuyu","Ujiharu","Ujihiro","Ujihisa","Ujiie","Ujikiyo","Ujimitsu","Ujimune","Ujinari","Ujinobu","Ujisato","Ujishige","Ujitane","Ujitoki","Ujitomo","Ujitoshi","Ujitoyo","Ujitsune","Ujitzugu","Ujiyori","Ujiyoshi","Ujiyuki","Ujizane","Ukon","Uma","Urakami","Uta","Utsunomiya","Watanabe","Yaekoa","Yamabukime","Yamana","Yamanouchi","Yamaoka","Yamauchi","Yaoko","Yasawa","Yashiro","Yashutoshi","Yasu","Yasuari","Yasuchika","Yasuda","Yasudasa","Yasuharu","Yasuhide","Yasuhira","Yasuie","Yasukatsu","Yasukiyo","Yasumasa","Yasumichi","Yasumochi","Yasumori","Yasumoto","Yasumune","Yasumura","Yasunaga","Yasunari","Yasunobu","Yasunori","Yasusada","Yasushige","Yasutaka","Yasutane","Yasutoki","Yasutomi","Yasutomo","Yasutoshi","Yasutsugi","Yasutsuna","Yasutsune","Yasutsura","Yasuuji","Yasuyori","Yasuyuki","Yaya","Yodo","Yokota","Yomogi","Yoriaki","Yoriari","Yorichika","Yorie","Yorifuji","Yorifusa","Yoriharu","Yorihide","Yorihira","Yorihisa","Yoriie","Yorikane","Yorikata","Yorikawa","Yorikazu","Yorikiyo","Yorimasa","Yorimasu","Yorimichi","Yorimitsu","Yorimori","Yorimoto","Yorimune","Yorinaga","Yorinao","Yorinari","Yorinobu","Yorisada","Yorishige","Yorisuke","Yoritada","Yoritaka","Yoritan","Yoritoki","Yoritomo","Yoritoshi","Yoritsugu","Yoritsuna","Yoritsune","Yoriuji","Yoriyasu","Yoriyoshi","Yoriyuki","Yorizane","Yoshiaki","Yoshiakira","Yoshiari","Yoshiatsu","Yoshichi","Yoshichika","Yoshida","Yoshifusa","Yoshifuyu","Yoshiharu","Yoshihide","Yoshihime","Yoshihira","Yoshihiro","Yoshihisa","Yoshihito","Yoshiie","Yoshikado","Yoshikage","Yoshikane","Yoshikata","Yoshikatsu","Yoshikazu","Yoshikiyo","Yoshikuni","Yoshimasa","Yoshimichi","Yoshimitsu","Yoshimochi","Yoshimori","Yoshimoto","Yoshimune","Yoshimura","Yoshinaga","Yoshinaka","Yoshinao","Yoshinari","Yoshinatsu","Yoshinobu","Yoshioki","Yoshisada","Yoshisato","YoshishigeYoshisue","Yoshisuke","Yoshitada","Yoshitaka","Yoshitake","Yoshitane","Yoshitatsu","Yoshiteru","Yoshitoki","Yoshitomo","Yoshitoshi","Yoshitoyo","Yoshitsugu","Yoshitsuke","Yoshitsuna","Yoshitsune","Yoshitsura","Yoshiuji","Yoshiyasu","Yoshiyori","Yoshiyuki","Yoshizane","Yoshizumi","Yuki","Yukiaki","Yukiari","Yukifuji","Yukifusa","YukihideYukihira","Yukihiro","Yukiie","Yukikata","Yukikiyo","Yukimasa","Yukimichi","Yukimitsu","Yukimori","Yukimune","Yukimura","Yukinaga","Yukinao","Yukinari","Yukio","Yukisada","Yukisuke","Yukitada","Yukitaka","Yukitoki","Yukitomo","Yukitsuna","Yukiuji","Yukiyasu","Yukiyori","Yukiyoshi","Yukizane","Yume","Yumi","Ashikaga","Chikatada","Hemi","Hideyoshi","Higuchi","Hiromoto","Hojo","Imai","Kagesue","Kagetoki","Kajiwara","Kanehira","Kanemitsu","Keriyoshi","Kikuchi","Kono","Masako","Minamoto","Mitsunobu","Miura","Nagakiyo","Nagamitsu","Nasu","Nenoi","Nitta","Nobumitsu","Nobuyoshi","Noriyori","Ogata","Ota","Saito","Sanetomo","Sasaki","Shuma","Tadanao","Takanao","Takanashi","Takatsuna","Takayoshi","Takeda","Takenouchi","Tate","Togakure","Toki","Tokifusa","Tokimasa","Tokugawa","Tomoe","Tomomasa","Wada","Yamamoto","Yasuda","Yoichi","Yoriie","Yoritomo","Yoshiaki","Yoshikane","Yoshimori","Yoshinaka","Yoshishige","Yoshitaka","Yoshitoki","Yoshitsune","Yoshizumi","Yukichika","Yukiie","Fukubara","Hidemoto","Hidenari","Kinu","Kobayakawa","Kuchiba","Masamura","Mori","Motoaki","Motoharu","Motokiyo","Motomasa","Motonari","Naritaka","Sayo","Shishido","Takakage","Takamoto","Terumoto","Akechi","Gozen","Hidenari","Hidetoshi","Hiroyoshi","Kanshichiro","Katsunaga","Kotoji","Magashuro","Nagamasu","Nobmoto","Nobufusa","Nobuharu","Nobuhide","Nobuhiro","Nobukane","Nobukiyo","Nobumasu","Nobumoto","Nobunaga","Nobunari","Nobuo","Nobuoki","Nobutada","Nobutaka","Nobuyuki","Nobuzumi","Oda","Tadamasa","Takayama","Takigawa","Toyotomi","Hisayasu","Hongo","Iehisa","Iriki-In","Katsuhisa","Kawamura","Noyuri","Sanehiro","Shimazu","Tadachika","Tadamasa","Tadatoshi","Tadatsune","Tadayuki","Takahisa","Tanegashima","Teruhisa","Toshihisa","Toyoharu","Tsunehisa","Yoshihiro","Yoshihisa","Yoshitora","Yukihisa","Atsumori","Chiba","Ema","Fuji","Haruda","Hatakeyama","Itai","Kaneyasu","Kikuchi","Kiyomori","Kumagae","Munemori","Oba","Sanemori","Satake","Seno","Shigehira","Shigetada","Taguchi","Taira","Takanao","Tanenao","Tokiko","Tomomori","Tsunemasa","Tsunemori","Tsunetoshi","Yamaga","Baba","Hiroko","Kanako","Katsura","Katsuyori","Kosaka","Munetomo","Nobuchika","Nobuhiro","Nobukado","Nobumitsu","Nobushige","Nobutomo","Nobutora","Nobutoyo","Nobutsuna","Nobuyuki","Nobuzane","Shingen","Suwa","Takeda","Yamadera","Yoshinobu","Hidetada","Hirotada","Honda","Ieyasu","Ii","Kanera","Matsudaira","Nobuyasu","Okubo","Tatsuko","Tokugawa","Akisada","Amakusa","Funayoshi","Kagekatsu","Kagenobu","Kagetora","Kenshin","Nagao","Norifusa","Norimasa","Sadakatsu","Uesugi","","Usami","Yasuda"
            );

    private final ArrayList<String> list = new ArrayList<>(listOfNames);

    public void giveMeName(Human human){

        List<String> stringList = list;
        Collections.shuffle(stringList);
        human.setName(stringList.get(0));

    }

    public void giveMeRankDescription(Human human){

        switch (human.getRank()){
            case 1: human.setName(human.getName() + " (Mob)");
            break;
            case 2: human.setName(human.getName() + " (Bandit)");
            break;
            case 3: human.setName(human.getName() + " (Ashigaru)");
            break;
            case 4: human.setName(human.getName() + " (Bushi)");
            break;
            case 5: human.setName(human.getName() + " (Samurai)");
            break;
            case 6: human.setName(human.getName() + " (Kensei)");
            break;
        }

    }
}
