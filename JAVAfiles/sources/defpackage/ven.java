package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ven {
    public final Optional a;
    public final akul b;

    public ven() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ven) {
            ven venVar = (ven) obj;
            if (this.a.equals(venVar.a) && this.b.equals(venVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        akul akulVar = this.b;
        return "ConversationSelfResult{getSelf=" + this.a.toString() + ", isSelfE2eeProvisioned=" + akulVar.toString() + "}";
    }

    public ven(Optional optional, akul akulVar) {
        if (optional == null) {
            throw new NullPointerException("Null getSelf");
        }
        this.a = optional;
        if (akulVar != null) {
            this.b = akulVar;
            return;
        }
        throw new NullPointerException("Null isSelfE2eeProvisioned");
    }
}
