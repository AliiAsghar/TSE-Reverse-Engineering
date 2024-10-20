package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahox implements ahlx {
    private final long a;
    private final alpt b;
    private final int c;

    public ahox() {
        throw null;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahox)) {
            return false;
        }
        ahox ahoxVar = (ahox) obj;
        int i = this.c;
        int i2 = ahoxVar.c;
        if (i != 0) {
            if (i == i2 && this.a == ahoxVar.a && this.b.equals(ahoxVar.b)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        a.aS(i);
        int i2 = ((altg) this.b).c;
        long j = this.a;
        return ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2;
    }

    public final String toString() {
        return "DebugMemoryConfigurations{enablement=" + ahly.a(this.c) + ", debugMemoryServiceThrottleMs=" + this.a + ", debugMemoryEventsToSample=" + String.valueOf(this.b) + "}";
    }

    public ahox(int i, long j, alpt alptVar) {
        this.c = 2;
        this.a = j;
        this.b = alptVar;
    }
}
