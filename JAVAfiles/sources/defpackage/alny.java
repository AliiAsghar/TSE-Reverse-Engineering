package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alny implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public alny(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new alnz(this.a.clone());
    }
}
