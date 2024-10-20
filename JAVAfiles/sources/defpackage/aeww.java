package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeww {
    public final aeia a;
    public final String b;
    public final String c;
    public final List d;
    public final arqg e;
    public final aewv f;

    public aeww(aeia aeiaVar, aewv aewvVar, String str, String str2, List list, arqg arqgVar) {
        str.getClass();
        list.getClass();
        this.a = aeiaVar;
        this.f = aewvVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeww)) {
            return false;
        }
        aeww aewwVar = (aeww) obj;
        if (d.F(this.a, aewwVar.a) && d.F(this.f, aewwVar.f) && d.F(this.b, aewwVar.b) && d.F(this.c, aewwVar.c) && d.F(this.d, aewwVar.d) && d.F(this.e, aewwVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        aeia aeiaVar = this.a;
        int i = 0;
        if (aeiaVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeiaVar.hashCode();
        }
        int hashCode2 = (((hashCode * 31) + this.f.hashCode()) * 31) + this.b.hashCode();
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((hashCode2 * 31) + i) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AppBarUiData(navigationAction=" + this.a + ", logo=" + this.f + ", title=" + this.b + ", description=" + this.c + ", actions=" + this.d + ", onClick=" + this.e + ")";
    }
}
