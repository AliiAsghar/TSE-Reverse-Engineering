package defpackage;

import com.google.android.gms.location.LocationResult;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abgj {
    public static volatile aqvw a;
    private static volatile aqux b;
    private static volatile aqux c;

    public abgj() {
    }

    public static aqux a() {
        aqux aquxVar = b;
        if (aquxVar == null) {
            synchronized (abgj.class) {
                aquxVar = b;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("stargate.DatagramNotificationService", "OnDatagramSent");
                    a2.b();
                    abgs abgsVar = abgs.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(abgsVar);
                    a2.d = new arkw(abgt.a);
                    aquxVar = a2.a();
                    b = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux b() {
        aqux aquxVar = c;
        if (aquxVar == null) {
            synchronized (abgj.class) {
                aquxVar = c;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("stargate.DatagramNotificationService", "OnReceiveDatagram");
                    a2.b();
                    abgu abguVar = abgu.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(abguVar);
                    a2.d = new arkw(abgv.a);
                    aquxVar = a2.a();
                    c = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 2:
                return "SATELLITE_SESSION_UNKNOWN";
            case 3:
                return "SATELLITE_SESSION_OFF";
            case 4:
                return "SATELLITE_SESSION_DEMO";
            case 5:
                return "SATELLITE_SESSION_NON_EMERGENCY";
            case 6:
                return "SATELLITE_SESSION_EMERGENCY";
            case 7:
                return "SATELLITE_SESSION_DISABLING";
            default:
                return "UNRECOGNIZED";
        }
    }

    public static void d(ByteBuffer byteBuffer, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length > 0 && byteArray[0] == 0) {
            byteBuffer.put(byteArray, 1, length - 1);
        } else {
            byteBuffer.put(byteArray);
        }
    }

    public static /* synthetic */ abee e(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (abee) s;
    }

    public static String f(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return a.bV(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static boolean g(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

    public static int h(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return i;
            default:
                return 1;
        }
    }

    public static String i(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "THROTTLE_NEVER";
                }
                throw new IllegalArgumentException();
            }
            return "THROTTLE_ALWAYS";
        }
        return "THROTTLE_BACKGROUND";
    }

    public static String j(int i) {
        if (i != 100) {
            if (i != 102) {
                if (i != 104) {
                    if (i == 105) {
                        return "PASSIVE";
                    }
                    throw new IllegalArgumentException();
                }
                return "LOW_POWER";
            }
            return "BALANCED_POWER_ACCURACY";
        }
        return "HIGH_ACCURACY";
    }

    public static void k(int i) {
        boolean z;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
                abhg.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
            }
        }
        z = true;
        abhg.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String m(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "GRANULARITY_FINE";
                }
                throw new IllegalArgumentException();
            }
            return "GRANULARITY_COARSE";
        }
        return "GRANULARITY_PERMISSION_LEVEL";
    }

    public static void n(int i) {
        boolean z;
        if (i != 0 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
                abhg.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
            }
        }
        z = true;
        abhg.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
    }

    public static ScheduledExecutorService o(ThreadFactory threadFactory) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }

    public static ExecutorService p(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ExecutorService q(ThreadFactory threadFactory) {
        return p(1, threadFactory);
    }

    public static ExecutorService r(int i) {
        return p(i, Executors.defaultThreadFactory());
    }

    public static boolean s(apct apctVar, long j, long j2, long j3) {
        long millis = (TimeUnit.SECONDS.toMillis(apctVar.b) + TimeUnit.NANOSECONDS.toMillis(apctVar.c)) - j;
        if (j2 <= millis && millis < j3) {
            return true;
        }
        return false;
    }

    public static Object t(Class cls, String str, acak... acakVarArr) {
        int length = acakVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < acakVarArr.length; i++) {
            acak acakVar = acakVarArr[i];
            acakVar.getClass();
            clsArr[i] = (Class) acakVar.a;
            objArr[i] = acakVarArr[i].b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static Object u(String str, acak... acakVarArr) {
        return t(Class.forName("android.os.SystemProperties"), str, acakVarArr);
    }

    public void l(LocationResult locationResult) {
        throw null;
    }

    public abgj(byte[] bArr) {
    }
}
