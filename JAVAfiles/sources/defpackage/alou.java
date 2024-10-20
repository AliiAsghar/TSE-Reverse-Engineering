package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alou implements Serializable {
    private static final long serialVersionUID = 0;
    final alor a;

    public alou(alor alorVar) {
        this.a = alorVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}
