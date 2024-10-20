package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlc {
    public final Optional a;
    public final amlg b;
    public final int c;
    public final int d;

    public mlc() {
        throw null;
    }

    public static aavj a() {
        aavj aavjVar = new aavj(null, null);
        aavjVar.a = 2;
        aavjVar.i(8);
        return aavjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mlc) {
            mlc mlcVar = (mlc) obj;
            if (this.a.equals(mlcVar.a) && this.b.equals(mlcVar.b) && this.c == mlcVar.c) {
                int i = this.d;
                int i2 = mlcVar.d;
                if (i != 0) {
                    if (i == i2) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.d;
        a.bm(i);
        return (((hashCode * 1000003) ^ this.c) * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        amlg amlgVar = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(amlgVar);
        int i = this.d;
        if (i != 0) {
            str = akec.aF(i);
        } else {
            str = "null";
        }
        return "MessagesBatchFailureContext{rawTelephonyStatus=" + valueOf + ", reason=" + valueOf2 + ", terminalStatus=" + this.c + ", canFallback=" + str + "}";
    }

    public mlc(Optional optional, amlg amlgVar, int i, int i2) {
        this.a = optional;
        this.b = amlgVar;
        this.c = i;
        this.d = i2;
    }
}
