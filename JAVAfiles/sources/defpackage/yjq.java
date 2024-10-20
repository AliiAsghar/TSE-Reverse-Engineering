package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yjq {
    public final String a;
    public final boolean b;
    private final boolean c;

    public yjq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yjq) {
            yjq yjqVar = (yjq) obj;
            if (this.a.equals(yjqVar.a) && this.b == yjqVar.b && this.c == yjqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.c) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "PhoneNumberFormatResult{formatToNormalizedResult=" + this.a + ", isRbmOrE164=" + this.b + ", isPossibleE164Number=" + this.c + "}";
    }

    public yjq(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
