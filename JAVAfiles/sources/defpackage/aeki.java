package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeki implements aetv {
    public final aejt a;
    public final aekh b;
    public final String c;
    public final boolean d;
    public final arqg e;
    private final arqg f;

    public aeki(aejt aejtVar, aekh aekhVar, String str, boolean z, arqg arqgVar, arqg arqgVar2) {
        arqgVar.getClass();
        this.a = aejtVar;
        this.b = aekhVar;
        this.c = str;
        this.d = z;
        this.f = arqgVar;
        this.e = arqgVar2;
    }

    public static /* synthetic */ aeki e(aeki aekiVar, aejt aejtVar, String str, boolean z, int i) {
        aekh aekhVar;
        if ((i & 1) != 0) {
            aejtVar = aekiVar.a;
        }
        aejt aejtVar2 = aejtVar;
        if ((i & 2) != 0) {
            aekhVar = aekiVar.b;
        } else {
            aekhVar = null;
        }
        aekh aekhVar2 = aekhVar;
        if ((i & 4) != 0) {
            str = aekiVar.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = aekiVar.d;
        }
        arqg arqgVar = aekiVar.f;
        arqg arqgVar2 = aekiVar.e;
        aekhVar2.getClass();
        return new aeki(aejtVar2, aekhVar2, str2, z, arqgVar, arqgVar2);
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.f;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        throw null;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeki)) {
            return false;
        }
        aeki aekiVar = (aeki) obj;
        if (d.F(this.a, aekiVar.a) && d.F(this.b, aekiVar.b) && d.F(this.c, aekiVar.c) && this.d == aekiVar.d && d.F(this.f, aekiVar.f) && d.F(this.e, aekiVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((hashCode2 + this.b.hashCode()) * 31) + hashCode) * 31) + a.v(this.d)) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AttachmentBubbleUiData(info=" + this.a + ", flags=" + this.b + ", contentDescription=" + this.c + ", isHighlighted=" + this.d + ", onClick=" + this.f + ", onLayout=" + this.e + ")";
    }

    public /* synthetic */ aeki(aejt aejtVar, aekh aekhVar, String str, boolean z, arqg arqgVar, int i) {
        this(aejtVar, (i & 2) != 0 ? new aekh((char[]) null) : aekhVar, str, ((i & 8) == 0) & z, (i & 16) != 0 ? accd.i : arqgVar, accd.j);
    }
}
