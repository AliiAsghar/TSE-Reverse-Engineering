package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.events.EventHubProxy;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrm {
    private static final advp c = new advp(acrm.class.getName());
    public final EventHubProxy a;
    public final EventHubProxy b;
    private final Context d;
    private final acoc e;

    public acrm(Context context, acoc acocVar, anen anenVar) {
        this.d = context;
        this.e = acocVar;
        this.a = new EventHubProxy("ENGINE", anenVar);
        this.b = new EventHubProxy("UI", anenVar);
    }

    private final void e(Event event, advy advyVar) {
        Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
        intent.putExtra(RcsIntents.EXTRA_EVENT, event);
        advz.a(this.d, intent, advyVar);
        f(event, 3);
    }

    private final void f(Event event, int i) {
        int i2;
        int i3 = event.g;
        if (i3 != 2 && (i2 = event.h) != 50050) {
            int ae = a.ae(i3);
            advp advpVar = c;
            if (ae != 0) {
                advr.l(advpVar, "Event sent, category: %s, method: %s, code: %s", aotl.f(ae), aoue.h(i), Integer.valueOf(i2));
                advr.w(1, 3, "Event sent, category: %s, method: %s, code: %s", aotl.f(ae), aoue.h(i), Integer.valueOf(event.h));
                aozy createBuilder = apfa.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                apfa apfaVar = (apfa) apagVar;
                apfaVar.g = i - 1;
                apfaVar.b |= 4;
                int ae2 = a.ae(event.g);
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                apfa apfaVar2 = (apfa) apagVar2;
                int i4 = ae2 - 1;
                if (ae2 != 0) {
                    apfaVar2.e = i4;
                    apfaVar2.b |= 1;
                    int i5 = event.h;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar3 = createBuilder.b;
                    apfa apfaVar3 = (apfa) apagVar3;
                    apfaVar3.b = 2 | apfaVar3.b;
                    apfaVar3.f = i5;
                    int b = actx.b(event.i);
                    if (!apagVar3.isMutable()) {
                        createBuilder.u();
                    }
                    apfa apfaVar4 = (apfa) createBuilder.b;
                    apfaVar4.h = b - 1;
                    apfaVar4.b |= 8;
                    event.e(createBuilder);
                    acoc acocVar = this.e;
                    Context context = this.d;
                    apfa apfaVar5 = (apfa) createBuilder.s();
                    aozy createBuilder2 = apkr.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apkr apkrVar = (apkr) createBuilder2.b;
                    apfaVar5.getClass();
                    apkrVar.d = apfaVar5;
                    apkrVar.c = 12;
                    acocVar.i(context, createBuilder2, apkj.EVENT_HUB_EVENT);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    public final void a(Event event, advy advyVar) {
        if (((Boolean) EventHubProxy.DD_NOT_MERGE_EVENTS.a()).booleanValue()) {
            c(event, advyVar);
            return;
        }
        this.a.postMergableEvent(event);
        if (this.b.hasSubscribersForEventCategory(event.g)) {
            this.b.postMergableEvent(event);
            f(event, 2);
        } else {
            advr.d(c, "Did not post mergable event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, advyVar);
        }
    }

    public final void b(Event event, advy advyVar) {
        this.a.postOverridingEvent(event);
        if (this.b.hasSubscribersForEventCategory(event.g)) {
            this.b.postOverridingEvent(event);
            f(event, 2);
        } else {
            advr.d(c, "Did not post overriding event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, advyVar);
        }
    }

    public final void c(Event event, advy advyVar) {
        this.a.postUniqueEvent(event);
        this.a.flushQueues();
        if (this.b.hasSubscribersForEventCategory(event.g)) {
            this.b.postUniqueEvent(event);
            this.b.flushQueues();
            f(event, 2);
        } else {
            advr.d(c, "Did not post unique event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, advyVar);
        }
    }

    public final void d(int i) {
        this.a.unsubscribe(5, i);
    }
}
