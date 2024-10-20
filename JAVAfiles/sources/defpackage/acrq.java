package defpackage;

import com.google.android.ims.rcsservice.events.Event;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrq implements acrp {
    private final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    @Override // defpackage.acrp
    public final Event a(int i) {
        Iterator it = this.a.iterator();
        Event event = null;
        while (it.hasNext()) {
            Event event2 = (Event) it.next();
            if (event2.h == i) {
                event = event2;
            }
        }
        return event;
    }

    @Override // defpackage.acrp
    public final /* synthetic */ List b() {
        throw new UnsupportedOperationException("List is not available");
    }

    @Override // defpackage.acrp
    public final Queue c() {
        return this.a;
    }

    @Override // defpackage.acrp
    public final void d(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Event event = (Event) it.next();
            if (event.h == i) {
                arrayList.add(event);
            }
        }
        this.a.removeAll(arrayList);
    }

    @Override // defpackage.acrp
    public final void e(Event event) {
        this.a.add(event);
    }
}
