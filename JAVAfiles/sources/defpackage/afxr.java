package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxr implements afqs {
    public final String a;
    public final afqq b;
    private final String c;
    private final String d;
    private final Iterable e;
    private final afxp f = new afxp(new afqo(this));

    public afxr(String str, String str2, String str3, Iterable iterable, afqq afqqVar) {
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = iterable;
        this.b = afqqVar;
    }

    @Override // defpackage.afqs
    public final afqq b() {
        return this.b;
    }

    @Override // defpackage.afqs
    public final /* synthetic */ afsu d() {
        return afsk.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afxr)) {
            return false;
        }
        afxr afxrVar = (afxr) obj;
        if (d.F(this.a, afxrVar.a) && d.F(this.c, afxrVar.c) && d.F(this.d, afxrVar.d) && d.F(this.e, afxrVar.e) && d.F(this.b, afxrVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afsn
    public final Iterable f() {
        return this.e;
    }

    @Override // defpackage.afcq
    public final /* synthetic */ afcp fh() {
        return this.b;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this.f;
    }

    @Override // defpackage.afcq
    public final String fj() {
        String str = this.d;
        String str2 = this.c;
        String bo = aeke.bo(this.a);
        String bo2 = aeke.bo(str2);
        Uri parse = Uri.parse(str);
        parse.getClass();
        String bn = aeke.bn(parse);
        Iterable iterable = this.e;
        ArrayList arrayList = new ArrayList(aqjn.J(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((afqr) it.next()).fj());
        }
        return "StickerMedia(id='" + bo + "', description='" + bo2 + "', webUrl='" + bn + "', variations=" + arrayList + ", source=" + this.b + ")";
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
        return (((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    @Override // defpackage.afqs
    public final String i() {
        return this.d;
    }

    @Override // defpackage.afso
    public final /* bridge */ /* synthetic */ afsw m() {
        afsw d;
        d = d();
        return d;
    }

    public final String toString() {
        return "StickerMedia(id=" + this.a + ", description=" + this.c + ", webUrl=" + this.d + ", variations=" + this.e + ", source=" + this.b + ")";
    }
}
