package defpackage;

import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsx extends InitializeAndStartRcsTransportRequest {
    private final aplh a;

    public adsx(aplh aplhVar) {
        if (aplhVar != null) {
            this.a = aplhVar;
            return;
        }
        throw new NullPointerException("Null requestProto");
    }

    @Override // com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest
    public final aplh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InitializeAndStartRcsTransportRequest) {
            return this.a.equals(((InitializeAndStartRcsTransportRequest) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "InitializeAndStartRcsTransportRequest{requestProto=" + this.a.toString() + "}";
    }
}
