package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wch {
    public static volatile aqvw a;
    private static volatile aqux b;
    private static volatile aqux c;
    private static volatile aqux d;
    private static volatile aqux e;
    private static volatile aqux f;
    private static volatile aqux g;
    private static volatile aqux h;
    private static volatile aqux i;
    private static volatile aqux j;
    private static volatile aqux k;

    public static final /* synthetic */ wru A(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wru) s;
    }

    public static final void B(wsa wsaVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wru wruVar = (wru) aozyVar.b;
        wru wruVar2 = wru.a;
        wruVar.c = wsaVar;
        wruVar.b |= 1;
    }

    public static final /* synthetic */ wrq C(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wrq) s;
    }

    public static final void D(wsa wsaVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wrq wrqVar = (wrq) aozyVar.b;
        wrq wrqVar2 = wrq.a;
        wrqVar.c = wsaVar;
        wrqVar.b |= 1;
    }

    public static final /* synthetic */ wrm E(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wrm) s;
    }

    public static final void F(wsa wsaVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wrm wrmVar = (wrm) aozyVar.b;
        wrm wrmVar2 = wrm.a;
        wrmVar.c = wsaVar;
        wrmVar.b |= 1;
    }

    public static int G(int i2) {
        return i2 - 1;
    }

    public static int H(int i2) {
        return i2 - 1;
    }

    public static final tqa I(String str) {
        tqa tqaVar;
        if (str == null) {
            return new tqa(-1);
        }
        Integer u = arsd.u(str);
        if (u != null) {
            tqaVar = new tqa(u.intValue());
        } else {
            tqaVar = new tqa(str);
        }
        return tqaVar;
    }

    public static final String J(tqa tqaVar) {
        tqaVar.getClass();
        String str = tqaVar.a;
        if (str == null) {
            return String.valueOf(tqaVar.b);
        }
        return str;
    }

    public static agmh[] K() {
        return (agmh[]) slm.d.c;
    }

    public static aqux a() {
        aqux aquxVar = h;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = h;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnAddUserToGroupCompleted");
                    a2.b();
                    wbe wbeVar = wbe.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wbeVar);
                    a2.d = new arkw(wbf.a);
                    aquxVar = a2.a();
                    h = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux b() {
        aqux aquxVar = g;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = g;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnCreateGroupCompleted");
                    a2.b();
                    wbl wblVar = wbl.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wblVar);
                    a2.d = new arkw(wbm.a);
                    aquxVar = a2.a();
                    g = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux c() {
        aqux aquxVar = c;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = c;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnGroupNotification");
                    a2.b();
                    wct wctVar = wct.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wctVar);
                    a2.d = new arkw(wcu.a);
                    aquxVar = a2.a();
                    c = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux d() {
        aqux aquxVar = b;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = b;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnReceiveMessageNotification");
                    a2.b();
                    wcv wcvVar = wcv.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wcvVar);
                    a2.d = new arkw(wcw.a);
                    aquxVar = a2.a();
                    b = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux e() {
        aqux aquxVar = i;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = i;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnRemoveUserFromGroupCompleted");
                    a2.b();
                    wdb wdbVar = wdb.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdbVar);
                    a2.d = new arkw(wdc.a);
                    aquxVar = a2.a();
                    i = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux f() {
        aqux aquxVar = f;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = f;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnRevokeMessageCompleted");
                    a2.b();
                    wdh wdhVar = wdh.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdhVar);
                    a2.d = new arkw(wdi.a);
                    aquxVar = a2.a();
                    f = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux g() {
        aqux aquxVar = e;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = e;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnSendFileOverMsrpCompleted");
                    a2.b();
                    wdl wdlVar = wdl.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdlVar);
                    a2.d = new arkw(wdm.a);
                    aquxVar = a2.a();
                    e = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux h() {
        aqux aquxVar = d;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = d;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnSendMessageCompleted");
                    a2.b();
                    wdp wdpVar = wdp.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdpVar);
                    a2.d = new arkw(wdq.a);
                    aquxVar = a2.a();
                    d = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux i() {
        aqux aquxVar = k;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = k;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnTriggerGroupNotificationCompleted");
                    a2.b();
                    wdv wdvVar = wdv.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdvVar);
                    a2.d = new arkw(wdw.a);
                    aquxVar = a2.a();
                    k = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux j() {
        aqux aquxVar = j;
        if (aquxVar == null) {
            synchronized (wch.class) {
                aquxVar = j;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineNotificationService", "OnUpdateGroupCompleted");
                    a2.b();
                    wdz wdzVar = wdz.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdzVar);
                    a2.d = new arkw(wea.a);
                    aquxVar = a2.a();
                    j = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static int k(int i2) {
        if (i2 != 0) {
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    return 0;
                }
            }
            return i3;
        }
        return 3;
    }

    public static String l() {
        return Integer.toString(a.ar(7));
    }

    public static /* synthetic */ String m(int i2) {
        if (i2 != 1) {
            return "TACHYGRAM";
        }
        return "TACHYON_REGISTRATION";
    }

    public static final long n(apct apctVar) {
        return aoue.m(apctVar).toEpochMilli();
    }

    public static /* synthetic */ akcx o(int i2, String str, Duration duration, int i3) {
        String str2;
        hgi hgiVar = new hgi((char[]) null);
        if (i2 != 1) {
            if (i2 != 2) {
                str2 = "REGISTER_SATELLITE_PENDING_INTENT";
            } else {
                str2 = "LOST_SATELLITE_CONNECTION";
            }
        } else {
            str2 = "NEW_SATELLITE_CONNECTION";
        }
        hgiVar.n(GroupManagementRequest.ACTION_TAG, str2);
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (str != null) {
            hgiVar.n("MyIdentityToken", str);
        }
        if ((i3 & 4) != 0) {
            duration = null;
        }
        akct a2 = akcx.a(wph.class);
        a2.f = hgiVar.j();
        a2.d(aqjn.e("SatelliteWorkTag"));
        if (duration != null) {
            alvw g2 = wph.a.g();
            g2.X(alwp.a, "BugleSatellite");
            ((alvg) g2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker$Companion", "buildWorkSpec", 178, "NotifySatelliteConnectionChangeWorker.kt")).s("Will re-register for satellite event with delay: %ss", duration.getSeconds());
            a2.d = new akcv(duration.getSeconds(), TimeUnit.SECONDS);
        } else {
            a2.c = algw.i(gtf.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        }
        return a2.a();
    }

    public static final int p(int i2) {
        int i3 = i2 - 2;
        if (i3 == 0) {
            return 2;
        }
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 2) {
            return 4;
        }
        if (i3 == 3) {
            return 5;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                return 1;
            }
            return 7;
        }
        return 6;
    }

    public static final wrv q(abhf abhfVar) {
        aozy createBuilder = wrv.a.createBuilder();
        createBuilder.getClass();
        abhe b2 = abhe.b(abhfVar.b);
        if (b2 == null) {
            b2 = abhe.UNRECOGNIZED;
        }
        int ordinal = b2.ordinal();
        int i2 = 2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i2 = 1;
                    } else {
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b2))));
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
        }
        z(i2, createBuilder);
        return y(createBuilder);
    }

    public static final /* synthetic */ wry r(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wry) s;
    }

    public static final void s(wsa wsaVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wry wryVar = (wry) aozyVar.b;
        wry wryVar2 = wry.a;
        wryVar.c = wsaVar;
        wryVar.b |= 1;
    }

    public static final /* synthetic */ wrx t(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wrx) s;
    }

    public static final /* synthetic */ wrw u(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wrw) s;
    }

    public static final void v(int i2, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wrw wrwVar = (wrw) aozyVar.b;
        wrw wrwVar2 = wrw.a;
        wrwVar.c = x(i2);
        wrwVar.b |= 1;
    }

    public static /* synthetic */ String w(int i2) {
        switch (i2) {
            case 1:
                return "UNRECOGNIZED";
            case 2:
                return "SESSION_STATUS_UNKNOWN";
            case 3:
                return "SESSION_STATUS_OFF";
            case 4:
                return "SESSION_STATUS_DEMO";
            case 5:
                return "SESSION_STATUS_NON_EMERGENCY";
            case 6:
                return "SESSION_STATUS_EMERGENCY";
            case 7:
                return "SESSION_STATUS_DISABLING";
            default:
                return "null";
        }
    }

    public static int x(int i2) {
        if (i2 != 1) {
            return i2 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static final /* synthetic */ wrv y(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wrv) s;
    }

    public static final void z(int i2, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wrv wrvVar = (wrv) aozyVar.b;
        wrv wrvVar2 = wrv.a;
        wrvVar.c = a.bd(i2);
        wrvVar.b |= 1;
    }
}
