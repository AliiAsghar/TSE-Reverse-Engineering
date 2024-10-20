package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class altx extends alpt {
    final transient Object a;

    public altx(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.alnu
    public final int c(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.alpt, defpackage.alnu
    public final alog g() {
        return alog.r(this.a);
    }

    @Override // defpackage.alpt, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.alpt, defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final aluq listIterator() {
        return new alqt(this.a);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
