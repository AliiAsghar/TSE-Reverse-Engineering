package com.google.communication.synapse.security.scytale;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class WriteOnlySqlStatementInterface {
    public abstract Status bindBlob(byte[] bArr);

    public abstract Status bindInt(long j);

    public abstract Status bindString(byte[] bArr);

    public abstract void close();

    public abstract Status executeWrite();

    public abstract void reset();
}
