package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vaz {
    CACHE_ALLOWED(true, true),
    FORCE_REFRESH(false, true),
    REFRESH_WITHOUT_REREGISTER(false, false);

    public final boolean d;
    public final boolean e;

    vaz(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
