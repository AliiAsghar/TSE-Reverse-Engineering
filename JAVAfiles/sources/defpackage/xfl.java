package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfl extends unp {
    public static final alwo a = alwo.o("BugleTachygram");
    public final xff b;
    private final armf c;

    public xfl(xff xffVar, armf armfVar) {
        this.b = xffVar;
        this.c = armfVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = xfs.a();
        a2.b = ((via) this.c.b()).a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("TachygramSendMessageWorkHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return this.b.c(unsVar, (qgf) apbtVar);
    }

    @Override // defpackage.unx
    public final apca e() {
        return qgf.a.getParserForType();
    }
}
