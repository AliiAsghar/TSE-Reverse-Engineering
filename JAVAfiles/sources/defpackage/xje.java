package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xje {
    private final xlb a;

    public xje(xlb xlbVar) {
        xlbVar.getClass();
        this.a = xlbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xje) && d.F(this.a, ((xje) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncAddedToQueue(request=" + this.a + ")";
    }
}
