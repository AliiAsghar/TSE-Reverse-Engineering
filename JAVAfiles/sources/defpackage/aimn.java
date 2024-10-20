package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimn extends aiku implements Cloneable {
    public String a = "SIP";
    public String b = "2.0";
    public String c = "UDP";

    @Override // defpackage.aiku
    public final String c() {
        return this.a.toUpperCase(Locale.US) + "/" + this.b + "/" + this.c.toUpperCase(Locale.US);
    }

    @Override // defpackage.aiku
    public final Object clone() {
        aimn aimnVar = new aimn();
        String str = this.a;
        if (str != null) {
            aimnVar.a = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            aimnVar.b = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            aimnVar.c = str3;
        }
        return aimnVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                aimn aimnVar = (aimn) obj;
                if (this.a.compareToIgnoreCase(aimnVar.a) != 0 || this.b.compareToIgnoreCase(aimnVar.b) != 0 || this.c.compareToIgnoreCase(aimnVar.c) != 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 999998888;
    }
}
