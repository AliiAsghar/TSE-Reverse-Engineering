package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmq {
    public String a;
    public ashu b;
    public String c;
    public Long d;
    public ahkz e;
    private boolean f;
    private asjt g;
    private boolean h;
    private int i;
    private byte j;

    public final ahmr a() {
        asjt asjtVar;
        if (this.j == 7 && (asjtVar = this.g) != null) {
            return new ahmr(this.a, this.f, asjtVar, this.b, this.c, this.d, this.h, this.e, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.g == null) {
            sb.append(" metric");
        }
        if ((this.j & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.j & 4) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.i = i;
        this.j = (byte) (this.j | 4);
    }

    public final void c(boolean z) {
        this.f = z;
        this.j = (byte) (this.j | 1);
    }

    public final void d(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 2);
    }

    public final void e(asjt asjtVar) {
        if (asjtVar != null) {
            this.g = asjtVar;
            return;
        }
        throw new NullPointerException("Null metric");
    }
}
