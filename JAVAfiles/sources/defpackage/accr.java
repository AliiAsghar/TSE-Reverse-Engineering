package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accr {
    public final acco a;
    public final accq b;
    public final long c;
    private final accu d;
    private final accp e;

    public accr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof accr) {
            accr accrVar = (accr) obj;
            if (this.a.equals(accrVar.a) && this.d.equals(accrVar.d) && this.b.equals(accrVar.b) && this.e.equals(accrVar.e) && this.c == accrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        accp accpVar = this.e;
        accq accqVar = this.b;
        accu accuVar = this.d;
        return "Signals{buildInfo=" + String.valueOf(this.a) + ", systemProperties=" + String.valueOf(accuVar) + ", identifiers=" + String.valueOf(accqVar) + ", callerInfo=" + String.valueOf(accpVar) + ", signalCollectionTimeMillis=" + this.c + "}";
    }

    public accr(acco accoVar, accu accuVar, accq accqVar, accp accpVar, long j) {
        this.a = accoVar;
        this.d = accuVar;
        this.b = accqVar;
        this.e = accpVar;
        this.c = j;
    }
}
