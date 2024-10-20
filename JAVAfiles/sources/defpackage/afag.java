package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afag implements aeip {
    public final String a;
    public final aerb b;
    private final List c;
    private final String d;
    private final aeio e;
    private final String f;

    public /* synthetic */ afag(String str, List list, aeio aeioVar, aerb aerbVar, int i) {
        list = (i & 2) != 0 ? arnv.a : list;
        aeioVar = (i & 8) != 0 ? new aeio((byte[]) null) : aeioVar;
        aerbVar = (i & 16) != 0 ? null : aerbVar;
        str.getClass();
        list.getClass();
        aeioVar.getClass();
        this.a = str;
        this.c = list;
        this.d = null;
        this.e = aeioVar;
        this.b = aerbVar;
        this.f = null;
    }

    @Override // defpackage.aeip
    public final String a() {
        return null;
    }

    @Override // defpackage.aeip
    public final aeio e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afag)) {
            return false;
        }
        afag afagVar = (afag) obj;
        if (!d.F(this.a, afagVar.a) || !d.F(this.c, afagVar.c)) {
            return false;
        }
        String str = afagVar.d;
        if (!d.F(null, null) || !d.F(this.e, afagVar.e) || this.b != afagVar.b) {
            return false;
        }
        String str2 = afagVar.f;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeip
    public final String f() {
        return this.a;
    }

    @Override // defpackage.aeip
    public final List g() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.c.hashCode()) * 961) + this.e.hashCode();
        aerb aerbVar = this.b;
        if (aerbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aerbVar.hashCode();
        }
        return ((hashCode2 * 31) + hashCode) * 31;
    }

    public final String toString() {
        return "TombstoneLine(text=" + this.a + ", annotations=" + this.c + ", contentDescription=null, annotationFlags=" + this.e + ", icon=" + this.b + ", iconContentDescription=null)";
    }
}
