package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akkc extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akkc(ahiy ahiyVar, ajwt ajwtVar, ahlp ahlpVar, int i) {
        super(0);
        this.d = i;
        this.a = ahiyVar;
        this.b = ajwtVar;
        this.c = ahlpVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    asql asqlVar = ((aslh) this.a).c;
                    asqlVar.getClass();
                    return asqlVar.a(((aslu) this.c).a(), ((aslb) this.b).h.c);
                }
                ?? r0 = this.c;
                akrc b = ((aksr) ((ahmn) this.b).a).b((String) this.a);
                try {
                    r0.a();
                    armd.i(b, null);
                    return arnb.a;
                } finally {
                }
            } else {
                ((ahiy) this.a).E((ajwt) this.b);
                return ((ahlp) this.c).g();
            }
        } else {
            ((ahiy) this.a).E((ajwt) this.b);
            return ((ahlp) this.c).g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akkc(ahmn ahmnVar, String str, arqg arqgVar, int i) {
        super(0);
        this.d = i;
        this.b = ahmnVar;
        this.a = str;
        this.c = arqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akkc(aslh aslhVar, aslu asluVar, aslb aslbVar, int i) {
        super(0);
        this.d = i;
        this.a = aslhVar;
        this.c = asluVar;
        this.b = aslbVar;
    }
}
