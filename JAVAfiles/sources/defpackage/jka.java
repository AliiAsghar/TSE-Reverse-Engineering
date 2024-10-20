package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jka {
    public final String a;
    public final aerb b;
    public final List c;

    public jka(String str, aerb aerbVar, List list) {
        aerbVar.getClass();
        list.getClass();
        this.a = str;
        this.b = aerbVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jka)) {
            return false;
        }
        jka jkaVar = (jka) obj;
        if (d.F(this.a, jkaVar.a) && this.b == jkaVar.b && d.F(this.c, jkaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DirectSendHeaderUiData(title=" + this.a + ", navigationIcon=" + this.b + ", toolbarActions=" + this.c + ")";
    }
}
