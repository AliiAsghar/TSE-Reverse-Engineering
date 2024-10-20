package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtx {
    public static final Object a = new Object();
    public static adtz b;

    public static Optional a() {
        Optional ofNullable;
        synchronized (a) {
            ofNullable = Optional.ofNullable(b);
        }
        return ofNullable;
    }

    public static void b() {
        synchronized (a) {
            advr.k("Destroying JibeServiceComponent", new Object[0]);
            b = null;
        }
    }
}
