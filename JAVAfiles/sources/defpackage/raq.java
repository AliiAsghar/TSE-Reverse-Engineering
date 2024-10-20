package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class raq extends arrp implements arqg {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raq(Object obj, Object obj2, int i, int i2) {
        super(0);
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v26, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    qjh.l(this.b, null, new uxn((avc) this.c, this.a, (arpe) null, 6), 3);
                    return arnb.a;
                }
                xhz xhzVar = (xhz) ((rat) this.b).E.b();
                ?? r2 = this.c;
                albo.C(r2);
                return xhzVar.b(r2, this.a, true ^ ((nwo) ((rat) this.b).N.b()).a());
            }
            Object obj = this.c;
            akrc b = ((aksr) ((lfl) obj).b).b("MultiShare#onAllContactClick");
            int i2 = this.a;
            Object obj2 = this.b;
            try {
                if (((alsx) ((mkh) obj2).e).c >= 0) {
                    ljn.d((ljn) ((lfl) obj).d.b(), 5, i2, 0, 4);
                    alog alogVar = ((mkh) obj2).e;
                    if (((alsx) alogVar).c > 1) {
                        ((lgg) ((lfl) obj).a).e.f(obj2);
                    } else {
                        alogVar.getClass();
                        ?? r1 = ((agoe) aqjn.X(alogVar)).b;
                        ((lgd) ((lfl) obj).c).a(lga.b((mkh) obj2, r1));
                    }
                    armd.i(b, null);
                    return arnb.a;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } finally {
            }
        } else {
            xhz xhzVar2 = (xhz) ((rat) this.b).E.b();
            ?? r22 = this.c;
            albo.C(r22);
            return xhzVar2.b(r22, this.a, true ^ ((nwo) ((rat) this.b).N.b()).a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raq(lfl lflVar, mkh mkhVar, int i, int i2) {
        super(0);
        this.d = i2;
        this.c = lflVar;
        this.b = mkhVar;
        this.a = i;
    }
}
