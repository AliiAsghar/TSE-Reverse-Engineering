package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umg extends unp {
    public final xnv a;
    public final lpg b;
    private final anen c;
    private final anen d;
    private final usk e;

    public umg(xnv xnvVar, anen anenVar, anen anenVar2, lpg lpgVar, usk uskVar) {
        this.a = xnvVar;
        this.c = anenVar;
        this.d = anenVar2;
        this.b = lpgVar;
        this.e = uskVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ExpireWapPushSiMessageHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        usk uskVar = this.e;
        uskVar.getClass();
        return aktp.ai(new rbg(uskVar, 16), this.c).h(new ult(this, 2), this.d);
    }

    @Override // defpackage.unx
    public final apca e() {
        return und.a.getParserForType();
    }
}
