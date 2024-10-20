package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzp {
    public final String a;
    public final List b;
    public final zzl c;
    public final arqg d;
    public final zzu e;
    public final zzo f;

    public zzp(String str, List list, zzl zzlVar, arqg arqgVar, zzu zzuVar, zzo zzoVar) {
        zzuVar.getClass();
        this.a = str;
        this.b = list;
        this.c = zzlVar;
        this.d = arqgVar;
        this.e = zzuVar;
        this.f = zzoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp zzpVar = (zzp) obj;
        if (d.F(this.a, zzpVar.a) && d.F(this.b, zzpVar.b) && d.F(this.c, zzpVar.c) && d.F(this.d, zzpVar.d) && this.e == zzpVar.e && d.F(this.f, zzpVar.f)) {
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
        return (((((((((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "PhotoSelectorUiData(title=" + this.a + ", photos=" + this.b + ", primaryButtonUiData=" + this.c + ", onDismiss=" + this.d + ", visibilityState=" + this.e + ", flags=" + this.f + ")";
    }
}
