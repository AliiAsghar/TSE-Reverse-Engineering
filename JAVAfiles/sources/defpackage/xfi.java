package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfi extends unp {
    private final xff a;
    private final armf b;

    public xfi(xff xffVar, armf armfVar) {
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
        return aktp.e("TachygramRemoveUserFromGroupWorkHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return this.a.c(unsVar, (qfy) apbtVar);
    }

    @Override // defpackage.unx
    public final apca e() {
        return qfy.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "tachygram_group_handler_queue";
    }
}
