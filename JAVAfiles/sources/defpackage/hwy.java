package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum hwy {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    public final boolean f;

    hwy(boolean z) {
        this.f = z;
    }
}
