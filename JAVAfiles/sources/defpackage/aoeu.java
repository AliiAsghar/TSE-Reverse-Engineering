package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoeu {
    public final boolean a;
    private final aofg b;

    public aoeu(aofg aofgVar, boolean z) {
        this.b = aofgVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aoeu) {
            aoeu aoeuVar = (aoeu) obj;
            if (aoeuVar.b.equals(this.b) && aoeuVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
