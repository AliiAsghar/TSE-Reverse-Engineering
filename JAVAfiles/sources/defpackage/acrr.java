package defpackage;

import com.google.android.ims.rcsservice.events.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrr implements acrp {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

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
    public final List b() {
        return this.a;
    }

    @Override // defpackage.acrp
    public final /* synthetic */ Queue c() {
        throw new UnsupportedOperationException("Queue is not available");
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
