package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxh {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public fxh(int i, String str, String str2, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxh)) {
            return false;
        }
        fxh fxhVar = (fxh) obj;
        if (this.a == fxhVar.a && Objects.equals(this.b, fxhVar.b) && Objects.equals(this.c, fxhVar.c) && this.d == fxhVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = this.a;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (((((i3 * 31) + i) * 31) + i2) * 31) + this.d;
    }

    public final String toString() {
        return "TransformationRequest{outputHeight=" + this.a + ", audioMimeType='" + this.b + "', videoMimeType='" + this.c + "', hdrMode=" + this.d + "}";
    }
}
