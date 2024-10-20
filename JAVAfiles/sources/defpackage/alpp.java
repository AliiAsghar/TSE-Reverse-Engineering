package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alpp implements Serializable {
    private final alog a;

    public alpp(alog alogVar) {
        this.a = alogVar;
    }

    Object readResolve() {
        if (this.a.isEmpty()) {
            return alpq.a;
        }
        if (alzz.at(this.a, alog.r(alst.a))) {
            return alpq.b;
        }
        return new alpq(this.a);
    }
}
