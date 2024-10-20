package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rhj {
    public final Object b;
    protected int c;
    public rhi d;
    public final Object e;
    private final String h;
    private static final xze f = xze.g("BugleDataModel", "ActionMonitor");
    private static final Handler g = new Handler(Looper.getMainLooper());
    public static final vl a = new vl();

    protected rhj(String str, Object obj) {
        this.b = new Object();
        this.h = str;
        this.c = 1;
        this.e = obj;
    }

    public static void a(Action action, Object obj) {
        int i;
        boolean D = action.D();
        rhj f2 = f(action.t);
        if (f2 != null) {
            i = f2.c;
            synchronized (f2.b) {
                if (D) {
                    e(action, 3, 4);
                }
            }
        } else {
            i = 3;
        }
        xze xzeVar = f;
        if (xzeVar.s(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            xyo d = xzeVar.d();
            d.H("Operation-");
            d.u(action.t);
            d.u(": @");
            d.u(simpleDateFormat.format(new Date()));
            d.u("UTC.");
            d.z("oldMonitorState", g(i));
            d.z("newMonitorState", "EXECUTED");
            d.q();
        }
        if (!action.D()) {
            c(action, 3, obj, true);
        }
    }

    public static void b(String str, rhj rhjVar) {
        if (!TextUtils.isEmpty(rhjVar.h) && !TextUtils.isEmpty(str) && str.equals(rhjVar.h)) {
            vl vlVar = a;
            synchronized (vlVar) {
                vlVar.put(str, rhjVar);
            }
        } else {
            throw new IllegalArgumentException("Monitor key " + rhjVar.h + " not compatible with action key " + str);
        }
    }

    public static void c(Action action, int i, Object obj, boolean z) {
        rhi rhiVar;
        int i2;
        rhj f2 = f(action.t);
        if (f2 != null) {
            int i3 = f2.c;
            synchronized (f2.b) {
                e(action, i, 8);
                rhiVar = f2.d;
            }
            if (rhiVar != null) {
                g.post(akto.j(new rhh(f2, z, action, obj, 0)));
            }
            String str = action.t;
            synchronized (f2.b) {
                i2 = f2.c;
            }
            if (i2 == 8) {
                vl vlVar = a;
                synchronized (vlVar) {
                    vlVar.remove(str);
                }
            }
            i = i3;
        }
        xze xzeVar = f;
        if (xzeVar.s(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            xyo d = xzeVar.d();
            d.H("Operation-");
            d.u(action.t);
            d.u(": @");
            d.u(simpleDateFormat.format(new Date()));
            d.u("UTC.");
            d.z("oldMonitorState", g(i));
            d.z("newMonitorState", g(8));
            d.q();
        }
    }

    public static void e(Action action, int i, int i2) {
        rhj f2 = f(action.t);
        if (f2 != null) {
            int i3 = f2.c;
            synchronized (f2.b) {
                if (i != 0) {
                    int i4 = f2.c;
                    if (i4 != i) {
                        throw new IllegalStateException("On updateState to " + i2 + " was " + g(i4) + ". expecting " + g(i));
                    }
                }
                if (i2 != f2.c) {
                    f2.c = i2;
                }
            }
            i2 = f2.c;
            i = i3;
        }
        xze xzeVar = f;
        if (xzeVar.s(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            xyo d = xzeVar.d();
            d.H("Operation-");
            d.u(action.t);
            d.u(": @");
            d.u(simpleDateFormat.format(new Date()));
            d.u("UTC.");
            d.z("oldMonitorState", g(i));
            d.z("newMonitorState", g(i2));
            d.q();
        }
    }

    private static rhj f(String str) {
        rhj rhjVar;
        vl vlVar = a;
        synchronized (vlVar) {
            rhjVar = (rhj) vlVar.get(str);
        }
        return rhjVar;
    }

    private static String g(int i) {
        switch (i) {
            case 0:
                return "STATE_UNDEFINED";
            case 1:
                return "STATE_CREATED";
            case 2:
                return "STATE_QUEUED";
            case 3:
                return "STATE_EXECUTING";
            case 4:
                return "STATE_BACKGROUND_ACTIONS_QUEUED";
            case 5:
                return "STATE_EXECUTING_BACKGROUND_ACTION";
            case 6:
                return "STATE_BACKGROUND_COMPLETION_QUEUED";
            case 7:
                return "STATE_PROCESSING_BACKGROUND_RESPONSE";
            default:
                return "STATE_COMPLETE";
        }
    }

    final void d(rhi rhiVar) {
        synchronized (this.b) {
            this.d = rhiVar;
        }
    }

    public rhj(rhi rhiVar, Action action) {
        this(action.t, (Object) null);
        d(rhiVar);
    }

    public rhj(rhi rhiVar, Action action, Object obj) {
        this(action.t, obj);
        d(rhiVar);
    }
}
