package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ash implements cas<artb> {
    private final int a;
    private final int b;
    private final byn c;
    private int d;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a {
        public static final artb a(int i, int i2, int i3) {
            int i4 = (i / i2) * i2;
            return arrn.B(Math.max(i4 - i3, 0), i4 + i2 + i3);
        }
    }

    public ash(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = new byu(a.a(i, i2, i3), cav.a);
        this.d = i;
    }

    @Override // defpackage.cas
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final artb a() {
        return (artb) this.c.a();
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            this.c.h(a.a(i, this.a, this.b));
        }
    }
}
