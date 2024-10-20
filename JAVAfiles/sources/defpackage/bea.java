package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bea<T> implements Comparator {
    final /* synthetic */ ud a;

    public bea(ud udVar) {
        this.a = udVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return arrj.q(Integer.valueOf(this.a.a(((Number) obj).longValue())), Integer.valueOf(this.a.a(((Number) obj2).longValue())));
    }
}
