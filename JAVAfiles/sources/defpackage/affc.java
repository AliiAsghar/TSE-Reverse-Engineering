package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affc extends aeke {
    private final Throwable a;

    public affc() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof affc)) {
            return false;
        }
        Throwable th = ((affc) obj).a;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a.cc(null, "ClosePacket(reason=", ")");
    }

    public /* synthetic */ affc(byte[] bArr) {
        this.a = null;
    }
}
