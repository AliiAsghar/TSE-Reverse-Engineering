package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alsw extends alnr {
    public static final alsw a = new alsw();
    final transient Object[] c;
    public final transient alsw d;
    private final transient Object e;
    private final transient int f;
    private final transient int g;

    private alsw() {
        this.e = null;
        this.c = new Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }

    @Override // defpackage.alnr
    public final alnr b() {
        return this.d;
    }

    @Override // defpackage.alor
    public final alpt f() {
        return new alsz(this, this.c, this.f, this.g);
    }

    @Override // defpackage.alor
    public final alpt g() {
        return new alta(this, new altb(this.c, this.f, this.g));
    }

    @Override // defpackage.alor
    public final boolean gY() {
        return false;
    }

    @Override // defpackage.alor, java.util.Map
    public final Object get(Object obj) {
        Object w = altc.w(this.e, this.c, this.g, this.f, obj);
        if (w == null) {
            return null;
        }
        return w;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.alnr, defpackage.alor
    public Object writeReplace() {
        return super.writeReplace();
    }

    private alsw(Object obj, Object[] objArr, int i, alsw alswVar) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = alswVar;
    }

    public alsw(Object[] objArr, int i) {
        this.c = objArr;
        this.g = i;
        this.f = 0;
        int d = i >= 2 ? alpt.d(i) : 0;
        this.e = altc.v(objArr, i, d, 0);
        this.d = new alsw(altc.v(objArr, i, d, 1), objArr, i, this);
    }
}
