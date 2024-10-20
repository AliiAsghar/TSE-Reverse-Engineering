package com.google.android.rcs.client.events;

import android.content.Context;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.ims.rcsservice.events.IEvent;
import defpackage.ajnv;
import defpackage.ajnw;
import defpackage.ajny;
import defpackage.ajoa;
import defpackage.ajoc;
import defpackage.ajod;
import defpackage.ajoe;
import defpackage.ajof;
import defpackage.aksr;
import defpackage.apfi;
import defpackage.uub;
import defpackage.xzb;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EventService extends ajnv<IEvent> {
    final ajod h;
    private final SparseArray i;

    public EventService(aksr aksrVar, uub uubVar, ajnw ajnwVar, Context context, ajoa ajoaVar) {
        super(IEvent.class, context, ajoaVar, 1, Optional.of(ajnwVar));
        uubVar.a();
        SparseArray sparseArray = new SparseArray();
        this.i = sparseArray;
        this.h = new ajod(sparseArray, aksrVar);
    }

    private final void g() {
        ajof.a.a(this);
        synchronized (this.i) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.i.keyAt(i);
                int i2 = ((ajoc) this.i.valueAt(i)).a;
                try {
                    synchronized (this.d) {
                        try {
                            try {
                                if (a() != null) {
                                    ((IEvent) a()).unsubscribe(keyAt, i2);
                                    xzb.d("RcsClientLib", "EventService removing key %d as listener for %d", Integer.valueOf(i2), Integer.valueOf(keyAt));
                                }
                            } catch (Throwable th) {
                                throw th;
                                break;
                            }
                        } catch (ajny unused) {
                        }
                    }
                } catch (RemoteException e) {
                    xzb.p("RcsClientLib", e, "exception when unsubscribing for disconnect");
                }
            }
            this.i.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajnv
    public final void d(String str) {
        super.d(str);
        ajof.a.b.put(this, true);
    }

    @Override // defpackage.ajnv
    public void disconnect() {
        g();
        super.disconnect();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajnv
    public final void e(String str) {
        g();
        ajof.a.a(this);
        super.e(str);
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "EventServiceVersions";
    }

    @Override // defpackage.ajnv
    public apfi getServiceNameLoggingEnum() {
        return apfi.EVENT_SERVICE;
    }

    public boolean isSubscribed(ajoe ajoeVar) {
        synchronized (this.i) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                if (((ajoc) this.i.valueAt(i)).b.contains(ajoeVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Deprecated
    public void subscribe(int i, ajoe ajoeVar) {
        b();
        try {
            synchronized (this.i) {
                ajoc ajocVar = (ajoc) this.i.get(i);
                if (ajocVar == null) {
                    xzb.d("RcsClientLib", "EventService subscribing itself as listener for %d", Integer.valueOf(i));
                    ajoc ajocVar2 = new ajoc(((IEvent) a()).subscribe(i, this.h), new CopyOnWriteArrayList());
                    this.i.put(i, ajocVar2);
                    ajocVar = ajocVar2;
                }
                xzb.d("RcsClientLib", "EventService adding %s as listener for %d", ajoeVar.a(), Integer.valueOf(i));
                ajocVar.b.add(ajoeVar);
            }
        } catch (Exception e) {
            throw new ajny(e.getMessage(), e);
        }
    }

    public void unsubscribe(int i, ajoe ajoeVar) {
        b();
        try {
            synchronized (this.i) {
                ajoc ajocVar = (ajoc) this.i.get(i);
                if (ajocVar == null) {
                    xzb.n("RcsClientLib", "Cannot unsubscribe from Rcs Event Service, there are no observers");
                    return;
                }
                String a = ajoeVar.a();
                Integer valueOf = Integer.valueOf(i);
                xzb.d("RcsClientLib", "EventService removing %s as listener for %d", a, valueOf);
                ajocVar.b.remove(ajoeVar);
                if (ajocVar.b.isEmpty()) {
                    ((IEvent) a()).unsubscribe(i, ajocVar.a);
                    this.i.remove(i);
                    xzb.d("RcsClientLib", "EventService removing itself as listener for %d", valueOf);
                }
            }
        } catch (Exception e) {
            throw new ajny(e.getMessage(), e);
        }
    }

    public void unsubscribeAllCategories(ajoe ajoeVar) {
        b();
        try {
            synchronized (this.i) {
                int size = this.i.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    int keyAt = this.i.keyAt(i);
                    if (((ajoc) this.i.valueAt(i)).b.contains(ajoeVar)) {
                        arrayList.add(Integer.valueOf(keyAt));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    unsubscribe(((Integer) it.next()).intValue(), ajoeVar);
                }
            }
        } catch (Exception e) {
            throw new ajny(e.getMessage(), e);
        }
    }
}
