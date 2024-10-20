package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajoj extends ajon {
    private final ajpg a;

    public ajoj(ajpg ajpgVar) {
        this.a = ajpgVar;
    }

    @Override // defpackage.ajpn
    public final int b() {
        return 4;
    }

    @Override // defpackage.ajon, defpackage.ajpn
    public final ajpg d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajpn) {
            ajpn ajpnVar = (ajpn) obj;
            if (ajpnVar.b() == 4 && this.a.equals(ajpnVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{fileTransferInformation=" + this.a.toString() + "}";
    }
}
