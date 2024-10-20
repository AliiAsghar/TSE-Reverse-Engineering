package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upl {
    public alog a;
    public Bundle b;
    private boolean c;
    private boolean d;
    private boolean e;
    private byte f;

    public final upm a() {
        if (this.f != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" completed");
            }
            if ((this.f & 2) == 0) {
                sb.append(" retryable");
            }
            if ((this.f & 4) == 0) {
                sb.append(" skipped");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new upm(this.c, this.d, this.a, this.e, this.b);
    }

    public final void b(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 1);
    }

    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 2);
    }

    public final void d(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 4);
    }
}
