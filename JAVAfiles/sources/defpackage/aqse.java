package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqse {
    public final aqsd a;
    public final Status b;

    public aqse(aqsd aqsdVar, Status status) {
        aqsdVar.getClass();
        this.a = aqsdVar;
        status.getClass();
        this.b = status;
    }

    public static aqse a(aqsd aqsdVar) {
        boolean z;
        if (aqsdVar != aqsd.TRANSIENT_FAILURE) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "state is TRANSIENT_ERROR. Use forError() instead");
        return new aqse(aqsdVar, Status.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqse)) {
            return false;
        }
        aqse aqseVar = (aqse) obj;
        if (!this.a.equals(aqseVar.a) || !this.b.equals(aqseVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Status status = this.b;
        return status.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Status status = this.b;
        if (status.f()) {
            return this.a.toString();
        }
        return this.a.toString() + "(" + status.toString() + ")";
    }
}
