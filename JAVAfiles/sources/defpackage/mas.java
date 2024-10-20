package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mas {
    public final amfq a;
    public final mbt b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final int f;
    private final mbb g;

    public mas() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mas) {
            mas masVar = (mas) obj;
            if (this.a.equals(masVar.a) && this.b.equals(masVar.b)) {
                int i = this.f;
                int i2 = masVar.f;
                if (i != 0) {
                    if (i == i2 && this.c.equals(masVar.c) && this.g.equals(masVar.g) && this.d.equals(masVar.d) && this.e.equals(masVar.e)) {
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
        int i = this.f;
        a.bm(i);
        return (((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str;
        mbt mbtVar = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(mbtVar);
        int i = this.f;
        if (i != 0) {
            str = Integer.toString(a.M(i));
        } else {
            str = "null";
        }
        Optional optional = this.c;
        mbb mbbVar = this.g;
        Optional optional2 = this.d;
        Optional optional3 = this.e;
        return "BugleClearcutLoggerChain{event=" + valueOf + ", logSpec=" + valueOf2 + ", logPurpose=" + str + ", stacktrace=" + String.valueOf(optional) + ", logger=" + String.valueOf(mbbVar) + ", overrideTimestamp=" + String.valueOf(optional2) + ", eventCode=" + String.valueOf(optional3) + "}";
    }

    public mas(amfq amfqVar, mbt mbtVar, int i, Optional optional, mbb mbbVar, Optional optional2, Optional optional3) {
        this.a = amfqVar;
        this.b = mbtVar;
        this.f = i;
        this.c = optional;
        this.g = mbbVar;
        this.d = optional2;
        this.e = optional3;
    }
}
