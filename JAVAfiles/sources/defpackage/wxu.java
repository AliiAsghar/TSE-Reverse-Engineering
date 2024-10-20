package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wxu extends RuntimeException {
    public wxu() {
        super("BCM is used, but legacy access to telephony was performed. Calling getOrCreateThreadId when BCM is used is not allowed");
    }
}
