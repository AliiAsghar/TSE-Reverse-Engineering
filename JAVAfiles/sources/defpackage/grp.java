package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.gqz;
import defpackage.grk;
import defpackage.grl;
import defpackage.grn;
import defpackage.gvf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grp implements gre {
    public static volatile grp a;
    public static final ReentrantLock b = new ReentrantLock();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final grn d;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    public grp(final grn grnVar) {
        this.d = grnVar;
        if (grnVar != null) {
            grnVar.e = new grl(new gro(this));
            ?? r0 = grnVar.a;
            if (r0 != 0) {
                r0.setSidecarCallback(new DistinctElementSidecarCallback(new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
                    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                        ?? r5;
                        sidecarDeviceState.getClass();
                        for (Activity activity : grn.this.c.values()) {
                            grn grnVar2 = grn.this;
                            IBinder aJ = gvf.aJ(activity);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                            if (aJ != null && (r5 = grnVar2.a) != 0) {
                                sidecarWindowLayoutInfo = r5.getWindowLayoutInfo(aJ);
                            }
                            Object obj = grnVar2.e;
                            if (obj != null) {
                                Object obj2 = grnVar2.b;
                                ((grl) obj).a(activity, grk.a(sidecarWindowLayoutInfo, sidecarDeviceState));
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
                    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                        SidecarDeviceState sidecarDeviceState;
                        iBinder.getClass();
                        sidecarWindowLayoutInfo.getClass();
                        Activity activity = (Activity) grn.this.c.get(iBinder);
                        if (activity == null) {
                            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                            return;
                        }
                        grn grnVar2 = grn.this;
                        Object obj = grnVar2.b;
                        ?? r02 = grnVar2.a;
                        if (r02 == 0 || (sidecarDeviceState = r02.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        grn grnVar3 = grn.this;
                        gqz a2 = grk.a(sidecarWindowLayoutInfo, sidecarDeviceState);
                        Object obj2 = grnVar3.e;
                        if (obj2 != null) {
                            ((grl) obj2).a(activity, a2);
                        }
                    }
                }, null));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [eab, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.gre
    public final void a(ecd ecdVar) {
        IBinder aJ;
        ?? r1;
        synchronized (b) {
            if (this.d == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ktk ktkVar = (ktk) it.next();
                if (ktkVar.b == ecdVar) {
                    ktkVar.getClass();
                    arrayList.add(ktkVar);
                }
            }
            this.c.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ?? r12 = ((ktk) it2.next()).a;
                CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (d.F(((ktk) it3.next()).a, r12)) {
                            break;
                        }
                    }
                }
                grn grnVar = this.d;
                if (grnVar != null && (aJ = gvf.aJ((Activity) r12)) != null) {
                    ?? r4 = grnVar.a;
                    if (r4 != 0) {
                        r4.onWindowLayoutChangeListenerRemoved(aJ);
                    }
                    ecd ecdVar2 = (ecd) grnVar.d.get(r12);
                    if (ecdVar2 != null) {
                        r12.g(ecdVar2);
                        grnVar.d.remove(r12);
                    }
                    Object obj = grnVar.e;
                    if (obj != null) {
                        ReentrantLock reentrantLock = ((grl) obj).a;
                        reentrantLock.lock();
                        try {
                            ((grl) obj).b.put(r12, null);
                            reentrantLock.unlock();
                        } finally {
                        }
                    }
                    int size = grnVar.c.size();
                    grnVar.c.remove(aJ);
                    if (size == 1 && (r1 = grnVar.a) != 0) {
                        r1.onDeviceStateListenersChanged(true);
                    }
                }
            }
        }
    }

    @Override // defpackage.gre
    public final void b(Context context, ecd ecdVar) {
        Object obj;
        Object obj2;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            grn grnVar = this.d;
            if (grnVar == null) {
                ecdVar.accept(new gqz(arnv.a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            boolean z = false;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (d.F(((ktk) it.next()).a, context)) {
                        z = true;
                        break;
                    }
                }
            }
            ktk ktkVar = new ktk((Activity) context, ecdVar);
            this.c.add(ktkVar);
            if (!z) {
                IBinder aJ = gvf.aJ((Activity) context);
                if (aJ != null) {
                    grnVar.b(aJ, (Activity) context);
                } else {
                    ((Activity) context).getWindow().getDecorView().addOnAttachStateChangeListener(new grm(grnVar, (Activity) context));
                }
            } else {
                Iterator it2 = this.c.iterator();
                while (true) {
                    obj = null;
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (d.F(context, ((ktk) obj2).a)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                ktk ktkVar2 = (ktk) obj2;
                if (ktkVar2 != null) {
                    obj = ktkVar2.c;
                }
                if (obj != null) {
                    ktkVar.f((gqz) obj);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
