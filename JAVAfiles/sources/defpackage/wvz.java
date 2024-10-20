package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wvz extends arpw implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvz(reb rebVar, long j, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = rebVar;
        this.a = j;
        this.c = str;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((wvz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((wvz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.d != 0) {
            aqil.P(obj);
            Object obj2 = this.c;
            return ((reb) this.b).k.u(this.a, (String) obj2);
        }
        aqil.P(obj);
        ((wwa) this.b).b((wwk) this.c, this.a);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.d != 0) {
            return new wvz((reb) this.b, this.a, (String) this.c, arpeVar, 1);
        }
        Object obj2 = this.b;
        return new wvz((wwa) obj2, (wwk) this.c, this.a, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvz(wwa wwaVar, wwk wwkVar, long j, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = wwaVar;
        this.c = wwkVar;
        this.a = j;
    }
}
