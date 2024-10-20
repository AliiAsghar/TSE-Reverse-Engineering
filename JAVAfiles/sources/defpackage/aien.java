package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aien implements Predicate {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ aien(long j, int i) {
        this.b = i;
        this.a = j;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        if (this.b != 0) {
            return Predicate$CC.$default$and(this, predicate);
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        if (this.b != 0) {
            return Predicate$CC.$default$negate(this);
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        if (this.b != 0) {
            return Predicate$CC.$default$or(this, predicate);
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        if (this.b != 0) {
            rry rryVar = (rry) obj;
            alwo alwoVar = vmu.a;
            boolean aC = rryVar.aC();
            long j = this.a;
            if (!aC ? rryVar.i() >= j : rryVar.k() >= j) {
                return true;
            }
            return false;
        }
        if (((alek) obj).b == this.a) {
            return true;
        }
        return false;
    }
}
