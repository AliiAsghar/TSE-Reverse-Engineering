package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ump extends unp {
    public final armf a;
    private final anen b;

    public ump(anen anenVar, armf armfVar) {
        this.b = anenVar;
        this.a = armfVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a = unf.a();
        a.c(unv.WORKMANAGER_ONLY);
        gsd gsdVar = new gsd();
        gsdVar.b = true;
        gsdVar.d();
        gsdVar.c = true;
        a.a = gsdVar.a();
        return a.b();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RunAnalyzeHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new rbg(this, 17), this.b);
    }

    @Override // defpackage.unx
    public final apca e() {
        return und.a.getParserForType();
    }
}
