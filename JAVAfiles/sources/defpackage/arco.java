package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arco {
    public List a;
    public int b;
    public int c;

    public arco(List list) {
        this.a = list;
    }

    public final aqrm a() {
        return ((aqsq) this.a.get(this.b)).c;
    }

    public final SocketAddress b() {
        return (SocketAddress) ((aqsq) this.a.get(this.b)).b.get(this.c);
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
    }
}
