package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qhm extends qhl {
    public final String a;
    public final qei c;

    public qhm(String str, qei qeiVar) {
        this.a = str;
        this.c = qeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhm)) {
            return false;
        }
        qhm qhmVar = (qhm) obj;
        if (d.F(this.a, qhmVar.a) && d.F(this.c, qhmVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RecreateGroupData(conversationId=" + this.a + ", selfChatEndpoint=" + this.c + ")";
    }
}
