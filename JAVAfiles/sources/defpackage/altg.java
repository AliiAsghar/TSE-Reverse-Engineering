package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class altg extends alpt {
    public static final altg a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        a = new altg(objArr, 0, objArr, 0, 0);
    }

    public altg(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.alpt
    public final boolean b() {
        return true;
    }

    @Override // defpackage.alnu
    public final int c(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.d;
            if (objArr.length != 0) {
                int bg = alzz.bg(obj);
                while (true) {
                    int i = bg & this.g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    bg = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.alnu
    public final int e() {
        return this.e;
    }

    @Override // defpackage.alnu
    public final int f() {
        return 0;
    }

    @Override // defpackage.alpt
    public final alog h() {
        return alog.i(this.b, this.e);
    }

    @Override // defpackage.alpt, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.alpt, defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return g().iterator();
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return false;
    }

    @Override // defpackage.alnu
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
