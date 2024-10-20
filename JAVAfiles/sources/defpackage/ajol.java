package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajol extends ajon {
    private final ajpm a;

    public ajol(ajpm ajpmVar) {
        this.a = ajpmVar;
    }

    @Override // defpackage.ajpn
    public final int b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajpn) {
            ajpn ajpnVar = (ajpn) obj;
            if (ajpnVar.b() == 5 && this.a.equals(ajpnVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajon, defpackage.ajpn
    public final ajpm f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{locationInformation=" + this.a.toString() + "}";
    }
}
