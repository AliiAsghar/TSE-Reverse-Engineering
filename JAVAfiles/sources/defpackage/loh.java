package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loh implements lkf {
    public final ResolvedRecipient a;
    public final jxo b;

    public loh(ResolvedRecipient resolvedRecipient, jxo jxoVar) {
        this.a = resolvedRecipient;
        this.b = jxoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loh)) {
            return false;
        }
        loh lohVar = (loh) obj;
        if (d.F(this.a, lohVar.a) && d.F(this.b, lohVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ShowOrAddContact(recipient=" + this.a + ", layoutRect=" + this.b + ")";
    }

    public /* synthetic */ loh(ResolvedRecipient resolvedRecipient) {
        this(resolvedRecipient, new jxo(0, 0, 0, 0));
    }
}
