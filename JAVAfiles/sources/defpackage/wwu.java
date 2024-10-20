package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wwu {
    public final adiv a;
    public final adiv b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public wwu(adiv adivVar, adiv adivVar2, int i, int i2) {
        this.a = adivVar;
        this.b = adivVar2;
        this.c = i;
        this.d = i2;
        this.e = adom.n(adivVar).a;
        this.f = adom.n(adivVar2).a;
    }

    public static final String a(String str) {
        if (str.length() > 3) {
            String substring = str.substring(str.length() - 3);
            substring.getClass();
            return substring;
        }
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwu)) {
            return false;
        }
        wwu wwuVar = (wwu) obj;
        if (d.F(this.a, wwuVar.a) && d.F(this.b, wwuVar.b) && a.bA(this.c, wwuVar.c) && a.bA(this.d, wwuVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        int i = this.d;
        return "ComparisonLoggingEventDetails(simSubscriptionInfoRcsProvisioningId=" + this.a + ", simPreferencesRcsProvisioningId=" + this.b + ", simSubscriptionInfoSubId=" + adix.a(this.c) + ", simPreferencesSubId=" + adix.a(i) + ")";
    }
}
