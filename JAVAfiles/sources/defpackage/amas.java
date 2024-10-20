package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amas extends amae implements amax {
    final amar a;

    public amas(ahlp ahlpVar) {
        Map aj;
        Object obj = ahlpVar.a;
        Integer num = 10;
        num.getClass();
        int ordinal = ((amah) obj).a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal != 3) {
                    throw new AssertionError();
                }
                throw new UnsupportedOperationException("This ordering does not define a comparator.");
            }
            aj = alzz.ak(10);
        } else {
            aj = alzz.aj(10);
        }
        this.a = new amar(aj);
        albo.M(true, "Not true that %s is non-negative.", 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amac
    public final long a() {
        return 0L;
    }

    @Override // defpackage.amae, defpackage.amac, defpackage.amat
    public final /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    @Override // defpackage.amaf, defpackage.amal
    public final Set d() {
        return new amaq(this.a);
    }

    @Override // defpackage.amaf, defpackage.amal
    public final Set e(Object obj) {
        amam amamVar = (amam) this.a.a(obj);
        if (amamVar != null) {
            Set a = amamVar.a();
            akll akllVar = new akll(this, obj, 3, null);
            ahsz ahszVar = new ahsz(obj, 20);
            a.getClass();
            return new amao(a, akllVar, ahszVar);
        }
        obj.getClass();
        throw new IllegalArgumentException(a.bX(obj, "Node ", " is not an element of this graph."));
    }

    @Override // defpackage.amax
    public final Object g(Object obj) {
        Object b;
        amam amamVar = (amam) this.a.a(obj);
        if (amamVar == null) {
            b = null;
        } else {
            b = amamVar.b();
        }
        if (b == null) {
            return null;
        }
        return b;
    }

    @Override // defpackage.amax
    public final void f() {
    }
}
