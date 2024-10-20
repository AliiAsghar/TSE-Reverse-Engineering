package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwp {
    public final ResolvedRecipient a;
    public final int b;

    public zwp(ResolvedRecipient resolvedRecipient, int i) {
        this.a = resolvedRecipient;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwp)) {
            return false;
        }
        zwp zwpVar = (zwp) obj;
        if (d.F(this.a, zwpVar.a) && this.b == zwpVar.b) {
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
        int i = this.b;
        a.bm(i);
        return (hashCode * 31) + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("UnblockUnspamBanner2LoadedData(recipient=");
        sb.append(this.a);
        sb.append(", bannerType=");
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "NOT_ELIGIBLE";
                    } else {
                        str = "DETECTED_RECIPIENT";
                    }
                } else {
                    str = "REPORTED_CONVERSATION";
                }
            } else {
                str = "REPORTED_RECIPIENT";
            }
        } else {
            str = "BLOCKED_RECIPIENT";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
