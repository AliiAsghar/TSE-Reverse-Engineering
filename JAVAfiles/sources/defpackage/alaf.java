package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alaf extends alar {
    public final Optional a;
    public final List b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    private final Optional f;
    private final Optional g;

    public alaf() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.f;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alaf) {
            alaf alafVar = (alaf) obj;
            if (this.f.equals(alafVar.f) && this.g.equals(alafVar.g) && this.a.equals(alafVar.a) && this.b.equals(alafVar.b) && this.c.equals(alafVar.c) && this.d.equals(alafVar.d) && this.e.equals(alafVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        Optional optional3 = this.c;
        List list = this.b;
        Optional optional4 = this.a;
        Optional optional5 = this.g;
        return "Order{id=" + String.valueOf(this.f) + ", name=" + String.valueOf(optional5) + ", orderDate=" + String.valueOf(optional4) + ", orderedItems=" + String.valueOf(list) + ", orderStatus=" + String.valueOf(optional3) + ", seller=" + String.valueOf(optional2) + ", orderDelivery=" + String.valueOf(optional) + "}";
    }

    public alaf(Optional optional, Optional optional2, Optional optional3, List list, Optional optional4, Optional optional5, Optional optional6) {
        this.f = optional;
        this.g = optional2;
        this.a = optional3;
        this.b = list;
        this.c = optional4;
        this.d = optional5;
        this.e = optional6;
    }
}
