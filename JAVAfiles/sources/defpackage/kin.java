package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kin implements aemc {
    public final List a;
    public final asai b;
    public final String c;
    public final String d;
    private final arqg e;
    private final boolean f = true;

    public kin(List list, asai asaiVar, String str, String str2, arqg arqgVar) {
        this.a = list;
        this.b = asaiVar;
        this.c = str;
        this.d = str2;
        this.e = arqgVar;
    }

    @Override // defpackage.aemc
    public final /* bridge */ /* synthetic */ aemc a(arqg arqgVar) {
        return new kin(this.a, this.b, this.c, this.d, arqgVar);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.e;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kin)) {
            return false;
        }
        kin kinVar = (kin) obj;
        if (!d.F(this.a, kinVar.a) || !d.F(this.b, kinVar.b) || !d.F(this.c, kinVar.c) || !d.F(this.d, kinVar.d) || !d.F(this.e, kinVar.e)) {
            return false;
        }
        boolean z = kinVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((i2 + i) * 31) + this.e.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "RadioButtonsListUiData(listItems=" + this.a + ", selectedListItemIndexFlow=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", onDismiss=" + this.e + ", includeScrim=true)";
    }
}
