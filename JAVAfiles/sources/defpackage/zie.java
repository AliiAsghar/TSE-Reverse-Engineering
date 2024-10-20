package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zie {
    public final String a;
    public final String b;
    public final Intent c;
    private final String d;

    public zie(String str, String str2, String str3, Intent intent) {
        this.d = str;
        this.a = str2;
        this.b = str3;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zie)) {
            return false;
        }
        zie zieVar = (zie) obj;
        if (d.F(this.d, zieVar.d) && d.F(this.a, zieVar.a) && d.F(this.b, zieVar.b) && d.F(this.c, zieVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ChatIdentitySettingsUiData(id=" + this.d + ", simName=" + this.a + ", phoneNumber=" + this.b + ", simSettingsIntent=" + this.c + ")";
    }
}
