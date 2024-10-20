package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsq {
    public static final aqrl a = new aqrl("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final aqrm c;
    private final int d;

    public aqsq(SocketAddress socketAddress) {
        this(socketAddress, aqrm.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqsq)) {
            return false;
        }
        aqsq aqsqVar = (aqsq) obj;
        if (this.b.size() != aqsqVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (!((SocketAddress) this.b.get(i)).equals(aqsqVar.b.get(i))) {
                return false;
            }
        }
        if (this.c.equals(aqsqVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        aqrm aqrmVar = this.c;
        return "[" + String.valueOf(this.b) + "/" + aqrmVar.toString() + "]";
    }

    public aqsq(SocketAddress socketAddress, aqrm aqrmVar) {
        this(Collections.singletonList(socketAddress), aqrmVar);
    }

    public aqsq(List list, aqrm aqrmVar) {
        d.t(!list.isEmpty(), "addrs is empty");
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = unmodifiableList;
        aqrmVar.getClass();
        this.c = aqrmVar;
        this.d = unmodifiableList.hashCode();
    }
}
