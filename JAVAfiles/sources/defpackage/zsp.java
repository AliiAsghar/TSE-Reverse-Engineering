package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsp {
    public final zsn a;
    public final boolean b;
    public final int c;

    public zsp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zsp)) {
            return false;
        }
        zsp zspVar = (zsp) obj;
        int i = this.c;
        int i2 = zspVar.c;
        if (i != 0) {
            if (i == i2 && this.a.equals(zspVar.a) && this.b == zspVar.b) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = this.c;
        a.aS(i2);
        int hashCode = ((i2 ^ 1000003) * 1000003) ^ this.a.hashCode();
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "NOT_ELIGIBLE";
                }
            } else {
                str = "ELIGIBLE";
            }
        } else {
            str = "LOADING";
        }
        zsn zsnVar = this.a;
        boolean z = this.b;
        return "SelectionParams{eligibility=" + str + ", priority=" + String.valueOf(zsnVar) + ", hasBeenShown=" + z + "}";
    }

    public zsp(int i, zsn zsnVar, boolean z) {
        this.c = i;
        this.a = zsnVar;
        this.b = z;
    }
}
