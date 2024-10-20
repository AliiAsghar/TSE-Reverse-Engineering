package defpackage;

import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxn extends SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public aqxn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqxn) || this.a != ((aqxn) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "BoundClientAddress[" + this.a + "]";
    }
}
