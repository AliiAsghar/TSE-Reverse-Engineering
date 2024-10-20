package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afql implements afqs {
    public final String a;
    public final String b;
    private final String c;
    private final Iterable d;
    private final afqq e;
    private final afqk f;

    public /* synthetic */ afql(String str, String str2, String str3, Iterable iterable, afqq afqqVar, int i) {
        afqqVar = (i & 16) != 0 ? afqp.a : afqqVar;
        str.getClass();
        str2.getClass();
        str3.getClass();
        iterable.getClass();
        afqqVar.getClass();
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.d = iterable;
        this.e = afqqVar;
        this.f = new afqk(new afqo(this));
    }

    @Override // defpackage.afqs
    public final afqq b() {
        return this.e;
    }

    @Override // defpackage.afqs
    public final /* synthetic */ afsu d() {
        return afsk.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afql)) {
            return false;
        }
        afql afqlVar = (afql) obj;
        if (d.F(this.a, afqlVar.a) && d.F(this.c, afqlVar.c) && d.F(this.b, afqlVar.b) && d.F(this.d, afqlVar.d) && d.F(this.e, afqlVar.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afsn
    public final Iterable f() {
        return this.d;
    }

    @Override // defpackage.afcq
    public final /* synthetic */ afcp fh() {
        return this.e;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this.f;
    }

    @Override // defpackage.afcq
    public final String fj() {
        String str = this.b;
        String str2 = this.c;
        String bo = aeke.bo(this.a);
        String bo2 = aeke.bo(str2);
        Uri parse = Uri.parse(str);
        parse.getClass();
        String bn = aeke.bn(parse);
        Iterable iterable = this.d;
        ArrayList arrayList = new ArrayList(aqjn.J(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((afqr) it.next()).fj());
        }
        return "GifMedia(id='" + bo + "', description='" + bo2 + "', webUrl='" + bn + "', variations=" + arrayList + ", source=" + this.e + ")";
    }

    @Override // defpackage.afqs
    public final String g() {
        return this.c;
    }

    @Override // defpackage.afqs
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // defpackage.afqs
    public final String i() {
        return this.b;
    }

    @Override // defpackage.afso
    public final /* bridge */ /* synthetic */ afsw m() {
        afsw d;
        d = d();
        return d;
    }

    public final String toString() {
        return "GifMedia(id=" + this.a + ", description=" + this.c + ", webUrl=" + this.b + ", variations=" + this.d + ", source=" + this.e + ")";
    }
}
