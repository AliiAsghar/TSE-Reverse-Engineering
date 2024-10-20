package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihq implements aiid {
    static final acyz a = acyy.b("enable_dns_client_exception_logging");
    private static final anen c = new andj();
    public final aiib b;
    private final List d;
    private final anen e;
    private final atki f;
    private final atna g;
    private final aiia h;

    public aihq(Optional optional, List list, aiia aiiaVar, aiib aiibVar, anen anenVar, ahlp ahlpVar, Optional optional2, Optional optional3) {
        aiiaVar.getClass();
        this.h = aiiaVar;
        aiibVar.getClass();
        this.b = aiibVar;
        list.getClass();
        this.d = (List) Collection.EL.stream(list).map(new aiec(5)).collect(Collectors.toList());
        anenVar.getClass();
        this.e = anenVar;
        this.f = (atki) ahlpVar.a;
        this.g = f(optional, list, optional2, optional3);
    }

    public static atna d(Optional optional, aihx aihxVar) {
        try {
            atnk atnkVar = new atnk(aihxVar.a());
            atnkVar.a = new InetSocketAddress(atnkVar.a.getAddress(), aihxVar.b);
            atnkVar.c = aihxVar.c.equals(aiic.TCP);
            optional.ifPresent(new aidg(atnkVar, 10));
            return atnkVar;
        } catch (UnknownHostException e) {
            throw new RuntimeException("unknown DNS server initializing AsyncDnsClient", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.common.util.concurrent.ListenableFuture e(java.lang.String r17, java.lang.Class r18) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aihq.e(java.lang.String, java.lang.Class):com.google.common.util.concurrent.ListenableFuture");
    }

    private static atna f(Optional optional, List list, Optional optional2, Optional optional3) {
        try {
            atlb atlbVar = new atlb((atna[]) ((List) Collection.EL.stream(list).map(new agoq(optional, 10)).collect(Collectors.toList())).toArray(new atna[0]));
            optional3.ifPresent(new aidg(atlbVar, 8));
            optional2.ifPresent(new aidg(atlbVar, 9));
            return atlbVar;
        } catch (UnknownHostException e) {
            throw new aihp(e);
        }
    }

    @Override // defpackage.aiid
    public final ListenableFuture a(String str) {
        ListenableFuture e = e(str, atka.class);
        ListenableFuture e2 = e(str, atjw.class);
        return albo.bW(e, e2).a(new ahes(e, e2, 5), c);
    }

    @Override // defpackage.aiid
    public final ListenableFuture b(String str) {
        return e(str, atmb.class);
    }

    @Override // defpackage.aiid
    public final ListenableFuture c(String str) {
        return e(str, atng.class);
    }
}
