package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akja {
    public final aozb a;
    public final long b;
    public final ahtt c;
    private final String d;

    public akja(String str, aozb aozbVar, long j, ahtt ahttVar) {
        this.d = str;
        this.a = aozbVar;
        this.b = j;
        this.c = ahttVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akja)) {
            return false;
        }
        akja akjaVar = (akja) obj;
        if (d.F(this.d, akjaVar.d) && d.F(this.a, akjaVar.a) && this.b == akjaVar.b && d.F(this.c, akjaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.d.hashCode() * 31;
        aozb aozbVar = this.a;
        if (aozbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aozbVar.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + a.A(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Metadata(serverToken=" + this.d + ", experimentToken=" + this.a + ", lastUpdateEpochMillis=" + this.b + ", commitProperties=" + this.c + ")";
    }
}
