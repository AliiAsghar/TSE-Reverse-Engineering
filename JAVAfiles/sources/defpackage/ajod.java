package defpackage;

import android.util.SparseArray;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEventObserver;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajod extends IEventObserver.Stub {
    static final uuf a = uuh.q(146383903);
    private final SparseArray b;
    private final aksr c;

    public ajod(SparseArray sparseArray, aksr aksrVar) {
        this.b = sparseArray;
        this.c = aksrVar;
    }

    final void a(Event event) {
        List<ajoe> list;
        akrh e;
        int i = event.g;
        synchronized (this.b) {
            ajoc ajocVar = (ajoc) this.b.get(i);
            if (ajocVar != null) {
                list = ajocVar.b;
            } else {
                int i2 = alog.d;
                list = alsx.a;
            }
        }
        for (ajoe ajoeVar : list) {
            if (((Boolean) a.e()).booleanValue()) {
                switch (event.g) {
                    case 0:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent UNKNOWN");
                        break;
                    case 1:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent AUTHENTICATION");
                        break;
                    case 2:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent FILE_TRANSFER");
                        break;
                    case 3:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent IMS");
                        break;
                    case 4:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent GROUPS");
                        break;
                    case 5:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent CHAT_SESSION");
                        break;
                    case 6:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent LOCATIONSHARING");
                        break;
                    case 7:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent PRESENCE");
                        break;
                    case 8:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent SMS");
                        break;
                    default:
                        e = aktp.e("EventService.ProxyObserver#notifyInProcessEvent default");
                        break;
                }
                try {
                    ajoeVar.b(event);
                    e.close();
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                ajoeVar.b(event);
            }
        }
        if (list.isEmpty()) {
            xzb.o("RcsClientLib", "EventService has no listeners for event %d", Integer.valueOf(event.g));
        } else if (list.size() == 1) {
            xzb.m("RcsClientLib", "EventService has 1 listeners for event %d: %s", Integer.valueOf(event.g), ((ajoe) list.get(0)).a());
        } else {
            xzb.m("RcsClientLib", "EventService has %d listeners for event %d", Integer.valueOf(list.size()), Integer.valueOf(event.g));
        }
    }

    @Override // com.google.android.ims.rcsservice.events.IEventObserver
    public final void notifyEvent(Event event) {
        akrc b;
        if (((Boolean) a.e()).booleanValue()) {
            aksr aksrVar = this.c;
            switch (event.g) {
                case 0:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent UNKNOWN");
                    break;
                case 1:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent AUTHENTICATION");
                    break;
                case 2:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent FILE_TRANSFER");
                    break;
                case 3:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent IMS");
                    break;
                case 4:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent GROUPS");
                    break;
                case 5:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent CHAT_SESSION");
                    break;
                case 6:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent LOCATIONSHARING");
                    break;
                case 7:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent PRESENCE");
                    break;
                case 8:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent SMS");
                    break;
                default:
                    b = aksrVar.b("EventService.ProxyObserver#notifyEvent default");
                    break;
            }
            try {
                a(event);
                b.close();
                return;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        a(event);
    }
}
