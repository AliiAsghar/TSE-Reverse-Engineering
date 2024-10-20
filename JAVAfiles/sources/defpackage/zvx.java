package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvx {
    public final ResolvedRecipient a;
    public final boolean b;
    public final boolean c;

    public zvx(ResolvedRecipient resolvedRecipient, boolean z, boolean z2) {
        this.a = resolvedRecipient;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvx)) {
            return false;
        }
        zvx zvxVar = (zvx) obj;
        if (d.F(this.a, zvxVar.a) && this.b == zvxVar.b && this.c == zvxVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ResolvedRecipient resolvedRecipient = this.a;
        if (resolvedRecipient == null) {
            hashCode = 0;
        } else {
            hashCode = resolvedRecipient.hashCode();
        }
        return (((hashCode * 31) + a.v(this.b)) * 31) + a.v(this.c);
    }

    public final String toString() {
        return "SpamBanner2LoadedData(targetRecipient=" + this.a + ", isGroup=" + this.b + ", isBannerEligible=" + this.c + ")";
    }
}
