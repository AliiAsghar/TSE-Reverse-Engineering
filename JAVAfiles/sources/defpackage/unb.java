package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class unb {
    private final apbt a;
    private final String b;
    private final String c;

    public unb(apbt apbtVar, String str, String str2) {
        this.a = apbtVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unb)) {
            return false;
        }
        unb unbVar = (unb) obj;
        if (d.F(this.a, unbVar.a) && d.F(this.b, unbVar.b) && d.F(this.c, unbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "CanceledWorkQueueRequest(rawData=" + this.a + ", cancellationTag=" + this.b + ", deduplicationTag=" + this.c + ")";
    }
}
