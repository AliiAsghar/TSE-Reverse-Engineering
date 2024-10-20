package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lef {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public lef() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lef) {
            lef lefVar = (lef) obj;
            if (this.a == lefVar.a && this.b == lefVar.b && this.c == lefVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = i ^ 1000003;
        if (true == this.c) {
            i3 = 1231;
        }
        return (((i4 * 1000003) ^ i2) * 1000003) ^ i3;
    }

    public final String toString() {
        return "LinkPreviewSettingsData{linkPreviewEnabled=" + this.a + ", allRichCardsEnabled=" + this.b + ", richCardsWifiOnly=" + this.c + "}";
    }

    public lef(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
