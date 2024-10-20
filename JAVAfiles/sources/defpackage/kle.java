package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum kle {
    DIGIT(0),
    URL(1),
    EMAIL(2);

    public final int d;

    kle(int i) {
        this.d = i;
    }

    public static kle a(int i) {
        for (kle kleVar : values()) {
            if (kleVar.d == i) {
                return kleVar;
            }
        }
        throw new IllegalArgumentException();
    }
}
