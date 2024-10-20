package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class los implements lkf {
    public final ResolvedRecipient a;
    public final nfw b;

    public los(ResolvedRecipient resolvedRecipient, nfw nfwVar) {
        this.a = resolvedRecipient;
        this.b = nfwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof los)) {
            return false;
        }
        los losVar = (los) obj;
        if (d.F(this.a, losVar.a) && d.F(this.b, losVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return yyb.bh(super.toString()).toString();
    }
}
