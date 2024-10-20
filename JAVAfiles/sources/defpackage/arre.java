package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arre implements Serializable {
    public static final arre a = new arre();

    private Object readResolve() {
        return a;
    }
}
