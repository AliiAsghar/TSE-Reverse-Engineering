package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjl {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final bqf e;
    public final arqg f;
    public final arqg g;

    public kjl(String str, String str2, String str3, boolean z, bqf bqfVar, arqg arqgVar, arqg arqgVar2) {
        str.getClass();
        bqfVar.getClass();
        arqgVar.getClass();
        arqgVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = bqfVar;
        this.f = arqgVar;
        this.g = arqgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjl)) {
            return false;
        }
        kjl kjlVar = (kjl) obj;
        if (d.F(this.a, kjlVar.a) && d.F(this.b, kjlVar.b) && d.F(this.c, kjlVar.c) && this.d == kjlVar.d && this.e == kjlVar.e && d.F(this.f, kjlVar.f) && d.F(this.g, kjlVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((((((hashCode2 * 31) + hashCode) * 31) + a.v(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "SnackbarUiData(id=" + this.a + ", text=" + this.b + ", actionLabel=" + this.c + ", withDismissAction=" + this.d + ", duration=" + this.e + ", onDismissed=" + this.f + ", onActionPerformed=" + this.g + ")";
    }

    public /* synthetic */ kjl(String str, String str2, boolean z, bqf bqfVar, arqg arqgVar, int i) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : null, str, (i & 4) != 0 ? null : str2, ((i & 8) == 0) & z, (i & 16) != 0 ? bqf.a : bqfVar, (i & 32) != 0 ? kek.j : null, (i & 64) != 0 ? kek.k : arqgVar);
    }
}
