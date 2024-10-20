package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsj {
    private final String a;
    private final Object b;

    public aqsj(String str) {
        this(str, null);
    }

    public final Object a(aqsm aqsmVar) {
        Object d;
        aqvm aqvmVar = aqsmVar.f;
        if (aqvmVar == null) {
            d = null;
        } else {
            d = aqvmVar.d(this, hashCode(), 0);
        }
        if (d == null) {
            return this.b;
        }
        return d;
    }

    public final String toString() {
        return this.a;
    }

    public aqsj(String str, Object obj) {
        Logger logger = aqsm.c;
        this.a = str;
        this.b = obj;
    }
}
