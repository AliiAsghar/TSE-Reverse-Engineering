package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxu {
    final String a = aktp.c();
    final alhr b = albo.D(new qwq(new RuntimeException(), 7));

    public final String a() {
        return (String) this.b.get();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qxu)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        qxu qxuVar = (qxu) obj;
        if (!Objects.equals(qxuVar.a, this.a) || !Objects.equals(qxuVar.a(), a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(a(), this.a);
    }
}
