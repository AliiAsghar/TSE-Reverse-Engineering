package defpackage;

import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvo {
    public final Optional a;
    public final qvn b;
    public final qwe c;
    public final Optional d;
    private final alpt e;
    private final Optional f;
    private final String g;

    public qvo() {
        throw null;
    }

    public final alpt a() {
        return (alpt) Collection.EL.stream(this.e).map(new qvm(0)).collect(alls.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvo) {
            qvo qvoVar = (qvo) obj;
            if (this.e.equals(qvoVar.e) && this.a.equals(qvoVar.a) && this.b.equals(qvoVar.b) && this.f.equals(qvoVar.f) && this.c.equals(qvoVar.c) && this.g.equals(qvoVar.g) && this.d.equals(qvoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        Optional optional = this.d;
        qwe qweVar = this.c;
        Optional optional2 = this.f;
        qvn qvnVar = this.b;
        Optional optional3 = this.a;
        return "MyIdentity{allSubs=" + String.valueOf(this.e) + ", address=" + String.valueOf(optional3) + ", addressType=" + String.valueOf(qvnVar) + ", messagingIdentity=" + String.valueOf(optional2) + ", token=" + String.valueOf(qweVar) + ", displayName=" + this.g + ", provisioningId=" + String.valueOf(optional) + ", isVerified=false}";
    }

    public qvo(alpt alptVar, Optional optional, qvn qvnVar, Optional optional2, qwe qweVar, String str, Optional optional3) {
        this.e = alptVar;
        this.a = optional;
        this.b = qvnVar;
        this.f = optional2;
        this.c = qweVar;
        this.g = str;
        this.d = optional3;
    }
}
