package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xdr {
    public final Optional a;
    public final amja b;

    public xdr() {
        throw null;
    }

    public static xou a() {
        xou xouVar = new xou((byte[]) null, (byte[]) null);
        aozy createBuilder = amja.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amja amjaVar = (amja) apagVar;
        amjaVar.d = 0;
        amjaVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amja amjaVar2 = (amja) createBuilder.b;
        amjaVar2.c = 0;
        amjaVar2.b |= 1;
        xouVar.e((amja) createBuilder.s());
        return xouVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdr) {
            xdr xdrVar = (xdr) obj;
            if (this.a.equals(xdrVar.a) && this.b.equals(xdrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        amja amjaVar = this.b;
        return "RcsCapabilitiesWithMetadataAndLookupType{rcsCapabilitiesWithMetadata=" + String.valueOf(this.a) + ", capabilityLookup=" + String.valueOf(amjaVar) + "}";
    }

    public xdr(Optional optional, amja amjaVar) {
        this.a = optional;
        this.b = amjaVar;
    }
}
