package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqs {
    public final int a;
    public final String b;
    public final boolean c;

    public iqs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iqs) {
            iqs iqsVar = (iqs) obj;
            if (this.a == iqsVar.a && ((str = this.b) != null ? str.equals(iqsVar.b) : iqsVar.b == null) && this.c == iqsVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = this.a;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ ((i2 ^ 1000003) * 1000003)) * 1000003) ^ i;
    }

    public final String toString() {
        return "SnackbarActionConfigExtras{conversationJoinState=" + this.a + ", globalRcsGroupName=" + this.b + ", isE2ee=" + this.c + "}";
    }

    public iqs(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }
}
