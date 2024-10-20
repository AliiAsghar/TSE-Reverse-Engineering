package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzu {
    public static final String a = gsy.b("NetworkRequestCompat");
    public final Object b;

    public gzu() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gzu) && d.F(this.b, ((gzu) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }

    public gzu(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ gzu(byte[] bArr) {
        this((Object) null);
    }
}
