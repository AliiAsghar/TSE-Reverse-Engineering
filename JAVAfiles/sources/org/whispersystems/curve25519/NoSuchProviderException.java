package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NoSuchProviderException extends RuntimeException {
    private final Throwable nested;

    public NoSuchProviderException(String str) {
        super(str);
        this.nested = null;
    }

    public Throwable getNested() {
        return this.nested;
    }

    public NoSuchProviderException(Throwable th) {
        this.nested = th;
    }
}
