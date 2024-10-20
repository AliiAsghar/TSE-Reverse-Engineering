package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alpk implements Serializable {
    final alpl a;

    public alpk(alpl alplVar) {
        this.a = alplVar;
    }

    Object readResolve() {
        return this.a.j();
    }
}
