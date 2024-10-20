package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eot implements arml {
    private final artf a;
    private final arqg b;
    private final arqg c;
    private final arqg d;
    private eor e;

    public eot(artf artfVar, arqg arqgVar, arqg arqgVar2, arqg arqgVar3) {
        this.a = artfVar;
        this.b = arqgVar;
        this.c = arqgVar2;
        this.d = arqgVar3;
    }

    @Override // defpackage.arml
    public final /* bridge */ /* synthetic */ Object a() {
        eor eorVar = this.e;
        if (eorVar == null) {
            efu efuVar = (efu) this.b.a();
            eov eovVar = (eov) this.c.a();
            epd epdVar = (epd) this.d.a();
            efuVar.getClass();
            eovVar.getClass();
            epdVar.getClass();
            eor b = new eoy(efuVar, eovVar, epdVar).b(this.a);
            this.e = b;
            return b;
        }
        return eorVar;
    }

    @Override // defpackage.arml
    public final boolean b() {
        throw null;
    }
}
