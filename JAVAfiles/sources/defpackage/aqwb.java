package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwb extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final Status a;
    public final aqut b;

    public aqwb(Status status) {
        this(status, null);
    }

    public aqwb(Status status, aqut aqutVar) {
        this(status, aqutVar, true);
    }

    public aqwb(Status status, aqut aqutVar, boolean z) {
        super(Status.e(status), status.r, true, z);
        this.a = status;
        this.b = aqutVar;
    }
}
