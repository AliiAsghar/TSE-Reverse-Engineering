package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ere {
    public final String a;
    public final erb b;
    public final era c;
    public final erh d;
    public final eqv e;
    public final erc f;

    static {
        new equ().a();
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
    }

    public ere(String str, eqw eqwVar, erb erbVar, era eraVar, erh erhVar, erc ercVar) {
        this.a = str;
        this.b = erbVar;
        this.c = eraVar;
        this.d = erhVar;
        this.e = eqwVar;
        this.f = ercVar;
    }

    public static ere a(Uri uri) {
        equ equVar = new equ();
        equVar.b = uri;
        return equVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ere)) {
            return false;
        }
        ere ereVar = (ere) obj;
        if (Objects.equals(this.a, ereVar.a) && this.e.equals(ereVar.e) && Objects.equals(this.b, ereVar.b) && Objects.equals(this.c, ereVar.c) && Objects.equals(this.d, ereVar.d) && Objects.equals(this.f, ereVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        erb erbVar = this.b;
        if (erbVar != null) {
            i = erbVar.hashCode();
        } else {
            i = 0;
        }
        return (((((((hashCode + i) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31;
    }
}
