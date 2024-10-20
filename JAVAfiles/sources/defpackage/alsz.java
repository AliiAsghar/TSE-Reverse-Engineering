package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alsz extends alpt {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient alor d;

    public alsz(alor alorVar, Object[] objArr, int i, int i2) {
        this.d = alorVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.alnu
    public final int c(Object[] objArr, int i) {
        return g().c(objArr, i);
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alpt
    public final alog h() {
        return new alsy(this);
    }

    @Override // defpackage.alpt, defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return g().iterator();
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
