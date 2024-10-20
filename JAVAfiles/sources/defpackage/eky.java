package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eky {
    public int a = 1;
    public int b;
    public int c;
    public fcp d;
    public fcp e;
    private final boolean f;
    private final int[] g;
    private final fcp h;

    public eky(fcp fcpVar, boolean z, int[] iArr) {
        this.h = fcpVar;
        this.d = fcpVar;
        this.f = z;
        this.g = iArr;
    }

    public static boolean c(int i) {
        if (i == 65039) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final elg a() {
        return (elg) this.d.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final elg b() {
        return (elg) this.e.b;
    }

    public final boolean d() {
        fjl f = ((elg) this.d.b).f();
        int x = f.x(6);
        if (x != 0) {
            if (((ByteBuffer) f.c).get(x + f.b) != 0) {
                return true;
            }
        }
        if (c(this.b)) {
            return true;
        }
        if (this.f) {
            if (this.g == null) {
                return true;
            }
            if (Arrays.binarySearch(this.g, ((elg) this.d.b).a(0)) < 0) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        this.a = 1;
        this.d = this.h;
        this.c = 0;
    }
}
