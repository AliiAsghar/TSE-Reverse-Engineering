package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class rdy extends arpw implements arqv {
    final /* synthetic */ reb a;
    final /* synthetic */ xaz b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdy(reb rebVar, xaz xazVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.a = rebVar;
        this.b = xazVar;
        this.c = str;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((rdy) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((rdy) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.e != 0) {
            aqil.P(obj);
            xaz xazVar = this.b;
            xazVar.getClass();
            String D = this.a.k.D(xazVar, this.c);
            if (D == null) {
                reb.a.q("Received an MMS without sender address; using unknown sender.");
                return "ʼUNKNOWN_SENDER!ʼ";
            }
            return D;
        }
        aqil.P(obj);
        xaz xazVar2 = this.b;
        xazVar2.getClass();
        msh mshVar = (msh) this.a.k.B(xazVar2, this.c).orElse(null);
        if (mshVar == null) {
            reb rebVar = this.a;
            reb.a.q("Received an MMS without sender address; using unknown sender.");
            return ((msk) rebVar.A.b()).f();
        }
        return mshVar;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.e != 0) {
            rdy rdyVar = new rdy(this.a, this.b, this.c, arpeVar, 1, null);
            rdyVar.d = obj;
            return rdyVar;
        }
        rdy rdyVar2 = new rdy(this.a, this.b, this.c, arpeVar, 0);
        rdyVar2.d = obj;
        return rdyVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdy(reb rebVar, xaz xazVar, String str, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.e = i;
        this.a = rebVar;
        this.b = xazVar;
        this.c = str;
    }
}
