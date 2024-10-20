package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vsf {
    public final xwa a;
    public final rut b;

    public vsf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsf) {
            vsf vsfVar = (vsf) obj;
            if (this.a.equals(vsfVar.a) && this.b.equals(vsfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        rut rutVar = this.b;
        return "GetOrCreateConversationIdAndThreadIdForOneToOneResult{conversationIdAndThreadId=" + this.a.toString() + ", createConversationResult=" + rutVar.toString() + "}";
    }

    public vsf(xwa xwaVar, rut rutVar) {
        this.a = xwaVar;
        this.b = rutVar;
    }
}
