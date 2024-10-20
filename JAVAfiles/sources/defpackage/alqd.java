package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alqd extends alpr {
    private final Comparator e;

    public alqd(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.alpr, defpackage.alns, defpackage.alnt
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.alpr
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final alqf g() {
        alqf x = alqf.x(this.e, this.b, this.a);
        this.b = x.size();
        this.c = true;
        return x;
    }

    public final void m(Object obj) {
        super.c(obj);
    }

    public final void n(Object... objArr) {
        super.i(objArr);
    }

    public final void o(Iterable iterable) {
        super.j(iterable);
    }
}
