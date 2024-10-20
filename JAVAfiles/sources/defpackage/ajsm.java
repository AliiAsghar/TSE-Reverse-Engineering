package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsm {
    public final String a;
    public final long b;
    public final msh c;

    public ajsm(String str, long j, msh mshVar) {
        this.a = str;
        this.b = j;
        this.c = mshVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajsm)) {
            return false;
        }
        ajsm ajsmVar = (ajsm) obj;
        if (d.F(this.a, ajsmVar.a) && this.b == ajsmVar.b && d.F(this.c, ajsmVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + a.A(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "IncomingProtoMessageData(conversationId=" + this.a + ", sentTimestamp=" + this.b + ", sender=" + this.c + ")";
    }
}
