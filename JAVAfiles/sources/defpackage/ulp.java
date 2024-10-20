package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ulp extends unp {
    public final vqu a;
    private final anen b;

    public ulp(anen anenVar, vqu vquVar) {
        this.b = anenVar;
        this.a = vquVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("CancelRcsFileTransferHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new ulo(this, (ulq) apbtVar, 0), this.b);
    }

    @Override // defpackage.unx
    public final apca e() {
        return ulq.a.getParserForType();
    }
}
