package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ardv extends aqve {
    final SocketAddress a;
    final String b;
    final Collection c;

    public ardv(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.aqva
    public final aqvd a(URI uri, aquy aquyVar) {
        return new ardu(this);
    }

    @Override // defpackage.aqva
    public final String b() {
        return "directaddress";
    }

    @Override // defpackage.aqve
    public final Collection c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqve
    public final void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqve
    public final void e() {
    }
}
