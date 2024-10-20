package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xgq extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler");
    public final xgw b;
    public final xnv c;
    private final arwe d;

    public xgq(arwe arweVar, xgw xgwVar, xnv xnvVar) {
        arweVar.getClass();
        xnvVar.getClass();
        this.d = arweVar;
        this.b = xgwVar;
        this.c = xnvVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(Integer.MAX_VALUE);
        a2.g(gry.LINEAR);
        a2.a = new gsf(true, 13);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("IncrementalReverseSyncWorkItemHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        xhb xhbVar = (xhb) apbtVar;
        xhbVar.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new uog(this, xhbVar, (arpe) null, 16));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = xhb.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
