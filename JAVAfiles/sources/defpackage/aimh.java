package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aimh extends aiku {
    public String c;
    public String d;

    public aimh() {
    }

    public abstract String a();

    @Override // defpackage.aiku
    public String c() {
        return this.c + ": " + a() + VCardBuilder.VCARD_END_OF_LINE;
    }

    public abstract aila d();

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof aimh)) {
            aimh aimhVar = (aimh) obj;
            if (d.B(this.c, aimhVar.c)) {
                return d.B(this.d, aimhVar.d);
            }
            return false;
        }
        return false;
    }

    public final int h(int i) {
        try {
            return Integer.parseInt(a());
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public int hashCode() {
        int i;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.d;
        if (str2 != null) {
            return (i * 37) + str2.hashCode();
        }
        return i;
    }

    public final String toString() {
        return c();
    }

    public aimh(String str) {
        this.c = str;
    }

    @Override // defpackage.aiku
    public Object clone() {
        return this;
    }
}
