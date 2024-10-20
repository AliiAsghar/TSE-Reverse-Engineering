package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arsr implements Serializable {
    public static final arsr a = new arsr();
    private static final long serialVersionUID = 0;

    private arsr() {
    }

    private final Object readResolve() {
        return arst.a;
    }
}
