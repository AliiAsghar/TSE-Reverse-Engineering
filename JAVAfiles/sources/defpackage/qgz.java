package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qgz {
    public final qej a;
    public final apwq b;

    public qgz(qej qejVar, apwq apwqVar) {
        apwqVar.getClass();
        this.a = qejVar;
        this.b = apwqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgz)) {
            return false;
        }
        qgz qgzVar = (qgz) obj;
        if (d.F(this.a, qgzVar.a) && d.F(this.b, qgzVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConvertResult(chatMessageContent=" + this.a + ", customCpimHeaders=" + this.b + ")";
    }
}
