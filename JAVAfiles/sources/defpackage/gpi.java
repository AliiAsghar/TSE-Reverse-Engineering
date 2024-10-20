package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpi extends gpk {
    private final int b;

    public gpi(int i) {
        this.b = i;
        if (Color.alpha(i) == 255) {
        } else {
            throw new IllegalArgumentException("Background color must be opaque");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof gpi) && this.b == ((gpi) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "ColorBackground{color:" + Integer.toHexString(this.b) + '}';
    }
}
