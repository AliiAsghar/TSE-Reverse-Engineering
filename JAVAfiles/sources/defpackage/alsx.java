package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alsx extends alog {
    public static final alog a = new alsx(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public alsx(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.alog, defpackage.alnu
    public final int c(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.alnu
    public final int e() {
        return this.c;
    }

    @Override // defpackage.alnu
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        albo.ad(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return false;
    }

    @Override // defpackage.alnu
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.alog, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
