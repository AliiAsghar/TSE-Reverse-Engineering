package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zln {
    public String a;
    public msh b;
    public String c;
    private int d;
    private int e;
    private byte f;

    public final zlo a() {
        if (this.f != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" index");
            }
            if ((this.f & 2) == 0) {
                sb.append(" id");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zlo(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(int i) {
        this.e = i;
        this.f = (byte) (this.f | 2);
    }

    public final void c(int i) {
        this.d = i;
        this.f = (byte) (this.f | 1);
    }
}
