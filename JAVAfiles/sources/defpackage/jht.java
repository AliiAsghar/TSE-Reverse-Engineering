package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jht {
    public final boolean a;
    public final int b;
    public final mjq c;
    public final long d;
    public final int e;

    public jht(int i, boolean z, int i2, mjq mjqVar, long j) {
        this.e = i;
        this.a = z;
        this.b = i2;
        this.c = mjqVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jht)) {
            return false;
        }
        jht jhtVar = (jht) obj;
        if (this.e == jhtVar.e && this.a == jhtVar.a && this.b == jhtVar.b && this.c == jhtVar.c && this.d == jhtVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        a.aS(i);
        return (((((((i * 31) + a.v(this.a)) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + a.A(this.d);
    }

    public final String toString() {
        return "ComposeConstraintsTransportData(attachmentMode=" + ((Object) lgc.L(this.e)) + ", locationSharingSupported=" + this.a + ", attachmentCountLimit=" + this.b + ", bestAvailableTransportFeatureSet=" + this.c + ", maxCharacterLimit=" + this.d + ")";
    }
}
