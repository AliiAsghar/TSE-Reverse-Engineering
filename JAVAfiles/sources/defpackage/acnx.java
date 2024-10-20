package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnx extends acny {
    public static final acyz b = acyy.b("add_ip_version_to_socket_event_rev1");
    private final Context e;

    public acnx(Context context, adeo adeoVar, adtn adtnVar, amnn amnnVar, anen anenVar, acnu acnuVar) {
        super(adeoVar, adtnVar, amnnVar, anenVar, acnuVar);
        this.e = context;
    }

    public static int p(String str) {
        if (((Boolean) b.a()).booleanValue()) {
            try {
                if (InetAddress.getByName(str) instanceof Inet6Address) {
                    return 3;
                }
                return 2;
            } catch (UnknownHostException unused) {
            }
        }
        return 1;
    }

    public static final void t(aozy aozyVar, aihy aihyVar) {
        String str = aihyVar.c;
        if (str != null) {
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apir apirVar = (apir) aozyVar.b;
            apir apirVar2 = apir.a;
            apirVar.b |= 64;
            apirVar.i = str;
        }
    }

    public final void d(apiy apiyVar) {
        e(apiyVar, null);
    }

    public final void e(apiy apiyVar, String str) {
        advr.o("Logging SIP registration event, type = %s", apiyVar);
        aozy createBuilder = apja.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apja apjaVar = (apja) createBuilder.b;
        apjaVar.c = apiyVar.g;
        apjaVar.b |= 1;
        if (!TextUtils.isEmpty(str)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apja apjaVar2 = (apja) createBuilder.b;
            str.getClass();
            apjaVar2.b |= 2;
            apjaVar2.d = str;
        }
        n((apja) createBuilder.s());
    }

    public final void f(apiz apizVar, Optional optional) {
        aozy createBuilder = apja.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apja apjaVar = (apja) createBuilder.b;
        apjaVar.e = apizVar.w;
        apjaVar.b |= 4;
        createBuilder.getClass();
        optional.ifPresent(new aauv(createBuilder, 18));
        advr.o("Logging SIP registration state change event, state = %s", apizVar);
        n((apja) createBuilder.s());
    }

    public final void g(apiz apizVar, apiz apizVar2, long j, Optional optional, Optional optional2) {
        aozy createBuilder = apja.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apja apjaVar = (apja) apagVar;
        apjaVar.e = apizVar.w;
        apjaVar.b |= 4;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apja apjaVar2 = (apja) apagVar2;
        apjaVar2.h = apizVar2.w;
        apjaVar2.b |= 128;
        int i = (int) j;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apja apjaVar3 = (apja) createBuilder.b;
        apjaVar3.b |= 256;
        apjaVar3.i = i;
        createBuilder.getClass();
        optional.ifPresent(new aauv(createBuilder, 17));
        optional2.ifPresent(new aauv(createBuilder, 18));
        advr.o("Logging SIP registration state change event, from %s to %s after %d ms. subId=%d", apizVar2, apizVar, Long.valueOf(j), optional.orElse(-1));
        n((apja) createBuilder.s());
    }

    public final void h(String str, apix apixVar) {
        aozy createBuilder = apiw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apiw apiwVar = (apiw) createBuilder.b;
        apiwVar.c = apixVar.C;
        apiwVar.b |= 1;
        apiw apiwVar2 = (apiw) createBuilder.s();
        aozy createBuilder2 = apja.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        apja apjaVar = (apja) apagVar;
        str.getClass();
        apjaVar.b |= 64;
        apjaVar.g = str;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apja apjaVar2 = (apja) createBuilder2.b;
        apiwVar2.getClass();
        apjaVar2.f = apiwVar2;
        apjaVar2.b |= 32;
        apja apjaVar3 = (apja) createBuilder2.s();
        advr.o("Logging SIP registration Processed message, message = %s", apixVar);
        n(apjaVar3);
    }

    public final void i(String str, apix apixVar, acok acokVar) {
        aozy createBuilder = apiw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apiw apiwVar = (apiw) createBuilder.b;
        apiwVar.c = apixVar.C;
        apiwVar.b |= 1;
        int g = aoue.g(acokVar.ordinal());
        if (g != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apiw apiwVar2 = (apiw) createBuilder.b;
            apiwVar2.d = g - 1;
            apiwVar2.b |= 2;
        }
        aozy createBuilder2 = apja.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        apja apjaVar = (apja) apagVar;
        str.getClass();
        apjaVar.b |= 64;
        apjaVar.g = str;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apja apjaVar2 = (apja) createBuilder2.b;
        apiw apiwVar3 = (apiw) createBuilder.s();
        apiwVar3.getClass();
        apjaVar2.f = apiwVar3;
        apjaVar2.b |= 32;
        apja apjaVar3 = (apja) createBuilder2.s();
        advr.o("Logging SIP registration Processed message, message = %s, terminationReason = %s", apixVar, acokVar);
        n(apjaVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(defpackage.apjg r5) {
        /*
            r4 = this;
            boolean r0 = r4.o()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r5.n
            int r1 = r5.m
            int r1 = defpackage.a.aO(r1)
            if (r1 != 0) goto L12
            goto L36
        L12:
            switch(r1) {
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L27;
                case 7: goto L24;
                case 8: goto L21;
                case 9: goto L1e;
                case 10: goto L1b;
                case 11: goto L18;
                default: goto L15;
            }
        L15:
            java.lang.String r1 = "SOCKET_STATE_FAILED"
            goto L38
        L18:
            java.lang.String r1 = "SOCKET_STATE_CLOSED"
            goto L38
        L1b:
            java.lang.String r1 = "SOCKET_STATE_CLOSING"
            goto L38
        L1e:
            java.lang.String r1 = "SOCKET_STATE_ACTIVE"
            goto L38
        L21:
            java.lang.String r1 = "SOCKET_STATE_AUTHENTICATED"
            goto L38
        L24:
            java.lang.String r1 = "SOCKET_STATE_AUTHENTICATING"
            goto L38
        L27:
            java.lang.String r1 = "SOCKET_STATE_CONNECTED"
            goto L38
        L2a:
            java.lang.String r1 = "SOCKET_STATE_CONNECTING"
            goto L38
        L2d:
            java.lang.String r1 = "SOCKET_STATE_ACCEPTED"
            goto L38
        L30:
            java.lang.String r1 = "SOCKET_STATE_ACCEPTING"
            goto L38
        L33:
            java.lang.String r1 = "SOCKET_STATE_INIT"
            goto L38
        L36:
            java.lang.String r1 = "SOCKET_STATE_UNKNOWN"
        L38:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "Logging socket state monitoring event for socket [%s]: %s"
            defpackage.advr.o(r0, r2)
            android.content.Context r0 = r4.e
            apis r1 = defpackage.apis.a
            aozy r1 = r1.createBuilder()
            apag r2 = r1.b
            boolean r2 = r2.isMutable()
            if (r2 != 0) goto L59
            r1.u()
        L59:
            apag r2 = r1.b
            apis r2 = (defpackage.apis) r2
            r5.getClass()
            r2.c = r5
            r5 = 3
            r2.b = r5
            apag r5 = r1.s()
            apis r5 = (defpackage.apis) r5
            r4.y(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acnx.j(apjg):void");
    }

    public final void k(apir apirVar) {
        aozy createBuilder = apis.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apis apisVar = (apis) createBuilder.b;
        apirVar.getClass();
        apisVar.c = apirVar;
        apisVar.b = 2;
        y(this.e, (apis) createBuilder.s());
    }

    @Deprecated
    public final void l(apjg apjgVar) {
        if (o()) {
            return;
        }
        aozy createBuilder = apis.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apis apisVar = (apis) createBuilder.b;
        apjgVar.getClass();
        apisVar.c = apjgVar;
        apisVar.b = 3;
        y(this.e, (apis) createBuilder.s());
    }

    public final void m(apiv apivVar) {
        aozy createBuilder = apis.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apis apisVar = (apis) createBuilder.b;
        apivVar.getClass();
        apisVar.c = apivVar;
        apisVar.b = 1;
        y(this.e, (apis) createBuilder.s());
    }

    public final void n(apja apjaVar) {
        if (!((Boolean) aczf.o().a.Q.a()).booleanValue()) {
            return;
        }
        aozy createBuilder = apis.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apis apisVar = (apis) createBuilder.b;
        apjaVar.getClass();
        apisVar.c = apjaVar;
        apisVar.b = 4;
        y(this.e, (apis) createBuilder.s());
    }

    public final boolean o() {
        if (aczx.v()) {
            if (amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS.equals(this.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(String str, int i) {
        aozy createBuilder = apjd.a.createBuilder();
        apjc apjcVar = apjc.SIP_TRANSPORT_EVENT_TYPE_ERROR;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjd apjdVar = (apjd) apagVar;
        apjdVar.c = apjcVar.c;
        apjdVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjd apjdVar2 = (apjd) apagVar2;
        apjdVar2.e = i - 1;
        apjdVar2.b |= 4;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apjd apjdVar3 = (apjd) createBuilder.b;
        str.getClass();
        apjdVar3.b |= 2;
        apjdVar3.d = str;
        apjd apjdVar4 = (apjd) createBuilder.s();
        if (!((Boolean) aczx.a().b.t.a()).booleanValue()) {
            return;
        }
        apjc b2 = apjc.b(apjdVar4.c);
        if (b2 == null) {
            b2 = apjc.SIP_TRANSPORT_EVENT_TYPE_UNKNOWN;
        }
        advr.o("Logging SipTransportEvent event type, %s", b2);
        aozy createBuilder2 = apis.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apis apisVar = (apis) createBuilder2.b;
        apjdVar4.getClass();
        apisVar.c = apjdVar4;
        apisVar.b = 5;
        y(this.e, (apis) createBuilder2.s());
    }

    public final aozy r(int i, apiu apiuVar, apit apitVar, int i2) {
        aozy createBuilder = apiv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apiv apivVar = (apiv) apagVar;
        apivVar.c = i - 1;
        apivVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apiv apivVar2 = (apiv) createBuilder.b;
        apivVar2.d = apiuVar.e;
        apivVar2.b |= 2;
        if (actx.k() == 2) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            apiv apivVar3 = (apiv) apagVar2;
            apivVar3.e = apitVar.d;
            apivVar3.b |= 4;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apiv apivVar4 = (apiv) createBuilder.b;
            apivVar4.b |= 8;
            apivVar4.f = i2;
        }
        return createBuilder;
    }

    @Deprecated
    public final aozy s(apjf apjfVar, int i, String str, int i2, int i3) {
        aozy createBuilder = apjg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjg apjgVar = (apjg) createBuilder.b;
        apjgVar.f = apjfVar.e;
        apjgVar.b |= 8;
        if (((Boolean) b.a()).booleanValue()) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apjg apjgVar2 = (apjg) apagVar;
            apjgVar2.k = i - 1;
            apjgVar2.b |= 256;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apjg apjgVar3 = (apjg) createBuilder.b;
            apjgVar3.j = i3 - 1;
            apjgVar3.b |= 128;
        }
        if (actx.k() == 2) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            apjg apjgVar4 = (apjg) apagVar2;
            apjgVar4.b |= 32;
            apjgVar4.h = str;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apjg apjgVar5 = (apjg) createBuilder.b;
            apjgVar5.b |= 64;
            apjgVar5.i = i2;
        }
        return createBuilder;
    }
}
