package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwg {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private byte f;

    public final mwh a() {
        if (this.f != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" currentMessageCount");
            }
            if ((this.f & 2) == 0) {
                sb.append(" codePointsUsed");
            }
            if ((this.f & 4) == 0) {
                sb.append(" codePointsRemaining");
            }
            if ((this.f & 8) == 0) {
                sb.append(" maxMessageCount");
            }
            if ((this.f & 16) == 0) {
                sb.append(" lengthRequiresMms");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new mwh(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(int i) {
        this.c = i;
        this.f = (byte) (this.f | 4);
    }

    public final void c(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    public final void d(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }

    public final void e(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 16);
    }

    public final void f(int i) {
        this.d = i;
        this.f = (byte) (this.f | 8);
    }
}
