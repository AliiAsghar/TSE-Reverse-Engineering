package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeun implements aeva {
    public final List a;
    public final aeuz b;
    public final arqr c;
    public final arqr d;
    public final Long e;
    private final int f;

    public aeun() {
        this(null, 0, null, null, null, 63);
    }

    @Override // defpackage.aeva
    public final aeuz a() {
        return this.b;
    }

    @Override // defpackage.aeva
    public final List b() {
        return this.a;
    }

    @Override // defpackage.aeva
    public final int c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeun)) {
            return false;
        }
        aeun aeunVar = (aeun) obj;
        if (d.F(this.a, aeunVar.a) && this.f == aeunVar.f && d.F(this.b, aeunVar.b) && d.F(this.c, aeunVar.c) && d.F(this.d, aeunVar.d) && d.F(this.e, aeunVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = this.f;
        a.bm(i);
        int hashCode3 = ((hashCode2 + i) * 31) + this.b.hashCode();
        arqr arqrVar = this.c;
        int i2 = 0;
        if (arqrVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqrVar.hashCode();
        }
        int i3 = ((hashCode3 * 31) + hashCode) * 31;
        arqr arqrVar2 = this.d;
        if (arqrVar2 != null) {
            i2 = arqrVar2.hashCode();
        }
        return ((i3 + i2) * 31) + this.e.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("EagerMetatextUiData(metatextList=");
        sb.append(this.a);
        sb.append(", visibility=");
        int i = this.f;
        if (i != 1) {
            if (i != 2) {
                str = "HIDDEN_BY_DEFAULT";
            } else {
                str = "SHOWN_BY_DEFAULT";
            }
        } else {
            str = "ALWAYS_SHOWN";
        }
        sb.append((Object) str);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", onPositionChangedAfterClick=");
        sb.append(this.d);
        sb.append(", durationOfPositionSubscriptionInMillis=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ aeun(List list, int i, aeuz aeuzVar, arqr arqrVar, arqr arqrVar2, int i2) {
        list = (i2 & 1) != 0 ? arnv.a : list;
        i = (i2 & 2) != 0 ? 3 : i;
        aeuzVar = (i2 & 4) != 0 ? new aeuz(false, false, 3) : aeuzVar;
        arqrVar = (i2 & 8) != 0 ? null : arqrVar;
        arqrVar2 = (i2 & 16) != 0 ? null : arqrVar2;
        list.getClass();
        if (i == 0) {
            throw null;
        }
        aeuzVar.getClass();
        this.a = list;
        this.f = i;
        this.b = aeuzVar;
        this.c = arqrVar;
        this.d = arqrVar2;
        this.e = 1000L;
    }
}
