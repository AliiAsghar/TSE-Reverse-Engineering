package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jji {
    public final int a;
    public final int b;
    public final boolean c;

    public jji(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jji)) {
            return false;
        }
        jji jjiVar = (jji) obj;
        if (this.a == jjiVar.a && this.b == jjiVar.b && this.c == jjiVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + a.v(this.c);
    }

    public final String toString() {
        return "TextCounterData(codePointsRemaining=" + this.a + ", currentMessageCount=" + this.b + ", isMessageTooLong=" + this.c + ")";
    }

    public /* synthetic */ jji(int i, int i2) {
        this(i, i2, false);
    }
}
