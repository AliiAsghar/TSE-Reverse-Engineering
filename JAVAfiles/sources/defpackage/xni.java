package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xni extends unp {
    public final xng a;
    private final anen b;

    public xni(xng xngVar, anen anenVar) {
        this.a = xngVar;
        this.b = anenVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a = unf.a();
        a.c(unv.WAKELOCK);
        a.d(5);
        return a.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("CopyFileTelephonyPartsWorkItemHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        xgn xgnVar = (xgn) apbtVar;
        if (!this.a.e()) {
            return aktp.ag(upm.b());
        }
        return aktp.ai(new xfb(this, xgnVar, 3), this.b);
    }

    @Override // defpackage.unx
    public final apca e() {
        return xgn.a.getParserForType();
    }
}
