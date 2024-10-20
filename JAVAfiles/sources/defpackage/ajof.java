package defpackage;

import com.google.android.rcs.client.events.EventService;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajof {
    public static final ajof a = new ajof();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final void a(EventService eventService) {
        this.b.remove(eventService);
    }
}
