package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsx {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/media/MediaType");
    public final afsw b;
    public final String c;
    public final afsq d;
    private final arml e;

    public afsx(afsw afswVar, String str, afsq afsqVar) {
        str.getClass();
        this.b = afswVar;
        this.c = str;
        this.d = afsqVar;
        this.e = armd.a(new afpw(this, 4));
    }

    public final String a() {
        return (String) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsx)) {
            return false;
        }
        afsx afsxVar = (afsx) obj;
        if (d.F(this.b, afsxVar.b) && d.F(this.c, afsxVar.c) && d.F(this.d, afsxVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() * 31) + this.c.hashCode();
        afsq afsqVar = this.d;
        if (afsqVar == null) {
            hashCode = 0;
        } else {
            hashCode = afsqVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return a();
    }
}
