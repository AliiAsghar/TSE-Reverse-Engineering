package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alta extends alpt {
    private final transient alor a;
    private final transient alog b;

    public alta(alor alorVar, alog alogVar) {
        this.a = alorVar;
        this.b = alogVar;
    }

    @Override // defpackage.alnu
    public final int c(Object[] objArr, int i) {
        return this.b.c(objArr, i);
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.a.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alpt, defpackage.alnu
    public final alog g() {
        return this.b;
    }

    @Override // defpackage.alpt, defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return this.b.iterator();
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
