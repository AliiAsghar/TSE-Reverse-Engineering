package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kit implements aemc {
    public final String a;
    public final arqg b;
    public final arqg c;

    public kit(String str, arqg arqgVar, arqg arqgVar2) {
        this.a = str;
        this.b = arqgVar;
        this.c = arqgVar2;
    }

    @Override // defpackage.aemc
    public final aemc a(arqg arqgVar) {
        return new kit(this.a, arqgVar, this.c);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.b;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kit)) {
            return false;
        }
        kit kitVar = (kit) obj;
        if (d.F(this.a, kitVar.a) && d.F(this.b, kitVar.b) && d.F(this.c, kitVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DuoKitInviteLinkQuestionUiData(recipientDisplayName=" + this.a + ", onDismiss=" + this.b + ", onSendInvite=" + this.c + ")";
    }
}
