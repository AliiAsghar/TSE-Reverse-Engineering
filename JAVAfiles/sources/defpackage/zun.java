package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zun {
    public final ResolvedRecipient a;
    public final boolean b;
    public final boolean c;

    public zun(ResolvedRecipient resolvedRecipient, boolean z, boolean z2) {
        this.a = resolvedRecipient;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zun)) {
            return false;
        }
        zun zunVar = (zun) obj;
        if (d.F(this.a, zunVar.a) && this.b == zunVar.b && this.c == zunVar.c) {
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
        return "AddContactBanner2LoadedData(recipient=" + this.a + ", isBannerEligible=" + this.b + ", isAddContactEligible=" + this.c + ")";
    }
}
