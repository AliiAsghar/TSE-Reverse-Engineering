package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfm {
    public static final int[] a = {17, 1, 0};
    public static final int[] b = {1, 0, 17};

    public static Optional a(int i) {
        if (i < 0) {
            return Optional.empty();
        }
        return Optional.of(Integer.valueOf(i));
    }
}
