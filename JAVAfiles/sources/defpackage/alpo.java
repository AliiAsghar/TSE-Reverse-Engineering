package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alpo implements Serializable, alsu {
    public static final alpo a;
    private static final long serialVersionUID = 0;
    public final transient alog b;
    public final transient alog c;

    static {
        int i = alog.d;
        alog alogVar = alsx.a;
        a = new alpo(alogVar, alogVar);
    }

    public alpo(alog alogVar, alog alogVar2) {
        this.b = alogVar;
        this.c = alogVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.alsu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final alor b() {
        if (this.b.isEmpty()) {
            return altc.a;
        }
        return new alqc(new alth(this.b, alss.a), this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alsu) {
            return b().equals(((alsu) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return alzz.ai(b());
    }

    Object writeReplace() {
        return new alpn(b());
    }
}
