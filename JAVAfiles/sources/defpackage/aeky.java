package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeky implements aelb {
    public final String a;
    public final aeli b;
    private final int c;

    public aeky() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeky)) {
            return false;
        }
        aeky aekyVar = (aeky) obj;
        int i = aekyVar.c;
        if (d.F(this.a, aekyVar.a) && d.F(this.b, aekyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        this.b.hashCode();
        return (hashCode * 31) + 32;
    }

    public final String toString() {
        return "ScheduledSend(count=0, contentDescription=" + this.a + ", style=" + this.b + ")";
    }

    public /* synthetic */ aeky(String str, aeli aeliVar, int i) {
        aeliVar = (i & 4) != 0 ? new aeli(null) : aeliVar;
        str = (i & 2) != 0 ? null : str;
        aeliVar.getClass();
        this.c = 0;
        this.a = str;
        this.b = aeliVar;
    }
}
