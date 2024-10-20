package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdu {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter");
    public final armf b;
    public final ytk c;
    public final khb d;
    public final jxl e;
    public final odu f;
    public boolean g;
    public boolean h;
    public final arqr i;
    public final lkd j;
    public final lrf k;
    public final abvz l;
    public final kkc m;
    private final arwe n;
    private final arpi o;

    public kdu(lkd lkdVar, lrf lrfVar, @oej armf armfVar, ytk ytkVar, khb khbVar, kkc kkcVar, abvz abvzVar, arwe arweVar, arpi arpiVar, ajwt ajwtVar, jxl jxlVar, odu oduVar) {
        lkdVar.getClass();
        lrfVar.getClass();
        armfVar.getClass();
        ytkVar.getClass();
        khbVar.getClass();
        kkcVar.getClass();
        abvzVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        ajwtVar.getClass();
        jxlVar.getClass();
        this.j = lkdVar;
        this.k = lrfVar;
        this.b = armfVar;
        this.c = ytkVar;
        this.d = khbVar;
        this.m = kkcVar;
        this.l = abvzVar;
        this.n = arweVar;
        this.o = arpiVar;
        this.e = jxlVar;
        this.f = oduVar;
        qjh.l(arweVar, arpiVar, new ikp(this, (arpe) null, 4), 2);
        this.i = qkf.f(new jya((Object) this, 10, (int[][]) null), arweVar);
    }

    public static final String a(String str) {
        if (str.length() > 250) {
            String substring = str.substring(0, 250);
            substring.getClass();
            return substring;
        }
        return str;
    }
}
