package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesr implements aesg, aeip {
    public final aerb a;
    public final Integer b;
    public final boolean c;
    private final String d;
    private final List e;
    private final aeio f;

    public /* synthetic */ aesr(String str, aerb aerbVar, List list, boolean z, int i) {
        boolean z2;
        list = (i & 8) != 0 ? arnv.a : list;
        aerbVar = (i & 2) != 0 ? null : aerbVar;
        if ((i & 16) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z & z2;
        aeio aeioVar = new aeio((byte[]) null);
        list.getClass();
        this.d = str;
        this.a = aerbVar;
        this.b = null;
        this.e = list;
        this.c = z3;
        this.f = aeioVar;
    }

    @Override // defpackage.aeip
    public final /* bridge */ /* synthetic */ String a() {
        return null;
    }

    @Override // defpackage.aeip
    public final aeio e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesr)) {
            return false;
        }
        aesr aesrVar = (aesr) obj;
        if (!d.F(this.d, aesrVar.d) || this.a != aesrVar.a) {
            return false;
        }
        Integer num = aesrVar.b;
        if (d.F(null, null) && d.F(this.e, aesrVar.e) && this.c == aesrVar.c && d.F(this.f, aesrVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeip
    public final String f() {
        return this.d;
    }

    @Override // defpackage.aeip
    public final List g() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.d.hashCode() * 31;
        aerb aerbVar = this.a;
        if (aerbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aerbVar.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 961) + this.e.hashCode()) * 31) + a.v(this.c)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "InfoListItemUiData(text=" + this.d + ", icon=" + this.a + ", iconTint=null, annotations=" + this.e + ", isError=" + this.c + ", annotationFlags=" + this.f + ")";
    }
}
