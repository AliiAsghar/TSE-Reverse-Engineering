package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajom extends ajon {
    private final ajpr a;

    public ajom(ajpr ajprVar) {
        this.a = ajprVar;
    }

    @Override // defpackage.ajpn
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajpn) {
            ajpn ajpnVar = (ajpn) obj;
            if (ajpnVar.b() == 3 && this.a.equals(ajpnVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajon, defpackage.ajpn
    public final ajpr g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{messageReceipt=" + this.a.toString() + "}";
    }
}
