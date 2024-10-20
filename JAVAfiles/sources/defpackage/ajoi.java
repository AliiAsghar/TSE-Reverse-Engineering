package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajoi extends ajon {
    private final ajpc a;

    public ajoi(ajpc ajpcVar) {
        this.a = ajpcVar;
    }

    @Override // defpackage.ajpn
    public final int b() {
        return 1;
    }

    @Override // defpackage.ajon, defpackage.ajpn
    public final ajpc c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajpn) {
            ajpn ajpnVar = (ajpn) obj;
            if (ajpnVar.b() == 1 && this.a.equals(ajpnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{chat=" + this.a.toString() + "}";
    }
}
