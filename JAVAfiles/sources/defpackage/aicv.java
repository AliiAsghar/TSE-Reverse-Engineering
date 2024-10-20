package defpackage;

import j$.util.Optional;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aicv {
    public final aidj a;
    public final long b;
    public final alex c;
    public final OptionalInt d;
    public final OptionalInt e;
    public final Optional f;

    public aicv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aicv) {
            aicv aicvVar = (aicv) obj;
            if (this.a.equals(aicvVar.a) && this.b == aicvVar.b && this.c.equals(aicvVar.c) && this.d.equals(aicvVar.d) && this.e.equals(aicvVar.e) && this.f.equals(aicvVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        OptionalInt optionalInt = this.e;
        OptionalInt optionalInt2 = this.d;
        alex alexVar = this.c;
        return "AggregateData{eventVector=" + String.valueOf(this.a) + ", systemProfileHash=" + this.b + ", systemProfile=" + String.valueOf(alexVar) + ", minDayIndex=" + String.valueOf(optionalInt2) + ", maxDayIndex=" + String.valueOf(optionalInt) + ", aggregateValue=" + String.valueOf(optional) + "}";
    }

    public aicv(aidj aidjVar, long j, alex alexVar, OptionalInt optionalInt, OptionalInt optionalInt2, Optional optional) {
        this.a = aidjVar;
        this.b = j;
        this.c = alexVar;
        this.d = optionalInt;
        this.e = optionalInt2;
        this.f = optional;
    }
}
