package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdk {
    public final qfo a;
    public final int b;

    public qdk() {
        throw null;
    }

    public static akia b() {
        akia akiaVar = new akia();
        akiaVar.m(0);
        return akiaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qej a() {
        return (qej) this.a.j.get(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdk) {
            qdk qdkVar = (qdk) obj;
            if (this.a.equals(qdkVar.a) && this.b == qdkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "SinglePartIncomingChatMessageRequest{incomingChatMessageRequest=" + String.valueOf(this.a) + ", contentPartIndex=" + this.b + "}";
    }

    public qdk(qfo qfoVar, int i) {
        this.a = qfoVar;
        this.b = i;
    }
}
