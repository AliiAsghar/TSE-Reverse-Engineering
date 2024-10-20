package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aecz extends aeda {
    public final aefg a;
    public final aozb b;
    public final aozb c;
    public final List d;
    public final boolean e;
    public final String f;
    public final aozb g;

    public aecz(aefg aefgVar, aozb aozbVar, aozb aozbVar2, List list, boolean z, String str, aozb aozbVar3) {
        aefgVar.getClass();
        aozbVar2.getClass();
        list.getClass();
        this.a = aefgVar;
        this.b = aozbVar;
        this.c = aozbVar2;
        this.d = list;
        this.e = z;
        this.f = str;
        this.g = aozbVar3;
    }

    @Override // defpackage.aeda
    public final aozb cw() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aecz)) {
            return false;
        }
        aecz aeczVar = (aecz) obj;
        if (d.F(this.a, aeczVar.a) && d.F(this.b, aeczVar.b) && d.F(this.c, aeczVar.c) && d.F(this.d, aeczVar.d) && this.e == aeczVar.e && d.F(this.f, aeczVar.f) && d.F(this.g, aeczVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aozb aozbVar = this.b;
        int i = 0;
        if (aozbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aozbVar.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a.v(this.e)) * 31;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.g.hashCode();
    }
}
