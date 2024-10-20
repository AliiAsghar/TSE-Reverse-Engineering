package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class armi implements Serializable, arml {
    private final Object a;

    public armi(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.arml
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.arml
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
