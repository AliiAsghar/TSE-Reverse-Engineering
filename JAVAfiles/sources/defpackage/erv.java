package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erv {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public erv(Surface surface, int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        if (i3 != 0 && i3 != 90 && i3 != 180) {
            if (i3 == 270) {
                i3 = 270;
            } else {
                z2 = false;
            }
        }
        d.t(z2, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erv)) {
            return false;
        }
        erv ervVar = (erv) obj;
        if (this.b == ervVar.b && this.c == ervVar.c && this.d == ervVar.d && this.e == ervVar.e && this.a.equals(ervVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
    }
}
