package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryc {
    private final yjt a;
    private final yjt b;
    private final yjt c;
    private final yjt d;
    private final List e;
    private final List f;

    public ryc(yjt yjtVar, yjt yjtVar2, yjt yjtVar3, yjt yjtVar4, List list, List list2) {
        this.a = yjtVar;
        this.b = yjtVar2;
        this.c = yjtVar3;
        this.d = yjtVar4;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryc)) {
            return false;
        }
        ryc rycVar = (ryc) obj;
        if (d.F(this.a, rycVar.a) && d.F(this.b, rycVar.b) && d.F(this.c, rycVar.c) && d.F(this.d, rycVar.d) && d.F(this.e, rycVar.e) && d.F(this.f, rycVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a.a;
        List list = this.e;
        yjt yjtVar = this.d;
        return (((((((((i * 31) + this.b.a) * 31) + this.c.a) * 31) + yjtVar.a) * 31) + list.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "CountryCodes(deviceCountry=" + this.a + ", deviceCountryDeprecated=" + this.b + ", localeCountry=" + this.c + ", settingsCountry=" + this.d + ", simCountryCodes=" + this.e + ", networkCountryCodes=" + this.f + ")";
    }
}
