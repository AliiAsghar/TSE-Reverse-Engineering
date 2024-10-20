package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xqe extends xqf {
    private final pwh a;

    public xqe(pwh pwhVar) {
        this.a = pwhVar;
    }

    @Override // defpackage.xre
    public final int b() {
        return 2;
    }

    @Override // defpackage.xqf, defpackage.xre
    public final pwh c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xre) {
            xre xreVar = (xre) obj;
            if (xreVar.b() == 2 && this.a.equals(xreVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageCoreDataOrWorkQueueResult{workQueueResult=" + this.a.toString() + "}";
    }
}
