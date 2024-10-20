package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vnx implements unx {
    private final /* synthetic */ uno a;
    private final /* synthetic */ int b;

    public vnx(arwe arweVar, qhd qhdVar, qdx qdxVar, pnl pnlVar, int i, byte[] bArr) {
        this.b = i;
        arweVar.getClass();
        qdxVar.getClass();
        apca parserForType = mnu.a.getParserForType();
        parserForType.getClass();
        this.a = new uno(arweVar, parserForType, new vnw(pnlVar, qhdVar, qdxVar, null, 1, null));
    }

    @Override // defpackage.unx
    public final unf a() {
        if (this.b != 0) {
            une a = unf.a();
            a.d(1);
            return a.a();
        }
        une a2 = unf.a();
        a2.d(10);
        a2.c(unv.WORKMANAGER_ONLY);
        a2.g(gry.EXPONENTIAL);
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        if (this.b != 0) {
            return aktp.e("CustomThemesSenderHandler");
        }
        return aktp.e("BardDeletionSenderHandler");
    }

    @Override // defpackage.unx
    public final apca e() {
        int i = this.b;
        return this.a.a;
    }

    @Override // defpackage.unx
    public final /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.unx
    public final /* synthetic */ boolean h(apbt apbtVar) {
        return true;
    }

    @Override // defpackage.unx
    public final /* synthetic */ boolean i(byte[] bArr) {
        if (this.b != 0) {
            return upb.f(this, bArr);
        }
        return upb.f(this, bArr);
    }

    @Override // defpackage.unx
    public final akul q(uns unsVar, alog alogVar) {
        if (this.b != 0) {
            return this.a.q(unsVar, alogVar);
        }
        return this.a.q(unsVar, alogVar);
    }

    @Override // defpackage.unx
    public final /* synthetic */ String r() {
        return null;
    }

    public vnx(arwe arweVar, qhd qhdVar, qdx qdxVar, pnl pnlVar, int i) {
        this.b = i;
        arweVar.getClass();
        qdxVar.getClass();
        apca parserForType = vny.a.getParserForType();
        parserForType.getClass();
        this.a = new uno(arweVar, parserForType, new vnw(pnlVar, qhdVar, qdxVar, null, 0));
    }

    @Override // defpackage.unx
    public final /* synthetic */ void g() {
    }
}
