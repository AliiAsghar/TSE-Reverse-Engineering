package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xen extends unp {
    public static final alwo a = alwo.o("BugleTachygram");
    private final xff b;
    private final armf c;

    public xen(xff xffVar, armf armfVar) {
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
        return aktp.e("TachygramCreateGroupWorkHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return this.b.c(unsVar, (qen) apbtVar);
    }

    @Override // defpackage.unx
    public final apca e() {
        return qen.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "tachygram_group_handler_queue";
    }
}
