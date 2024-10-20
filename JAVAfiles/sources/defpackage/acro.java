package defpackage;

import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEventObserver;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acro extends ConcurrentHashMap {
    private static final long serialVersionUID = -6690785995969305545L;

    public final void a(Event event) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Integer num = (Integer) entry.getKey();
                try {
                    IEventObserver iEventObserver = (IEventObserver) get(num);
                    iEventObserver.getClass();
                    advr.c("Notifying observer of class %s of event %s", iEventObserver.getClass().getName(), event);
                    iEventObserver.notifyEvent(event);
                } catch (NetworkOnMainThreadException e) {
                    e = e;
                    advr.s(e, "", new Object[0]);
                } catch (RemoteException unused) {
                    advr.k("Removing orphaned observer %s", num);
                    it.remove();
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    advr.s(e, "", new Object[0]);
                } catch (IllegalStateException e3) {
                    e = e3;
                    advr.s(e, "", new Object[0]);
                } catch (NullPointerException e4) {
                    e = e4;
                    advr.s(e, "", new Object[0]);
                } catch (SecurityException e5) {
                    e = e5;
                    advr.s(e, "", new Object[0]);
                } catch (UnsupportedOperationException e6) {
                    e = e6;
                    advr.s(e, "", new Object[0]);
                }
            }
        }
    }
}
