package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrj extends unp {
    public final armf a;
    private final arwe b;

    public yrj(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.b = arweVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a = unf.a();
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a.a = gsdVar.a();
        a.c(unv.WORKMANAGER_ONLY);
        return a.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("SpamReclassificationHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        yrk yrkVar = (yrk) apbtVar;
        yrkVar.getClass();
        c = qjh.c(this.b, arpj.a, arwf.a, new yqs(this, yrkVar, (arpe) null, 3));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = yrk.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
