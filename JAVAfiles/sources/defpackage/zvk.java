package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvk {
    public final boolean a;
    public final ResolvedRecipient b;

    public zvk(boolean z, ResolvedRecipient resolvedRecipient) {
        this.a = z;
        this.b = resolvedRecipient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvk)) {
            return false;
        }
        zvk zvkVar = (zvk) obj;
        if (this.a == zvkVar.a && d.F(this.b, zvkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ResolvedRecipient resolvedRecipient = this.b;
        if (resolvedRecipient == null) {
            hashCode = 0;
        } else {
            hashCode = resolvedRecipient.hashCode();
        }
        return (a.v(this.a) * 31) + hashCode;
    }

    public final String toString() {
        return "RoamingShortCodeLoadedData(isBannerEligible=" + this.a + ", otherRecipient=" + this.b + ")";
    }
}
