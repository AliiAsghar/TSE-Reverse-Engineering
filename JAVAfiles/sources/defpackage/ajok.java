package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajok extends ajon {
    private final ajpl a;

    public ajok(ajpl ajplVar) {
        this.a = ajplVar;
    }

    @Override // defpackage.ajpn
    public final int b() {
        return 2;
    }

    @Override // defpackage.ajon, defpackage.ajpn
    public final ajpl e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajpn) {
            ajpn ajpnVar = (ajpn) obj;
            if (ajpnVar.b() == 2 && this.a.equals(ajpnVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{isComposing=" + this.a.toString() + "}";
    }
}
