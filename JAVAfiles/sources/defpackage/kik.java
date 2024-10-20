package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kik implements aemc {
    public final arqg a;
    public final arqg b;
    public final arqg c;
    public final arqg d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    private final arqg l;
    private final boolean m = true;

    public kik(arqg arqgVar, arqg arqgVar2, arqg arqgVar3, arqg arqgVar4, arqg arqgVar5, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6) {
        this.l = arqgVar;
        this.a = arqgVar2;
        this.b = arqgVar3;
        this.c = arqgVar4;
        this.d = arqgVar5;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str;
        this.j = z5;
        this.k = z6;
    }

    @Override // defpackage.aemc
    public final /* bridge */ /* synthetic */ aemc a(arqg arqgVar) {
        return new kik(arqgVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.l;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kik)) {
            return false;
        }
        kik kikVar = (kik) obj;
        if (!d.F(this.l, kikVar.l)) {
            return false;
        }
        boolean z = kikVar.m;
        if (d.F(this.a, kikVar.a) && d.F(this.b, kikVar.b) && d.F(this.c, kikVar.c) && d.F(this.d, kikVar.d) && this.e == kikVar.e && this.f == kikVar.f && this.g == kikVar.g && this.h == kikVar.h && d.F(this.i, kikVar.i) && this.j == kikVar.j && this.k == kikVar.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.l.hashCode() * 31;
        arqg arqgVar = this.a;
        int i = 0;
        if (arqgVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqgVar.hashCode();
        }
        int v = (((hashCode5 + a.v(true)) * 31) + hashCode) * 31;
        arqg arqgVar2 = this.b;
        if (arqgVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arqgVar2.hashCode();
        }
        int i2 = (v + hashCode2) * 31;
        arqg arqgVar3 = this.c;
        if (arqgVar3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arqgVar3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        arqg arqgVar4 = this.d;
        if (arqgVar4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = arqgVar4.hashCode();
        }
        int v2 = (((((((((i3 + hashCode4) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 31) + a.v(this.g)) * 31) + a.v(this.h)) * 31;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((v2 + i) * 31) + a.v(this.j)) * 31) + a.v(this.k);
    }

    public final String toString() {
        return "MessageActionsUiData(onDismiss=" + this.l + ", includeScrim=true, onOpenSettings=" + this.a + ", onResend=" + this.b + ", onResendAsFallback=" + this.c + ", onDelete=" + this.d + ", isRcs=" + this.e + ", isEncrypted=" + this.f + ", isSending=" + this.g + ", isSent=" + this.h + ", recipientDisplayName=" + this.i + ", hasSendingConnection=" + this.j + ", hasDataConnection=" + this.k + ")";
    }
}
