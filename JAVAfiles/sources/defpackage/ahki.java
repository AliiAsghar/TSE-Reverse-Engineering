package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahki {
    public final aneo a;
    public final int b;
    public final int c;
    public final boolean d;

    public ahki() {
        throw null;
    }

    public static ahqx a() {
        ahqx ahqxVar = new ahqx();
        ahqxVar.a = 11;
        byte b = ahqxVar.c;
        ahqxVar.d = 2;
        ahqxVar.c = (byte) (b | 3);
        ahqxVar.g();
        return ahqxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahki) {
            ahki ahkiVar = (ahki) obj;
            aneo aneoVar = this.a;
            if (aneoVar != null ? aneoVar.equals(ahkiVar.a) : ahkiVar.a == null) {
                if (this.b == ahkiVar.b && this.c == ahkiVar.c && this.d == ahkiVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        aneo aneoVar = this.a;
        if (aneoVar == null) {
            hashCode = 0;
        } else {
            hashCode = aneoVar.hashCode();
        }
        int i2 = this.b;
        int i3 = this.c;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i;
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=" + String.valueOf(this.a) + ", primesMetricExecutorPriority=" + this.b + ", primesMetricExecutorPoolSize=" + this.c + ", enableDeferredTasks=" + this.d + "}";
    }

    public ahki(aneo aneoVar, int i, int i2, boolean z) {
        this.a = aneoVar;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
