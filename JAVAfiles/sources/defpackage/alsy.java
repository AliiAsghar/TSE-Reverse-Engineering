package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alsy extends alog {
    final /* synthetic */ alsz a;

    public alsy(alsz alszVar) {
        this.a = alszVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        albo.ad(i, this.a.c);
        alsz alszVar = this.a;
        Object[] objArr = alszVar.a;
        int i2 = i + i;
        int i3 = alszVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.alog, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
