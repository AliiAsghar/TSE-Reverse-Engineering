package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apip implements apak {
    DNS_QUERY_RESULT_UNKNOWN(0),
    DNS_QUERY_RESULT_SUCCESS(1),
    DNS_QUERY_RESULT_FAILURE(5),
    DEPRECATED_DNS_QUERY_RESULT_FAILURE_GENERIC(2),
    DEPRECATED_DNS_QUERY_RESULT_FAILURE_HOST_NOT_FOUND(3),
    DEPRECATED_DNS_QUERY_RESULT_FAILURE_QUERY_TYPE_NOT_FOUND(4);

    public final int g;

    apip(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
