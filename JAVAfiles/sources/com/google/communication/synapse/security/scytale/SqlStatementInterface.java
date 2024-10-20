package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class SqlStatementInterface {
    public abstract Status bindInt(long j);

    public abstract Status bindString(byte[] bArr);

    public abstract void close();

    public abstract Status execute();

    public abstract StatusOr<byte[]> getBlob(int i);

    public abstract StatusOr<Long> getInt(int i);

    public abstract StatusOr<byte[]> getString(int i);

    public abstract boolean hasNext();

    public abstract Status moveNext();

    public abstract void reset();
}
