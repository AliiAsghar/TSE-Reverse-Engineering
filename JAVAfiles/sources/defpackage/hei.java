package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hei extends arpw implements arqw {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hei(arpe arpeVar, int i) {
        super(3, arpeVar);
        this.a = i;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.a != 0) {
            new hei((arpe) obj3, 1, null);
            return a.I(arnb.a);
        }
        ((Number) obj).intValue();
        return new hei((arpe) obj3, 0).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.a != 0) {
            return a.I(obj);
        }
        aqil.P(obj);
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hei(arpe arpeVar, int i, byte[] bArr) {
        super(3, arpeVar);
        this.a = i;
    }
}
