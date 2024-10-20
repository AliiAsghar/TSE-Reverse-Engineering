package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknv {
    public final long a;
    public final long b;
    public final Map c;

    public aknv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aknv) {
            aknv aknvVar = (aknv) obj;
            if (this.a == aknvVar.a && this.b == aknvVar.b && alzz.am(this.c, aknvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SyncConfig{minSyncInterval=" + this.a + ", timeout=" + this.b + ", constraints=" + alzz.ai(this.c) + ", allowMultiprocess=false}";
    }

    public aknv(long j, long j2, Map map) {
        this.a = j;
        this.b = j2;
        this.c = map;
    }
}
