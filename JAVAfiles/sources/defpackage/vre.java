package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vre {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    private final Optional f;
    private final Optional g;

    public vre() {
        throw null;
    }

    public static vre a(vrd vrdVar) {
        return new vre(Optional.of(vrdVar), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vre) {
            vre vreVar = (vre) obj;
            if (this.a.equals(vreVar.a) && this.b.equals(vreVar.b) && this.c.equals(vreVar.c) && this.d.equals(vreVar.d) && this.e.equals(vreVar.e) && this.f.equals(vreVar.f) && this.g.equals(vreVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        Optional optional = this.g;
        Optional optional2 = this.f;
        Optional optional3 = this.e;
        Optional optional4 = this.d;
        Optional optional5 = this.c;
        Optional optional6 = this.b;
        return "TransactionId{mmsMessage=" + this.a.toString() + ", legacyConferenceUri=" + optional6.toString() + ", rcsMessage=" + optional5.toString() + ", legacyTransactionId=" + optional4.toString() + ", mmsMessageProto=" + optional3.toString() + ", smsMessage=" + optional2.toString() + ", messagePersistenceId=" + String.valueOf(optional) + "}";
    }

    public vre(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
    }
}
