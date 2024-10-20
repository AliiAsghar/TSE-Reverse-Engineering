package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eka {
    private int a = 1;
    private int b;
    private int c;
    private final boolean d;
    private final int[] e;
    private final fcp f;
    private fcp g;
    private fcp h;

    public eka(fcp fcpVar, boolean z, int[] iArr) {
        this.f = fcpVar;
        this.g = fcpVar;
        this.d = z;
        this.e = iArr;
    }

    private static boolean e(int i) {
        if (i == 65039) {
            return true;
        }
        return false;
    }

    private final boolean f() {
        gku e = ((ejy) this.g.b).e();
        int a = e.a(6);
        if (a != 0) {
            if (((ByteBuffer) e.b).get(a + e.a) != 0) {
                return true;
            }
        }
        if (e(this.b)) {
            return true;
        }
        if (this.d) {
            if (this.e == null) {
                return true;
            }
            if (Arrays.binarySearch(this.e, ((ejy) this.g.b).a(0)) < 0) {
                return true;
            }
        }
        return false;
    }

    private final void g() {
        this.a = 1;
        this.g = this.f;
        this.c = 0;
    }

    public final int a(int i) {
        fcp l = this.g.l(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a != 2) {
            if (l == null) {
                g();
            } else {
                this.a = 2;
                this.g = l;
                this.c = 1;
                i2 = i3;
            }
        } else {
            if (l != null) {
                this.g = l;
                this.c++;
            } else if (i == 65038) {
                g();
            } else if (!e(i)) {
                fcp fcpVar = this.g;
                if (fcpVar.b != null) {
                    i3 = 3;
                    if (this.c == 1) {
                        if (f()) {
                            this.h = this.g;
                            g();
                        } else {
                            g();
                        }
                    } else {
                        this.h = fcpVar;
                        g();
                    }
                } else {
                    g();
                }
            }
            i2 = i3;
        }
        this.b = i;
        return i2;
    }

    public final ejy b() {
        return (ejy) this.g.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ejy c() {
        return (ejy) this.h.b;
    }

    public final boolean d() {
        if (this.a != 2 || this.g.b == null) {
            return false;
        }
        if (this.c <= 1 && !f()) {
            return false;
        }
        return true;
    }
}
