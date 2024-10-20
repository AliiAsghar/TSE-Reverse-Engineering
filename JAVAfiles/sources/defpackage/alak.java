package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alak extends alar {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    private final Optional g;
    private final Optional h;

    public alak() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.g;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alak) {
            alak alakVar = (alak) obj;
            if (this.g.equals(alakVar.g) && this.h.equals(alakVar.h) && this.a.equals(alakVar.a) && this.b.equals(alakVar.b) && this.c.equals(alakVar.c) && this.d.equals(alakVar.d) && this.e.equals(alakVar.e) && this.f.equals(alakVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        Optional optional6 = this.a;
        Optional optional7 = this.h;
        return "ParcelDelivery{id=" + String.valueOf(this.g) + ", name=" + String.valueOf(optional7) + ", deliveryAddress=" + String.valueOf(optional6) + ", deliveryMethod=" + String.valueOf(optional5) + ", expectedArrivalFrom=" + String.valueOf(optional4) + ", expectedArrivalUntil=" + String.valueOf(optional3) + ", trackingNumber=" + String.valueOf(optional2) + ", trackingUrl=" + String.valueOf(optional) + "}";
    }

    public alak(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8) {
        this.g = optional;
        this.h = optional2;
        this.a = optional3;
        this.b = optional4;
        this.c = optional5;
        this.d = optional6;
        this.e = optional7;
        this.f = optional8;
    }
}
