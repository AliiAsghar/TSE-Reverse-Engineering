package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qsd implements qrv {
    private final armf a;
    private final armf b;
    private final /* synthetic */ int c;

    public qsd(armf armfVar, armf armfVar2, int i) {
        this.c = i;
        this.a = armfVar;
        this.b = armfVar2;
    }

    @Override // defpackage.qrv
    public final akul a(int i, msh mshVar) {
        if (this.c != 0) {
            return aktp.ag(new qsc(((xbf) this.a.b()).a(i), (xbi) this.b.b(), 1));
        }
        xbi xbiVar = (xbi) this.b.b();
        return aktp.ag(new qsc(((xbf) this.a.b()).a(i), xbiVar.a(i), xbiVar.e(i), 0));
    }
}
