package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uno extends unp {
    public final apca a;
    public final arqw b;
    private final arwe c;

    public uno(arwe arweVar, apca apcaVar, arqw arqwVar) {
        this.c = arweVar;
        this.a = apcaVar;
        this.b = arqwVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("SingleItemCoroutineWorkHandler");
    }

    @Override // defpackage.unp
    protected final akul d(uns unsVar, apbt apbtVar) {
        akul c;
        apbtVar.getClass();
        c = qjh.c(this.c, arpj.a, arwf.a, new qka(this, apbtVar, unsVar, (arpe) null, 10));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        return this.a;
    }
}
