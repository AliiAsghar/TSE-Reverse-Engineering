package defpackage;

import j$.util.function.IntPredicate$CC;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zlp implements IntPredicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zlp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        if (this.b != 0) {
            return IntPredicate$CC.$default$and(this, intPredicate);
        }
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        if (this.b != 0) {
            return IntPredicate$CC.$default$negate(this);
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        if (this.b != 0) {
            return IntPredicate$CC.$default$or(this, intPredicate);
        }
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        if (this.b != 0) {
            return ((itb) this.a).B(i);
        }
        if (this.a.get(i) != null) {
            return true;
        }
        return false;
    }
}
