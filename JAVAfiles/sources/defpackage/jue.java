package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jue extends arpw implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jue(arqg arqgVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.b = i;
        this.a = arqgVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new jue((AtomicReference) this.a, (arpe) obj, 3).b(arnb.a);
                }
                return new jue((jug) this.a, (arpe) obj, 2, null).b(arnb.a);
            }
            return new jue((arqg) this.a, (arpe) obj, 1).b(arnb.a);
        }
        return new jue((jug) this.a, (arpe) obj, 0).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, arqg] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    Object obj2 = ((AtomicReference) this.a).get();
                    obj2.getClass();
                    return obj2;
                }
                aqil.P(obj);
                ((jug) this.a).d();
                return arnb.a;
            }
            aqil.P(obj);
            return this.a.a();
        }
        aqil.P(obj);
        ((jug) this.a).d();
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jue(AtomicReference atomicReference, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.b = i;
        this.a = atomicReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jue(jug jugVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.b = i;
        this.a = jugVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jue(jug jugVar, arpe arpeVar, int i, byte[] bArr) {
        super(1, arpeVar);
        this.b = i;
        this.a = jugVar;
    }
}
