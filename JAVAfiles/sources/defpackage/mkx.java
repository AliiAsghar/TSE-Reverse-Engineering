package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkx {
    public final int a;
    public final Optional b;
    public final int c;
    public final Optional d;
    public final int e;

    public mkx() {
        throw null;
    }

    public static mkx a() {
        return new mkx(0, Optional.empty(), 1, 0, Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mkx) {
            mkx mkxVar = (mkx) obj;
            if (this.a == mkxVar.a && this.b.equals(mkxVar.b) && this.e == mkxVar.e && this.c == mkxVar.c && this.d.equals(mkxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.e;
        a.bm(i);
        return (((((hashCode * 1000003) ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        int i = this.e;
        return "LogContent{httpStatusCode=" + this.a + ", rcsDiagnostics=" + this.b.toString() + ", mmsApi=" + akec.aI(i) + ", lastConnectionFailureCauseCode=" + this.c + ", formatType=" + optional.toString() + "}";
    }

    public mkx(int i, Optional optional, int i2, int i3, Optional optional2) {
        this.a = i;
        this.b = optional;
        this.e = i2;
        this.c = i3;
        this.d = optional2;
    }
}
