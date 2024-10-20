package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apje implements apak {
    SOCKET_FAILURE_UNKNOWN(0),
    SOCKET_FAILURE_UNABLE_TO_OPEN(1),
    SOCKET_FAILURE_READ_TIMEOUT(2),
    SOCKET_FAILURE_WRITE_TIMEOUT(3),
    SOCKET_FAILURE_HOST_VERIFICATION_FAILED(4),
    SOCKET_FAILURE_READ_ERROR(5),
    SOCKET_FAILURE_WRITE_ERROR(6),
    SOCKET_FAILURE_UNABLE_TO_CLOSE(7),
    SOCKET_FAILURE_TLS_HANDSHAKE_FAILED(8);

    public final int j;

    apje(int i) {
        this.j = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
