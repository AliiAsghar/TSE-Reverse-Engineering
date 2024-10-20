package defpackage;

import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alqv extends AbstractList {
    final List a;
    final int b;

    public alqv(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        albo.ad(i, size());
        List list = this.a;
        int i2 = this.b;
        int i3 = i * i2;
        return this.a.subList(i3, Math.min(i2 + i3, list.size()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return albo.cR(this.a.size(), this.b, RoundingMode.CEILING);
    }
}
