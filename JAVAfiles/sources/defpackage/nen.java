package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nen implements ncq {
    public final arwe a;
    public final armf b;
    public yga c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final yyt g;
    private final arwe h;
    private final /* synthetic */ int i;

    public nen(wfh wfhVar, arwe arweVar, arwe arweVar2, usk uskVar, msk mskVar, xnv xnvVar, armf armfVar, int i) {
        this.i = i;
        wfhVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        uskVar.getClass();
        mskVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        this.a = arweVar;
        this.h = arweVar2;
        this.e = uskVar;
        this.f = mskVar;
        this.d = xnvVar;
        this.b = armfVar;
        this.g = wfhVar.Y(new mlr(this, 1));
    }

    public static final sdu d(String str) {
        sdv a = sdx.a();
        if (str == null) {
            return a.b();
        }
        sdw sdwVar = new sdw();
        sdwVar.b(str);
        a.k(new agpw(sdwVar));
        return a.b();
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        int i = 0;
        if (this.i != 0) {
            return this.g.w(new kzq(ncpVar, i), "HomeScreenActiveComposersSupplier::register", "HomeScreenActiveComposersSupplier::callback", "HomeScreenActiveComposersSupplier::unregister");
        }
        return this.g.w(new nem(ncpVar, 0), "RecipientBusinessInfoObservableSupplier::register", "RecipientBusinessInfoObservableSupplier::callback", "RecipientBusinessInfoObservableSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul c;
        if (this.i != 0) {
            return qjh.a(arrn.I(this.h, null, null, new kbl(this, (arpe) null, 19), 3));
        }
        c = qjh.c(this.h, arpj.a, arwf.a, new leb(this, (arpe) null, 20));
        return c;
    }

    @Override // defpackage.ncq
    public final /* synthetic */ Object c() {
        if (this.i != 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    public nen(arwe arweVar, arwe arweVar2, wfh wfhVar, iew iewVar, armf armfVar, msh mshVar, int i) {
        this.i = i;
        this.a = arweVar;
        this.h = arweVar2;
        this.d = wfhVar;
        this.e = iewVar;
        this.b = armfVar;
        this.f = mshVar;
        this.g = wfhVar.Y(new mlr(this, 7));
    }
}
