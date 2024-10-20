package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkp {
    public final boolean a;
    public final boolean b;
    public final double c;
    public final alog d;
    private final Bundle e;

    public kkp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kkp) {
            kkp kkpVar = (kkp) obj;
            if (this.a == kkpVar.a && this.b == kkpVar.b) {
                if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(kkpVar.c) && alzz.at(this.d, kkpVar.d) && this.e.equals(kkpVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long doubleToLongBits = (Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c);
        int i2 = 1231;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((i ^ 1000003) * 1000003) ^ 1237;
        if (true != this.b) {
            i2 = 1237;
        }
        return ((((((int) doubleToLongBits) ^ (((i3 * 1000003) ^ i2) * 1000003)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.e;
        return "DonatableMessageRequest{includePersonalMessages=" + this.a + ", includeMessagesFromContacts=false, includeSentMessages=" + this.b + ", normalizedEditDistanceThreshold=" + this.c + ", redactors=" + String.valueOf(this.d) + ", intentExtras=" + String.valueOf(bundle) + "}";
    }

    public kkp(boolean z, boolean z2, double d, alog alogVar, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = d;
        this.d = alogVar;
        this.e = bundle;
    }
}
