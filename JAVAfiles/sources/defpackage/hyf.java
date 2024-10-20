package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyf implements hne {
    private final Object b;

    public hyf(Object obj) {
        hwr.i(obj);
        this.b = obj;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hyf) {
            return this.b.equals(((hyf) obj).b);
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
