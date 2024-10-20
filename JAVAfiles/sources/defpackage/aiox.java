package defpackage;

import android.content.Context;
import android.net.Network;
import java.net.Inet4Address;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiox implements aiot {
    private static final alog a = alog.u("8.8.8.8", "8.8.4.4", "2001:4860:4860:0:0:0:0:8888", "2001:4860:4860:0:0:0:0:8844");
    private final aigy b;
    private final acnx c;
    private final Context d;
    private final advp e;
    private final boolean f;
    private final boolean g;
    private final ajdz h;

    public aiox(Context context, acnx acnxVar, aigy aigyVar, advp advpVar, ajdz ajdzVar, boolean z, boolean z2) {
        this.d = context;
        this.c = acnxVar;
        this.b = aigyVar;
        this.e = advpVar;
        this.f = z;
        this.g = z2;
        this.h = ajdzVar;
    }

    private final List c(aiid aiidVar, String str, ailh ailhVar, boolean z, String str2, int i) {
        ailm ailnVar;
        String str3;
        boolean z2;
        if (i > 0) {
            return alog.r(new aili(str2, str2, i, ailhVar));
        }
        if (str2 != null) {
            advr.l(this.e, "Discovering sip proxies for pcscf:[%s] over protocol:[%s]", str2, ailhVar);
            if (this.f) {
                if (!((Boolean) aczf.o().a.d.a()).booleanValue() && !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ailnVar = new ailk(aiidVar, new ailo(z2, this.g, ailhVar, alfd.a));
            } else {
                ailnVar = new ailn(aiidVar, new ailo(false, this.g, ailhVar, algw.i(this.e)));
            }
            List b = ailnVar.b(str2);
            b.getClass();
            if (b.isEmpty()) {
                advp advpVar = this.e;
                if (true != z) {
                    str3 = "IPv6";
                } else {
                    str3 = "IPv4";
                }
                advr.h(advpVar, "DNS lookup of %s failed! No results from discovery over %s network[%s]", str2, str3, str);
                throw new aiou(this.e.a);
            }
            advr.k("SIP discovery results: %s", b);
            return b;
        }
        throw new aild(this.e.a.concat(": Unable to discover null outbound proxy"));
    }

    private static boolean d(String str) {
        return anbj.a(str) instanceof Inet4Address;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x020e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001f, B:11:0x0026, B:12:0x0044, B:14:0x004a, B:15:0x0083, B:17:0x00c9, B:18:0x00d2, B:20:0x00f3, B:21:0x0141, B:24:0x0166, B:26:0x0179, B:28:0x017d, B:29:0x0190, B:31:0x0196, B:34:0x01ac, B:41:0x01c2, B:43:0x01d2, B:44:0x01db, B:45:0x01dc, B:47:0x0172, B:48:0x011e, B:49:0x00ce, B:50:0x0067, B:51:0x002b, B:52:0x0208, B:53:0x020d), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[Catch: all -> 0x020e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001f, B:11:0x0026, B:12:0x0044, B:14:0x004a, B:15:0x0083, B:17:0x00c9, B:18:0x00d2, B:20:0x00f3, B:21:0x0141, B:24:0x0166, B:26:0x0179, B:28:0x017d, B:29:0x0190, B:31:0x0196, B:34:0x01ac, B:41:0x01c2, B:43:0x01d2, B:44:0x01db, B:45:0x01dc, B:47:0x0172, B:48:0x011e, B:49:0x00ce, B:50:0x0067, B:51:0x002b, B:52:0x0208, B:53:0x020d), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3 A[Catch: all -> 0x020e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001f, B:11:0x0026, B:12:0x0044, B:14:0x004a, B:15:0x0083, B:17:0x00c9, B:18:0x00d2, B:20:0x00f3, B:21:0x0141, B:24:0x0166, B:26:0x0179, B:28:0x017d, B:29:0x0190, B:31:0x0196, B:34:0x01ac, B:41:0x01c2, B:43:0x01d2, B:44:0x01db, B:45:0x01dc, B:47:0x0172, B:48:0x011e, B:49:0x00ce, B:50:0x0067, B:51:0x002b, B:52:0x0208, B:53:0x020d), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d A[Catch: all -> 0x020e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001f, B:11:0x0026, B:12:0x0044, B:14:0x004a, B:15:0x0083, B:17:0x00c9, B:18:0x00d2, B:20:0x00f3, B:21:0x0141, B:24:0x0166, B:26:0x0179, B:28:0x017d, B:29:0x0190, B:31:0x0196, B:34:0x01ac, B:41:0x01c2, B:43:0x01d2, B:44:0x01db, B:45:0x01dc, B:47:0x0172, B:48:0x011e, B:49:0x00ce, B:50:0x0067, B:51:0x002b, B:52:0x0208, B:53:0x020d), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dc A[Catch: all -> 0x020e, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001f, B:11:0x0026, B:12:0x0044, B:14:0x004a, B:15:0x0083, B:17:0x00c9, B:18:0x00d2, B:20:0x00f3, B:21:0x0141, B:24:0x0166, B:26:0x0179, B:28:0x017d, B:29:0x0190, B:31:0x0196, B:34:0x01ac, B:41:0x01c2, B:43:0x01d2, B:44:0x01db, B:45:0x01dc, B:47:0x0172, B:48:0x011e, B:49:0x00ce, B:50:0x0067, B:51:0x002b, B:52:0x0208, B:53:0x020d), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e A[Catch: all -> 0x020e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001f, B:11:0x0026, B:12:0x0044, B:14:0x004a, B:15:0x0083, B:17:0x00c9, B:18:0x00d2, B:20:0x00f3, B:21:0x0141, B:24:0x0166, B:26:0x0179, B:28:0x017d, B:29:0x0190, B:31:0x0196, B:34:0x01ac, B:41:0x01c2, B:43:0x01d2, B:44:0x01db, B:45:0x01dc, B:47:0x0172, B:48:0x011e, B:49:0x00ce, B:50:0x0067, B:51:0x002b, B:52:0x0208, B:53:0x020d), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce A[Catch: all -> 0x020e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001f, B:11:0x0026, B:12:0x0044, B:14:0x004a, B:15:0x0083, B:17:0x00c9, B:18:0x00d2, B:20:0x00f3, B:21:0x0141, B:24:0x0166, B:26:0x0179, B:28:0x017d, B:29:0x0190, B:31:0x0196, B:34:0x01ac, B:41:0x01c2, B:43:0x01d2, B:44:0x01db, B:45:0x01dc, B:47:0x0172, B:48:0x011e, B:49:0x00ce, B:50:0x0067, B:51:0x002b, B:52:0x0208, B:53:0x020d), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067 A[Catch: all -> 0x020e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001f, B:11:0x0026, B:12:0x0044, B:14:0x004a, B:15:0x0083, B:17:0x00c9, B:18:0x00d2, B:20:0x00f3, B:21:0x0141, B:24:0x0166, B:26:0x0179, B:28:0x017d, B:29:0x0190, B:31:0x0196, B:34:0x01ac, B:41:0x01c2, B:43:0x01d2, B:44:0x01db, B:45:0x01dc, B:47:0x0172, B:48:0x011e, B:49:0x00ce, B:50:0x0067, B:51:0x002b, B:52:0x0208, B:53:0x020d), top: B:3:0x0003, inners: #0 }] */
    @Override // defpackage.aiot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.aior a(defpackage.ailh r22, android.net.Network r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.lang.String r27, int r28) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiox.a(ailh, android.net.Network, java.lang.String, java.lang.String, java.util.List, java.lang.String, int):aior");
    }

    final aior b(String str, ailp ailpVar, Network network, String str2, ailh ailhVar) {
        int q = ahji.q();
        advr.d(this.e, "Local IP address is %s:%d", advq.IP_ADDRESS.c(str2), Integer.valueOf(q));
        str2.getClass();
        String d = ailpVar.d();
        d.getClass();
        int a2 = ailpVar.a();
        str.getClass();
        return new aipa(this.d, network, str2, q, d, a2, str, this.c, this.e, this.b, ailhVar);
    }
}
