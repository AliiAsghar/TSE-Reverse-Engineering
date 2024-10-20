package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxp implements gwn, gts {
    public static final String a = gsy.b("SystemFgDispatcher");
    public final gvd b;
    public final Object c = new Object();
    gyg d;
    final Map e;
    public final Map f;
    public final Map g;
    public gxo h;
    public final gpx i;
    public final hgi j;
    private final Context k;

    public gxp(Context context) {
        this.k = context;
        gvd m = gvd.m(context);
        this.b = m;
        this.i = m.l;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.j = new hgi(m.k);
        m.g.a(this);
    }

    @Override // defpackage.gts
    public final void a(gyg gygVar, boolean z) {
        arxm arxmVar;
        Map.Entry entry;
        synchronized (this.c) {
            if (((gys) this.f.remove(gygVar)) != null) {
                arxmVar = (arxm) this.g.remove(gygVar);
            } else {
                arxmVar = null;
            }
            if (arxmVar != null) {
                arxmVar.v(null);
            }
        }
        gsp gspVar = (gsp) this.e.remove(gygVar);
        if (gygVar.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (gyg) entry.getKey();
                if (this.h != null) {
                    gsp gspVar2 = (gsp) entry.getValue();
                    this.h.c(gspVar2.a, gspVar2.b, gspVar2.c);
                    this.h.a(gspVar2.a);
                }
            } else {
                this.d = null;
            }
        }
        gxo gxoVar = this.h;
        if (gspVar != null && gxoVar != null) {
            gsy.a().c(a, "Removing Notification (id: " + gspVar.a + ", workSpecId: " + gygVar + ", notificationType: " + gspVar.b);
            gxoVar.a(gspVar.a);
        }
    }

    public final void b(Intent intent) {
        if (this.h != null) {
            int i = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            gyg gygVar = new gyg(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            gsy.a().c(a, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
            if (notification != null) {
                gsp gspVar = new gsp(intExtra, notification, intExtra2);
                this.e.put(gygVar, gspVar);
                gsp gspVar2 = (gsp) this.e.get(this.d);
                if (gspVar2 == null) {
                    this.d = gygVar;
                } else {
                    this.h.b(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        Iterator it = this.e.entrySet().iterator();
                        while (it.hasNext()) {
                            i |= ((gsp) ((Map.Entry) it.next()).getValue()).b;
                        }
                        gspVar = new gsp(gspVar2.a, gspVar2.c, i);
                    } else {
                        gspVar = gspVar2;
                    }
                }
                this.h.c(gspVar.a, gspVar.b, gspVar.c);
                return;
            }
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
    }

    public final void c() {
        this.h = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((arxm) it.next()).v(null);
            }
        }
        this.b.g.b(this);
    }

    public final void d(int i) {
        gsy.a();
        Log.i(a, a.bV(i, "Foreground service timed out, FGS type: "));
        for (Map.Entry entry : this.e.entrySet()) {
            if (((gsp) entry.getValue()).b == i) {
                this.b.q((gyg) entry.getKey(), -128);
            }
        }
        gxo gxoVar = this.h;
        if (gxoVar != null) {
            gxoVar.d();
        }
    }

    @Override // defpackage.gwn
    public final void e(gys gysVar, gvf gvfVar) {
        if (gvfVar instanceof gwi) {
            gsy.a().c(a, "Constraints unmet for WorkSpec ".concat(gysVar.c));
            this.b.q(gvf.J(gysVar), ((gwi) gvfVar).a);
        }
    }
}
