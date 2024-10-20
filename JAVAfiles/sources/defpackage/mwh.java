package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwh {
    public final int a;
    public final int b;
    public final boolean c;
    private final int d;
    private final int e;

    public mwh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwh) {
            mwh mwhVar = (mwh) obj;
            if (this.a == mwhVar.a && this.d == mwhVar.d && this.b == mwhVar.b && this.e == mwhVar.e && this.c == mwhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i2 = this.a;
        int i3 = this.d;
        return i ^ ((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ this.b) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "BugleSimpleMessageProperties{currentMessageCount=" + this.a + ", codePointsUsed=" + this.d + ", codePointsRemaining=" + this.b + ", maxMessageCount=" + this.e + ", lengthRequiresMms=" + this.c + "}";
    }

    public mwh(int i, int i2, int i3, int i4, boolean z) {
        this.a = i;
        this.d = i2;
        this.b = i3;
        this.e = i4;
        this.c = z;
    }
}
