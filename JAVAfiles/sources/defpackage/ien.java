package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ien implements idt {
    public final ascd a;
    public boolean b;
    private final arwe c;
    private ascv d;
    private final iek e;

    public ien(iek iekVar, arwe arweVar) {
        iekVar.getClass();
        arweVar.getClass();
        this.e = iekVar;
        this.c = arweVar;
        this.a = ascy.a(true);
        this.b = true;
    }

    @Override // defpackage.idt
    public final /* bridge */ /* synthetic */ asai a(iec iecVar, asai asaiVar) {
        ief iefVar = (ief) iecVar;
        if (this.d == null) {
            asdn asdnVar = new asdn(new idw((arpe) null, this, 3), asaiVar);
            arwe arweVar = this.c;
            int i = ascp.a;
            this.d = arrn.T(asdnVar, arweVar, asco.a, false);
        }
        ascv ascvVar = this.d;
        ascvVar.getClass();
        return new jdn(ascvVar, this, iefVar, 1, null);
    }

    public final void b(ief iefVar) {
        this.e.a(iefVar.a, iel.b);
        iefVar.k.a();
    }
}
