package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxr {
    public final mit a;
    public final tqc b;
    public final boolean c;
    public final boolean d;

    public jxr(mit mitVar, tqc tqcVar, boolean z, boolean z2) {
        this.a = mitVar;
        this.b = tqcVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxr)) {
            return false;
        }
        jxr jxrVar = (jxr) obj;
        if (this.a == jxrVar.a && this.b == jxrVar.b && this.c == jxrVar.c && this.d == jxrVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "ConversationPropertiesProjection(kind=" + this.a + ", archiveStatus=" + this.b + ", longPressActionsEnabled=" + this.c + ", shouldShowSimName=" + this.d + ")";
    }
}
