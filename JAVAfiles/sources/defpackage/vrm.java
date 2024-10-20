package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrm {
    public final amwt a;
    public final vrk b;
    public final Optional c;
    public final Optional d;

    public vrm() {
        throw null;
    }

    public static vrm a(amwt amwtVar, vrk vrkVar, int i, Optional optional) {
        Optional of = Optional.of(Integer.valueOf(i));
        if (amwtVar == null) {
            amwtVar = amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
        }
        return new vrm(amwtVar, vrkVar, of, optional);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrm) {
            vrm vrmVar = (vrm) obj;
            if (this.a.equals(vrmVar.a) && this.b.equals(vrmVar.b) && this.c.equals(vrmVar.c) && this.d.equals(vrmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        vrk vrkVar = this.b;
        return "RcsAvailabilityUpdate{availability=" + this.a.toString() + ", hint=" + vrkVar.toString() + ", subId=" + optional2.toString() + ", rcsProvisioningId=" + optional.toString() + "}";
    }

    public vrm(amwt amwtVar, vrk vrkVar, Optional optional, Optional optional2) {
        if (amwtVar == null) {
            throw new NullPointerException("Null availability");
        }
        this.a = amwtVar;
        if (vrkVar != null) {
            this.b = vrkVar;
            this.c = optional;
            this.d = optional2;
            return;
        }
        throw new NullPointerException("Null hint");
    }
}
