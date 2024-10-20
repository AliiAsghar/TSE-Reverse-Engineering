package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajop extends ajpc {
    private final aozb a;
    private final ajpd b;

    public ajop(aozb aozbVar, ajpd ajpdVar) {
        this.a = aozbVar;
        this.b = ajpdVar;
    }

    @Override // defpackage.ajpc
    public final ajpd a() {
        return this.b;
    }

    @Override // defpackage.ajpc
    public final aozb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpc) {
            ajpc ajpcVar = (ajpc) obj;
            if (this.a.equals(ajpcVar.b()) && this.b.equals(ajpcVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
