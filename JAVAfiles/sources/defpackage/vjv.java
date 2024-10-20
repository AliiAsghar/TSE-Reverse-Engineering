package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjv {
    public final Optional a;
    public final vli b;
    public final vlb c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    public vjv() {
        throw null;
    }

    public static aiwl a() {
        aiwl aiwlVar = new aiwl(null, null, null);
        aiwlVar.g = Optional.empty();
        aiwlVar.n(false);
        aiwlVar.c = Optional.empty();
        aiwlVar.e = Optional.empty();
        return aiwlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vjv) {
            vjv vjvVar = (vjv) obj;
            if (this.a.equals(vjvVar.a) && this.b.equals(vjvVar.b) && this.c.equals(vjvVar.c) && this.d.equals(vjvVar.d) && this.e.equals(vjvVar.e) && this.f == vjvVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        if (true != this.f) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        vlb vlbVar = this.c;
        vli vliVar = this.b;
        return "BasicNotificationBuilderInfo{notificationExtras=" + String.valueOf(this.a) + ", notificationStyleInfo=" + String.valueOf(vliVar) + ", clickInteractionInfo=" + String.valueOf(vlbVar) + ", swipeInteractionInfo=" + String.valueOf(optional2) + ", notificationActions=" + String.valueOf(optional) + ", shouldAlert=" + this.f + "}";
    }

    public vjv(Optional optional, vli vliVar, vlb vlbVar, Optional optional2, Optional optional3, boolean z) {
        this.a = optional;
        this.b = vliVar;
        this.c = vlbVar;
        this.d = optional2;
        this.e = optional3;
        this.f = z;
    }
}
