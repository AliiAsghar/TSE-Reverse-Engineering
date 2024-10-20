package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoi {
    public final aerb a;
    public final arqg b;
    public final arqg c;
    public final String d;
    public final String e;
    public final boolean f;
    public final aeoh g;

    public aeoi(aerb aerbVar, arqg arqgVar, arqg arqgVar2, String str, String str2, boolean z, aeoh aeohVar) {
        aerbVar.getClass();
        arqgVar2.getClass();
        this.a = aerbVar;
        this.b = arqgVar;
        this.c = arqgVar2;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = aeohVar;
    }

    public static /* synthetic */ aeoi a(aeoi aeoiVar, aerb aerbVar, arqg arqgVar, arqg arqgVar2, String str, String str2, boolean z, aeoh aeohVar, int i) {
        aerb aerbVar2;
        arqg arqgVar3;
        arqg arqgVar4;
        String str3;
        String str4;
        boolean z2;
        aeoh aeohVar2;
        if ((i & 1) != 0) {
            aerbVar2 = aeoiVar.a;
        } else {
            aerbVar2 = aerbVar;
        }
        if ((i & 2) != 0) {
            arqgVar3 = aeoiVar.b;
        } else {
            arqgVar3 = arqgVar;
        }
        if ((i & 4) != 0) {
            arqgVar4 = aeoiVar.c;
        } else {
            arqgVar4 = arqgVar2;
        }
        if ((i & 8) != 0) {
            str3 = aeoiVar.d;
        } else {
            str3 = str;
        }
        if ((i & 16) != 0) {
            str4 = aeoiVar.e;
        } else {
            str4 = str2;
        }
        if ((i & 32) != 0) {
            z2 = aeoiVar.f;
        } else {
            z2 = z;
        }
        if ((i & 64) != 0) {
            aeohVar2 = aeoiVar.g;
        } else {
            aeohVar2 = aeohVar;
        }
        aerbVar2.getClass();
        arqgVar3.getClass();
        arqgVar4.getClass();
        aeohVar2.getClass();
        return new aeoi(aerbVar2, arqgVar3, arqgVar4, str3, str4, z2, aeohVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeoi)) {
            return false;
        }
        aeoi aeoiVar = (aeoi) obj;
        if (this.a == aeoiVar.a && d.F(this.b, aeoiVar.b) && d.F(this.c, aeoiVar.c) && d.F(this.d, aeoiVar.d) && d.F(this.e, aeoiVar.e) && this.f == aeoiVar.f && d.F(this.g, aeoiVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((i2 + i) * 31) + a.v(this.f)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ComposeRowSendButtonUiData(icon=" + this.a + ", onSend=" + this.b + ", onScheduledSend=" + this.c + ", contentDescription=" + this.d + ", iconBottomLabel=" + this.e + ", enabled=" + this.f + ", flags=" + this.g + ")";
    }

    public /* synthetic */ aeoi(aerb aerbVar, arqg arqgVar, arqg arqgVar2, String str, boolean z, aeoh aeohVar, int i) {
        this(aerbVar, arqgVar, (i & 4) != 0 ? accd.q : arqgVar2, (i & 8) != 0 ? null : str, (String) null, (!((i & 32) == 0)) | z, aeohVar);
    }
}
