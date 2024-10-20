package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zss {
    public final boolean a;
    public final boolean b;

    public zss() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zss) {
            zss zssVar = (zss) obj;
            if (this.a == zssVar.a && this.b == zssVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.b) {
            i2 = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        return "BannerFrameworkConfig{showDismissAnimationEnabled=" + this.a + ", windowInsetsEnabled=" + this.b + "}";
    }

    public zss(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
