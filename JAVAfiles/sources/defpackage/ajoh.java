package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajoh extends ajon {
    private final ajpb a;

    public ajoh(ajpb ajpbVar) {
        this.a = ajpbVar;
    }

    @Override // defpackage.ajon, defpackage.ajpn
    public final ajpb a() {
        return this.a;
    }

    @Override // defpackage.ajpn
    public final int b() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajpn) {
            ajpn ajpnVar = (ajpn) obj;
            if (ajpnVar.b() == 6 && this.a.equals(ajpnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{basicTextMessage=" + this.a.toString() + "}";
    }
}
