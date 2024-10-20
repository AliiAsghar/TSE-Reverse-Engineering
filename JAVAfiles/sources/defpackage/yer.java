package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yer extends yep {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl");
    public final Object b = new Object();
    public volatile boolean c;
    public final Context d;
    public final anen e;
    public final List f;
    private final BroadcastReceiver g;

    public yer(Context context, anen anenVar, anen anenVar2) {
        yeq yeqVar = new yeq(this);
        this.g = yeqVar;
        this.f = new ArrayList();
        this.d = context;
        this.e = anenVar2;
        qiu.h(anenVar.submit(akto.j(new ybh(this, 4))));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        egl.h(context, yeqVar, intentFilter);
    }

    private final Map k() {
        l("bugle_");
        Context context = this.d;
        context.getClass();
        return acmd.d(context.getContentResolver(), "bugle_");
    }

    private final void l(String str) {
        akrh e = aktp.e("BugleGservicesImpl#assertKeyAndWaitForGservices");
        try {
            boolean z = true;
            if (!str.startsWith("bugle_") && !str.equals("android_id") && !str.equals("device_country")) {
                z = false;
            }
            d.s(z);
            while (true) {
                if (this.c) {
                    break;
                }
                synchronized (this.b) {
                    if (this.c) {
                        break;
                    }
                    try {
                        this.b.wait(60000L);
                    } catch (InterruptedException e2) {
                        alvw h = a.h();
                        h.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) ((alvg) h).g(e2)).h("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl", "assertKeyAndWaitForGservices", (char) 190, "BugleGservicesImpl.java")).q("Waited too long for gservices");
                    }
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.yep
    public final float a(String str, float f) {
        Object obj;
        Float f2;
        l(str);
        if (yes.c(str)) {
            if (yes.c == null) {
                return brg.a;
            }
            return yes.c.getFloat(str);
        }
        ContentResolver contentResolver = this.d.getContentResolver();
        acmk acmkVar = acmd.a;
        acmk.e(contentResolver);
        synchronized (acmkVar) {
            acmkVar.c(contentResolver);
            obj = acmkVar.f;
            f2 = (Float) acmk.f(acmkVar.e, str, Float.valueOf(f));
        }
        if (f2 != null) {
            return f2.floatValue();
        }
        String a2 = acmkVar.a(contentResolver, str, null);
        if (a2 != null) {
            try {
                float parseFloat = Float.parseFloat(a2);
                f2 = Float.valueOf(parseFloat);
                f = parseFloat;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (acmkVar) {
            acmkVar.d(obj, acmkVar.e, str, f2);
        }
        return f;
    }

    @Override // defpackage.yep
    public final int b(String str, int i) {
        l(str);
        if (yes.c(str)) {
            if (yes.c == null) {
                return 0;
            }
            return yes.c.getInt(str);
        }
        return acmd.a(this.d.getContentResolver(), str, i);
    }

    @Override // defpackage.yep
    public final long c(String str, long j) {
        l(str);
        if (yes.c(str)) {
            if (yes.c == null) {
                return 0L;
            }
            return yes.c.getLong(str);
        }
        return acmd.b(this.d.getContentResolver(), str, j);
    }

    @Override // defpackage.yep
    public final String d() {
        return j();
    }

    @Override // defpackage.yep
    public final String e(String str, String str2) {
        l(str);
        if (yes.c(str)) {
            if (yes.c == null) {
                return "";
            }
            return albo.ag(yes.c.getString(str));
        }
        return acmd.c(this.d.getContentResolver(), str, str2);
    }

    @Override // defpackage.yep
    public final Map f() {
        return k();
    }

    @Override // defpackage.yep
    public final void g(Runnable runnable) {
        synchronized (this.f) {
            this.f.add(runnable);
        }
    }

    @Override // defpackage.yep
    public final void h() {
        this.d.sendBroadcast(new Intent("android.server.checkin.CHECKIN"));
    }

    @Override // defpackage.yep
    public final boolean i(String str, boolean z) {
        l(str);
        if (yes.c(str)) {
            if (yes.c == null) {
                return false;
            }
            return yes.c.getBoolean(str);
        }
        return acmd.e(this.d.getContentResolver(), str, z);
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        Map k = k();
        if (k.isEmpty()) {
            sb.append("No bugle gservices keys/values");
        } else {
            for (String str : k.keySet()) {
                sb.append(String.format("%s: %s\n", str, (String) k.get(str)));
            }
        }
        return sb.toString();
    }
}
