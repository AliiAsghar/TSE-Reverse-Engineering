package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anls {
    public final Iterable a;
    public final Iterable b;
    private final aozb c;
    private final aqfu d;
    private final long e;

    public anls(aozb aozbVar, aqfu aqfuVar, long j, Iterable iterable, Iterable iterable2) {
        this.c = aozbVar;
        this.d = aqfuVar;
        this.e = j;
        this.a = iterable;
        this.b = iterable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anls)) {
            return false;
        }
        anls anlsVar = (anls) obj;
        if (d.F(this.c, anlsVar.c) && d.F(this.d, anlsVar.d) && this.e == anlsVar.e && d.F(this.a, anlsVar.a) && d.F(this.b, anlsVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + a.A(this.e)) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DeviceRegistration(registrationId=" + this.c + ", identityKey=" + this.d + ", registrationHash=" + this.e + ", capabilities=" + this.a + ", features=" + this.b + ")";
    }
}
