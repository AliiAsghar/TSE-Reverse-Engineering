package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lob implements ljw {
    private final /* synthetic */ int a;
    private final Object b;

    public lob(llc llcVar, int i) {
        this.a = i;
        this.b = llcVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    @Override // defpackage.ljw
    public final /* synthetic */ Object b(lkg lkgVar, arpe arpeVar) {
        if (this.a != 0) {
            arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
            arvpVar.A();
            ((yjl) this.b.b()).f(((lny) lkgVar).a, new lnz(arvpVar));
            Object l = arvpVar.l();
            if (l == arpl.a) {
                arpeVar.getClass();
            }
            return l;
        }
        Object a = ((llc) this.b).a(((loa) lkgVar).a, new sl(), arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return (ru) a;
    }

    public lob(armf armfVar, int i) {
        this.a = i;
        armfVar.getClass();
        this.b = armfVar;
    }
}
