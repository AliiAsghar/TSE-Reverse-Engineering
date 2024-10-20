package com.google.android.ims.events;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.events.IEventObserver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.acbq;
import defpackage.acrn;
import defpackage.acro;
import defpackage.acrp;
import defpackage.acrq;
import defpackage.acrr;
import defpackage.acyz;
import defpackage.aczd;
import defpackage.adsk;
import defpackage.advr;
import defpackage.agkx;
import defpackage.albo;
import defpackage.anen;
import defpackage.xch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EventHubProxy extends IEvent.Stub {
    public static final acyz<Boolean> DD_NOT_MERGE_EVENTS = aczd.a(154997142);
    private static final acyz a = aczd.a(159965913);
    private final String b;
    private final boolean d;
    ListenableFuture<?> eventFuture;
    private final List f;
    private final List g;
    private final anen h;
    private final Runnable i;
    private acrn j;
    private boolean c = false;
    private volatile long e = Long.MAX_VALUE;

    /* renamed from: -$$Nest$fgetname */
    public static /* bridge */ /* synthetic */ String m221$$Nest$fgetname(EventHubProxy eventHubProxy) {
        return eventHubProxy.b;
    }

    public EventHubProxy(String str, anen anenVar) {
        String[] strArr = adsk.a;
        this.f = new ArrayList(9);
        this.g = new ArrayList(9);
        this.eventFuture = null;
        this.i = new acbq(this, 11, null);
        this.j = null;
        this.b = str;
        this.h = anenVar;
        for (int i = 0; i < 9; i++) {
            this.f.add(new acro());
        }
        this.d = ((Boolean) a.a()).booleanValue();
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.d) {
                this.g.add(new acrq());
            } else {
                this.g.add(new acrr());
            }
        }
    }

    private final void a(IBinder iBinder) {
        acrn acrnVar = new acrn(this, 0);
        this.j = acrnVar;
        try {
            iBinder.linkToDeath(acrnVar, 0);
            advr.c("Linked death recipient for %s", this.b);
        } catch (RemoteException unused) {
            advr.q("Unable to link death recipient for %s", this.b);
            this.j = null;
        }
    }

    private final void b(int i, Event event) {
        acro acroVar = (acro) this.f.get(i);
        advr.c(" *** posting to %d %s observers: %s", Integer.valueOf(acroVar.size()), this.b, event);
        acroVar.a(event);
    }

    private final synchronized void c() {
        ListenableFuture<?> listenableFuture = this.eventFuture;
        if (listenableFuture != null && !listenableFuture.isDone() && !this.eventFuture.isCancelled()) {
            return;
        }
        advr.c("%s: Schedule posting events.", this.b);
        this.eventFuture = this.h.submit(new acbq(this, 10));
    }

    private final void d() {
        synchronized (this.i) {
            if (this.e == Long.MAX_VALUE) {
                this.e = agkx.W().longValue() + 100;
                albo.bR(this.h.submit(this.i), new xch(this, 3), this.h);
            }
        }
    }

    public void flushQueues() {
        synchronized (this.i) {
            if (this.e != Long.MAX_VALUE) {
                this.e = Long.MIN_VALUE;
                this.i.notifyAll();
            }
        }
    }

    public boolean hasSubscribersForEventCategory(int i) {
        boolean z;
        String[] strArr = adsk.a;
        if (i < 9) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "invalid category %s", i);
        if (isBound() && !((acro) this.f.get(i)).isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isBound() {
        return this.c;
    }

    public boolean isSubscribed(int i, IEventObserver iEventObserver) {
        boolean z;
        String[] strArr = adsk.a;
        boolean z2 = false;
        if (i < 9) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "invalid category %s", i);
        if (this.j == null) {
            a(iEventObserver.asBinder());
            this.c = true;
        }
        int hashCode = iEventObserver.hashCode();
        acro acroVar = (acro) this.f.get(i);
        synchronized (acroVar) {
            if (acroVar.get(Integer.valueOf(hashCode)) == iEventObserver) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void ping() {
        postMergableEvent(new Event(1, 0L, 0L));
    }

    public void postMergableEvent(Event event) {
        acrp acrpVar = (acrp) this.g.get(event.g);
        Event a2 = acrpVar.a(event.h);
        if (this.d) {
            if (a2 == null) {
                acrpVar.e(event);
            } else {
                a2.f();
            }
        } else {
            synchronized (acrpVar) {
                if (a2 == null) {
                    acrpVar.e(event);
                } else {
                    a2.f();
                }
            }
        }
        d();
    }

    public void postOverridingEvent(Event event) {
        acrp acrpVar = (acrp) this.g.get(event.g);
        if (this.d) {
            acrpVar.d(event.h);
            acrpVar.e(event);
        } else {
            synchronized (acrpVar) {
                acrpVar.d(event.h);
                acrpVar.e(event);
            }
        }
        d();
    }

    public void postQueuedEvents() {
        int i = 0;
        while (true) {
            String[] strArr = adsk.a;
            if (i < 9) {
                albo.L(true, "invalid category %s", i);
                acrp acrpVar = (acrp) this.g.get(i);
                if (this.d) {
                    while (true) {
                        Event event = (Event) acrpVar.c().poll();
                        if (event == null) {
                            break;
                        } else {
                            b(i, event);
                        }
                    }
                } else {
                    synchronized (acrpVar) {
                        Iterator it = acrpVar.b().iterator();
                        while (it.hasNext()) {
                            b(i, (Event) it.next());
                        }
                        acrpVar.b().clear();
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void postUniqueEvent(Event event) {
        acrp acrpVar = (acrp) this.g.get(event.g);
        if (this.d) {
            acrpVar.e(event);
        } else {
            synchronized (acrpVar) {
                acrpVar.e(event);
            }
        }
        if (((Boolean) DD_NOT_MERGE_EVENTS.a()).booleanValue()) {
            c();
        } else {
            d();
        }
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public int subscribe(int i, IEventObserver iEventObserver) {
        boolean z;
        Integer valueOf;
        String[] strArr = adsk.a;
        if (i < 9) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "invalid category %s", i);
        if (this.j == null) {
            a(iEventObserver.asBinder());
            this.c = true;
        }
        int hashCode = iEventObserver.hashCode();
        acro acroVar = (acro) this.f.get(i);
        synchronized (acroVar) {
            valueOf = Integer.valueOf(hashCode);
            acroVar.put(valueOf, iEventObserver);
        }
        advr.k("Adding event listener %s for category %d with key %d for hub %s", iEventObserver, Integer.valueOf(i), valueOf, this.b);
        return hashCode;
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void unsubscribe(int i, int i2) {
        boolean z;
        Integer valueOf;
        String[] strArr = adsk.a;
        if (i < 9) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "invalid category %s", i);
        synchronized (((acro) this.f.get(i))) {
            acro acroVar = (acro) this.f.get(i);
            valueOf = Integer.valueOf(i2);
            acroVar.remove(valueOf);
        }
        advr.k("Removing event listener %s for category %d for hub %s", valueOf, Integer.valueOf(i), this.b);
        System.gc();
    }
}
