package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aloy implements Serializable {
    private static final long serialVersionUID = 0;
    final alor a;

    public aloy(alor alorVar) {
        this.a = alorVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}
