package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vum extends unp {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final armf b;
    public final xnv c;
    public final ryg d;
    public final ujv e;
    public final agnq f;
    public final uhj g;
    public final mbl h;
    private final anen i;

    public vum(anen anenVar, armf armfVar, xnv xnvVar, ryg rygVar, ujv ujvVar, agnq agnqVar, uhj uhjVar, mbl mblVar) {
        this.i = anenVar;
        this.b = armfVar;
        this.c = xnvVar;
        this.d = rygVar;
        this.e = ujvVar;
        this.f = agnqVar;
        this.g = uhjVar;
        this.h = mblVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("MarkAllRcsGroupsAsLeftHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new vib(this, 12), this.i);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vun.a.getParserForType();
    }
}
