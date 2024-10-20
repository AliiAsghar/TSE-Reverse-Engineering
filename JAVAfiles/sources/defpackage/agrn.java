package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agrn {
    public static volatile agrn e;

    public static agrn c() {
        if (e == null) {
            synchronized (agrn.class) {
                if (e == null) {
                    try {
                        Class.forName("agrm");
                        if (e == null) {
                            throw new IllegalStateException("HatsModule is not initialized.");
                        }
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalStateException("Failed to initialize HatsModule", e2);
                    }
                }
            }
        }
        return e;
    }

    public abstract agqz a();

    public abstract agrr b();
}
