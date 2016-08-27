package com.example.speakingjoy.genelandroid.SairlerSiirler;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.text.method.ScrollingMovementMethod;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.speakingjoy.genelandroid.R;

        import java.util.ArrayList;

/**
 * Created by speakingJoy on 25.07.2016.
 */
public class SairSiir extends Activity{
    final String[][] Siir={

            {"Öyle Günler Gördüm ki","\nÖyle günler gördüm ki, aydın gökler kararıp\n" +
                    "Bahtım bir bulut gibi üstüme çöker oldu,\n" +
                    "Her gözümü yumunca tanıdık yüzler görüp,\n" +
                    "Hayaller alev alev beynimi yakar oldu.\n" +
                    "Ümitsizlik, gariplik dört tarafımı sarıp\n" +
                    "Yüzüm sırıtsa bile, içim yaş döker oldu.\n" +
                    "\n" +
                    "Her sabah ilk ışiklar gözlerimi oyardı,\n" +
                    "Uyanan taş duvarlar iniltimi duyardı.\n" +
                    "\n" +
                    "Öyle günler gördum ki, duvarlar gelir dile,\n" +
                    "Gözumde canlanırdı eşkiya masalları.\n" +
                    "Varlığımı sarardı, hain bir isteyişle\n" +
                    "Görmediğim yumuşak bir düşmanın elleri\n" +
                    "Kafada çelik gibi fikirler dursa bile\n" +
                    "Kalplerin eksik olmaz böyle zayıf halleri:\n" +
                    "\n" +
                    "Bazen kendi kendimin elinden kurtulurdum,\n" +
                    "Kalbimi bir çamurda çırpınırken bulurdum.\n" +
                    "\n" +
                    "Öyle günler gördüm ki, dost dediğim insanlar\n" +
                    "Ben yanına varınca dudağını kıvırdı.\n" +
                    "Bir zamanlar yanımda ağız açmayanlar\n" +
                    "Sırtımı sıvazladı, bana oğüt savurdu.\n" +
                    "Silahsız gördüğüne saldıran kahramanlar\n" +
                    "En alçak tekmelerle beni yere devirdi.\n" +
                    "\n" +
                    "Ruhum bir heykel gibi düşüp parcalanırdı.\n" +
                    "Bu sesleri duyanlar gülüyorum sanırdı.\n" +
                    "\n" +
                    "Öyle günler gördüm ki, tabanca sakağımda\n" +
                    "Tasarladım aydınlık dünyayı bırakmayı\n" +
                    "Gönlüm acıklı buldu, en ateşli çağımda\n" +
                    "Sönük bir yıldız gibi boşluklara akmayı\n" +
                    "Tabancanın namlusu ısındı yanagımda,\n" +
                    "Parmagım istemedi tetiğini çekmeyi\n" +
                    "\n" +
                    "Bir sonbahar yağmuru gibi içim ağlardı\n" +
                    "Bir şeyler fakat beni yaşamağa bağlardı.\n" +
                    "\n" +
                    "Ey bir tane sevgilim, ben bugün yaşıyorsam\n" +
                    "Sanma ki hayat tatlı, insanlar hoş olmustur,\n" +
                    "Dağ başında bir kaya gibiyim şöyle dursam\n" +
                    "Etrafım eskisinden daha bomboş olmuştur\n" +
                    "Yalnız sana borçluyum bugün dünyada varsam:\n" +
                    "Seni her andığımda gözlerim yaş olmuştur\n" +
                    "\n" +
                    "Yaşlar ki bir ırmaktır, dertleri sürür gider,\n" +
                    "Gözyaşları içinde seneler yürür gider.\n" +
                    "\n" +
                    "Yok olmak isteğiyle kalbim attığı zaman,\n" +
                    "Bana: Yaşa der gibi gülen senin yüzündü.\n" +
                    "Dizlerim bir batakta yorgun yattığı zaman\n" +
                    "Bacaklarıma kuvvet veren senin hızındı.\n" +
                    "Yaşaran gözlerimde, güneş battığı zaman\n" +
                    "Sıcak bir yuva gibi tüten senin dizindi.\n" +
                    "\n" +
                    "Sen aklıma gelince her şey gülümserdi.\n" +
                    "Ağaçlar sarkı söyler, rüzgar tatlı eserdi.\n" +
                    "\n" +
                    "Ey sevgilim, bilirsin benim ne çektiğimi:\n" +
                    "Garip başimın derdi bir yürek taşıyorum.\n" +
                    "Anlarsın niçin uzak yerlere baktığımı:\n" +
                    "İçinde yaşanmaz bir dünyada yaşıyorum.\n" +
                    "Görünce gülme sakın çırpınıp aktıgımı:\n" +
                    "Ilık ve aydınlık bir denize koşuyorum.\n" +
                    "\n" +
                    "Sen benim sevgilimsin, sevsen de, sevmesen de,\n" +
                    "Aradığım yerlere benzeyiş buldum sende.\n"},
            {"Çakır","\nAltın saçlarını sıkıca tarar,\n" +
                    "Sonra iki örgü yana bırakır;\n" +
                    "Ayağında pembe dallı mor şalvar,\n" +
                    "Taze gelin gibi süzülür Çakır...\n" +
                    "\n" +
                    "Beyaz ellerine kına yaraşır,\n" +
                    "Mavi gözleriyle bir içim sudur.\n" +
                    "Efeler onu el üstünde taşır;\n" +
                    "Köyün bir tanecik orospusudur.\n" +
                    "\n" +
                    "Çakır´sız olamaz hiç bir eğlence\n" +
                    "Herkesingönlünü kaplar çünkü sis...\n" +
                    "Bazan mal olsa da iki üç gence,\n" +
                    "Yine Çakır´ını ister her meclis...\n" +
                    "\n" +
                    "Geniş meydanlarda yakılır çıra,\n" +
                    "Çakır nazlı nazlı dokunur ´def´e...\n" +
                    "Süt gibi rakıyı sunar Çakır´a\n" +
                    "Gür bıyıklı, ateş gözlü bir efe...\n" +
                    "\n" +
                    "gitgide açılır sırma cepkenler;\n" +
                    "Kıllı göğüslerinden süzülür rakı.\n" +
                    "Bazan birisinin bağrına girer,\n" +
                    "Elma soymak için alınan çakı...\n" +
                    "\n" +
                    "Çakır yılan gibi döner, kıvrılır\n" +
                    "-Sırma saçlarında fildişi tarak-\n" +
                    "Tabanca çekilir, bıçak sıyrılır,\n" +
                    "O döner elini şıkırdatarak...\n" +
                    "\n" +
                    "Yalnız bazı kere taze gelinler,\n" +
                    "´Bize kocamızı ver! ...diye inler...\n" +
                    "O zaman Çakır´ın gözü doludur...\n" +
                    "\n" +
                    "O zaman gözünün önüne gelen\n" +
                    "Cepheden şehitlik alıp yükselen\n" +
                    "İncecik bıyıklı bir yavukludur...\n"},
            {"Hapishane Şarkısı",
                    "\ngöklerde kartal gibiydim\n" +
                            "kanatlarımdan vuruldum\n" +
                            "mor çiçekli dal gibiydim\n" +
                            "bahar vaktinde kırıldım\n" +
                            "\n" +
                            "yar olmadı bana devir\n" +
                            "her günüm bir başka zehir\n" +
                            "hapishanelerde demir\n" +
                            "parmaklıklara sarıldım\n" +
                            "\n" +
                            "coşkundum pınarlar gibi\n" +
                            "sarhoştum rüzgarlar gibi\n" +
                            "ihtiyar çınarlar gibi\n" +
                            "bir gün içinde devrildim\n" +
                            "\n" +
                            "ekmeğim bahtımdan katı\n" +
                            "bahtım düşmanımdan kötü\n" +
                            "böyle kepaze hayatı\n" +
                            "sürüklemekten yoruldum\n" +
                            "\n" +
                            "kimseye soramadığım\n" +
                            "doyunca saramadığım\n" +
                            "görmesem duramadığım\n" +
                            "nazlı yarimden ayrıldım\n"},
            {"Acaba","\nEla gözünden akan\n" +
                    "Ateşli nazarların\n" +
                    "Acaba acımadan\n" +
                    "Kimi yakacak yarın?\n" +
                    "\n" +
                    "Dudakların acaba\n" +
                    "Kimlerle öpüşecek?\n" +
                    "Kimler yarın acaba,\n" +
                    "Tuzağına düşecek?\n" +
                    "\n" +
                    "Anlıyorum, bizlerden\n" +
                    "İntikam alıyorsun.\n" +
                    "Lakin ey kadın bilsen,\n" +
                    "Nasıl alçalıyorsun...\n\n"},
            {"Haddeden Geçmiş Nezaket",
                    "\nHaddeden geçmiş nezâket yâl ü bâl olmuş sana\n" +
                            "Mey süzülmüş şîşeden ruhsar-ı âl olmuş sana\n" +
                            "\n" +
                            "Bûy-i gül taktîr olunmuş nâzın işlenmiş ucu\n" +
                            "Biri olmuş hoy birisi dest-mâl olmuş sana\n" +
                            "\n" +
                            "Sihr ü efsûn ile dolmuşdur derûnun ey kalem\n" +
                            "Zülfü Hârut'un demek mümkin ki nâl olmuş sana\n" +
                            "\n" +
                            "Şöyle gird olmuş Firengistân birikmiş bir yere\n" +
                            "Sonra gelmiş gûşe-i ebrûda hâl olmuş sana\n" +
                            "\n" +
                            "Ol büt-i tersâ sana mey nûş eder misin demiş\n" +
                            "El-amân ey dil ne müşkil-ter suâl olmuş sana\n" +
                            "\n" +
                            "Sen ne câmın mestisin âyâ kimin hayrânısın\n" +
                            "Kendin aldırdın gönül n'oldun ne hal olmuş sana\n" +
                            "\n" +
                            "Leblerin mecrûh olur dendân-ı sîn-i bûseden\n" +
                            "Lâ'lin öptürmek bu hâletle muhâl olmuş sana\n" +
                            "\n" +
                            "Yok bu şehr içre senin vasfettiğin dilber Nedîm\n" +
                            "Bir perî-sûret görünmüş bir hayâl olmuş sana\n\n" +
                            "\n"},
            {"Müstezad","\nEy şûh-ı kerem-pişe dîl-i zâr senindir\n" +
                    "Yok minnetin asla\n" +
                    "Ey kân-ı güher anda ne kim var senindir\n" +
                    "Pinhân u Hüveydâ\n" +
                    "Sen kim gelesin meclise bir yer mi bulunmaz\n" +
                    "Baş üzre yerin var\n" +
                    "Gül goncasısın gûşe-i destâr senindir\n" +
                    "Gel ey gül-i rana\n" +
                    "Neylersen edip bir-iki gün bâr-ı cefâya\n" +
                    "Sabreyle de sonra\n" +
                    "Peymâne senin hâne senin yâr senindir\n" +
                    "Ey dil tek ü tenhâ\n" +
                    "Bir bûse-i cân bahşına ver nakd-i hayatı\n" +
                    "Ger kail olursa\n" +
                    "Senden yanadır söz yine bazar senindir\n" +
                    "Ey âşık-ı şeydâ\n" +
                    "Çeşmân-ı siyeh mest-i sitem kakülü pür-hâm\n" +
                    "Ebrûları pür-çîn\n" +
                    "Benzer ki bu dîldâr-ı cefâkâr senindir\n" +
                    "Biçâre Nedîmâ\n\n" +
                    "\n"},
            {"İstanbul Kasidesi","\nBu şehr-i Sitanbul ki bi misl ü behâdır\n" +
                    "Bir sengine yek pâre Acem mülkü fedâdır\n" +
                    "\n" +
                    "Bir gevher-i yekpare iki bahr arasında\n" +
                    "Hurşîd-i cihan-tâb ile tartılsa sezâdır\n" +
                    "\n" +
                    "Bir kân-ı niamdır ki anın gevheri ikbâl\n" +
                    "Bir bağ-ı iremdir ki gülü izz ü alâdır\n" +
                    "\n" +
                    "Altında mı üstünde midir cennet-i a'lâ\n" +
                    "El-hak bu ne halet bu ne hoş âb u hevâdır\n" +
                    "\n" +
                    "Her bağçesi bir çemenistân-ı letâfet\n" +
                    "Her kûşesi bir meclis-i pür-feyz ü safâdır\n" +
                    "\n" +
                    "İnsaf değildir ânı dünyaya değişmek\n" +
                    "Gülzarların cennete teşbih hatadır\n" +
                    "\n" +
                    "Herkes irişür anda muradına ânınçün\n" +
                    "Dergahları melce-i erbab-ı recâdır\n" +
                    "\n" +
                    "Kala-yı meârif satılır sûklarında\n" +
                    "Bazâr-ı hüner ma'den-i ilm ü ulemâdır\n" +
                    "\n" +
                    "Camilerinin her biri bir kûh-i tecellî\n" +
                    "Ebrû-yi melek andaki mihrâb-ı duâdır\n" +
                    "\n" +
                    "Mescidlerinin her biri bir lücce-i envâr\n" +
                    "Kandilleri meh gibi lebrîz-i ziyâdır\n" +
                    "\n" +
                    "Ser-çeşmeleri olmada insana revân-bahş\n" +
                    "Germ-âbeleri câna safâ cisme şifâdır\n" +
                    "\n" +
                    "Hep halkının etvarı pesendîde-i makbul\n" +
                    "Derler ki biraz dilleri bî-mihr ü vefâdır\n" +
                    "\n" +
                    "Şimdi yapılan âlem-i nev-resm ü safânın\n" +
                    "Evsafı hele başka kitâb olsa sezâdır\n" +
                    "\n" +
                    "Nâmı gibi olmuşdur o hem sa'd hem âbâd\n" +
                    "İstanbul'a sermâye-i fahr olsa revâdır\n" +
                    "\n" +
                    "Kûh-sarları bağları kasrları hep\n" +
                    "Güya ki bütün şevk ü tarab zevk u safâdır\n" +
                    "\n" +
                    "İstanbul'un evsafını mümkün mi beyân hiç\n" +
                    "Maksûd heman sadr-ı kerem-kâra senâdır\n\n" +
                    "\n"},
            {"Rubai",
                    "\nSâkî nigehin tamam kâr etdi bana\n" +
                            "Hayretle cihan yüzünü târ etdi bana\n" +
                            "Cahbâya bahane bulma vallah billâh\n" +
                            "Nitdiyse o çeşm-i pür-humâr etdi bana\n" +
                            "\n" +
                            "Rakkas bu hâlet senin oynunda mıdır\n" +
                            "Aşıkların günâhı boynunda mıdır\n" +
                            "Doymam şeb-i vaslına şeb-i ruze gibi\n" +
                            "Ey sim-beden sabah koynunda mıdır\n"},
            {"Tahammül Mülkünü Yıktın",
                    "\nTahammül mülkünü yıktın Hulagu Han mısın kafir\n" +
                            "Aman dünyayı yaktın ateş-i suzan mısın kafir\n" +
                            "\n" +
                            "Kız oğlan nazı nazın şehlevend avazı avazın\n" +
                            "Belasın ben de bilmem kız mısın oğlan mısın kafir\n" +
                            "\n" +
                            "Ne ma´na gösterir duşundaki ol ateşin atlas\n" +
                            "Ki ya´ni şule-i cansuz-ı hüsn ü an mısın kafir\n" +
                            "\n" +
                            "Nedir bu gizli gizli ahlar çak-i giribanlar\n" +
                            "Aceb bir şuha sende aşık-ı nalan mısın kafir\n" +
                            "\n" +
                            "Sana kimisi canım kimi cananım deyü söyler\n" +
                            "Nesin sen doğru söyle can mısın canan mısın kafir\n" +
                            "\n" +
                            "Şarab-ı ateşinin keyfi rüyun şul´elendirmiş\n" +
                            "Bu haletle çerağ-ı meclis-i mestan mısın kafir\n" +
                            "\n" +
                            "Niçin sık sık bakarsın öyle mirat-ı mücellaya\n" +
                            "Meğer sen dahi kendi hüsnüne hayran mısın kafir\n" +
                            "\n" +
                            "Nedim-i zarı bir kafir esir etmiş işitmiştim\n" +
                            "Sen ol cellad-ı din ol düşmeni iman mısın kafir\n\n" +
                            "\n"},
            {"Bercesteler",
                    "\nSen bî-haber hayâlin ile gûşelerde biz\n" +
                            "Tâ subh olunca her gece ayş u dem eyleriz\n" +
                            "* * *\n" +
                            "Esdikçe bâd-ı subh perîşânsın ey gönül\n" +
                            "Benzer esîr-i turra-i cânânsın ey gönül\n" +
                            "* * *\n" +
                            "Güllü dîbâ giydin ammâ korkarım âzâr eder\n" +
                            "Nâzenînim sâye-i hâr-ı gül-i dîbâ seni\n" +
                            "* * *\n" +
                            "Gülüm şöyle gülüm böyle demektir yâre mu'tâdım\n" +
                            "Seni ey gül sever cânım ki cânâne hitâbımsın\n"},
            {"Gazel1",
                    "\nHâsılım yok ser-i kûyunda belâdan gayrı\n" +
                            "Garazım yok reh-i aşkında fenâdan gayrı\n" +
                            "\n" +
                            "Ney-i bezm-i gamem ey âh ne bulsan yele ver\n" +
                            "Oda yanmış kuru cisminde hevâdan gayrı\n" +
                            "\n" +
                            "Perde çek çehreme hicran günü ey kanlu sirişk\n" +
                            "Ki gözüm görmeye ol mâhlikadan gayrı\n" +
                            "\n" +
                            "Yetti bi-kesliğim ol gayete kim çevremde\n" +
                            "Kimse yok çizgine gird-âb-ı belâdan gayrı\n" +
                            "\n" +
                            "Bozma ey mevc gözüm yaşı habâbın ki bu seyl\n" +
                            "Komadı hiç imâret bu binadan gayrı\n" +
                            "\n" +
                            "Bezm-i aşk içre Fuzûli nice âh eylemeyem\n" +
                            "Ne temettu´ bulunur neyde sadâdab gayrı\n\n" +
                            "\n"},
            {"Beni Candan Usandırdı",
                    "\nBeni candan usandırdı cefâdan yâr usanmaz mı\n" +
                            "Felekler yandı âhımdan murâdım şem´i yanmaz mı\n" +
                            "\n" +
                            "Kamu bîmârına cânân deva-yı derd eder ihsan\n" +
                            "Niçün kılmaz bana derman beni bîmar sanmaz mı\n" +
                            "\n" +
                            "Şeb-i hicran yanar cânım döker kan çeşm-i giryânım\n" +
                            "Uyadır halkı efgânım gara bahtım uyanmaz mı\n" +
                            "\n" +
                            "Gûl-i ruhsârına karşu gözümden kanlu akar su\n" +
                            "Habîbim fasl-ı güldür bu akar sular bulanmaz mı\n" +
                            "\n" +
                            "Gâmım pinhan tutardım ben dedîler yâre kıl rûşen\n" +
                            "Desem ol bî-vefâ bilmen inanır mı inanmaz mı\n" +
                            "\n" +
                            "Değildim ben sana mâil sen ettin aklımı zâil\n" +
                            "Bana ta´n eyleyen gâfil seni görgeç utanmaz mı\n" +
                            "\n" +
                            "Fuzûlî rind-i şeydâdır hemîşe halka rüsvâdır\n" +
                            "Sorun kim bu ne sevdâdır bu sevdâdan usanmaz mı\n\n" +
                            "\n"},
            {"Su Kasidesi",
                    "\nSaçma ey göz eşkten gönlümdeki odlare su\n" +
                            "Kim bu denli tutuşan odlare kılmaz çare su\n" +
                            "\n" +
                            "Âb-gûndur günbed-i devvar rengi bilmezem\n" +
                            "Ya muhît olmuş gözümden günbed-i devvare su\n" +
                            "\n" +
                            "Zevk-i tiğinden aceb yok olsa gönlüm çak çak\n" +
                            "Kim mürur ilen bırakır rahneler divare su\n" +
                            "\n" +
                            "Suya versin bağ-ban gül-zarı zahmet çekmesin\n" +
                            "Bir gül açılmaz yüzün tek verse bin gül-zare su\n" +
                            "\n" +
                            "Ohşadabilmez gubarını muhharir hattına\n" +
                            "Hame tek bakmaktan inse gözlerine kare su\n" +
                            "\n" +
                            "Arızın yadiyhle nem-nak olsa müjganım nola\n" +
                            "Zayi olmaz gül temennasiyle vermek hare su\n" +
                            "\n" +
                            "Hayret ilen parmağın dişler kim etse istima\n" +
                            "Parmağından verdiği şiddet günü Ensar'e su\n" +
                            "\n" +
                            "Eylemiş her katreden bin bahr-i rahmet mevc-hiz\n" +
                            "El sunup urgaç vuzu için gül-i ruhsare su\n" +
                            "\n" +
                            "Hâk-i payine yetem der ömrlerdir muttasil\n" +
                            "Başini taştan taşa urup gezer avare su\n" +
                            "\n" +
                            "Zerre zerre hâk-i der-gâhina ister sala nûr\n" +
                            "Dönmez ol der-gâhtan ger olsa pâre pâre su\n" +
                            "\n" +
                            "Zikr-i na'tin virdini derman bilir ehl-i hatâ\n" +
                            "Eyle kim def'-i humar için içer mey-hâre su\n" +
                            "\n" +
                            "Yâ Habibu'llah yâ hayru'l-beşer müştâkinim\n" +
                            "Eyle kim leb-teşneler yanip diler hemvâre su\n" +
                            "\n" +
                            "Sensin ol bahr-i keramet kim şeb-i Mirâc'da\n" +
                            "Şeb-nem-i feyzin yetirmiş sâbit ü seyyâre su\n" +
                            "\n" +
                            "Bîm-i dûzah nâr-ı gam salmış dil-i sûzânıma\n" +
                            "Var ümîdim ebr-i ihsânın sepe ol nâre su\n" +
                            "\n" +
                            "Yümn-i na'tinden güher olmuş Fuzûli sözleri\n" +
                            "Ebr-i nîsandan dönen tek lü'lü-i şeh-vâre su\n" +
                            "\n" +
                            "Hâb-i gafletten olan bîdâr olanda rûz-ı haşr\n" +
                            "Hâb-ı hasretten dökende dîde-i bîdâre su\n" +
                            "\n" +
                            "Umduğum oldur ki Rûz-i Haşr mahrûm olmayam\n" +
                            "Çeşme-i vaslın vere ben teşne-i dîdâre su\n" +
                            "\n" +
                            "Gam günü etme dil-i bîmârdan tiğin diriğ\n" +
                            "Hayrdır vermek karanu gecede bîmâre su\n" +
                            "\n" +
                            "İste peykânın gönül hecrinde şevkim sâkin et\n" +
                            "Susuzum bir kez bu sahrâda benim'çün ara su\n" +
                            "\n" +
                            "Ben lebin müştâkiyim zühhâd kevser tâlibi\n" +
                            "Nitekim meste mey içmek hoş gelir huş-yâre su\n" +
                            "\n" +
                            "Ravza-i kûyuna her dem durmayıp eyler güzâr\n" +
                            "Aşık olmuş gâliba ol serv-i hoş-reftare su\n" +
                            "\n" +
                            "Su yolun ol kûydan toprağ olup tutsam gerek\n" +
                            "Çün rakîbimdir dahi ol kûya koyman vâre su\n" +
                            "\n" +
                            "Dest-busı arzusiyle ger ölsem dostlar\n" +
                            "Kûze eylen toprağım sunun anınla yâre su\n" +
                            "\n" +
                            "İçmek ister bölübülün kanın meger bir reng ile\n" +
                            "Gül budağının mizâcına gire kurtare su\n" +
                            "\n" +
                            "Tînet-i pâkini rûşen kılmış ehl-i âleme\n" +
                            "İktida kılmış tarîk-i Ahmed-i Muhtâr'e su\n" +
                            "\n" +
                            "Seyyid-i nev'-i beşer deryâ-yi dürr-i istifâ\n" +
                            "Kim sepiptir mu'cizâtı âteş-i eşrâre su\n" +
                            "\n" +
                            "Kılmak için tâze gül-zâr-i nübüvvet revnâkın\n" +
                            "Mu'cizinden eylemiş izhâr seng-i hâre su\n" +
                            "\n" +
                            "Mu'cizi bir bahr-i bî-pâyân imiş âlemde kim\n" +
                            "Yetmiş andan bin bin âteş-hâne-i küffâre su\n\n" +
                            "\n"},
            {"Canı Kim Cananı Kim",
                    "\nCânı kim cânânı içün sevse cânânın sever\n" +
                            "Cânı içün kim ki cânânın sever cânın sever\n" +
                            "\n" +
                            "Her kimün âlemde mıkdârıncadur tab´ınde meyl\n" +
                            "Men leb-i cânânumu Hızr Ab-ı Hayvânın sever\n" +
                            "\n" +
                            "Başa dem düştükçe taksîr eylemez eyler meded\n" +
                            "Ol sebebden muttasıl çeşmüm ciger kanın sever\n" +
                            "\n" +
                            "Müşg-i Çîn âvâre olmuşdur vatandan men kimi\n" +
                            "Hansı şûhun bilmezem zülf-i perîşânın sever\n" +
                            "\n" +
                            "Şu ki ser-gerdân gezer başında vardu...\nCânı kim cânânı içün sevse cânânın sever\n" +
                            "Cânı içün kim ki cânânın sever cânın sever\n" +
                            "\n" +
                            "Her kimün âlemde mıkdârıncadur tab´ınde meyl\n" +
                            "Men leb-i cânânumu Hızr Ab-ı Hayvânın sever\n" +
                            "\n" +
                            "Başa dem düştükçe taksîr eylemez eyler meded\n" +
                            "Ol sebebden muttasıl çeşmüm ciger kanın sever\n" +
                            "\n" +
                            "Müşg-i Çîn âvâre olmuşdur vatandan men kimi\n" +
                            "Hansı şûhun bilmezem zülf-i perîşânın sever\n" +
                            "\n" +
                            "Şu ki ser-gerdân gezer başında vardur ki hevâ\n" +
                            "Gâlibâ bir gül-ruhun serv-i hırâmânın sever\n" +
                            "\n" +
                            "Akıbet rusvâ olub mey-tek düşer il ağzına\n" +
                            "Kim ki bir ser-mest sâkî lâ´l-i handânın sever\n" +
                            "\n" +
                            "N´olacakdur terk-i ışk etme Fuzûlî vehm edüb\n" +
                            "Gâyeti derler ola bir bende sultânın sever\n\n" +
                            "\n"},
            {"Beni Hor Görme Kasrdeşim",
                    "\nBeni hor görme kardeşim\n" +
                            "Sen altındın ben tunç muyum\n" +
                            "Aynı vardan var olmuşuz\n" +
                            "Sen gümüşsün ben saç mıyım\n" +
                            "\n" +
                            "Ne varise sende bende\n" +
                            "Aynı varlık her bedende\n" +
                            "Yarın mezara girende\n" +
                            "Sen toksun da be aç mıyım\n" +
                            "\n" +
                            "Kimi molla kimi derviş\n" +
                            "Allah bize neler vermiş\n" +
                            "Kimi arı çiçek dermiş\n" +
                            "Sen balsın da ben cec miyim\n" +
                            "\n" +
                            "Topraktandır cümle beden\n" +
                            "Nefsini öldür ölmeden\n" +
                            "Böyle emretmiş yaradan\n" +
                            "Sen kalemsin ben uç muyum\n" +
                            "\n" +
                            "Tabiata Veysel aşık\n" +
                            "Topraktan olduk kardaşık\n" +
                            "Aynı yolcuyuz yoldaşık\n" +
                            "Sen yolcusun ben bac mıyım\n\n" +
                            "\n"},
            {"İşde Hiyle Sözde Yalan Olmasa",
                    "\nİnsanoğlu doğru yoldan şaşmazdı\n" +
                            "İşde hiyle, sözde yalan olmasa\n" +
                            "Türlü türlü felakete düşmezdi\n" +
                            "İşde hiyle, sözde yalan olmasa\n" +
                            "\n" +
                            "İstemezdi alış verişte senet\n" +
                            "Kafalara yerleşmezdi ihanet\n" +
                            "Ne zina olurdu ne çapkın evlat\n" +
                            "İşde hiyle, sözde yalan olmasa\n" +
                            "\n" +
                            "Ne bir yetim hakkı ne de bir rüşvet\n" +
                            "Yanmazdı gönüller olurdu hep şad\n" +
                            "Derdim anlatırken denmezdi kapat\n" +
                            "İşde hiyle, sözde yalan olmasa\n" +
                            "\n" +
                            "Bu güzel sohbette olmazdı fıs fıs\n" +
                            "Çirkin ise meyyal olmazdı nefis\n" +
                            "Ne cinayet ne hırsız ne hapis\n" +
                            "İşde hiyle, sözde yalan olmasa\n" +
                            "\n" +
                            "Ortadan kalkardı günah musibet\n" +
                            "Aşıklar olurdu hak ve hakikat\n" +
                            "Herkes için açık olurdu cennet\n" +
                            "İşde hiyle, sözde yalan olmasa\n" +
                            "\n" +
                            "Tamuda olmazdı kullara ceza\n" +
                            "Olsa temiz ahlak ve husni-i rıza\n" +
                            "Hiç şüphe girmezdi gönüle göze\n" +
                            "İşde hiyle, sözde yalan olmasa\n" +
                            "\n" +
                            "Yalancılar belki kızar bu işe\n" +
                            "Yalan ayaktadır çıkamaz basa\n" +
                            "Kemlik düşünür mü kardeş kardeşe\n" +
                            "İşde hiyle, sözde yalan olmasa\n" +
                            "\n" +
                            "VEYSEL bu yollarda sarfeder nefes\n" +
                            "Herkesin elinde gezer bir kafes\n" +
                            "Binbir türlü derdi çeker mi herkez\n" +
                            "İşde hile, sözde yalan olmasa\n\n" +
                            "\n"},
            {"Mecnun gibi dolanıyorum çöllerde",
                    "\nMecnun gibi dolanıyorum çöllerde\n" +
                            "Hayal beni yeldiriyor yel gibi\n" +
                            "Ah çeker ağlarım gurbet ellerde\n" +
                            "Durmaz akar gözüm yaşı sel gibi\n" +
                            "\n" +
                            "Bir güzelin mecnunuyum ezelden\n" +
                            "Veremem telkini gelmiyor elden\n" +
                            "Yandım ateşine can u gönülden\n" +
                            "Görmesem günlerim uzar yıl gibi\n" +
                            "\n" +
                            "Hesapsız haftalar yıllar geçiyor\n" +
                            "Evvel benim idi şimdi kaçıyor\n" +
                            "Varıp düşmanlara derdin açıyor\n" +
                            "Beni görüp saklanıyor el gibi\n" +
                            "\n" +
                            "Zincirsiz kösteksiz bağladı beni\n" +
                            "Tatlı diliyle eğledi beni\n" +
                            "Yurdumdan yuvamdan eyledi beni\n" +
                            "Yarsız dunya malı bana pul gibi\n" +
                            "\n" +
                            "Aşkın beni deryalara daldırdı\n" +
                            "Bazı ağlatır da bazı güldürür\n" +
                            "İster azat eyler ister öldürür\n" +
                            "Sefil Veysel kapısında kul gibi\n" +
                            "\n"},
            {"Dalgın Dalgın Seyreyledim Alemi",
                    "\nDalgın dalgın seyreyledim alemi\n" +
                            "Renkler ne çiçekler ne koku ne\n" +
                            "Bir arama yaptım kendi kafamı\n" +
                            "Görünen ne gösteren ne görgü ne\n" +
                            "\n" +
                            "Çeşitli irenkler türlü görüşler\n" +
                            "Hayal midir rüya mıdır bu işler\n" +
                            "Tatlı muhabbetler güzel sevişler\n" +
                            "Güzellik ne sevda nedir sevgi ne\n" +
                            "\n" +
                            "Göz ile görülmez duyulan sesler\n" +
                            "Nerden uyanıyor bizdeki hisler\n" +
                            "Şekilsiz gölgesiz canlar nefesler\n" +
                            "Duyulan ne duyuran ne duygu ne\n" +
                            "\n" +
                            "Kimse bilmez dünya nasıl kurulmuş\n" +
                            "Her cisime birer zerre verilmiş\n" +
                            "Cümle varlık bir kuvvetten var olmuş\n" +
                            "Gelen ne giden ne yol ne yolcu ne\n" +
                            "\n" +
                            "Herkese gizlidir bu sırr-ı hikmet\n" +
                            "Her nesnede vardır bir türlü ibret\n" +
                            "Veysel´i söyletir bir büyük kuvvet\n" +
                            "Söyleyen ne söyleten ne Tanrı ne?\n" +
                            "\n"},
            {"Gönül Sana Nasihatım",
                    "\nGönül sana nasihatim\n" +
                            "Çağrılmazsan varma gönül\n" +
                            "Seni sevmezse bir güzel\n" +
                            "Bağlanıp da durma gönül\n" +
                            "\n" +
                            "Ne gezersin Şam´ı Şark´ı\n" +
                            "Yok mu sende hiç bir korku\n" +
                            "Terkedersin evi barkı\n" +
                            "Beni boşa yorma gönül.\n" +
                            "\n" +
                            "Yorulursun gitme yaya,\n" +
                            "Hükmedersin güne aya,\n" +
                            "Aşk denilen bir deryaya\n" +
                            "Çıkamazsın girme gönül.\n" +
                            "\n" +
                            "Ben kocadım sen genceldin,\n" +
                            "Başa bela nerden geldin\n" +
                            "Kahi indin kah yükseldin\n" +
                            "Şimdi oldun turna gönül.\n" +
                            "\n" +
                            "Bazı zengin bazı züğürt,\n" +
                            "Bazı usta bazı sakird\n" +
                            "Bazı koyun bazı aç kurt\n" +
                            "Her irenkten derme gönül\n" +
                            "\n" +
                            "Veysel gönülden ayrılmaz,\n" +
                            "Kahi bilir kahi bilmez,\n" +
                            "Yalan dünya yarsız olmaz,\n" +
                            "İster saçı sırma gönül.\n" +
                            "\n"},
            {"Memlekete Destan Oldum",
                    "\nMemlekete destan oldum\n" +
                            "Karım beni beğenmedi\n" +
                            "Eşten oldum dosttan oldum\n" +
                            "Yarim beni beğenmedi\n" +
                            "\n" +
                            "Ne söylesem \"deli\" dedi\n" +
                            "\"Meyva vermez çalı\" dedi\n" +
                            "\"Açma bana kolu\" dedi\n" +
                            "Sarım beni beğenmedi\n" +
                            "\n" +
                            "Ben gönlümün valisiyim\n" +
                            "Altı çocuk velisiyim\n" +
                            "Bir güzel delisiyim\n" +
                            "Durum beni beğenmedi\n" +
                            "\n" +
                            "Yine düştüm dilden dile\n" +
                            "Gözyaşlarım sile sile\n" +
                            "Attı beni gurbet ele\n" +
                            "Yarim beni beğenmedi\n" +
                            "\n" +
                            "Geçti güzelliğin çağı\n" +
                            "Gölköy´e kurdum otağı\n" +
                            "Güz geldi döktü yaprağı\n" +
                            "Dalım beni beğenmedi\n" +
                            "\n" +
                            "Veysel yönüm yare döndüm\n" +
                            "Lodos değmiş kara döndüm\n" +
                            "Yeşillenmiş yare döndüm\n" +
                            "Pirim beni beğenmedi\n" +
                            "\n"},
            {"Sen Bir Çiçek Olsan Ben Bir Yaz Olsam",
                    "\nHer sabah her sabah suya giderken\n" +
                            "Yar yolunda toprak olsam toz olsam\n" +
                            "Bakıp dört köşeyi seyran ederken\n" +
                            "Kara kaş altında ela göz olsam\n" +
                            "\n" +
                            "Uğrunu uğrunu giderken yola\n" +
                            "Nice dilsizleri getirir dile\n" +
                            "Gövel ördek gibi inerken göle\n" +
                            "Ya bir şahin olsam ya bir baz olsam\n" +
                            "\n" +
                            "Veysel ördek olsun sen de göl yarim\n" +
                            "Yeter artık kerem eyle gel yarim\n" +
                            "Lale sümbül mor menekşe gül yarim\n" +
                            "Sen bir çiçek olsan ben bir yaz olsam\n" +
                            "\n"},
            {"Deli Gönül Deyme Canda Bulunmaz",
                    "\nDeli gönül değme çaydan bulanmaz\n" +
                            "Coşarsa dalgası kendinden olur\n" +
                            "Derdsiz aşık diyar diyar dolanmaz\n" +
                            "Gezdirir kavgası kendinden olur\n" +
                            "\n" +
                            "Gönüle delidir demiştik baştan\n" +
                            "Üşenmez borandan ıslanmaz yaştan\n" +
                            "Boğulmaz denizden yenmez ateşten\n" +
                            "Ateşi kor közü kendinden olur\n" +
                            "\n" +
                            "Gönül bir deryadır dalgası dinmez\n" +
                            "Her güzele meyil verip dost denmez\n" +
                            "Taşıma su ile değirmen dönmez\n" +
                            "Dökülür çarka su kendinden olur\n" +
                            "\n" +
                            "Yüce dağlar ova gibi düzlenmez\n" +
                            "Veysel muhannetten kerem gözlenmez\n" +
                            "Tilki gölgesine arslan gizlenmez\n" +
                            "Yiğidin gölgesi kendinden\n" +
                            "\n"},
            {"Ağlar Veysel Çıkmaz Sesi",
                    "\nAh çektikçe erir gider\n" +
                            "Yüreğimin yağı benim\n" +
                            "Seni görsem durur gider\n" +
                            "Dillerimin bağı benim\n" +
                            "\n" +
                            "Gam leskesi saf saf oldu\n" +
                            "Hep sözlerim boş laf oldu\n" +
                            "Senin yolunda mahv oldu\n" +
                            "Gençliğimin çağı benim\n" +
                            "\n" +
                            "Ah belimi büken oldu\n" +
                            "Gurbet bana diken oldu\n" +
                            "Altı aydır mekan oldu\n" +
                            "Dibi kırkkız dağı benim\n" +
                            "\n" +
                            "Sensin derdine düştüğüm\n" +
                            "Hayal oldu konuştuğum\n" +
                            "Her gün yediğim içtiğim\n" +
                            "İçerimde ağu benim\n" +
                            "\n" +
                            "Ağlar VEYSEL çıkmaz sesi\n" +
                            "Gine...Ah çektikçe erir gider\n" +
                            "Yüreğimin yağı benim\n" +
                            "Seni görsem durur gider\n" +
                            "Dillerimin bağı benim\n" +
                            "\n" +
                            "Gam leskesi saf saf oldu\n" +
                            "Hep sözlerim boş laf oldu\n" +
                            "Senin yolunda mahv oldu\n" +
                            "Gençliğimin çağı benim\n" +
                            "\n" +
                            "Ah belimi büken oldu\n" +
                            "Gurbet bana diken oldu\n" +
                            "Altı aydır mekan oldu\n" +
                            "Dibi kırkkız dağı benim\n" +
                            "\n" +
                            "Sensin derdine düştüğüm\n" +
                            "Hayal oldu konuştuğum\n" +
                            "Her gün yediğim içtiğim\n" +
                            "İçerimde ağu benim\n" +
                            "\n" +
                            "Ağlar VEYSEL çıkmaz sesi\n" +
                            "Gine coştu gam deryası\n" +
                            "Garip gönlümün yaylası\n" +
                            "Güzel hüsnün bağı benim\n" +
                            "\n"},
            {"Kara Toprak",
                    "\nDost dost diye nicesine sarıldım\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "beyhude dolandım, boşa yoruldum\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "Nice güzellere bağlandım kaldım\n" +
                            "Ne bir vefa gördüm ne fayda buldum\n" +
                            "Her türlü istediğim topraktan aldım\n" +
                            "Benim sadık yarim kara topraktır\n" +
                            "\n" +
                            "Koyun verdi, kuzu verdi, süt verdi\n" +
                            "Yemek verdi, ekmek verdi, et verdi\n" +
                            "Kazma ile dövmeyince kıt verdi\n" +
                            "Benim sadık yarim ...Dost dost diye nicesine sarıldım\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "beyhude dolandım, boşa yoruldum\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "Nice güzellere bağlandım kaldım\n" +
                            "Ne bir vefa gördüm ne fayda buldum\n" +
                            "Her türlü istediğim topraktan aldım\n" +
                            "Benim sadık yarim kara topraktır\n" +
                            "\n" +
                            "Koyun verdi, kuzu verdi, süt verdi\n" +
                            "Yemek verdi, ekmek verdi, et verdi\n" +
                            "Kazma ile dövmeyince kıt verdi\n" +
                            "Benim sadık yarim kara topraktır\n" +
                            "\n" +
                            "Adem´den bu deme neslim getirdi\n" +
                            "Bana türlü türlü meyve bitirdi\n" +
                            "Her gün beni tepesinde götürdü\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "\n" +
                            "Karnın yardım kazmayınan, belinen\n" +
                            "Yüzün yırttım tırnağınan, elinen\n" +
                            "Yine beni karşıladı gülünen\n" +
                            "Benim sadık yarim kara topraktır\n" +
                            "\n" +
                            "İşkence yaptıkça bana gülerdi\n" +
                            "bunda yalan yoktur herkes de gördü\n" +
                            "Bir çekirdek verdim, dört bostan verdi\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "\n" +
                            "Havaya bakarsam hava alırım\n" +
                            "Toprağa bakarsam dua alırım\n" +
                            "Topraktan ayrılsam nerde kalırım\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "\n" +
                            "Bir dileğin varsa iste Allah´tan\n" +
                            "Almak için uzak gitme topraktan\n" +
                            "Cömertlik toprağa verilmiş Hak´tan\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "\n" +
                            "Hakikat istersen açık bir nokta\n" +
                            "Allah kula yakın, kul da Allah´a\n" +
                            "Hakkın gizli hazinesi toprakta\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "\n" +
                            "Bütün kusurumu toprak gizliyor\n" +
                            "Melhem çalıp yaralarım düzlüyor\n" +
                            "Kolun açmış yollarımı gözlüyor\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "\n" +
                            "Her kim ki olursa bu sırra mazhar\n" +
                            "Dünyaya bırakır ölmez bir eser\n" +
                            "Gün gelir Veysel´i bağrına basar\n" +
                            "Benim sadık yarim kara topraktır.\n" +
                            "\n"},
            {"Ala Gözlerini Sevdiğim Dilber",
                    "\nAla gözlerini sevdiğim dilber\n" +
                            "Göster cemalini görmeye geldim\n" +
                            "Şeftalini derde derman dediler\n" +
                            "Gerçek mi sevdiğim sormaya geldim\n" +
                            "\n" +
                            "Gündüz hayallerim gece düşlerim\n" +
                            "Uyandıkça ağlamaya başlarım\n" +
                            "Sevdiğim üstünde uçan kuşların\n" +
                            "Tutup kanatların kırmaya geldim\n" +
                            "\n" +
                            "Senin aşkların gülmez dediler\n" +
                            "Ağlayıp yaşını silmez dediler\n" +
                            "Seni bir kez saran ölmez dediler\n" +
                            "Gerçek mi efendim sormaya geldim\n" +
                            "\n" +
                            "Senin işin yiyip içmek dediler\n" +
                            "Yaren ile konup göçmek dediler\n" +
                            "Göğsün cennet koynun uçmak dediler\n" +
                            "Hak nasip ederse görmeye geldim\n" +
                            "\n" +
                            "Mail oldum senin ince beline\n" +
                            "Canım kurban olsun tatlı diline\n" +
                            "Aşık olup senin hüsnün bağına\n" +
                            "Kırmızı güllerin dermeye geldim\n" +
                            "\n" +
                            "Karac´oğlan der ki işin doğrusu\n" +
                            "Gokte melek yerde huma yavrusu\n" +
                            "Söyleyim ben sana sözün doğrusu\n" +
                            "Soyunup koynuna girmeye geldim\n" +
                            "\n"},
            {"Aşam Dedim Karlı Dağlar Başından",
                    "\nAşam dedim, karlı dağlar başından\n" +
                            "Yüce dağlar koç yiğide dağ m´olur\n" +
                            "Ağrır bedenim, sızlar yaralarım\n" +
                            "Bu yarayı çeken yiğit sağ m´olur\n" +
                            "\n" +
                            "Sıra sıra dikemedim söğüdü\n" +
                            "Ben başıma veremedim öğüdü\n" +
                            "Elleri göğsünde görün yiğidi\n" +
                            "Yiğit mağrur gezmek ile bey m´olur\n" +
                            "\n" +
                            "Ögüt versen, bana öğüt kâr etmez\n" +
                            "O yârin hayali karşımdan gitmez\n" +
                            "Kementle bağlasam, kolun bağ tutmaz\n" +
                            "Yârin zülüfünden özge bağ m´olur\n" +
                            "\n" +
                            "Karac´oğlan der ki, fani dünyadan\n" +
                            "Korkmaz mısın haram ile zinadan\n" +
                            "Ayırır seni anan babandan\n" +
                            "Gurbet ile düşen yiğit sağ m´olur\n" +
                            "\n"},
            {"Yürü Bre Yalan Dünya",
                    "\nYürü bre yalan dünya\n" +
                            "Sana konan göçer bir gün\n" +
                            "İnsan bir ekine misal\n" +
                            "Seni eken biçer bir gün\n" +
                            "\n" +
                            "Ağalar içmesi hoştur\n" +
                            "O da züğürtlere güçtür\n" +
                            "Can kafeste duran kuştur\n" +
                            "Elbet uçar gider bir gün\n" +
                            "\n" +
                            "Aşıklar der ki n´olacak\n" +
                            "Bu dünya mamur olacak\n" +
                            "Haleb´i Osmanlı alacak\n" +
                            "Dağı taşa katar bir gün\n" +
                            "\n" +
                            "Yerimi serin bucağa\n" +
                            "Suyumu koyun ocağa\n" +
                            "Kafamı alin kucağa\n" +
                            "Garip anam ağlar bir gün\n" +
                            "\n" +
                            "Yer yüzünde yeşil yaprak\n" +
                            "Yer altında kefen yırtmak\n" +
                            "Yastığımız kara toprak\n" +
                            "O da bizi atar bir gün\n" +
                            "\n" +
                            "Bindirirler cansız ata\n" +
                            "İndirirler tuta tuta\n" +
                            "Var dünyadan yol ahrete\n" +
                            "Yelgin gider salın bir gün\n" +
                            "\n" +
                            "Karac´oğlan der nasıma\n" +
                            "Çok işler gelir başıma\n" +
                            "Mezarımın baş taşına\n" +
                            "Baykuş konar öter bir gün\n" +
                            "\n"},
            {"Viran Oldum mor Sümbüllü Bağ İken",
                    "\nşu yalan dünyaya geldim geleli\n" +
                            "Tas tas içtim ağulari sağ iken\n" +
                            "Kahpe felek vermez benim muradım\n" +
                            "Viran oldum mor sümbüllü bağ iken\n" +
                            "\n" +
                            "Aradılar bir tenhada buldular\n" +
                            "Yaslandılar şıvgalarım kırdılar\n" +
                            "Yaz bahar ayında bir od verdiler\n" +
                            "Yandım gittim alkarlı dağ iken\n" +
                            "\n" +
                            "Farımaz da deli gönlüm farımaz\n" +
                            "Akar gözlerimin yaşı kurumaz\n" +
                            "Şimden geri benim hükmüm yürümez\n" +
                            "Azil oldum güzellere beğ iken\n" +
                            "\n" +
                            "Karac´oğlan der ki bakın geline\n" +
                            "Ömrümün yarısı gitti talana\n" +
                            "Sual eylen bizden evvel gelene\n" +
                            "Kim var imiş biz burada yoğ iken\n" +
                            "\n"},
            {"Yeşil Başlı Gövel Ördek",
                    "\nYeşil başlı gövel ördek\n" +
                            "Uçar gider göle karşı\n" +
                            "Eğricesin tel tel etmiş\n" +
                            "Döker gider yâre karşı\n" +
                            "\n" +
                            "Telli turnam sökün gelir\n" +
                            "İnci mercan yükün gelir\n" +
                            "Elvan elvan kokun gelir\n" +
                            "Yâr oturmuş yele karşı\n" +
                            "\n" +
                            "Şahinim var bazlarım var\n" +
                            "Tel alışkın sazlarım var\n" +
                            "Yâre gizli sözlerim var\n" +
                            "Diyemiyom ele karşı\n" +
                            "\n" +
                            "Hani Karac´oğlan hani\n" +
                            "Veren alır tatlı canı\n" +
                            "Yakışmazsa öldür beni\n" +
                            "Yeşil bağla ala karşı\n" +
                            "\n"},
            {"Nazlı Yardan Geldi Bana Bir Name",
                    "\nNazlı yârdan geldi bana bir name\n" +
                            "Eğer doğru ise kırdı belimi\n" +
                            "Dediler ki yarini yad iller almış\n" +
                            "Kadir Mevlam nasib eyle ölümü\n" +
                            "\n" +
                            "Bülbüle söyleyin gülüne konsun\n" +
                            "Beni yârdan eden Allah´tan bulsun\n" +
                            "Sabreyle sevdiğim ilkbahar olsun\n" +
                            "Terkedeyim vatanımı ilimi\n" +
                            "\n" +
                            "Ak yâri gördükçe ağladım coştum\n" +
                            "Al elinden dolu badeler içtim\n" +
                            "Kötüler sandı ki ben yârdan geçtim\n" +
                            "Ölmeyince çeker miyim elimi\n" +
                            "\n" +
                            "Karac´oğlan derki konmadan göçmem\n" +
                            "Her olur olmaza sırrımı açmam\n" +
                            "Kötüler köprü olsa üstünden geçmem\n" +
                            "Taşık suya uğradırım yolumu\n" +
                            "\n"},
            {"Bir Ayrılık Bir Yoksulluk Bir Ölüm",
                    "\nVara vara vardım ol kara taşa\n" +
                            "Hasret kodun beni kavim kardaşa\n" +
                            "Sebep gözden akan bu kanlı yaşa\n" +
                            "Bir ayrılık, bir yoksulluk, bir ölüm\n" +
                            "\n" +
                            "Nice sultanları tahttan indirdi\n" +
                            "Nicesinin gül benzini soldurdu\n" +
                            "Nicelerin gelmez yola gönderdi\n" +
                            "Bir ayrılık, bir yoksulluk, bir ölüm\n" +
                            "\n" +
                            "Karac´oğlan der ki kondum göçülmez\n" +
                            "Acıdır ecel şerbeti içilmez\n" +
                            "Üç derdim var birbirinden seçilmez\n" +
                            "Bir ayrılık, bir yoksulluk, bir ölüm\n" +
                            "\n"},
            {"Kadir Mevlam Senden Bir Dileğim Var",
                    "\nKadir Mevlam senden bir dileğim var\n" +
                            "Muhannes kuluna muhtaç eyleme\n" +
                            "Cennet-i alâyı nasib et bana\n" +
                            "Sırat köprüsünden yolum bağlama\n" +
                            "\n" +
                            "Kapımıza kara deve çökünce\n" +
                            "Fırtınasi şol alemi yıkınca\n" +
                            "Cehenneme kul seçilip çıkınca\n" +
                            "Kadir Mevlam o kullardan eyleme\n" +
                            "\n" +
                            "Kadir Mevlam ateş atma özüme\n" +
                            "Dünya malı görünmüyor gözüme\n" +
                            "Kadir Mevlam sen bak benim yüzüme\n" +
                            "Cehennemin ateşiyle dağlama\n" +
                            "\n" +
                            "Karac´oğlan hata çıkmaz dilimden\n" +
                            "Kocadım da hayır gelmez elimden\n" +
                            "Kadir Mevlam asla geçmez kulundan\n" +
                            "Deli gönül ah çekip de ağlama\n" +
                            "\n"},
            {"İncecikten Bir Kar Yağar",
                    "\nİncecikten bir kar yağar\n" +
                            "Tozar Elif Elif diye\n" +
                            "Deli gönül abdal olmuş\n" +
                            "Gezer Elif Elif diye\n" +
                            "\n" +
                            "Elif´in uğru nakışlı\n" +
                            "Yavru balaban bakışlı\n" +
                            "Yayla çiçeği kokuşlu\n" +
                            "Kokar Elif Elif diye\n" +
                            "\n" +
                            "Elif kaşlarını çatar\n" +
                            "Gamzesi bağrıma batar\n" +
                            "Ak elleri kalem tutar\n" +
                            "Yazar Elif Elif diye\n" +
                            "\n" +
                            "Evlerinin önü çardak\n" +
                            "Elif´in elinde bardak\n" +
                            "Sanki yeşil başlı ördek\n" +
                            "Yüzer Elif Elif diye\n" +
                            "\n" +
                            "Karac´oğlan eğmelerin\n" +
                            "Gönül sevmez değmelerin\n" +
                            "İliklenmiş düğmelerin\n" +
                            "Çözer Elif Elif diye\n" +
                            "\n"},
            {"Derdim Başka",
                    "\nSanma ki derdim güneşten ötürü;\n" +
                            "\n" +
                            "Ne çıkar bahar geldiyse?\n" +
                            "\n" +
                            "Bademler çiçek açtıysa?\n" +
                            "\n" +
                            "Ucunda ölüm yok ya.\n" +
                            "\n" +
                            "Hoş, olsa da korkacakmıyım zaten.\n" +
                            "\n" +
                            "Güneşle gelecek ölümden?\n" +
                            "\n" +
                            "Ben ki her nisan bir yaş daha genç,\n" +
                            "\n" +
                            "Her bahar biraz daha aşığım;\n" +
                            "\n" +
                            "Korkarmıyım?\n" +
                            "\n" +
                            "Ah, dostum derdim başka...\n" +
                            "\n"},
            {"Baharın İlk Sabahları",
                    "\nTüyden hafif olurum böyle sabahlar;\n" +
                            "Karşı damda bir güneş parçası,\n" +
                            "İçimde kuş cıvıltıları, şarkılar;\n" +
                            "Bağıra çağıra düşerim yollara;\n" +
                            "Döner döner durur başım havalarda.\n" +
                            "\n" +
                            "Sanırım ki günler hep güzel gidecek;\n" +
                            "Her sabah böyle bahar;\n" +
                            "Ne iş güç gelir aklıma, ne yoksulluğum;\n" +
                            "Derim ki :\"Sıkıntılarım duradursun!\"\n" +
                            "Şairliğimle yetinir,\n" +
                            "Avunurum."},
            {"Ah! Neydi Benim Gençliğim",
                    "\nNerde böyle hüzünlenmek o zaman;\n" +
                            "İçip içip ağlamak,\n" +
                            "Uzaklara dalıp şarkı söylemek;\n" +
                            "Hafta sekiz ben eğlentide;\n" +
                            "Bugün saz,yarın sinema,\n" +
                            "Beğenmedin Aile Bahçesi;\n" +
                            "Onu da beğenmedin,parka;\n" +
                            "Sevdiğim dillere destan;\n" +
                            "Sevdiğim,\n" +
                            "Meyil verdiğim;\n" +
                            "Ben dizinin dibinde elpençe divan,\n" +
                            "Samanlık seyran.\n" +
                            "Nerde,\n" +
                            "Nerde,\n" +
                            "Nerde böyle hüzünlenmek o zaman!"},
            {"Dağ Başı",
                    "\nDağ başındasın;\n" +
                            "Derdin günün hasretlik;\n" +
                            "Akşam olmuş,\n" +
                            "Günes batmış,\n" +
                            "İçmeyip de ne haltedeceksin?"},
            {"Maniler",
                    "\nSen gül dalında gonca,\n" +
                            "Ben dağ yolunda yonca.\n" +
                            "Sen açılıp gülersin,\n" +
                            "Ben sararıp solunca!\n" +
                            "\n" +
                            "* * *\n" +
                            "\n" +
                            "Sevdi aldattı beni;\n" +
                            "Güldü, ağlattı beni!\n" +
                            "Gittim kölesi oldum;\n" +
                            "Götürdü sattı beni!\n" +
                            "\n" +
                            "* * *\n" +
                            "\n" +
                            "Can işte... Canan hani?\n" +
                            "Dert işte!... Derman hani?\n" +
                            "Gönül sarayı bomboş,\n" +
                            "Beklenen sultan hani?"},
            {"Annemle Hasbihal",
                    "\nAnne, zannetme ki günler geçti de\n" +
                            "Değişti evvelki hissim gitgide!\n" +
                            "Bir hırçın çocuğum, değişmez huyum;\n" +
                            "Seneler geçse de ben yine buyum!\n" +
                            "Senden umuyorum teselli yine!\n" +
                            "Bugün şefkatine, muhabbetine\n" +
                            "Zanneder misin ki yok ihtiyacım?\n" +
                            "Belki eskisinden daha muhtacım!\n" +
                            "Dünyanın tükenmez kederlerinden\n" +
                            "Kalbim kırılsa da böyle derinden,\n" +
                            "Hayatım büsbütün ye´se kapılmaz.\n" +
                            "Teselli bulurum içimde biraz\n" +
                            "O derin sevgini hatırlarım da!\n" +
                            "Her gece hıçkıran dudaklarımda\n" +
                            "Hasretle anılan senin adın var.\n" +
                            "Anne, hayatımda bir tek kadın var.\n" +
                            "Beni aldatmadı, sevdi daima!\n" +
                            "Gittikçe ruhumu saran bu humma\n" +
                            "Başka sevgilerden yadigâr, anne!\n" +
                            "Sevmeyen sevenden bahtiyar, anne!\n" +
                            "\n" +
                            "Sorma ki başımdan çok şey geçti mi?\n" +
                            "Ah... eğer anlatsam sergüzeştimi!\n" +
                            "Nasıl terk edildim, nasıl atıldım;\n" +
                            "Anne aldatıldım, ah aldatıldım,\n" +
                            "Belki her zamandan fazla severken.\n" +
                            "Bir lahza bahtiyar olayım derken,\n" +
                            "Bilmezsin kaç gece böyle ağladım!\n" +
                            "Şimdi tecrübem var, artık anladım:\n" +
                            "Aşk, o bir masalmış, yalanmış meğer!\n" +
                            "Seven bir kalp için sığınılacak yer\n" +
                            "Yalnız o kucakmış, yalnız o dizmiş...\n" +
                            "İnsanlar ne kadar merhametsizmiş.\n" +
                            "\n"},
            {"Vedaa",
                    "\nHani, o bırakıp giderken seni\n" +
                            "Bu öksüz tavrını takmayacaktın?\n" +
                            "Alnına koyarken vedâ busemi,\n" +
                            "Yüzüme bu türlü bakmayacaktın?\n" +
                            "\n" +
                            "Hani, ey gözlerim bu son vedâda,\n" +
                            "Yolunu kaybeden yolcunun dağda,\n" +
                            "Birini çağırmak için imdada\n" +
                            "Yaktığı ateşi yakmayacaktın?\n" +
                            "\n" +
                            "Gelse de en acı sözler dilime,\n" +
                            "Uçacak sanırım birkaç kelime...\n" +
                            "Bir alev halinde düştün elime,\n" +
                            "Hani, ey gözyaşım akmayacaktın?\n" +
                            "\n"},
            {"O Beyaz Bir Kuştu",
                    "\nO, beyaz bir kuştu, uzun kanatlı;\n" +
                            "Ardında ışıktan bir iz bıraktı.\n" +
                            "Yel gibi dağları aştı bir atlı\n" +
                            "Arada bir engin deniz bıraktı.\n" +
                            "\n" +
                            "Uzaktan gelirken derin akisler,\n" +
                            "Kapadı geçtiğim yolları sisler.\n" +
                            "Tutuştu içimde birikmiş hisler;\n" +
                            "Gönlümü o kadar temiz bıraktı.\n" +
                            "\n" +
                            "O, beyaz bir kuştu, ak kanatlıydı;\n" +
                            "Yel gibi dağları aşan atlıydı;\n" +
                            "Hayâldi, hayâlden bile tatlıydı;\n" +
                            "Ne ışık bıraktı, ne iz bıraktı!\n" +
                            "\n"},
            {"Diyorlar",
                    "\nÖlürsem yazıktır sana kanmadan\n" +
                            "Kollarım boynunda halkalanmadan\n" +
                            "Bir günüm geçmiyor seni anmadan\n" +
                            "Derdine katlandım hiç usanmadan\n" +
                            "Diyorlar: \"Kül olmaz ateş yanmadan\n" +
                            "Denizler durulmaz dalgalanmadan!\"\n" +
                            "\n" +
                            "Saadet benziyor boş bir seraba\n" +
                            "Düşüyor her seven gönül azaba\n" +
                            "Gelmiyor çekilen dertler hesaba\n" +
                            "Diyorum: \"Sebep ne bu ızdıraba?\"\n" +
                            "Diyorlar: \"Kül olmaz ateş yanmadan\n" +
                            "Denizler durulmaz dalgalanmadan!\n" +
                            "\n"},
            {"Gönlüm",
                    "\nBenim gönlüm bir kelebek\n" +
                            "Dolaşıyor çiçek çiçek.\n" +
                            "Tükenecek ömrü böyle\n" +
                            "Çırpınarak, titreyerek\n" +
                            "\n" +
                            "Ne şerefli bir adı var,\n" +
                            "Ne bir büyük maksadı var.\n" +
                            "Her gün biraz zedelenen\n" +
                            "İki ipek kanadı var!\n" +
                            "\n" +
                            "Sabırlıdır, gözü toktur,\n" +
                            "Zavallının derdi çoktur.\n" +
                            "Yorulunca konacağı\n" +
                            "Bir yuvası bile yoktur.\n" +
                            "\n" +
                            "Her şey ona karşı durur:\n" +
                            "Güneş yakar, kış dondurur.\n" +
                            "Bazı tutar kanadından\n" +
                            "Bir fırtına yere vurur.\n" +
                            "\n" +
                            "Benim gönlüm bir kelebek\n" +
                            "Dolaşıyor titreyerek.\n" +
                            "Zavallının bir baharlık\n" +
                            "Ömrü böyle tükenecek!\n" +
                            "\n"},
            {"Bir Gün",
                    "\nHangi zorluğu\n" +
                            "yenmemiş insanoğlu.\n" +
                            "Hele taşıyorsa içinde\n" +
                            "bu insanca sevgiyi.\n" +
                            "Güzel günler\n" +
                            "zorlu duraklardan\n" +
                            "geçer sevdiğim.\n" +
                            "Damla damla\n" +
                            "birikiyor insan.\n" +
                            "Damla damla sevgili...\n" +
                            "Bir gün\n" +
                            "akıp gideceğiz hayata.\n" +
                            "Duvarlar yıkılacak,\n" +
                            "açılacak bütün kapılar\n" +
                            "bilesin.\n" +
                            "Benim yüreğim\n" +
                            "sensin şimdi\n" +
                            "seni vurur durur...\n" +
                            "Ve yine damla damla\n" +
                            "çoğalıyorsun içimde.\n" +
                            "\n"},
            {"Eskiden Bilmezdim Yalnızlığı",
                    "\nEskiden bilmezdim yalnızlığı\n" +
                            "Bir ağaç nasıl yalnız değilse ormanında\n" +
                            "Bir çiçek kendi dalında\n" +
                            "Eskiden bilmezdim yalnızlığı\n" +
                            "Yalnızlığın içinde\n" +
                            "Şimdi yalnız, yalnız mıyım\n" +
                            "Kopuk muyum dalımdan\n" +
                            "Uzağında mı kaldım ormanın"},
            {"Köprü",
                    "\nSevgili\n" +
                            "yetmiyor ´sevgili´ sözü\n" +
                            "tek başına. Karşılamıyor\n" +
                            "içimi dolduran duyguyu.\n" +
                            "Oysa ben ´sevgili´\n" +
                            "derken neler\n" +
                            "düşünüyorum bilsen.\n" +
                            "Sonsuz, bir güneş\n" +
                            "bir yudum rakı\n" +
                            "çiçeğe durmuş ince bir\n" +
                            "bahar dalı\n" +
                            "oğlumun sıcak yanağı\n" +
                            "anamın acılı gözleri\n" +
                            "babamın tütün kokan eli\n" +
                            "evimizdeki kuş\n" +
                            "yarının güzel günleri.\n" +
                            "Anlatılması güç binlerce\n" +
                            "duygu ve sen...\n" +
                            "İşte sen\n" +
                            "beni hayata bağlayan\n" +
                            "en güzel köprüsün;\n" +
                            "köprülerin en güzelisin.\n" +
                            "Sevgilim... Güzelim...\n" +
                            "İnsanı yaşatan\n" +
                            "içimizdeki hayat böceğidir.\n" +
                            "O ölürse\n" +
                            "hayatımızın da tadı biter.\n" +
                            "O sakın ölmesin\n" +
                            "yaşat onu.\n" +
                            "\n"},
            {"Canım",
                    "\nCanım, sevdiğim, yüreğim\n" +
                            "Bu duvarlar bizi ayırmaya yetmez bilesin\n" +
                            "Bu kapılar, bu demir parmaklıklar hava inan\n" +
                            "Bazen bir yumrukta yıkacak kadar güçlü\n" +
                            "Bazen bir serçe kadar güçsüzsem bir nedeni vardır\n" +
                            "hangi zorluğu yenmemiş insanoğlu\n" +
                            "Hele taşıyorsa içinde bu insanca sevgiyi"},
            {"Canım, Sevdiğim, Yüreğim","\nCanım, Sevdiğim, Yüreğim\n" +
                    "\n" +
                    "Bu duvarlar yetmiyor bizi ayırmaya bilesin...\n" +
                    "Bu parmaklıklar, bu demir kapılar, bu hava, inan...\n" +
                    "Bazen bir yumrukta yıkacak kadar güçlü,\n" +
                    "Bazen bir serçe kadar güçsüzsem, bir nedeni vardır...\n" +
                    "Hangi zorluğu yenmemiş insanoğlu.\n" +
                    "Hele taşıyorsa içinde bu insanca sevgiyi.\n" +
                    "Güzel günler zorlu duraklardan geçer sevdiğim.\n" +
                    "Damla damla birikiyor insan.\n" +
                    "Damla damla sevgili...\n" +
                    "Bir gün akıp gideceğiz hayata...\n" +
                    "Duvarlar yıkılacak, açılacak bütün kapılar bilesin.\n" +
                    "Benim yüreğim sensin şimdi, seni vurur durur...\n" +
                    "Ve yine damla damla çoğalıyorsun içimde.\n" +
                    "\n"},
            {"Mutlu Olma Şansı",
                    "\nHayat bize mutlu olma şansı vermedi sevgili\n" +
                            "biz kendimizden başka herkesin üzüntüsünü üzüntümüz, acısını\n" +
                            "acımız yaptık çünkü.\n" +
                            "Dünyanın öbür ucunda hiç tanımadığımız bir insanın gözyaşı bile\n" +
                            "içimizi parçaladı.\n" +
                            "Kedilere ağladık, kuşların yasını tuttuk...\n" +
                            "Yüreğimizin zayıflığı kimi zaman hayat karşısında bizi zayıf yaptı.\n" +
                            "Aslında ne güzel şeydir insanın insana yanması sevgili...\n" +
                            "Ne güzeldir bilmediğ...Hayat bize mutlu olma şansı vermedi sevgili\n" +
                            "biz kendimizden başka herkesin üzüntüsünü üzüntümüz, acısını\n" +
                            "acımız yaptık çünkü.\n" +
                            "Dünyanın öbür ucunda hiç tanımadığımız bir insanın gözyaşı bile\n" +
                            "içimizi parçaladı.\n" +
                            "Kedilere ağladık, kuşların yasını tuttuk...\n" +
                            "Yüreğimizin zayıflığı kimi zaman hayat karşısında bizi zayıf yaptı.\n" +
                            "Aslında ne güzel şeydir insanın insana yanması sevgili...\n" +
                            "Ne güzeldir bilmediğin birinin derdine üzülebilmek ve çare aramak.\n" +
                            "Ben bütün hayatımda hep üzüldüm, hep yandım.\n" +
                            "Yaşamak ne güzeldir be sevgili...\n" +
                            "Sevinerek, severek, sevilerek, düşünerek...\n" +
                            "Ve o vazgeçilmez sancılarını duyarak hayatın...\n" +
                            "\n"},
            {"Hüsran",
                    "\nBen böyle bakıp durmayacaktım, dili bağlı,\n" +
                            "İslâmı uyandırmak için haykıracaktım.\n" +
                            "Gür hisli, gür imanlı beyinler, coşar ancak,\n" +
                            "Ben zaten uzun boylu düşünmekten uzaktım?\n" +
                            "Haykır! Kime, lâkin? Hani sâhipleri yurdun?\n" +
                            "Ellerdi yatanlar, sağa baktım, sola baktım;\n" +
                            "Feryâdımı artık boğarak, na´şını, tuttum,\n" +
                            "Bin parça edip şi´rime gömdüm de bıraktım.\n" +
                            "Seller gibi vâdîyi enînim saracakken,\n" +
                            "Hiç çağlamadan, gizli inen yaş gibi aktım.\n" +
                            "Yoktur elemimden şu sağır kubbede bir iz;\n" +
                            "İnler \"Safahât\"ımdaki husran bile sessiz!\n" +
                            "\n"},
            {"Şeytan",
                    "\nAnadolu´da bir köy\n" +
                            "Köyün içinde bir ev\n" +
                            "Evin içinde bir adam\n" +
                            "Adamın içinde bir şeytan\n" +
                            "Kezban...Kezban"},
            {"Cenk Marşı",
                    "\ney sürüden arkaya kalmış yiğit\n" +
                            "arkadaşın gitti haydi sen de git\n" +
                            "bak ne diyor ceddi şehidin işit\n" +
                            "haydi git evladım uğurlar ola\n" +
                            "haydi git evladım açıktır yolun\n" +
                            "zalimlere karşı bükülmez kolun\n" +
                            "bayrağı çek ön safa geçmiş bulun\n" +
                            "uğurun açık olsun uğurlar ola.\n" +
                            "\n" +
                            "eşele bir yerleri örten karı\n" +
                            "ot değil onlar dedenin saçları\n" +
                            "dinle şehit sesleridir rüzgarı\n" +
                            "haydi git evladım uğurlar ola\n" +
                            "haydi git evladım açıktır yolun\n" +
                            "zalimlere karşı bükülmez kolun\n" +
                            "bayrağı çek on safa geçmiş bulun\n" +
                            "uğurun açık olsun uğurlar ola\n" +
                            "haydi levent asker uğurlar ola\n" +
                            "\n" +
                            "yerleri yırtan sel olup taşmalı\n" +
                            "dağ demeyip taş demeyip aşmalı\n" +
                            "sende ki coşkunluğa er şaşmalı\n" +
                            "kahraman askerim uğurlar ola\n" +
                            "haydi git evladım açıktır yolun\n" +
                            "zalimlere karşı bükülmez kolun\n" +
                            "bayrağı çek ön safa geçmiş bulun\n" +
                            "haydi levent asker uğurlar ola\n" +
                            "haydi git evladım uğurlar ola.\n" +
                            "\n"},
            {"Bülbül",
                    "\nBütün dünyâya küskündüm, dün akşam pek bunalmıştım;\n" +
                            "Nihayet, bir zaman kırlarda gezmiş, köyde kalmıştım.\n" +
                            "Şehirden kaçmak isterken sular zaten kararmıştı,\n" +
                            "Pek ıssız bir karanlık sonradan vâdiyi sarmıştı.\n" +
                            "Işık yok, yolcu yok, ses yok, bütün hılkat kesilmiş lâl...\n" +
                            "Bu istiğrâkı tek bir nefha olsun etmiyor ihlâl\n" +
                            "Muhîtin hâli \"insâniyyet\"in timsâlidir, sandım;\n" +
                            "Dönüp mâzîye tırmandım, ne hicranlar, neden andım!\n" +
                            "\n" +
                            "Taşarken haşrolup beynimden artık bin müselsel yâd,\n" +
                            "Zalâmın sinesinden fışkıran memdûd bir feryâd,\n" +
                            "0 müstağrak, o durgun vecdi nâgâh öyle coşturdu\n" +
                            "Ki vâdiden bütün, yer yer, enînler çağlayıp durdu.\n" +
                            "Ne muhrik nağmeler, yâ Rab, ne mevcâmevc demlerdi;\n" +
                            "Ağaçlar, taşlar ürpermişti, gûya Sûr-i Mahşerdi!\n" +
                            "\n" +
                            "-Eşin var, âşiyanın var, baharın var, ki beklerdin;\n" +
                            "Kıyâmetler koparmak neydi, ey bülbül, nedir derdin ?\n" +
                            "0 zümrüd tahta kondun, bir semâvî saltanat kurdun;\n" +
                            "Cihânın yurdu hep çiğnense, çiğnenmez senin yurdun,\n" +
                            "Bugün bir yemyeşil vâdi, yarın bir kıpkızıl gülşen,\n" +
                            "Gezersin, hânmânın şen, için şen, kâinatın şen.\n" +
                            "Hazansız bir zemin isterse, şâyed rûh-i ser-bâzın,\n" +
                            "Ufuklar, bu´d-i mutlaklar bütün mahkûm-i pervâzın.\n" +
                            "Değil bir kayda, sığmazsın - kanadlandım mı - eb´âda;\n" +
                            "Hayâtın en muhayyel gayedir ahrâra dünyâda,\n" +
                            "Neden öyleyse mâtemlerle eyyâmın perîşandır?\n" +
                            "Niçin bir damlacık göğsünde bir umman hurûşandır?\n" +
                            "Hayır, mâtem senin hakkın değil... Mâtem benim hakkım:\n" +
                            "Asırlar var ki, aydınlık nedir, hiç bilmez âfâkım!\n" +
                            "Tesellîden nasîbim yok, hazân ağlar bahârımda;\n" +
                            "Bugün bir hânmansız serseriyim öz diyârımda!\n" +
                            "Ne husrandır ki: Şark´ın ben vefâsız, kansız evlâdı,\n" +
                            "Serâpâ Garba çiğnettim de çıktım hâk-i ecdâdı!\n" +
                            "Hayâlimden geçerken şimdi, fikrim herc ü merc oldu,\n" +
                            "SALÂHADDÎN-İ EYYÛBÎ´lerin, FATİH´lerin yurdu.\n" +
                            "Ne zillettir ki: nâkûs inlesin beyninde OSMAN´ın;\n" +
                            "Ezan sussun, fezâlardan silinsin yâdı Mevlâ´nın!\n" +
                            "Ne hicrandır ki: en şevketli bir mâzi serâp olsun;\n" +
                            "O kudretler, o satvetler harâb olsun, türâb olsun!\n" +
                            "Çökük bir kubbe kalsın ma´bedinden YILDIRIM Hân´ın;\n" +
                            "Şenâatlerle çiğnensin muazzam Kabri ORHAN´ın!\n" +
                            "Ne heybettir ki: vahdet-gâhı dînin devrilip, taş taş,\n" +
                            "Sürünsün şimdi milyonlarca me´vâsız kalan dindaş!\n" +
                            "Yıkılmış hânmânlar yerde işkenceyle kıvransın;\n" +
                            "Serilmiş gövdeler, binlerce, yüz binlerce doğransın!\n" +
                            "Dolaşsın, sonra, İslâm´ın harem-gâhında nâ-mahrem...\n" +
                            "Benim hakkım, sus ey bülbül, senin hakkın değil mâtem!\n" +
                            "\n"},
            {"İtiraf",
                    "\nSafahât´ımda, evet, şi´r arayan hiç bulamaz;\n" +
                            "Yalınız, bir yeri hakkında \"hazin işte bu!\" der.\n" +
                            "Küfe? Yok. Kahve? Hayır. Hasta? Değil. Hangisi var ya?\n" +
                            "Üç buçuk nazma gömülmüş koca bir ömr-i heder!"},
            {"Mahalle Kahvesi",
                    "\n...................................................................\n" +
                            "Çamurlu bir kapı, üstünde bir değirmi delik;\n" +
                            "Önünde tahta mı, toprak mı? sorma, pis bir eşik.\n" +
                            "Şu gördüğün yer için her ne söylesen câiz;\n" +
                            "Ahırla farkı: O yemliklidir, bu yemliksiz!\n" +
                            "Zemini yüz sene evvel döşenme malta imiş...\n" +
                            "\"İmiş\"le söylüyorum, çünkü anlamak uzun iş.\n" +
                            "O bir karış kirin altında hangi maden var?\n" +
                            "Tavan açık kuka renginde; sağlı sollu dıvar,\n" +
                            "Maun cilâsına batmış tütünlü nargileden;\n" +
                            "Duman ocak gibi çıkmakta çünkü her lüleden.\n" +
                            "Dikilmiş ortaya boynundan üstü az koyu al.\n" +
                            "Vücudu kapkara, leylek bacaklı bir mangal.\n" +
                            "Kenarda, peykelerin alt başında bir kirli\n" +
                            "Tomar sürükleniyor, bir yatak ki besbelli:\n" +
                            "Çekilmiş üstüne yağmurluğumsu bir pırtı,\n" +
                            "Zavallının güveden hep liyme liyme sırtı.\n" +
                            "Kurur bir örtünün üstünde yağlı bir mendil:\n" +
                            "Ki \"ben tependen inersem\" diyen hasır zembil\n" +
                            "\n" +
                            "Onun hizasına gelmez mi? Bir döner şöyle;\n" +
                            "Sicimle kulpuna ilmikli çifte mestiyle!\n" +
                            "Duvarda eski ocaklar kadar geniş bir oyuk,\n" +
                            "İçinde camlı dolap var ya, raflarında ne yok!\n" +
                            "Birinci katta sülük beslenen büyük kavanoz;\n" +
                            "Onun yanında kan almak için beş on boynuz.\n" +
                            "İkinci katta bütün kerpetenler, usturalar...\n" +
                            "Demek ki kahveci hem diş tabibi, hem perukâr,\n" +
                            "İnanmadınsa değildir tereddüdün sırası;\n" +
                            "Uzun lâkırdıya hâcet ne? İşte mosturası:\n" +
                            "Çekerken etli kemiklerle ayrılıp çeneden,\n" +
                            "Sonunda bir ipe, boy boy, onar onar dizilen\n" +
                            "Şu kazma dişleri sen mahya belledinse, değil;\n" +
                            "Birer mezâra işaret düşün ki her kandil!\n" +
                            ".......................................................................\n" +
                            "Seyirciler mütefekkir, güzide bir tabaka;\n" +
                            "Düşünmelerdeki şiveyse büsbütün başka:\n" +
                            "Kiminde el, filân asla karışmıyorken işe,\n" +
                            "Kiminde durmadan işler benân-ı endîşe!\n" +
                            "Al işte: \"Beyne burundan gerek\" demiş de \"hulûl\"\n" +
                            "Tahharriyat-i amîkayla muttasıl meşgul!\n" +
                            "Mühendis olmalı mutlak şu ak sakallı adam!\n" +
                            "Zemine, daire şeklinde yaydı bir balgam:\n" +
                            "Abanmış olduğu bir yumru yumru değnekle,\n" +
                            "Mümâslar çizerek soktu belki yüz şekle!\n" +
                            "\n"},
            {"Çanakkale Şehitlerine",
                    "\nŞüheda gövdesi, bir baksana dağlar taşlar...\n" +
                            "O, rûkü olmasa, dünyada eğilmez başlar,\n" +
                            "Vurulmuş temiz alnından uzanmış yatıyor;\n" +
                            "Bir hilâl uğruna ya Rab, ne güneşler batıyor!\n" +
                            "Ey, bu topraklar için toprağa düşmüş, asker!\n" +
                            "Gökten ecdâd inerek öpse o pak alnı değer.\n" +
                            "Ne büyüksün ki kanın kurtarıyor Tevhid´i...\n" +
                            "Bedr´in aslanları ancak, bu kadar şanlı idi...\n" +
                            "Sana dar gelmeyecek makberi kimler kazsın?\n" +
                            "\"Gömelim gel seni tarihe!\" desem, sığmazsın.\n" +
                            "Herc u merc ettiğin edvara ya yetmez o kitab...\n" +
                            "Seni ancak ebediyyetler eder istiab.\n" +
                            "\"Bu, taşındır\" diyerek Kabe´yi diksem başına;\n" +
                            "Ruhumun vahyini duysam da geçirsem taşına;\n" +
                            "Sonra gök kubbeyi alsam da, rida namiyle,\n" +
                            "Kanayan lahdine çeksem bütün ecramiyle;\n" +
                            "Mor bulutlarla açık türbene çatsam da tavan;\n" +
                            "Yedi kandilli Süreyya´yı uzatsam oradan;\n" +
                            "Sen bu avizenin altında, bürünmüş kanına,\n" +
                            "Uzanırken gece mehtabı getirsem yanına,\n" +
                            "Türbedarın gibi ta fecre kadar bekletsem;\n" +
                            "Gündüzün fecr ile avizeni lebriz etsem;\n" +
                            "Tüllenen mağribi, akşamları sarsam yarana...\n" +
                            "Yine bir şey yapabildim diyemem hatırana.\n" +
                            "Sen ki, son ehl-i salibin kırarak savletini,\n" +
                            "Şarkın en sevgili sultanı Selahaddin´i,\n" +
                            "Kılıç Arslan gibi iclaline ettin hayran...\n" +
                            "Sen ki İslam´ı kuşatmış, boğuyorken hüsran,\n" +
                            "O demir çemberi göğsünde kırıp parçaladın;\n" +
                            "Sen ki, ruhunla beraber gezer ecramı adın;\n" +
                            "Sen ki; a´sara gömülsen taşacaksın... Heyhat,\n" +
                            "Sana gelmez bu ufuklar, seni almaz bu cihat...\n" +
                            "Ey şehid oğlu şehid, isteme benden makber,\n" +
                            "Sana ağuşunu açmış duruyor Peygamber.\n" +
                            "\n"},
            {"Kıssadan Hisse",
                    "\nGeçmişten adam hisse kaparmış... Ne masal şey!\n" +
                            "Beş bin senelik kıssa yarım hisse mi verdi?\n" +
                            "\"Tarih\"i \"tekerrür\" diye tarif ediyorlar;\n" +
                            "Hiç ibret alınsaydı, tekerrür mü ederdi?"},
            {"Zulmü Alkışlayamam",
                    "\nZulmü alkışlayamam, zalimi asla sevemem;\n" +
                            "Gelenin keyfi için geçmişe kalkıp sövemem.\n" +
                            "Biri ecdadıma saldırdımı,hatta boğarım!...\n" +
                            "-Boğamazsın ki!\n" +
                            "-Hiçolmazsa yanımdan kovarım.\n" +
                            "Üçbuçuk soysuzun ardından zağarlık yapamam;\n" +
                            "Hele hak namına haksızlığa ölsem tapamam.\n" +
                            "Doğduğumdan beridir, aşığım istiklale;\n" +
                            "Bana hiç tasmalık etmiş değil altın lale!\n" +
                            "Yumuşak başlı isem, kim dedi uysal koyunum\n" +
                            "Kesilir belki, fakat çekmeye gelmez boyunum!\n" +
                            "Kanayan bir yara gördümmü yanar ta ciğerim,\n" +
                            "Onu dindirmek için kamçı yerim, çifte yerim!\n" +
                            "Adam aldırmada geç git, diyemem aldırırım.\n" +
                            "Çiğnerim, çiğnenirim, hakkı tutar kaldırırım!\n" +
                            "Zalimin hasmıyım amma severim mazlumu...\n" +
                            "İrticanın şu sizin lehçede ma'nası bu mu?\n" +
                            "\n"},
            {"Ey Yolcu",
                    "\nGitme, ey yolcu, beraber oturup ağlaşalım:\n" +
                            "Elemim bir yüreğin kârı değil, paylaşalım:\n" +
                            "Ne yapıp ye'simi kahreyleyeyim, bilmem ki?\n" +
                            "Öyle dehşetli muhitimde dönen matem ki!..\n" +
                            "Ah! Karşımda vatan namına bir kabristan,\n" +
                            "Yatıyor şimdi... Nasıl yerlere geçmez insan?\n" +
                            "Şu mezarlar ki uzanmış gidiyor, ey yolcu,\n" +
                            "Nereden başladı yükselmeye, bak, nerde ucu!"},
            {"Her gecemi bir Uykusuzluk",
                    "\nHer gece mi bu uykusuzluk!\n" +
                            "Hele saatin tıkırtısı!\n" +
                            "Ya karasinek düşünceler!\n" +
                            "Çıldıracağım bu gidişle;\n" +
                            "Yatak değil sanki cehennem.\n" +
                            "\n" +
                            "Deliksiz bir uykuysa vaadin,\n" +
                            "Günün dolmuş veya dolmamış,\n" +
                            "Gençliğime filan bakmadan,\n" +
                            "Derhal gelebilirsin ölüm;\n" +
                            "Kapı açıktır, lamba sönük."},
            {"İnsanoğlu",
                    "\nAdem´le Havva´dan geldiğim doğru;\n" +
                            "Vuruldum bir kere elma dalına\n" +
                            "Hala aklımda o Tufan yağmuru;\n" +
                            "Şükür çıktığıma Nuh´un salına.\n" +
                            "\n" +
                            "Ölmek varsa günün birinde gayri,\n" +
                            "Göz nuru, el emeği, alın teri\n" +
                            "Yaşadığım iyi kötü günleri\n" +
                            "Değişmem hiçbir cennet masalına."},
            {"Yalnızlık",
                    "\nGeniş, siyah gölgesi hayatımı kaplayan,\n" +
                            "Tepemde kanat germiş bir kartaldır yalnızlık.\n" +
                            "Kalp çarpıntılarıyla günleri hesaplayan\n" +
                            "Bir benim, benim olan bir masaldır yalnızlık.\n" +
                            "\n" +
                            "Gördüm yapraklarımın bir bir döküldüğünü,\n" +
                            "Baharda yaşamanın bilmedim nedir tadı.\n" +
                            "Gemi yüzü görmeyen bir limanın hüznünü\n" +
                            "Kimsesiz gönlüm kadar hiçbir gönül duymadı.\n" +
                            "\n" +
                            "Bir ayna parçasından başka beni kim anlar,\n" +
                            "Bir mum gibi erirken bu bitmeyen düğünde?\n" +
                            "Bir kardeş tesellisi verir bana aynalar;\n" +
                            "Aynalar da olmasa işim ne yeryüzünde?"},
            {"Esmer Güzeli Yarim",
                    "\nBu meltemli geceler,\n" +
                            "Su sesi, ayışığı,\n" +
                            "Uzayan türküleri\n" +
                            "Cırcır böceklerinin,\n" +
                            "Bu cümbüş, bu muhabbet\n" +
                            "Bu tatlı uykusuzluk,\n" +
                            "Hep senin şerefine,\n" +
                            "Esmer güzeli yarim..."},
            {"Karasevda",
                    "\nBir kere sevdaya tutulmaya gör;\n" +
                            "Ateşlere yandığının resmidir.\n" +
                            "Aşık dediğin, Mecnun misali kör;\n" +
                            "Ne bilsin alemde ne mevsimidir.\n" +
                            "\n" +
                            "Dünya bir yana, o hayal bir yana;\n" +
                            "Bir meşaledir pervaneyim ona.\n" +
                            "Altında bir ömür dönedolana\n" +
                            "Ağladığım yer penceresi midir?\n" +
                            "\n" +
                            "Bir köşeye mahzun çekilen için,\n" +
                            "Yemekten içmekten kesilen için,\n" +
                            "Sensiz uykuyu haram bilen için,\n" +
                            "Ayrılık ölümün diğer ismidir\n" +
                            "\n"},
            {"Bir Umut",
                    "\nYorgunsun,uzaklardan gelmişsin;\n" +
                            "Yitirmişsin neyin varsa birer birer.\n" +
                            "Bir sağlık,bir sevinç,bir umut...\n" +
                            "Onlar da neredeyse gitti gider.\n" +
                            "\n" +
                            "Dost bildiğin insanların yüzleri\n" +
                            "Aynalar gibi kapkara.\n" +
                            "Suyu mu çekilmiş bulutların?\n" +
                            "Dönmüşsün kuruyan ırmaklara.\n" +
                            "\n" +
                            "Taşlara düşen saat gibi,\n" +
                            "Ne artı, ne eksi.\n" +
                            "Bir sağlık,bir sevinç,bir umut\n" +
                            "Hikaye hepsi."},
            {"Tanımadı",
                    "\nTürküm müjdeydi ülkeye\n" +
                            "Gezdim söyleye söyleye\n" +
                            "Bir gün söylemedim diye\n" +
                            "Türküm beni tanımadı\n" +
                            "\n" +
                            "Onlar bacım,onlar ağam\n" +
                            "Onlardır sevincim tasam\n" +
                            "Ahmet'im, Mehmet´im, Suna'm\n" +
                            "Güllü'm beni tanımadı\n" +
                            "\n" +
                            "Elimde doğmuş kuzular\n" +
                            "Bir gün benden soğudular\n" +
                            "Sordum ne oldunuz ne var\n" +
                            "Sürüm beni tanımadı\n" +
                            "\n" +
                            "Daha dün sözleştik şurda\n" +
                            "Düğün hazırladım Yurda\n" +
                            "Eller beni tanıdı da\n" +
                            "Sözlüm beni tanımadı\n" +
                            "\n" +
                            "Yine sizinleyim dedim\n" +
                            "Nasılsam öyleyim dedim\n" +
                            "Çıkıp ta söyleyim dedim\n" +
                            "Karım beni tanımadı\n" +
                            "\n" +
                            "Hırpalanmak ne kelime\n" +
                            "Didik didik lime lime\n" +
                            "Götürülürken ölüme\n" +
                            "Ölüm beni tanımadı\n" +
                            "\n"},
            {"Ağıt",
                    "\nAğlayın, parmakları nur\n" +
                            "Sularından kınalı kızlarım\n" +
                            "Ağlasın Meraga göklerinden\n" +
                            "Meraga´ya bakıp yıldızlarım\n" +
                            "\n" +
                            "Yollara Kürşadlar uzanmış ölü\n" +
                            "Ağlasın Akülke, ağlasın Sütgölü\n" +
                            "Yiğitlerim uyur gurbet ellerde\n" +
                            "Kimi Semerkant´ta bekler beni\n" +
                            "Kimi Caber´de\n" +
                            "\n" +
                            "Caber yok, Tiyanşan yok, Aral yok\n" +
                            "Ben nasıl varım?\n" +
                            "Ağla ey Tanrı dağlarıdan\n" +
                            "İndirilmiş Tanrım\n" +
                            "\n" +
                            "Şu yakın suların\n" +
                            "Kolu neden bükülmez\n" +
                            "Fırat niçin, Dicle niçin, Aras niçin\n" +
                            "Benden doğar, bana dökülmez?\n" +
                            "\n" +
                            "Ben ki ataeşle konuşurdum.selle konuşurdum\n" +
                            "İdil´le Tuna´yla Nil´le konuşurdum\n" +
                            "\"Sangaryos\"u \"Sakarya\" yapan\n" +
                            "\"İkonyom\"u \"Konya\" yapan\n" +
                            "Dille konuşurdum.\n" +
                            "\n"},
            {"Tanrıya Sesleniş",
                    "\nElsizlere el,dilsizlere dil ver yeniden,\n" +
                            "Lütfet,bize bin şanlı nesil ver yeniden,\n" +
                            "Dünyayı alıp avcuna bir gün Tanrım,\n" +
                            "Avcunda bu dünyaya şekil ver yeniden."},
            {"Mavi",
                    "\nKayıklarla kayıkçılar\n" +
                            "\n" +
                            "Dalgıçlarla balıkçılar\n" +
                            "\n" +
                            "Bilirsin:ne ister,deniz!\n" +
                            "\n" +
                            "Kendini bu isteklerin:\n" +
                            "\n" +
                            "Yelkenlerin küreklerin\n" +
                            "\n" +
                            "Altına seriver, deniz!\n" +
                            "\n" +
                            "Balıkların,kandillerin\n" +
                            "\n" +
                            "Ne varsa olsun ellerin\n" +
                            "\n" +
                            "Bana mavini ver deniz!\n" +
                            "\n"},
            {"Kanatlar",
                    "\nYaşamaktan mı yorgunum,bilmem\n" +
                            "Seni günlerce beklemekten mi?\n" +
                            "Yine yoldan geyik geyik sekişin\n" +
                            "Gün sönerken mi,ay batarken mi?\n" +
                            "Söyle:Memnun musun uzaklarda\n" +
                            "Yuvan aydın gönülcüğün şen mi?\n" +
                            "\n" +
                            "Yine kalsın mı, dizlerimde başın\n" +
                            "Yine koynumda can çekişsen mi...\n" +
                            "Kim sorar,ey hayat,kim düşünür\n" +
                            "Ki vakit geç mi yoksa erken mi?\n" +
                            "\n" +
                            "Söyle:Memnun musun uzaklarda\n" +
                            "Yuvan aydın gönülcüğün şen mi?\n" +
                            "\n" +
                            "Gökte kanatlar bizimdi...bilmezdik\n" +
                            "Bu hafiflik kanat mı yelken mi;\n" +
                            "Anlamaz,anlamazdık Allahım\n" +
                            "Böyle yekpare can mıyız ten mi?\n" +
                            "\n" +
                            "Söyle:Memnun musun uzaklarda\n" +
                            "Yuvan aydın gönülcüğün şen mi?\n" +
                            "\n" +
                            "Bilemem:Gizli gizli´gel´dediğin\n" +
                            "Başka bir aşina mıdır,ben mi;\n" +
                            "Kadehinden mi sarhoşum hala\n" +
                            "Kadehlerinden mi?\n" +
                            "\n" +
                            "Söyle:Memnun musun uzaklarda\n" +
                            "Yuvan aydın gönülcüğün şen mi?\n" +
                            "\n"},
            {"Dağlar",
                    "\nÇekmece´den Maltepe´den ileri\n" +
                            "Gitmemiş Sâdâbâd çelebileri\n" +
                            "Alem tepesine Alemdağ derler...\n" +
                            "Böyle bilmiş böyle yazmış eserler.\n" +
                            "\n" +
                            "Dağlar var karanlık, dağlar var beyaz.\n" +
                            "Korka korka eteğinden öper yaz;\n" +
                            "Ağrıdağ, Babadağ, Gâvurdağ, Ilgaz\n" +
                            "Kubbelerdir...dolaşır, aşılmaz.\n" +
                            "\n" +
                            "Tendürük´te, Kop´ta Palandöken´de\n" +
                            "Kurtların payı var gelip geçende...\n" +
                            "Ki alırlar vermek istemesen de!\n" +
                            "\n" +
                            "Dağlar var, tahtından inmeyen sultan\n" +
                            "Dağlar var, yapılmış bundan, buluttan...\n" +
                            "Dağlar var ki Bingöl, Binboğa, Süphan,\n" +
                            "\n" +
                            "Medetsiz´ler, Mor´lar, Nur´lar, Yıldız´lar;\n" +
                            "Karalar, Kızıllar, Bozlar, yağızlar...\n" +
                            "Karla dolar ´İmdat´ diyen ağızlar;\n" +
                            "Yollar kesen, haraç alan dağlar var.\n" +
                            "\n" +
                            "Bolkarda çamların sakızı damlar...\n" +
                            "Ve bir yıldız düşer, tutuşur çamlar...\n" +
                            "Bir kızıl şehrâyin olur akşamlar...\n" +
                            "Tacı olan, tahtı olan dağlar var.\n" +
                            "\n" +
                            "Tüter Sarıçiçek, burcu burcudur,\n" +
                            "Akşamlar ya mor, ya turuncudur.\n" +
                            "Ve kışın dünyanın öbür ucudur...\n" +
                            "\n" +
                            "Sarkarken Cudinin karları dal dal\n" +
                            "Bağdaş kuradursun yollara Karhal!\n" +
                            "´Ferman padişahın, dağlar bizimdir;´\n" +
                            "Dedi yerde bir kurt, gökte bir kartal.\n" +
                            "\n" +
                            "Dönmez misiniz ey yolda kalanlar;\n" +
                            "Yolcular, garipler, garip çobanlar;\n" +
                            "Allahüekberde tekbir alanlar?\n" +
                            "Ovalar, konaklar, yollar aşırı\n" +
                            "Birbirini selamlayan dağlar var.\n" +
                            "\n" +
                            "Dağlar var, batının yangınında kor...\n" +
                            "Dağlar var; adları Nemrut, Balahor...\n" +
                            "Kayışdağ kim, alemdağ kim oluyor?\n" +
                            "\n" +
                            "Lakin ufukları görünce yoksul\n" +
                            "Dağ yerine kubbe yapmış İstanbul;\n" +
                            "Kurşun şamdanlarda mumlar fildişi...\n" +
                            "Ki pırıltıları sularda pul pul.\n" +
                            "\n"},
            {"Seni",
                    "\nSana vermiş veren sulardan ses\n" +
                            "\n" +
                            "Sana vermiş veren şiirden dil...\n" +
                            "\n" +
                            "Yaratılmışsın ayrı topraktan...\n" +
                            "\n" +
                            "Hamurun,toprağın bizimki değil!\n" +
                            "\n" +
                            "Saçların var,ki başka türlü sarı\n" +
                            "\n" +
                            "Gözlerin var,ki başka türlü yeşil\n" +
                            "\n" +
                            "Yarı olmuş vücudun üstünde\n" +
                            "\n" +
                            "Ne güzel şey çocuk yüzün ,çil çil!\n" +
                            "\n" +
                            "Bu köpükler,bu dalgalar,bu güneş...\n" +
                            "\n" +
                            "Hepsi birden diyor:´Geliş,serpil!´\n" +
                            "\n" +
                            "Nefesin var,ki başka türlü sıcak\n" +
                            "\n" +
                            "Gözlerin var,ki başka türlü yeşil\n" +
                            "\n"},
            {"Masa",
                    "\nÇağırdım geldiler\n" +
                            "Oturmasalar olurdum\n" +
                            "Oturdular oldum.\n" +
                            "Anlamadılar."},
            {"Mum Alevi ile Oynayan Kedinin Öyküsü",
                    "\nBir mum yanıyordu bir evin bir odasında.\n" +
                            "O evde bir kedi vardı.\n" +
                            "Geceler indiğinde kendi havasında\n" +
                            "Mum yanar, kedi de oynardı.\n" +
                            "\n" +
                            "Mumun yandığı gecelerden birinde\n" +
                            "Kedi oyunlarına daldı.\n" +
                            "Oyun arayan gözlerinde\n" +
                            "Mumun alevi yandı,\n" +
                            "Baktı,\n" +
                            "Mumun titrek alevinde\n" +
                            "Oyuna çağıran bir hava vardı.\n" +
                            "\n" +
                            "Oyunlarını büyüten kedi büyüdü\n" +
                            "Kendi türünde çocukcasına,\n" +
                            "Döndü dolaştı, yavaş yavaş yürüdü\n" +
                            "Geldi mum...\n" +
                            "\n"},
            {"Durak",
                    "\nKent küçük bir hışımla büyüyor.\n" +
                            "Büyüyor, büyüyor uğultusu başımda,\n" +
                            "Otoların, motorların uğultusu.\n" +
                            "Tekerlekler dönüyor, dönüyor, dönüyor,\n" +
                            "Işıklar bir yanıyor, bir sönüyor;\n" +
                            "Kırmızı, yeşil, mavi, kırmızı, yeşil.\n" +
                            "Onu düşünüyorum;\n" +
                            "Kimseden saklanacak gibi değil.\n" +
                            "\n" +
                            "Bekleyenler var duraklarda,\n" +
                            "Sıraya girmek için\n" +
                            "Yitirmek yarışını\n" +
                            "Bitirmek için.\n" +
                            "\n" +
                            "Kiminin elinde çanta var, kiminde çiçek;\n" +
                            "Beyaz,..."},
            {"An",
                    "\nGülüş bir yanaşımdır bir öbür kişiye;\n" +
                            "Birden iki kişiyi döndürür bir kişiye..\n" +
                            "Anılarından kale yapıp sığınsa bile,\n" +
                            "Yetmez yalnız başına bir ömür bir kişiye."},
            {"Duygusal",
                    "\nSen ona bir gemisin, yönü senin yönündür\n" +
                            "Bir sancısın geçerken denizlerini özgür\n" +
                            "O da bir ada olsun, sana çevrili dursun\n" +
                            "Dağının dalgalarla, yüzünün rüzgarlarla"},
            {"Hızla Gelişecek Kalbimiz",
                    "\nhızla gelişecek kalbimiz\n" +
                            "kalbimiz hızla.\n" +
                            "sürgünlerin umutsuzluğunda\n" +
                            "kırık kalpler, yaralılar, onulmazlar\n" +
                            "farksız çarpanların umutsuzluğunda\n" +
                            "ve köprü başlarının umutsuzluğunda\n" +
                            "ve köprü başlarının umudunda.\n" +
                            "sular bitse bile, çiçekler atılırken oralara\n" +
                            "temiz bir ilişkinin bulutsuzluğunda\n" +
                            "ve eski dağlarda, eski dağlarda kış\n" +
                            "kovalarken ülkesini\n" +
                            "hızla gelişecek kalbimiz.\n" +
                            "kendi öz hüznümüzün ..."},
            {"Baharı Bekleyene",
                    "\nben kışın güzelliğini söylerim ne gelirse dilime\n" +
                            "çünkü kış bir hazırlıktır soluğuma kıpkırmızı gülüme\n" +
                            "\n" +
                            "nice kırmızı ayaklar gelip geçti o gün katar katar\n" +
                            "kış günleri sözgelişi ben bir çöp bile almadım elime\n" +
                            "\n" +
                            "altı kız bir ay ışığı def çalıp şarkılar söylediler\n" +
                            "beri yanda ormanlar yanardı, ciğerpareler lime\n" +
                            "\n" +
                            "artık su uyur aşk uyanır mendilim kana boyanır\n" +
                            "bilirim bu baharda da herkes hasetleni..."},
            {"Senfoni",
                    "\nÖnce sesin gelir aklıma\n" +
                            "Çaresiz kaldıkça hep seni düşünürüm\n" +
                            "Güzel olan, dolgun başaklardaki sarışın sevinçli\n" +
                            "Sonra cumartesi günleri gelir\n" +
                            "Sonra gökyüzü gelir hemen kurtulurum"},
            {"Palyaço",
                    "\nkaç kişiyi öldürdüm düşlerimde\n" +
                            "kaç kilo çekerdi yalnızlık\n" +
                            "kaç kere ezildim altında\n" +
                            "yaz yağmurlarının\n" +
                            "\n" +
                            "belki de palyaçolar ağlardı pazartesi sabahları\n" +
                            "her sirk geldiğinde ağlamaklı olurduk"},
            {"Camdan",
                    "\nİçkievinden çıkınca\n" +
                            "Camdan\n" +
                            "demin oturduğum yere\n" +
                            "baktım.\n" +
                            "\n" +
                            "Sigara paketimi\n" +
                            "masada unutmuşum.\n" +
                            "Sandalyede\n" +
                            "Tıpkı benim gibi\n" +
                            "Oturuyor boşluğum.\n" +
                            "\n" +
                            "Bir eli alnında\n" +
                            "benim gibi.\n" +
                            "Ama\n" +
                            "biraz daha mı hüzünlü?\n" +
                            "Otururken de\n" +
                            "Biraz daha mı çıkarıyor\n" +
                            "kamburunu?\n" +
                            "\n" +
                            "Biraz daha mı benziyor\n" +
                            "babama?\n" +
                            "\n" +
                            "Bir yaş büyüğüm babamdan\n" +
                            "ve rüzgar\n" +
                            "bir törendeki gibi\n" +
                            "çekiştirir durur\n" +
                            "yağmurluğumu.\n" +
                            "\n"},
            {"Yazmam Daha Aşk Şiiri",
                    "Oydu bir bakışta tanıdım onu\n" +
                            "Kuşlar bakımından uçarı\n" +
                            "Çocuk tutumuyla beklenmedik\n" +
                            "Uzatmış ay aydınlık karanlığıma\n" +
                            "Nerden uzatmışsa tenha boynunu\n" +
                            "\n" +
                            "Dünyanın en güzel kadını oydu\n" +
                            "Saçlarını tarasa baştan başa rumeli\n" +
                            "Otursa ama hiç oturmaz ki\n" +
                            "Kan kadını rüzgardı atların\n" +
                            "Hep andım ne yaşanır olduğunu\n" +
                            "\n" +
                            "En çok neresi mi ağzıydı elbet\n" +
                            "Bütün duyarlıklara ayarlı\n" +
                            "Öpüşlerin türlüsünden elhamra\n" +
                            "Sınırsız denizin..."},
            {"Balzamin",
                    "Sen el kadar bir kadınsındır\n" +
                            "Sabahlara kadar beyaz ve kirpikli.\n" +
                            "Bazı ağaçlara kapı komşu,\n" +
                            "Bazı çiçeklerin andırdığı.\n" +
                            "İş bu kadarla bitse iyi;\n" +
                            "Bir insan edinmişsindir kendine,\n" +
                            "Bir şarkı edinmişsindir, bir umut\n" +
                            "Güzelsindir de oldukça, çocuksundur da\n" +
                            "Saçlarınla beraber penceredeyken\n" +
                            "Besbelli arandığından haberli\n" +
                            "Gemiler eskirken, deniz eskirken limanda\n" +
                            "Sevgili."},
            {"Az Yaşadıksak da",
                    "Ben kibriti çaktığım zaman\n" +
                            "Her şey kırmızıydı yüzün olarak\n" +
                            "Ben kibriti çaktığım zaman\n" +
                            "Çünkü her yüz bir memlekettir\n" +
                            "\n" +
                            "Ben sigaramı yaktığım zaman\n" +
                            "Çünkü her sigara bir kelimedir\n" +
                            "Ben sigaramı yaktığım zaman\n" +
                            "Güz günleriydi bir şarkı olarak\n" +
                            "\n" +
                            "Bir güvercin ben öldüğüm zaman\n" +
                            "Nice hüzünlerden yaprak yaprak\n" +
                            "Bir güvercin ben öldüğüm zaman"},
            {"Çekirge Bulutu",
                    "Çekirge bulutu içinde\n" +
                            "Koynuma soktuğun ekin;\n" +
                            "Çalgılar ikidurur sürgün ilinde,\n" +
                            "Bir gözü mavidir bir gözü bleu.\n" +
                            "\n" +
                            "Gölgede boy atmış top fesleğen,\n" +
                            "Bir ilkokul bahçesinde görmüştüm seni,\n" +
                            "Marienbad ilkokulu, Nişantaş´ta;\n" +
                            "Bir çocuk yeşil örtüyü çekiverdi.\n" +
                            "\n" +
                            "Hızla geçen otobüslerin ardında benzeşmek..\n" +
                            "Keşke yalnız bunun için sevseydim seni."},
            {"Kesik","Sokaktaki adamların gözlerinde yitik\n" +
                    "Nasıl oluyor bir türlü anlamıyorum\n" +
                    "Arada bir barış arada bir gökyüzü\n" +
                    "Her şeyin güzeli aşkla beraber\n" +
                    "Kesik kesik\n" +
                    "\n" +
                    "Hiç durmadı aşk dursa bile dünya\n" +
                    "İnsanlar sevdiler hep bazı insanları\n" +
                    "Gece inmesin gözlere ve sokaklara\n" +
                    "Vücutlar arasında kadınlık erkeklik\n" +
                    "Aşkla ayakta\n" +
                    "\n" +
                    "Ama ne var eskisi gibi değil\n" +
                    "Bir başına değil aşk başka sevilerle koşullu\n" +
                    "Meselâ bar..."},
            {"Unutamadığım",
                    "Açardın, \n" +
                            "Yalnızlığımda \n" +
                            "Mavi ve yeşil, \n" +
                            "Açardın. \n" +
                            "Tavşan kanı, kınalı - berrak. \n" +
                            "Yenerdim acıları, kahpelikleri... \n" +
                            "Gitmek, \n" +
                            "Gözlerinde gitmek sürgüne. \n" +
                            "Yatmak, \n" +
                            "Gözlerinde yatmak zindanı \n" +
                            "Gözlerin hani? \n" +
                            "\"To be or not to be\" değil. \n" +
                            "\"Cogito ergo sum\" hiç değil... \n" +
                            "Asıl iş, anlamak kaçınılmaz'ı, \n" +
                            "Durdurulmaz çığı \n" +
                            "Sonsuz akımı. \n" +
                            "İçmek, \n" +
                            "Gözlerinde içmek ayışığını. \n" +
                            "Varmak, \n" +
                            "Gözlerinde varmak can tılsımına. \n" +
                            "Gözlerin hani? \n" +
                            "Canımın gizlisinde bir can idin ki \n" +
                            "Kan değil sevdamız akardı geceye, \n" +
                            "Sıktıkça cellad, \n" +
                            "Kemendi... \n" +
                            "Duymak, \n" +
                            "Gözlerinde duymak üç - ağaçları \n" +
                            "Susmak, \n" +
                            "Gözlerinde susmak, \n" +
                            "Ustura gibi... \n" +
                            "Gözlerin hani? \n" +
                            "\n"},
            {"Tutuklu",
                    "Birden \n" +
                            "Kurşun yemiş gibi susar \n" +
                            "Gözbebeklerime karşı \n" +
                            "Susar da \n" +
                            "Açılıp yol verir şehir \n" +
                            "Sade radyolarda bir gamlı hava \n" +
                            "\"Elaziz uzun carşı\" \n" +
                            "Firarda gözüm yok \n" +
                            "Namussuzum yok \n" +
                            "Yok pişmanlık bir halim \n" +
                            "Yaslanıp \n" +
                            "Bir cigara yakmak isterim \n" +
                            "Dumanı cevahir değer \n" +
                            "Mağlup mu desem, mahçup mu? \n" +
                            "Ama ikisi de değil \n" +
                            "Ben garip sen güzel \n" +
                            "Dünya umutlu \n" +
                            "Öyle bir tuhafım bu akşamüstü \n" +
                            "Sevgilim \n" +
                            "Canavar götürür gibi \n" +
                            "İki yanım \n" +
                            "İki süngü\n" +
                            "\n"},
            {"Haberin Var mı?",
                    "Haberin var mı taş duvar? \n" +
                            "Demir kapı, kör pencere, \n" +
                            "Yastığım, ranzam, zincirim, \n" +
                            "Uğrunda ölümlere gidip geldiğim \n" +
                            "Zulamdaki mahzun resim. \n" +
                            "Görüşmecim yeşil soğan göndermiş.\n" +
                            "Karanfil kokuyor cigaram \n" +
                            "Dağlarına bahar gelmiş memleketimin... "},
            {"Ay Karanlık",
                    "Maviye, \n" +
                            "Maviye çalar gözlerin, \n" +
                            "Yangın mavisine \n" +
                            "Rüzgarda asi, \n" +
                            "Körsem, \n" +
                            "Senden gayrısına yoksam, \n" +
                            "Bozuksam, \n" +
                            "Can benim, düş benim, \n" +
                            "Ellere nesi? \n" +
                            "Haydi gel, \n" +
                            "Ay karanlık... \n" +
                            "İtten aç, \n" +
                            "Yılandan çıplak, \n" +
                            "Vurgun ve bela \n" +
                            "Gelip durmuşsam kapına \n" +
                            "Var mı ki doymazlığım?\n" +
                            "İlle de ille \n" +
                            "Sevmelerim, \n" +
                            "Sevmelerim gibisi? \n" +
                            "Oturmuş yazıcılar \n" +
                            "Fermanım yazar \n" +
                            "Ne olur gel, \n" +
                            "Ay karanlik... \n" +
                            "Dört yanım puşt zulası, \n" +
                            "Dost yüzlü, \n" +
                            "Dost gülücüklü \n" +
                            "Cigaramdan yanar. \n" +
                            "Alnım öperler, \n" +
                            "Suskun, hain, cıyansı. \n" +
                            "Dört yanım puşt zulası, \n" +
                            "Dönerim dönerim çıkmaz. \n" +
                            "En leylim gecede ölesim tutmuş, \n" +
                            "Etme gel, \n" +
                            "Ay karanlik...\n" +
                            "\n "},
            {"Ağlamak",
                    "Ağlamak \n" +
                            "Bazi acılarda yetmez \n" +
                            "Bazi ölümlere \n" +
                            "Örtüsüdür bazı acıların \n" +
                            "Örter, örtülmez \n" +
                            "Savunur bir süre \n" +
                            "Ağlayanlar sevinmeli \n" +
                            "Sevin ağlayabiliyorsan \n" +
                            "Acılar art arda dinmeli \n" +
                            "Durur bir nöbetçi gibi \n" +
                            "Durur bir bekçi gibi \n" +
                            "Zamana gülmeli gülmeli. \n" +
                            "Sevin ağlayabiliyorsan \n" +
                            "Unutmanın kardeşidir ağlamak \n" +
                            "Uyur uyanır yatağında duyguların \n" +
                            "Düşüncenin kucağında hep çocuktur \n" +
                            "Ağlamak...\n" +
                            "\n "},
            {"Hasretinden Prangalar Eskittim",
                    "\n   Seni, anlatabilmek seni.\n" +
                            "   İyi çocuklara, kahramanlara.\n" +
                            "   Seni anlatabilmek seni,\n" +
                            "   Namussuza, halden bilmeze,\n" +
                            "   Kahpe yalana.\n" +
                            "\n" +
                            "   Ard- arda kaç zemheri,\n" +
                            "   Kurt uyur, kuş uyur, zindan uyurdu.\n" +
                            "   Dışarda gürül- gürül akan bir dünya...           \n" +
                            "   Bir ben uyumadım,\n" +
                            "   Kaç leylim bahar,\n" +
                            "   Hasretinden prangalar eskittim.\n" +
                            "   Saçlarına kan gülleri takayım,\n" +
                            "   Bir o yana \n" +
                            "   Bir bu yana...\n" +
                            "\n" +
                            "   Seni bağırabilsem seni,\n" +
                            "   Dipsiz kuyulara,\n" +
                            "   Akan yıldıza,\n" +
                            "   Bir kibrit çöpüne varana,\n" +
                            "   Okyanusun en ıssız dalgasına\n" +
                            "   Düşmüş bir kibrit çöpüne.\n" +
                            "\n" +
                            "   Yitirmiş tılsımını ilk sevmelerin,\n" +
                            "   Yitirmiş öpücükleri,\n" +
                            "   Payı yok, apansız inen akşamlardan,\n" +
                            "   Bir kadeh, bir cıgara, dalıp gidene,\n" +
                            "   Seni anlatabilsem seni...\n" +
                            "   Yokluğun, Cehennemin öbür adıdır\n" +
                            "   Üşüyorum, kapama gözlerini...\n\n" +
                            "\n"},
            {"Karanfil Sokağı",
                    "\n   Tekmil ufuklar kışladı\n" +
                            "   Dört yön,onaltı rüzgar\n" +
                            "   Ve yedi iklim beş kıta\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Kavuşmak ilmindeyiz bütün fasıllar\n" +
                            "   Ray, asfalt, şose, makadam\n" +
                            "   Benim sarp yolum, patikam\n" +
                            "   Toros, Anti-toros ve asi Fırat\n" +
                            "   Tütün, pamuk, buğday ovaları,çeltikler \n" +
                            "   Vatanım boylu boyunca\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Döğüşenler de var bu havalarda\n" +
                            "   El, ayak buz kesmiş, yürek cehennem\n" +
                            "   Ümit, öfkeli ve mahzun\n" +
                            "   Ümit, sapına kadar namuslu\n" +
                            "   Dağlara çekilmiş\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Şarkılar bilirim çığ tutmuş\n" +
                            "   Resimler, heykeller, destanlar\n" +
                            "   Usta ellerin yapısı\n" +
                            "   Kolsuz,yarı çıplak Venüs\n" +
                            "   Trans-nonain sokağı\n" +
                            "   Garcia Lorca'nın mezarı,\n" +
                            "   Ve gözbebekleri Pierre Curie'nin\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Duvarları katı sabır taşından\n" +
                            "   Kar altındadır varoşlar,\n" +
                            "   Hasretim nazlıdır Ankara.\n" +
                            "   Dumanlı havayı kurt sevsin\n" +
                            "   Asfalttan yürüsün Aralık,\n" +
                            "   Sevmem, netameli aydır.\n" +
                            "   Bir başka ama bilemem\n" +
                            "   Bir kaçıncı bahara kalmıştır vuslat\n" +
                            "   Kalbim, bu zulümlü sevda,\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Gecekondularda hava bulanık puslu\n" +
                            "   Altındağ gökleri kümülüslü\n" +
                            "   Ekmeğe, aşka ve ömre\n" +
                            "   Küfeleriyle hükmeden\n" +
                            "   Ciğerleri küçük, elleri büyük\n" +
                            "   Nefesleri yetmez avuçlarına\n" +
                            "   -İlkokul çağında hepsi-\n" +
                            "   Kenar çocukları\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Hatıp Çay'ın öte yüzü ılıman\n" +
                            "   Bulvarlar çakırkeyf Yenişehir'de\n" +
                            "   Karanfil Sokağında gün açmış\n" +
                            "   Hikmetinden sual olunmaz değil\n" +
                            "   \"mucip sebebin\" bilirim\n" +
                            "   Ve \"kafi delil\" ortada...\n" +
                            "\n" +
                            "   Karanfil sokağında bir camlı bahçe\n" +
                            "   Camlı bahçe içre bir çini saksı\n" +
                            "   Bir dal süzülür mavide\n" +
                            "   Al - al bir yangın şarkısı,\n" +
                            "   Bakmayın saksıda boy verdiğine\n" +
                            "   Kökü Altındağ'da, İncesu'dadır.\n" +
                            "\n\n"},
            {"Akşam Erken İner Mahpushaneye",
                    "\n  Akşam erken iner mahpushaneye.\n" +
                            "  Ejderha olsan kar etmez.\n" +
                            "  Ne kavgada ustalığın,\n" +
                            "  Ne de çatal yürek civan oluşun.\n" +
                            "  Kar etmez, inceden içine dolan,\n" +
                            "  Alıp götüren hasrete.\n" +
                            "\n" +
                            "  Akşam erken iner mahpushaneye.\n" +
                            "  İner, yedi kol demiri,\n" +
                            "  Yedi kapıya.\n" +
                            "  Birden, ağlamaklı olur bahçe.\n" +
                            "  Karşıda, duvar dibinde,\n" +
                            "  Üç dal gece sefası,\n" +
                            "  Üç kök hercai menekşe...\n" +
                            "\n" +
                            "  Aynı korkunç sevdadadır\n" +
                            "  Gökte bulut, dalda kaysı.\n" +
                            "  Başlar  koymağa hapislik.\n" +
                            "  Karanlık can sıkıntısı...\n" +
                            "  \"Kürdün Gelini\"ni söyler maltada biri,\n" +
                            "  Bense volta'dayım ranza dibinde\n" +
                            "  Ve hep olmayacak şeyler kurarım,\n" +
                            "  Gülünç, acemi, çocuksu...\n" +
                            "\n" +
                            "  Vurulsam kaybolsam derim,\n" +
                            "  Çırılçıplak, bir kavgada,\n" +
                            "  Erkekçe olsun isterim,\n" +
                            "  Dostluk da, düşmanlık da.\n" +
                            "  Hiçbiri olmaz halbuki,\n" +
                            "  Geçer süngüler namluya.\n" +
                            "  Başlar gece devriyesi jandarmaların...\n" +
                            "\n" +
                            "  Hırsla çakarım kibriti,\n" +
                            "  İlk nefeste yarılanır cıgaram,\n" +
                            "  Bir duman alırım, dolu,\n" +
                            "  Bir duman, kendimi öldüresiye,\n" +
                            "  Biliyorum, \"sen de mi?\" diyeceksin,\n" +
                            "  Ama akşam erken  iniyor mahpushaneye.            \n" +
                            "  Ve dışarda delikanlı bir bahar,\n" +
                            "  Seviyorum seni,\n" +
                            "  Çıldırasıya...\n\n" +
                            "\n"},
            {"Anadolu",
                    "\n   Beşikler vermişim Nuh'a\n" +
                            "   Salıncaklar, hamaklar,\n" +
                            "   Havva Ana'n dünkü çocuk sayılır,\n" +
                            "   Anadoluyum ben,\n" +
                            "   Tanıyor musun ?\n" +
                            "\n" +
                            "   Utanırım,\n" +
                            "   Utanırım fıkaralıktan,\n" +
                            "   Ele, güne karşı çıplak...\n" +
                            "   Üşür fidelerim,\n" +
                            "   Harmanım kesat.\n" +
                            "   Kardeşliğin, çalışmanın,\n" +
                            "   Beraberliğin,\n" +
                            "   Atom güllerinin katmer açtığı,\n" +
                            "   Şairlerin, bilginlerin dünyalarında,          \n" +
                            "   Kalmışım bir başıma,\n" +
                            "   Bir başıma ve uzak.\n" +
                            "   Biliyor musun ?\n" +
                            "\n" +
                            "   Binlerce yıl sağılmışım,\n" +
                            "   Korkunç atlılarıyla parçalamışlar\n" +
                            "   Nazlı, seher-sabah uykularımı\n" +
                            "   Hükümdarlar, saldırganlar, haydutlar,\n" +
                            "   Haraç salmışlar üstüme.\n" +
                            "   Ne İskender takmışım,\n" +
                            "   Ne şah ne sultan\n" +
                            "   Göçüp gitmişler, gölgesiz!\n" +
                            "   Selam etmişim dostuma\n" +
                            "   Ve dayatmışım...\n" +
                            "   Görüyor musun ?\n" +
                            "\n" +
                            "   Nasıl severim bir bilsen.\n" +
                            "   Köroğlu'yu,\n" +
                            "   Karayılanı,\n" +
                            "   Meçhul Askeri...\n" +
                            "   Sonra Pir Sultanı ve Bedrettini.\n" +
                            "   Sonra kalem yazmaz,\n" +
                            "   Bir nice sevda...\n" +
                            "   Bir bilsen,\n" +
                            "   Onlar beni nasıl severdi.\n" +
                            "   Bir bilsen, Urfa'da kurşun atanı\n" +
                            "   Minareden, barikattan,\n" +
                            "   Selvi dalından,\n" +
                            "   Ölüme nasıl gülerdi.\n" +
                            "   Bilmeni mutlak isterim,\n" +
                            "   Duyuyor musun ?\n" +
                            " \n" +
                            "   Öyle yıkma kendini,\n" +
                            "   Öyle mahzun, öyle garip...\n" +
                            "   Nerede olursan ol,\n" +
                            "   İçerde, dışarda, derste, sırada,\n" +
                            "   Yürü üstüne - üstüne,\n" +
                            "   Tükür yüzüne celladın,\n" +
                            "   Fırsatçının, fesatçının, hayının...\n" +
                            "   Dayan kitap ile\n" +
                            "   Dayan iş ile.\n" +
                            "   Tırnak ile, diş ile,\n" +
                            "   Umut ile, sevda ile, düş ile\n" +
                            "   Dayan rüsva etme beni.\n" +
                            "\n" +
                            "   Gör, nasıl yeniden yaratılırım,\n" +
                            "   Namuslu, genç ellerinle.\n" +
                            "   Kızlarım,\n" +
                            "   Oğullarım var gelecekte,\n" +
                            "   Herbiri vazgeçilmez cihan parçası.\n" +
                            "   Kaç bin yıllık hasretimin koncası,\n" +
                            "   Gözlerinden,\n" +
                            "   Gözlerinden öperim,\n" +
                            "   Bir umudum sende,\n" +
                            "   Anlıyor musun ?\n\n" +
                            "\n"},
            {"OtuzÜç Kurşun","\n1. \n" +
                    "\n" +
                    "   Bu dağ Mengene dağıdır\n" +
                    "   Tanyeri atanda Van'da \n" +
                    "   Bu dağ Nemrut yavrusudur \n" +
                    "   Tanyeri atanda Nemruda karşı \n" +
                    "   Bir yanın çığ tutar, Kafkas ufkudur     \n" +
                    "   Bir yanın seccade Acem mülküdür \n" +
                    "   Doruklarda buzulların salkımı\n" +
                    "   Firari guvercinler su başlarında \n" +
                    "   Ve karaca sürüsü, \n" +
                    "   Keklik takımı...\n" +
                    "   \n" +
                    "   Yiğitlik inkar gelinmez \n" +
                    "   Tek'e - tek döğüşte yenilmediler \n" +
                    "   Bin yıllardan bu yan, bura uşağı\n" +
                    "   Gel haberi nerden verek \n" +
                    "   Turna sürüsü değil bu \n" +
                    "   Gökte yıldız burcu değil \n" +
                    "   Otuzüç kurşunlu yürek \n" +
                    "   Otuzuç kan pınarı \n" +
                    "   Akmaz, \n" +
                    "   Göl olmuş bu dağda... \n" +
                    "\n" +
                    "   2. \n" +
                    "\n" +
                    "   Yokuşun dibinden bir tavşan kalktı \n" +
                    "   Sırtı alaçakır \n" +
                    "   Karnı sütbeyaz\n" +
                    "   Garip, ikicanlı, bir dağ tavşanı \n" +
                    "   Yüreği ağzında öyle zavallı \n" +
                    "   Tövbeye getirir insanı \n" +
                    "   Tenhaydı, tenhaydı vakitler \n" +
                    "   Kusursuz, çırılçıplak bir şafaktı\n" +
                    "   \n" +
                    "   Baktı otuzüçten biri \n" +
                    "   Karnında açlığın ağır boşluğu \n" +
                    "   Saç, sakal bir karış \n" +
                    "   Yakasında bit, \n" +
                    "   Baktı kolları vurulu, \n" +
                    "   Cehennem yürekli bir yiğit, \n" +
                    "   Bir garip tavşana, \n" +
                    "   Bir gerilere. \n" +
                    "\n" +
                    "   Düştü nazlı filintası aklına, \n" +
                    "   Yastığı altında küsmüş, \n" +
                    "   Düştü, Harran ovasından getirdiği tay \n" +
                    "   Perçemi mavi boncuklu, \n" +
                    "   Alnında akıtma \n" +
                    "   Üç topuğu ak, \n" +
                    "   Eşkini hovarda, kıvrak, \n" +
                    "   Doru, seglavi kısrağı. \n" +
                    "   Nasıl uçmuşlardı Hozat önünde!\n" +
                    "\n" +
                    "   Şimdi, böyle çaresiz ve bağlı, \n" +
                    "   Böyle arkasında bir soğuk namlu \n" +
                    "   Bulunmayaydı, \n" +
                    "   Sığınabilirdi yüceltilere... \n" +
                    "   Bu dağlar, kardeş dağlar, kadrini bilir,      \n" +
                    "   Evvel Allah bu eller utandırmaz adamı, \n" +
                    "   Yanan cıgaranın külünü, \n" +
                    "   Güneşlerde çatal kıvılcımlanan \n" +
                    "   Engereğin dilini, \n" +
                    "   İlk atımda uçuran \n" +
                    "   Usta elleri... \n" +
                    "\n" +
                    "   Bu gözler, bir kere bile faka basmadı \n" +
                    "   Çığ bekleyen boğazların kıyametini \n" +
                    "   Karlı, yumuşacık hıyanetini \n" +
                    "   Uçurumların, \n" +
                    "   Önceden bilen gözleri... \n" +
                    "   Çaresiz\n" +
                    "   Vurulacaktı, \n" +
                    "   Buyruk kesindi, \n" +
                    "   Gayrı gözlerini kör sürüngenler \n" +
                    "   Yüreğini leş kuşları yesindi...\n" +
                    "\n" +
                    "   3. \n" +
                    "\n" +
                    "   Vurulmuşum \n" +
                    "   Dağların kuytuluk bir boğazında \n" +
                    "   Vakitlerden bir sabah namazında \n" +
                    "   Yatarım         \n" +
                    "   Kanlı, upuzun... \n" +
                    "\n" +
                    "   Vurulmuşum \n" +
                    "   Düşüm, gecelerden kara \n" +
                    "   Bir hayra yoranım çıkmaz \n" +
                    "   Canım alırlar ecelsiz \n" +
                    "   Sığdıramam kitaplara \n" +
                    "   Şifre buyurmuş bir paşa \n" +
                    "   Vurulmuşum hiç sorgusuz, yargısız \n" +
                    "\n" +
                    "   Kirvem, hallarımı aynı böyle yaz \n" +
                    "   Rivayet sanılır belki \n" +
                    "   Gül memeler değil \n" +
                    "   Domdom kurşunu \n" +
                    "   Paramparça ağzımdaki... \n" +
                    "\n" +
                    "\n" +
                    "   4.\n" +
                    "\n" +
                    "   Ölüm buyruğunu uyguladılar, \n" +
                    "   Mavi dağ dumanını \n" +
                    "   ve uyur-uyanık seher yelini \n" +
                    "   Kanlara buladılar. \n" +
                    "   Sonra oracıkta tüfek çattılar \n" +
                    "   Koynumuzu usul-usul yoklayıp \n" +
                    "   Aradılar. \n" +
                    "   Didik-didik ettiler \n" +
                    "   Kirmanşah dokuması al kuşağımı \n" +
                    "   Tespihimi, tabakamı alıp gittiler \n" +
                    "   Hepsi de armağandı Acemelinden... \n" +
                    "\n" +
                    "   Kirveyiz, kardeşiz, kanla bağlıyız \n" +
                    "   Karşıyaka köyleri, obalarıyla \n" +
                    "   Kız alıp vermişiz yüzyıllar boyu, \n" +
                    "   Komşuyuz yaka yakaya \n" +
                    "   Birbirine karışır tavuklarımız \n" +
                    "   Bilmezlikten değil, \n" +
                    "   Fıkaralıktan \n" +
                    "   Pasaporta ısınmamış içimiz \n" +
                    "   Budur katlimize sebep suçumuz, \n" +
                    "   Gayrı eşkiyaya çıkar adımız \n" +
                    "   Kaçakçıya \n" +
                    "   Soyguncuya \n" +
                    "   Hayına... \n" +
                    "\n" +
                    "   Kirvem hallarımı aynı böyle yaz \n" +
                    "   Rivayet sanılır belki \n" +
                    "   Gül memeler değil \n" +
                    "   Domdom kurşunu \n" +
                    "   Paramparça ağzımdaki... \n" +
                    "\n" +
                    "  \n" +
                    "   5.\n" +
                    " \n" +
                    "   Vurun ulan, \n" +
                    "   Vurun, \n" +
                    "   Ben kolay ölmem. \n" +
                    "   Ocakta küllenmiş közüm, \n" +
                    "   Karnımda sözüm var \n" +
                    "   Haldan bilene. \n" +
                    "   Babam gözlerini verdi Urfa önünde \n" +
                    "   Üç de kardaşını \n" +
                    "   Üç nazlı selvi, \n" +
                    "   Ömrüne doymamış üç dağ parçası. \n" +
                    "   Burçlardan, tepelerden, minarelerden \n" +
                    "   Kirve, hısım, dağların çocukları \n" +
                    "   Fransız Kuşatmasına karşı koyanda\n" +
                    "\n" +
                    "   Bıyıkları yeni terlemiş daha \n" +
                    "   Benim küçük dayım Nazif \n" +
                    "   Yakışıklı, \n" +
                    "   Hafif,    \n" +
                    "   İyi süvari \n" +
                    "   Vurun kardaş demiş\n" +
                    "   Namus günüdür \n" +
                    "   Ve şaha kaldırmış atını. \n" +
                    "\n" +
                    "   Kirvem hallarımı aynı böyle yaz \n" +
                    "   Rivayet sanılır belki \n" +
                    "   Gül memeler değil \n" +
                    "   Domdom kurşunu \n" +
                    "   Paramparça ağzımdaki... \n\n" +
                    "\n "},
            {"Aşk",
                    "\nŞimdi sen kalkıp gidiyorsun. Git \n" +
                            "Gözlerin durur mu onlar da gidiyorlar. Gitsinler.\n" +
                            "Oysa ben senin gözlerinsiz edemem bilirsin \n" +
                            "Oysa Allah bilir bugün iyi uyanmıştık \n" +
                            "Sevgideydi ilk açılışı gözlerimizin sırf onaydı \n" +
                            "Bir kuş konmuş parmaklarıma uzun uzun ötmüştü \n" +
                            "Bir sevişmek gelmiş bir daha gitmemişti \n" +
                            "Yoktu dünlerde evelsi günlerdeki yoksulluğumuz \n" +
                            "Sanki hiç olmamıştı\n" +
                            "\n" +
                            "Oysa kalbim işte şuracıkta çarpıyordu\n" +
                            "Şurda senin gözlerindeki bakımsız mavi, güzel laflı \n" +
                            "                                                            İstanbullar\n" +
                            "Şurda da etin çoğalıyordu dokundukça lafların\n" +
                            "                                                            dünyaların\n" +
                            "Öyle düzeltici öyle yerine getiriciydi sevmek\n" +
                            "Ki Karaköy köprüsüne yağmur yağarken\n" +
                            "Bıraksalar gökyüzü kendini ikiye bölecekti\n" +
                            "Çünkü iki kişiydik\n" +
                            "\n" +
                            "Oysa bir bardak su yetiyordu saçlarını ıslatmaya\n" +
                            "Bir dilim ekmeğin bir iki zeytinin başınaydı doymamız\n" +
                            "Seni bir kere öpsem ikinin hatırı kalıyordu\n" +
                            "İki kere öpeyim desem üçün boynu bükük\n" +
                            "Yüzünün bitip vücudunun başladığı yerde\n" +
                            "Memelerin vardı memelerin kahramandı sonra \n" +
                            "Sonrası iyilik güzellik.\n" +
                            "\n\n"},
            {"Afrika",
                    "\nAfrika dediğin bir garip kıta\n" +
                            "El bilir âlem bilir\n" +
                            "Ki şekli bozulmasın diye Akdeniz'in\n" +
                            "Hâlâ eskisi gibi çizilir\n" +
                            "Haritalarda\n"},
            {"Gül",
                    "\nGülün tam ortasında ağlıyorum\n" +
                            "Her akşam sokak ortasında öldükçe\n" +
                            "Önümü arkamı bilmiyorum\n" +
                            "Azaldığını duyup duyup karanlıkta\n" +
                            "Beni ayakta tutan gözlerinin\n" +
                            "\n" +
                            "Ellerini alıyorum sabaha kadar seviyorum\n" +
                            "Ellerin beyaz tekrar beyaz tekrar beyaz\n" +
                            "Ellerinin bu kadar beyaz olmasından korkuyorum\n" +
                            "İstasyonda tiren oluyor biraz\n" +
                            "Ben bazan istasyonu bulamayan bir adamım\n" +
                            "\n" +
                            "Gülü alıyorum yüzüme sürüyorum\n" +
                            "Her nasılsa sokağa düşmüş\n" +
                            "Kolumu kanadımı kırıyorum\n" +
                            "Bir kan oluyor bir kıyamet bir çalgı\n" +
                            "Ve zurnanın ucunda yepyeni bir çingene\n"},
            {"Turgut Uyar",
                    "\nAk odada oturur\n" +
                            "Kapısı penceresinden çok\n" +
                            "\n" +
                            "Gözlerinde yıldızlar\n" +
                            "Serin yerde durur\n" +
                            "\n" +
                            "Bir elinde kadeh\n" +
                            "Öbürünü yarasına bastırır\n" +
                            "\n" +
                            "İnşaattan ses gelir\n" +
                            "Bir şeyi okşar gibidir\n" +
                            "\n" +
                            "Uzanıp durmuş mahçup\n" +
                            "Işığagöçerin şarkısı\n" +
                            "\n" +
                            "Dönülmez dizeler içinde\n" +
                            "Onunkiler gülaçılır\n" +
                            "\n" +
                            "Öldüğü gün\n" +
                            "Hepimizi işten attılar\n"},
            {"Acıyor",
                    "\nMutsuzlukdan söz etmek istiyorum\n" +
                            "Dikey ve yatay mutsuzluktan\n" +
                            "Mükemmel mutsuzluğundan insansoyunun\n" +
                            "Sevgim acıyor\n" +
                            "\n" +
                            "Biz giz dolu bir şey yaşadık\n" +
                            "Onlarda orada yaşadılar\n" +
                            "Bir dağın çarpıklığını\n" +
                            "bir sevinç sanarak\n" +
                            "\n" +
                            "En başta mutsuzluk elbet\n" +
                            "Kasaba meyhanesi gibi \n" +
                            "Kahkahası gün ışığına vurup da\n" +
                            "öteden beri yansımayan\n" +
                            "Yani birinin solgun bir gülden kaptığı frengi\n" +
                            "Öbürünün bir kadından aldığı verem\n" +
                            "Bütün işhanlarının tarihçesi\n" +
                            "sevgim acıyor\n" +
                            "\n" +
                            "Yazık sevgime diyor birisi \n" +
                            "Güzel gözlü bir çocuğun bile \n" +
                            "O kadar korunmuş bir yazı yoktu\n" +
                            "Ne denmelidir bilemiyorum\n" +
                            "sevgim acıyor\n" +
                            "Gemiler gene gelip gidiyor\n" +
                            "Dağlar kararıp aydınlanacaklar\n" +
                            "Ve o kadar\n" +
                            "\n" +
                            "Tavrım bir çok şeyi bulup coşmaktır\n" +
                            "Sonbahar geldi hüzün\n" +
                            "İlkbahar geldi kara hüzün\n" +
                            "Ey en akıllı kişisi dünyanın\n" +
                            "Bazen yaz ortasında gündüzün\n" +
                            "sevgim acıyor\n" +
                            "Kimi sevsem\n" +
                            "Kim beni sevse \n" +
                            "\n" +
                            "Eylül toparlandı gitti işte \n" +
                            "Ekim filanda gider bu gidişle \n" +
                            "Tarihe gömülen koca koca atlar\n" +
                            "Tarihe gömülür o kadar \n\n" +
                            "\n"},
            {"Akşam Üstü Rüyası",
                    "\nŞimdi gemiler geçer uzaklardan\n" +
                            "Gönlüm güvertede sereserpedir.\n" +
                            "Işıklı geceler,saz sesleri, peynir ekmek\n" +
                            "Ne biletim ne param ne dostum var\n" +
                            "Pır pır eder yüreğim bakındıkça...\n" +
                            "-Uyan Turgut um, garibim, uyan\n" +
                            "Bura Terme'dir.\n" +
                            "\n" +
                            "Terme köprüsünden kamyonlar geçer,\n" +
                            "Irgatlar üç orada beş burada konuşurlar\n" +
                            "Bir gece başlar, yarı siyah, yarı kırmızı\n" +
                            "Cigaramı yakar evime dönerim...\n" +
                            "-Gidin gemiler, gidin\n" +
                            "Vardığınız yerlere selam edin\n" +
                            "Gün olur bütün kaygılardan uzak\n" +
                            "Ben de gelirim...\n"},
            {"Arz-ı Hal",
                    "\nBen de günahkar kullarındanım Allahım...\n" +
                            "Bir \"Kulhuvallahi\" bilirim dualardan,\n" +
                            "Bir de \"Yarabbi şükür\" demeyi doyunca,\n" +
                            "Bir kere oruç tutmam ramazan boyunca,\n" +
                            "Ama çekmediğim kalmadı sevdalardan.\n" +
                            "Ben de günahkar kullarındanım Allahım!...\n" +
                            "\n" +
                            "Benim gibi kulun çok dünyada, Allahım!...\n" +
                            "Eğer bilmiyorsan işte, haberin olsun.\n" +
                            "Ekmek derdi, aşk derdi unutturdu seni.\n" +
                            "İnsan hatırlamıyor dün ne yediğini.\n" +
                            "Zaten yediğimiz ne ki hatırda dursun.\n" +
                            "Benim gibi kulun çok dünyada, Allahım!...\n" +
                            "\n" +
                            "Yazdıklarıma sakın darılma Allahım!...\n" +
                            "Meleklerin sana bunları söylemezler.\n" +
                            "Artık, pek yarattığın gibi değil dünya\n" +
                            "İnsanlar hem sabuna karıştı, hem suya:\n" +
                            "Ne olursun hoşuna gitmediyse eğer,\n" +
                            "Yazdıklarıma sakın darılma Allahım!...\n" +
                            "\n" +
                            "Sana bir şey soracağım, affet, Allahım!...\n" +
                            "Beş vakit kızlar doluyor camilerine,\n" +
                            "Beyaz yaşmaklı, beyaz tenli masum kızlar...\n" +
                            "Benim bir defa görüşte yüreğim sızlar;\n" +
                            "Sen tutulmadın mı, içlerinden birine?\n" +
                            "Sana bir şey soracağım, affet, Allahım!...\n" +
                            "\n" +
                            "İşte insanlar bu minval üzre, Allahım!...\n" +
                            "Kıt kanaat sere serpe yollar boyunca\n" +
                            "Sen, bizim için hala o ezeli sırsın.\n" +
                            "Sen de, bizi bilmiş olsan, başkalaşırsın...\n" +
                            "Herkesin kederi, gailesi boyunca.\n" +
                            "İşte insanlar bu minval üzre, Allahım!...\n" +
                            "\n\n"},
            {"Binlerce",
                    "\nbinlerce pazartesi geçti ömrümde\n" +
                            "hangisiydi o çıkaramıyorum\n" +
                            "bir kiraz yediğimi hatırlıyorum kurtluydu\n" +
                            "demek oldukça eski\n" +
                            "\n" +
                            "bir de saçmasapan şeyler\n" +
                            "bir kızın dizaltını örneğin\n" +
                            "bir adamın çirkin sigara içişini\n" +
                            "\n" +
                            "nasıl yaşanıyor bu vesayetli dünyada\n" +
                            "hangi çılgınlar nasıl dayanıyor buna\n" +
                            "kimsenin soyunu sopunu bulmak görevim değil\n" +
                            "kendi öykümü düzenlemek yetiyor bana\n" +
                            "güzel bir öğle vakti\n" +
                            "eski güzel bir akşamı hatırlayarak\n" +
                            "sonra dopdolu şeyler\n" +
                            "damacanalar gibi\n" +
                            "içim kabarıyor\n" +
                            "\n" +
                            "sonu olsun diyorum\n" +
                            "neyin sonu ama\n" +
                            "hiç değilse bu taş basamakların\n" +
                            "\n\n"},
            {"Kan Uyku",
                    "\nBir biz varız güzel öbürleri hep çirkin\n" +
                            "Birde bu terli karanlık\n" +
                            "Sonra bir şey daha var muhakkak ama adını bilmiyorum\n" +
                            "Nereden başlasam sonunda o ışıkla karşılaşıyorum\n" +
                            "Yarı çıplak utanmaz bir kadın resmini aydınlatıyor\n" +
                            "Akşam oluyor ya bir türlü inanamıyorum\n" +
                            "Oturmuş iri yapılı adamlar esrar çekiyorlar\n" +
                            "Daha bir aydınlık olsun diye içtikleri su\n" +
                            "Sarı toprakdan testileri güneşte pişiriyorlar\n" +
                            "\n" +
                            "Bir korkuyorum yanlız kalmaktan bir korkuyorum\n" +
                            "Gündüzleri delice çalışıyorum geceleri kadınlarla yatıyorum\n" +
                            "\n" +
                            "Sonra birden büyümüş görüyorum ağaçları\n" +
                            "Kısrakları birden yavrulamış\n" +
                            "Havaları birden güneşli\n" +
                            "\n" +
                            "Kadınlarla yattığım yetse ya\n" +
                            "Birde kadınlarla yattığıma inanmam gerekiyor\n" +
                            "\n" +
                            "Hoşlanmıyorum\n\n" +
                            "\n"},
            {"Bir Şeyin Adı",
                    "\n, büyük büyük düşündüm;\n" +
                            "Sonra büyük büyük yaşadım.\n" +
                            "Ne varsa, onlar aldı.\n" +
                            "Şimdi bana küçük bir ölüm kaldı.\n"},
            {"Düello",
                    "\n  Her tomurcuk bir çiçeğin uykusuna,\n" +
                            "  Her çiçek bir yemişin kuşkusuna,\n" +
                            "  Her yemiş bir böceğin korkusuna,\n" +
                            "  Uykusuzca, kuşkusuzca, korkusuzca yürür.\n"},
            {"Kelimeler",
                    "\nYarıda kalmış aşklarının hesapları içinde\n" +
                            "Denizlere açıldı içimizden biri\n" +
                            "Niçin gittiğini söylemeden.\n" +
                            "Doyulmamış arzularla doluydu yelkenleri.\n" +
                            "Yıpranmış kelimelerin verdiği güvenden.\n" +
                            "Bulacak sanıyordu yenilikleri.\n" +
                            "Her an bir yeni su vardı,\n" +
                            "Her yeni suda bir yeni an.\n" +
                            "Deniz, dalgalarıyla gösteriyordu dışından\n" +
                            "Yaşananla düşünülenler arasındaki farkı.\n" +
                            "Bitmiyordu köpüklerle renkler\t\n" +
                            "Bir başka damlada, bir başka ışıkta başlamadan.\n" +
                            "Gözlerinin önünde bir oyun, ardında bir oyun.\n" +
                            "Dışında ne varsa yeni, ne varsa gerçek.\n" +
                            "Yeni manzaralarla gelen yeni duygular\n" +
                            "Hani, eski kelimelerle olmasa\n" +
                            "İnsanın ömrünce devam edecek.\n" +
                            "Gözlerinin önünde bir oyun, ardında bir oyun.\n" +
                            "Anladı,ölmekle yaşamanın birleştiği noktada\n" +
                            "Yeni rüzgarlarla esen yeni korkulara\n" +
                            "Yeniliklerini bağışlamayan kelimelerin\n" +
                            "Nasıl düşman sığınaklar halinde direndiğini.\n" +
                            "Anladı, bütün olmuşlarla olanların\n" +
                            "Ve bütün olacakların\n" +
                            "O kelimelerin içinde\n" +
                            "Kendisine varmadan eskidiğini.\n\n" +
                            "\n"},
            {"Bayrak",
                    "\nEy mavi göklerin beyaz ve kızıl süsü,\n" +
                            "Kız kardeşimin gelinliği, şehidimin son örtüsü,\n" +
                            "Işık ışık, dalga dalga bayrağım!\n" +
                            "Senin destanını okudum, senin destanını yazacağım.\n" +
                            "\n" +
                            "Sana benim gözümle bakmayanın\n" +
                            "Mezarını kazacağım.\n" +
                            "Seni selâmlamadan uçan kuşun\n" +
                            "Yuvasını bozacağım.\n" +
                            "\n" +
                            "Dalgalandığın yerde ne korku, ne keder...\n" +
                            "Gölgende bana da, bana da yer ver.\n" +
                            "Sabah olmasın, günler doğmasın ne çıkar:\n" +
                            "Yurda ay yıldızının ışığı yeter.\n" +
                            "\n" +
                            "Savaş bizi karlı dağlara götürdüğü gün\n" +
                            "Kızıllığında ısındık;\n" +
                            "Dağlardan çöllere düştüğümüz gün\n" +
                            "Gölgene sığındık.\n" +
                            "\n" +
                            "Ey şimdi süzgün, rüzgârlarda dalgalı;\n" +
                            "Barışın güvercini, savaşın kartalı\n" +
                            "Yüksek yerlerde açan çiçeğim.\n" +
                            "Senin altında doğdum.\n" +
                            "Senin altında öleceğim.\n" +
                            "\n" +
                            "Tarihim, şerefim, şiirim, her şeyim:\n" +
                            "Yer yüzünde yer beğen!\n" +
                            "Nereye dikilmek istersen,\n" +
                            "Söyle, seni oraya dikeyim!\n\n" +
                            "\n"},
            {"Fetih Marşı",
                    "\nYelkenler biçilecek, yelkenler dikilecek;\n" +
                            "Dağlardan çektiriler, kalyonlar çekilecek;\n" +
                            "Kerpetenlerle surun dişleri sökülecek\n" +
                            "\n" +
                            "Yürü, hâlâ ne diye oyunda oynaştasın ?\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n" +
                            "\n" +
                            "Sen ne geçebilirsin yardan, anadan, serden....\n" +
                            "Senin de destanını okuyalım ezberden...\n" +
                            "Haberin yok gibidir taşıdığın değerden...\n" +
                            "\n" +
                            "Elde sensin, dilde sen, gönüldesin baştasın...\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n" +
                            "\n" +
                            "Yüzüne çarpmak gerek zamanenin fendini...\n" +
                            "Göster : Kabaran sular nasıl yıkar bendini ?\n" +
                            "Küçük görme, hor görme, delikanlım kendini\n" +
                            "\n" +
                            "Şu kırık abideyi yükseltecek taştasın;\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n" +
                            "\n" +
                            "Bu kitaplar Fatihtir, Selimdir, Süleymandır.\n" +
                            "Şu mihrap Sinanüddin, şu minare Sinandır.\n" +
                            "Haydi artık uyuyan destanını uyandır.!\n" +
                            "\n" +
                            "Bilmem, neden gündelik işlerle telaştasın\n" +
                            "Kızım, sen de Fatihler doğuracak yaştasın.!\n" +
                            "\n" +
                            "Delikanlım, işaret aldığın gün atandan\n" +
                            "Yürüyeceksin... Millet yürüyecek arkandan !\n" +
                            "Sana selam getirdim Ulubatlı Hasandan ....\n" +
                            "\n" +
                            "Sen ki burçlara bayrak olacak kumaştasın;\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n" +
                            "\n" +
                            "Bırak, bozuk saatler yalan yanlış işlesin !\n" +
                            "Çelebiler çekilip haremlerde kışlasın!\n" +
                            "Yürü aslanım, fetih hazırlığı başlasın...\n" +
                            "\n" +
                            "Yürü, hâlâ ne diye kendinle savaştasın ?\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n\n" +
                            "\n"},
            {"Abbas","\n" +
                    "Haydi Abbas, vakit tamam;\n" +
                    "Akşam diyordun işte oldu akşam.\n" +
                    "Kur bakalım çilingir soframızı;\n" +
                    "Dinsin artık bu kalb ağrısı.\n" +
                    "Şu ağacın gölgesinde olsun;\n" +
                    "Tam kenarında havuzun.\n" +
                    "Aya haber sal çıksın bu gece;\n" +
                    "Görünsün şöyle gönlümce.\n" +
                    "Bas kırbacı sihirli seccadeye,\n" +
                    "Göster hükmettiğini mesafeye\n" +
                    "Ve zamana.\n" +
                    "Katıp tozu dumana,\n" +
                    "Var git,\n" +
                    "Böyle ferman etti Cahit,\n" +
                    "Al getir ilk sevgiliyi Beşiktaş'tan;\n" +
                    "Yaşamak istiyorum gençliğimi yeni baştan.\n"},
            {"Otuz Beş Yaş",
                    "\nYaş otuz beş! yolun yarısı eder.\n" +
                            "Dante gibi ortasındayız ömrün.\n" +
                            "Delikanlı çağımızdaki cevher,\n" +
                            "Yalvarmak, yakarmak nafile bugün,\n" +
                            "Gözünün yaşına bakmadan gider.\n" +
                            "Şakaklarıma kar mı yağdı ne var?\n" +
                            "Benim mi Allahım bu çizgili yüz?\n" +
                            "Ya gözler altındaki mor halkalar?\n" +
                            "Neden böyle düşman görünürsünüz,\n" +
                            "Yıllar yılı dost bildiğim aynalar?\n" +
                            "Zamanla nasıl değişiyor insan!\n" +
                            "Hangi resmime baksam ben değilim.\n" +
                            "Nerde o günler, o şevk, o heyecan?\n" +
                            "Bu güler yüzlü adam ben değilim;\n" +
                            "Yalandır kaygısız olduğum yalan.\n" +
                            "Hayal meyal şeylerden ilk aşkımız;\n" +
                            "Hatırası bile yabancı gelir.\n" +
                            "Hayata beraber başladığımız,\n" +
                            "Dostlarla da yollar ayrıldı bir bir;\n" +
                            "Gittikçe artıyor yalnızlığımız.\n" +
                            "Gökyüzünün başka rengi de varmış!\n" +
                            "Geç farkettim taşın sert olduğunu.\n" +
                            "Su insanı boğar, ateş yakarmış!\n" +
                            "Her doğan günün bir dert olduğunu,\n" +
                            "İnsan bu yaşa gelince anlarmış.\n" +
                            "Ayva sarı nar kırmızı sonbahar!\n" +
                            "Her yıl biraz daha benimsediğim.\n" +
                            "Ne dönüp duruyor havada kuşlar?\n" +
                            "Nerden çıktı bu cenaze? ölen kim?\n" +
                            "Bu kaçıncı bahçe gördüm tarumar?\n" +
                            "Neylersin ölüm herkesin başında.\n" +
                            "Uyudun uyanamadın olacak.\n" +
                            "Kimbilir nerde, nasıl, kaç yaşında?\n" +
                            "Bir namazlık saltanatın olacak,\n" +
                            "Taht misali o musalla taşında.\n\n" +
                            "\n"},
            {"Desem ki",
                    "\nDesem ki vakitlerden bir Nisan akşamıdır,\n" +
                            "Rüzgârların en ferahlatıcısı senden esiyor,\n" +
                            "Sende seyrediyorum denizlerin en mavisini,\n" +
                            "Ormanların en kuytusunu sende gezmekteyim,\n" +
                            "Senden kopardım çiçeklerin en solmazını,\n" +
                            "Toprakların en bereketlisini sende sürdüm,\n" +
                            "Sende tattım yemişlerin cümlesini.\n" +
                            "\n" +
                            "Desem ki sen benim için,\n" +
                            "Hava kadar lazım,\n" +
                            "Ekmek kadar mübarek,\n" +
                            "Su gibi aziz bir şeysin;\n" +
                            "Nimettensin, nimettensin!\n" +
                            "Desem  ki...\n" +
                            "İnan bana sevgilim inan,\n" +
                            "Evimde şenliksin, bahçemde bahar;\n" +
                            "Ve soframda en eski şarap.\n" +
                            "Ben sende yaşıyorum,\n" +
                            "Sen bende hüküm sürmektesin.\n" +
                            "Bırak ben söyleyeyim güzelliğini, \n" +
                            "Rüzgârlarla, nehirlerle, kuşlarla beraber.\n" +
                            "Günlerden sonra bir gün,\n" +
                            "Şayet sesimi farkedemezsen,\n" +
                            "Rüzgârların, nehirlerin, kuşların sesinden,\n" +
                            "Bil ki ölmüşüm.\n" +
                            "Fakat yine üzülme, müsterih ol;\n" +
                            "Kabirde böceklere ezberletirim güzelliğini,\n" +
                            "Ve neden sonra\n" +
                            "Tekrar duyduğun gün sesimi gökkubbede,\n" +
                            "Hatırla ki mahşer günüdür\n" +
                            "Ortalığa düşmüşüm seni arıyorum.\n\n" +
                            "\n"},
            {"Memleket İsterim",
                    "\nMemleket isterim\n" +
                            "Gök mavi, dal yeşil, tarla sarı olsun;\n" +
                            "Kuşların çiçeklerin diyarı olsun.\n" +
                            "\n" +
                            "Memleket isterim\n" +
                            "Ne başta dert, ne gönülde hasret olsun;\n" +
                            "Kardeş kavgasına bir nihayet olsun.\n" +
                            "\n" +
                            "Memleket isterim\n" +
                            "Ne zengin fakir, ne sen ben farkı olsun;\n" +
                            "Kış günü herkesin evi barkı olsun.\n" +
                            "\n" +
                            "Memleket isterim\n" +
                            "Yaşamak, sevmek gibi gönülden olsun;\n" +
                            "Olursa bir şikâyet ölümden olsun.\n\n" +
                            "\n"}
    };
    TextView tvbaslik,tvicerik;
    Button btn,btngeri;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sair_tek_siir);
        tvicerik=(TextView)findViewById(R.id.siiricerik);
        Intent i=getIntent();
        String gelendeger = i.getExtras().getString("id");
        //btngeri=(Button)findViewById(R.id.buttongeri);
        final ArrayList<String> arrayList=new ArrayList<>();
        btn=(Button)findViewById(R.id.siirbaslik);
        btn.setText(gelendeger);
        for(int j=0;j<Siir.length;j++) {
            if(gelendeger.equals(Siir[j][0])){
                arrayList.add(Siir[j][1]);
            }
            else{
                System.out.print("Hatalı girdi");
            }
        }
        Toast.makeText(getApplicationContext(),gelendeger,Toast.LENGTH_SHORT).show();
        tvicerik.setVerticalScrollBarEnabled(true);
        tvicerik.setMovementMethod(ScrollingMovementMethod.getInstance());//kaydırma özellikleri atandı
        tvicerik.setText(arrayList.set(0,""));

    }
}
