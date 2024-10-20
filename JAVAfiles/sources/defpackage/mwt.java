package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwt {
    public final ResolvedRecipient a;
    private final Instant b;

    public mwt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwt) {
            mwt mwtVar = (mwt) obj;
            if (this.a.equals(mwtVar.a) && this.b.equals(mwtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Instant instant = this.b;
        return "BugleActiveComposer{recipient=" + String.valueOf(this.a) + ", expiry=" + String.valueOf(instant) + "}";
    }

    public mwt(ResolvedRecipient resolvedRecipient, Instant instant) {
        this.a = resolvedRecipient;
        this.b = instant;
    }
}
