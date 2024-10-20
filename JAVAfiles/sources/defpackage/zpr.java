package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpr {
    private boolean a;
    private int b;
    private boolean c;
    private boolean d;
    private int e;
    private byte f;

    public final zps a() {
        if (this.f != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" isIncoming");
            }
            if ((this.f & 2) == 0) {
                sb.append(" status");
            }
            if ((this.f & 4) == 0) {
                sb.append(" overrideAsFailure");
            }
            if ((this.f & 8) == 0) {
                sb.append(" isSelected");
            }
            if ((this.f & 16) == 0) {
                sb.append(" protocol");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zps(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(boolean z) {
        this.a = z;
        this.f = (byte) (this.f | 1);
    }

    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 8);
    }

    public final void d(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 4);
    }

    public final void e(int i) {
        this.e = i;
        this.f = (byte) (this.f | 16);
    }

    public final void f(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }
}
