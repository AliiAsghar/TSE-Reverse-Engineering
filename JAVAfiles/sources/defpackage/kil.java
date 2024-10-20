package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kil implements aemc {
    public final arqg a;
    public final String b;
    public final List c;
    public final arqg d;
    public final arqg e;
    private final boolean f;

    public kil(arqg arqgVar, String str, List list, arqg arqgVar2, arqg arqgVar3) {
        str.getClass();
        this.a = arqgVar;
        this.f = false;
        this.b = str;
        this.c = list;
        this.d = arqgVar2;
        this.e = arqgVar3;
    }

    @Override // defpackage.aemc
    public final /* bridge */ /* synthetic */ aemc a(arqg arqgVar) {
        return new kil(arqgVar, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.a;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kil)) {
            return false;
        }
        kil kilVar = (kil) obj;
        if (!d.F(this.a, kilVar.a)) {
            return false;
        }
        boolean z = kilVar.f;
        if (d.F(this.b, kilVar.b) && d.F(this.c, kilVar.c) && d.F(this.d, kilVar.d) && d.F(this.e, kilVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + 1237) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "PremiumSmsOptionsUiData(onDismiss=" + this.a + ", includeScrim=false, body=" + this.b + ", bodyAnnotations=" + this.c + ", onSettingsClick=" + this.d + ", onResendClick=" + this.e + ")";
    }
}
