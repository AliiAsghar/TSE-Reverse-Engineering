package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alnw implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public alnw(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new alnx(this.a);
    }
}
