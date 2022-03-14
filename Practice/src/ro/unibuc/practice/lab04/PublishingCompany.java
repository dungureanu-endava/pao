package ro.unibuc.practice.lab04;

public class PublishingCompany {

    public static void main(String[] args) {
        String author = "Karlheinz Gaspar";
        String title = "Dicimus II";
        String content = "Dicimus his sum quamvis est diversa effectu chartam nullibi. Eligendo im comparem ab cognosci et se. Simili ac ha arrogo vi certum mandat sacras realem. Ei quodque ferenda ac discere assequi ha putarem gi. Pla actum pappo mei illos cui. Credidique devenietur deceptorem ha re. An acceptis ha occurret postquam animalia at emanasse. Propter hiemali du ex erroris verarum se. Simili calore ei colore fingam fallar co pudeat de. Lumen sed nam velut ignem qua dubie fal. In suam ille illa quia fiat ut etsi. Actu inde tius du to ii. Percipitur ha me virtutibus afferuntur ii ob. Actum utrum ob ha intra. Primis hic sentio saltem nam caelum volens. Ob caeteras to ad si credatur differre efficiat reperiri. Ipsi ullo visu ipse to boni et cera si. Veri hoc ego voce uti sumi. Theologos ita veniebant hoc perductae rem existimem inveniant ingeniosi. Ego vere heri spem dico ego. Continetur objectivae est pervenisse prosecutus sufficiunt inusitatis non. Pulses ei ea altius ii totius terram notior vi. Cernitur deponant mutuatis perfecta potentia regendae ad in ex. Ha is se voluntate praestari ii fruebatur. Rectum pendeo minuta mo loquar matura magnum ha ut to. Examinavi gi veritatem si opiniones experimur. Suae idem novi meum vere poni vim sum. Mundo mutuo nullo ideam vitam eam per lus. Ob scripta du nemoque videmus ac eo. Licet ope durat quasi seu haben talis sed. Has fuistis est vix cognita caeteri quasdam credere vis dignati. Extat fas pro debet hae vox eidem. Alteram tanquam creatis viribus at si. Maximam vos hoc antehac imo ignotas eae aliarum fictile. Excludat is potestis me du si cognitio liberius. Sum quae rem meae male haec. Fallacem totamque at loquebar formemus suspicio ex me ne. Haereo mutata dum vix magnum tertia volunt nam suo audita. Quodcumque affirmarem secernitur facillimam gi at se. Aperire quatuor facilem nunquam an peccant mo. Conari re debent me ii clarae ob secius potius pileos. Actu more ac is sumi amen quia. Impetus legendo ac ab dicamne. Capacem dispari qua aliquid sic. Alicujus comparem in studiose rationum ad cohiberi deveniri ob. Falsa mem ope multa fieri vulgo porro. At sumi puto ergo duas fuse ha to ideo. An re ponitur veritas halitus du etiamsi quinque quatuor me. Seipso necdum de bitavi at ad. Errem rei solus tur debet nempe. At to ut ut superest callidum quidquam. Fallebar superest gi aliosque ii. Materiam ob momentum existens de immorari. Sumpta initio habebo ea fallit putare creari id. Inspiciam sed recurrunt quocunque aut rei improviso examinare non. At in ausit certi facit terra alias ii ex favis. Aggredi ginabor et et ha se suppono quiddam gallice saepius. His actum imo vitro fal bonus vos istam istas. Usu imo gnum casu etsi vice sive. Jam rom est externo putarim sub naturam. Mox sae persuadeam dat dubitandum excogitent non. Pro sit sub istam tales fas somno quies notum multa. Assignare continere cur perfacile est ego. Profundum credendum summopere sap lus inspiciam confirmet. An imbecillia labefactat co incidissem im. Exhibetur inscitiae concilium ii at mo. Cupientem praeditis ii quocunque archimede procedere at ac. Mem firmae exigui nondum rea contra tam hoc nomine. Ii ut vultum ausint vereor ac. Ulla male suam sine ante uti meam nec sum. Foco ab ob im sane fore de nova tale. Re porro omnia vi im serio is. Ea geometras eversioni ad pergamque. Toga sic mei has loco viam nota luce veri. Dem his quam ipsi boni. Dubium altera cau duo nihilo summam lumini nia humano. Se jactantur id distinguo im videantur ut. Scriptum inquiram eo deinceps permulta ac.";
        int size = 500;

        PublishingCompany company = new PublishingCompany();
        Book dicimusII = company.publishBook(author, title, content, size);

        dicimusII.printBook();
    }

    private Book publishBook(String author, String title, String content, int size) {
        int pageIndex = 0;

        Page[] pages = new Page[content.length() / size + 1];

        while (content.length() > size) {
            int indexOfLastSpaceOfSubContent = content.substring(0, size).lastIndexOf(" ");
            pages[pageIndex] = new Page(content.substring(0, indexOfLastSpaceOfSubContent), pageIndex);

            content = content.substring(indexOfLastSpaceOfSubContent + 1);
            pageIndex++;
        }

        pages[pageIndex] = new Page(content, pageIndex);

        return new Book(author, title, pages);
    }

}
