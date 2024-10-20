package defpackage;

import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEventObserver;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acrx extends IEventObserver.Stub {
    public int a;
    final /* synthetic */ acry b;
    private final long c;
    private final String d;

    public acrx(acry acryVar, long j, String str) {
        this.b = acryVar;
        this.c = j;
        this.d = str;
    }

    @Override // com.google.android.ims.rcsservice.events.IEventObserver
    public final void notifyEvent(Event event) {
        if (event.h == 50030 && event.j == this.c && (event instanceof ChatSessionMessageEvent) && this.d.equals(((ChatSessionMessageEvent) event).c)) {
            long j = this.c;
            HashMap hashMap = this.b.f;
            String l = Long.toString(j);
            hashMap.remove(l);
            this.b.b(l);
            acry acryVar = this.b;
            acryVar.d.d(this.a);
        }
    }
}
