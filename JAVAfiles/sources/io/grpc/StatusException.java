package io.grpc;

import defpackage.aqut;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final Status a;
    public final aqut b;

    public StatusException(Status status) {
        this(status, null);
    }

    public StatusException(Status status, aqut aqutVar) {
        super(Status.e(status), status.r, true, true);
        this.a = status;
        this.b = aqutVar;
    }
}
