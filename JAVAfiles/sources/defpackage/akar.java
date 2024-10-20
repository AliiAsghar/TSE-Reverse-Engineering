package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akar extends Service {
    public ahiy a;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        void Md(akar akarVar);
    }

    public final ahiy a() {
        ahiy ahiyVar = this.a;
        if (ahiyVar != null) {
            return ahiyVar;
        }
        arro.b("registry");
        return null;
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.getClass();
        akbd w = a().w(getClass());
        synchronized (w.b) {
            Iterator it = w.c.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println(((Map.Entry) it.next()).toString());
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((a) akec.w(this, a.class)).Md(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        akbd w = a().w(getClass());
        synchronized (w.b) {
            if (intent == null) {
                if (w.g == akbc.STOPPED) {
                    stopSelf(i2);
                }
                return 2;
            }
            w.h = this;
            w.i = i2;
            w.g = akbc.STARTED;
            if (w.c.isEmpty()) {
                w.c(this, (Notification) intent.getParcelableExtra("fallback_notification"));
                w.d();
            } else {
                w.j = w.a(w.j);
                w.c(this, w.j.a);
            }
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        akbd w = a().w(getClass());
        synchronized (w.b) {
            if (w.g.ordinal() == 2) {
                w.d();
                akbb akbbVar = new akbb();
                Collection s = w.d.s();
                alpr alprVar = new alpr();
                Iterator it = s.iterator();
                while (it.hasNext()) {
                    alprVar.c(((aktr) it.next()).a);
                }
                alpt<akry> g = alprVar.g();
                aktu aktuVar = new aktu(akbbVar, new StackTraceElement[0]);
                alok alokVar = new alok();
                for (akry akryVar : g) {
                    aktu aktuVar2 = new aktu(null, aktu.l(akryVar, null));
                    aktuVar.addSuppressed(aktuVar2);
                    alokVar.h(akryVar, aktuVar2);
                }
                alor b = alokVar.b();
                aktu.h(b);
                aktu.f(b);
                ((alvg) ((alvg) ((alvg) akbd.a.h()).g(aktuVar)).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "onTimeout", (char) 437, "ForegroundServiceTracker.java")).q("Timeout elapsed");
                w.f.clear();
                w.d.o();
            }
        }
    }
}
