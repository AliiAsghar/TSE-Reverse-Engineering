package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeor {
    public final String a;
    public final boolean b;
    private final String c = null;

    public /* synthetic */ aeor(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeor)) {
            return false;
        }
        aeor aeorVar = (aeor) obj;
        if (!d.F(this.a, aeorVar.a) || this.b != aeorVar.b) {
            return false;
        }
        String str = aeorVar.c;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + a.v(this.b)) * 31;
    }

    public final String toString() {
        return "CounterUiData(text=" + this.a + ", isError=" + this.b + ", contentDescription=null)";
    }
}
