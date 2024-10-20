package defpackage;

import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsy extends StopAllRcsTransportsExceptRequest {
    private final aplj a;

    public adsy(aplj apljVar) {
        if (apljVar != null) {
            this.a = apljVar;
            return;
        }
        throw new NullPointerException("Null requestProto");
    }

    @Override // com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest
    public final aplj a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StopAllRcsTransportsExceptRequest) {
            return this.a.equals(((StopAllRcsTransportsExceptRequest) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "StopAllRcsTransportsExceptRequest{requestProto=" + this.a.toString() + "}";
    }
}
