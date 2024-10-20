package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvl {
    public final Set a;
    private final boolean b;

    public qvl(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvl)) {
            return false;
        }
        qvl qvlVar = (qvl) obj;
        if (d.F(this.a, qvlVar.a) && this.b == qvlVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "MyIdentitiesUpdateResult(tokens=" + this.a + ", hasChanges=" + this.b + ")";
    }
}
