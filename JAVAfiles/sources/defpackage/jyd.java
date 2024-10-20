package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyd extends arpw implements arqv {
    /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyd(arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.b != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((jyd) c(bool, (arpe) obj2)).b(arnb.a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((jyd) c(bool2, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.b != 0) {
            aqil.P(obj);
            return Boolean.valueOf(!this.a);
        }
        aqil.P(obj);
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.b != 0) {
            jyd jydVar = new jyd(arpeVar, 1, null);
            jydVar.a = ((Boolean) obj).booleanValue();
            return jydVar;
        }
        jyd jydVar2 = new jyd(arpeVar, 0);
        jydVar2.a = ((Boolean) obj).booleanValue();
        return jydVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyd(arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
    }
}
