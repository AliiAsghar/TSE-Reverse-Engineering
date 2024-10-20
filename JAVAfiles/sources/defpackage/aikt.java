package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikt {
    public String a;
    public String b;
    private int c;

    public final void a(String str) {
        this.a = str;
        if (str != null && (str.indexOf("#") >= 0 || str.indexOf(";") >= 0)) {
            b(1);
        } else {
            b(2);
        }
    }

    public final void b(int i) {
        if (i != 1) {
            i = 2;
        }
        this.c = i;
    }

    public final Object clone() {
        aikt aiktVar = new aikt();
        aiktVar.a(this.a);
        String str = this.b;
        if (str != null) {
            aiktVar.b = str;
        }
        return aiktVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aikt)) {
            return false;
        }
        aikt aiktVar = (aikt) obj;
        if (this.c != aiktVar.c || !d.B(this.b, aiktVar.b)) {
            return false;
        }
        String str = this.a;
        if (str == null && aiktVar.a != null) {
            return false;
        }
        if (str != null && !str.equalsIgnoreCase(aiktVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }
}
