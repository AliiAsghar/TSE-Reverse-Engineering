package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rcd {
    public final alpt a;
    public final smr b;
    public final rut c;
    public final boolean d;
    public final boolean e;

    public rcd(alpt alptVar, smr smrVar, rut rutVar, boolean z, boolean z2) {
        alptVar.getClass();
        smrVar.getClass();
        rutVar.getClass();
        this.a = alptVar;
        this.b = smrVar;
        this.c = rutVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcd)) {
            return false;
        }
        rcd rcdVar = (rcd) obj;
        if (d.F(this.a, rcdVar.a) && d.F(this.b, rcdVar.b) && d.F(this.c, rcdVar.c) && this.d == rcdVar.d && this.e == rcdVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.v(this.d)) * 31) + a.v(this.e);
    }

    public final String toString() {
        return "BcmFindOrCreateConversationResults(recipientsNotIncludingSelf=" + this.a + ", targetConversation=" + this.b + ", bcmConversation=" + this.c + ", isAllowedByParents=" + this.d + ", isMergedToRcsGroup=" + this.e + ")";
    }
}
