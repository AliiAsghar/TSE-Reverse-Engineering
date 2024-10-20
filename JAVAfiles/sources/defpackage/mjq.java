package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum mjq {
    NONE(false, false),
    BEST_AVAILABLE(false, false),
    SATELLITE(false, false),
    SIMPLE(false, false),
    RICH(true, false),
    RICH_ENCRYPTED(true, true);

    public final boolean g;
    public final boolean h;

    mjq(boolean z, boolean z2) {
        this.g = z;
        this.h = z2;
    }
}
