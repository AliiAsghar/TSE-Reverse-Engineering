package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vhz {
    public final Size a;
    private final Size b;

    public vhz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vhz) {
            vhz vhzVar = (vhz) obj;
            if (this.b.equals(vhzVar.b) && this.a.equals(vhzVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        Size size = this.a;
        return "ResourceDimensions{imageSize=" + this.b.toString() + ", iconSize=" + size.toString() + "}";
    }

    public vhz(Size size, Size size2) {
        this.b = size;
        this.a = size2;
    }
}
