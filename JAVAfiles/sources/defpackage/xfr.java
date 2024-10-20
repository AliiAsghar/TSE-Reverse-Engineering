package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfr extends unp {
    private final xff a;
    private final armf b;

    public xfr(xff xffVar, armf armfVar) {
        this.a = xffVar;
        this.b = armfVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a = xfs.a();
        a.b = ((via) this.b.b()).a();
        return a.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("TachygramUpdateGroupPropertiesWorkHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return this.a.c(unsVar, (qgw) apbtVar);
    }

    @Override // defpackage.unx
    public final apca e() {
        return qgw.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "tachygram_group_handler_queue";
    }
}
