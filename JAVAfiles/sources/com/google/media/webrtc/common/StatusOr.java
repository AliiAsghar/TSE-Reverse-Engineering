package com.google.media.webrtc.common;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class StatusOr<T> {
    public boolean hasValue;
    public Status status;
    public T value;

    private StatusOr() {
    }

    public static <T> StatusOr<T> fromStatus(Status status) {
        StatusOr<T> statusOr = new StatusOr<>();
        statusOr.status = status;
        statusOr.hasValue = false;
        return statusOr;
    }

    public static <T> StatusOr<T> fromValue(T t) {
        StatusOr<T> statusOr = new StatusOr<>();
        statusOr.status = Status.b;
        statusOr.hasValue = true;
        statusOr.value = t;
        return statusOr;
    }
}
