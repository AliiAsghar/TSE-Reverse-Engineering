package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknr {
    public final int a;
    public final int b;

    public aknr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aknr) {
            aknr aknrVar = (aknr) obj;
            if (this.a == aknrVar.a && this.b == aknrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.aS(i);
        int i2 = this.b;
        a.aS(i2);
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        String str;
        String str2;
        if (this.a != 1) {
            str = "CACHE";
        } else {
            str = "FILES";
        }
        if (this.b != 1) {
            str2 = "CREDENTIAL";
        } else {
            str2 = "DEVICE";
        }
        return a.bZ(str2, str, "StorageSpec{type=", ", directBoot=", "}");
    }

    public aknr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
