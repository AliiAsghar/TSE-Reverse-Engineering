package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xiq extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/telephony/forwardsync/SpotSyncWorkHandler");
    public final mce b;
    public final xkf c;
    private final arwe d;

    public xiq(xnv xnvVar, xkf xkfVar, mce mceVar, arwe arweVar) {
        xnvVar.getClass();
        xkfVar.getClass();
        mceVar.getClass();
        arweVar.getClass();
        this.c = xkfVar;
        this.b = mceVar;
        this.d = arweVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.f(true);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("SpotSyncWorkHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        xip xipVar = (xip) apbtVar;
        xipVar.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new xgk(this, xipVar, (arpe) null, 5, (byte[]) null));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = xip.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
