package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zck {
    public final Recipient a;
    public final akul b;

    public zck(Recipient recipient, akul akulVar) {
        this.a = recipient;
        this.b = akulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zck)) {
            return false;
        }
        zck zckVar = (zck) obj;
        if (d.F(this.a, zckVar.a) && d.F(this.b, zckVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CachedRecipient(recipient=" + this.a + ", capabilities=" + this.b + ")";
    }
}
