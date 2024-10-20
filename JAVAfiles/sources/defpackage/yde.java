package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yde {
    public final long a;
    public final Optional b;

    public yde() {
        throw null;
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yde) {
            yde ydeVar = (yde) obj;
            if (this.a == ydeVar.a && this.b.equals(ydeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AutoDownloadCheckResult{maxAutoDownloadFileSizeBytes=" + this.a + ", failureReason=" + this.b.toString() + "}";
    }

    public yde(long j, Optional optional) {
        this.a = j;
        this.b = optional;
    }
}
