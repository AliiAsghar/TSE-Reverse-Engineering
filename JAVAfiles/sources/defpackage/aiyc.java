package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiyc implements Application.ActivityLifecycleCallbacks, aixz {
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public ScheduledFuture d;
    public agcp f;
    private final aiya h;
    public final AtomicLong c = new AtomicLong(0);
    public final long b = g;
    protected final Object e = new Object();

    public aiyc(agcp agcpVar, ScheduledExecutorService scheduledExecutorService, aiya aiyaVar) {
        this.f = agcpVar;
        this.a = scheduledExecutorService;
        this.h = aiyaVar;
    }

    public final void a() {
        synchronized (this.e) {
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.d = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map, java.lang.Object] */
    public final void b() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        this.c.set(0L);
        agcp agcpVar = this.f;
        ArrayList arrayList2 = new ArrayList();
        aiya aiyaVar = this.h;
        synchronized (aiyaVar.b) {
            Iterator it = aiyaVar.a.values().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                aixy aixyVar = (aixy) it.next();
                HashMap hashMap = new HashMap(10);
                aixx aixxVar = new aixx(aixyVar.c, aixyVar.d);
                synchronized (aixyVar.b) {
                    aixxVar.d = aixyVar.f;
                    aixxVar.a = aixyVar.g;
                    aixyVar.f = hashMap;
                    aixyVar.g = 0;
                }
                arrayList2.add(aixxVar);
            }
        }
        aozy createBuilder = aldx.a.createBuilder();
        int size = arrayList2.size();
        int i4 = 0;
        while (true) {
            abnq abnqVar = null;
            aonn aonnVar = null;
            if (i4 < size) {
                aixx aixxVar2 = (aixx) arrayList2.get(i4);
                if (aixxVar2.a == 0) {
                    arrayList = arrayList2;
                    i2 = size;
                } else {
                    aozy createBuilder2 = aonn.a.createBuilder();
                    long a = aiya.a((String) aixxVar2.b);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    aonn aonnVar2 = (aonn) createBuilder2.b;
                    aonnVar2.b |= 2;
                    aonnVar2.c = a;
                    aixw[] aixwVarArr = (aixw[]) aixxVar2.c;
                    int length = aixwVarArr.length;
                    for (int i5 = i; i5 < length; i5++) {
                        long a2 = aiya.a(aixwVarArr[i5].a);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        aonn aonnVar3 = (aonn) createBuilder2.b;
                        apar aparVar = aonnVar3.d;
                        if (!aparVar.c()) {
                            aonnVar3.d = apag.mutableCopy(aparVar);
                        }
                        aonnVar3.d.f(a2);
                    }
                    for (Map.Entry entry : aixxVar2.d.entrySet()) {
                        aozy createBuilder3 = aonm.a.createBuilder();
                        aixu aixuVar = (aixu) entry.getKey();
                        aixv aixvVar = (aixv) entry.getValue();
                        Object obj = aixxVar2.b;
                        ArrayList arrayList3 = new ArrayList(aixuVar.b.length);
                        int i6 = 0;
                        while (i6 < aixuVar.b.length) {
                            aozy createBuilder4 = aonk.a.createBuilder();
                            Object obj2 = aixuVar.b[i6];
                            ArrayList arrayList4 = arrayList2;
                            if (obj2 instanceof String) {
                                String str = (String) obj2;
                                if (!createBuilder4.b.isMutable()) {
                                    createBuilder4.u();
                                }
                                aonk aonkVar = (aonk) createBuilder4.b;
                                str.getClass();
                                i3 = size;
                                aonkVar.b = 1;
                                aonkVar.c = str;
                            } else {
                                i3 = size;
                                if (obj2 instanceof Integer) {
                                    Integer num = (Integer) obj2;
                                    num.intValue();
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    aonk aonkVar2 = (aonk) createBuilder4.b;
                                    aonkVar2.b = 2;
                                    aonkVar2.c = num;
                                } else if (obj2 instanceof Boolean) {
                                    Boolean bool = (Boolean) obj2;
                                    bool.booleanValue();
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    aonk aonkVar3 = (aonk) createBuilder4.b;
                                    aonkVar3.b = 3;
                                    aonkVar3.c = bool;
                                } else {
                                    throw new IllegalArgumentException("Metric " + ((String) obj) + " has field " + i6 + " with an unexpected value: " + String.valueOf(obj2));
                                }
                            }
                            arrayList3.add((aonk) createBuilder4.s());
                            i6++;
                            arrayList2 = arrayList4;
                            size = i3;
                        }
                        ArrayList arrayList5 = arrayList2;
                        int i7 = size;
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        aonm aonmVar = (aonm) createBuilder3.b;
                        apax apaxVar = aonmVar.c;
                        if (!apaxVar.c()) {
                            aonmVar.c = apag.mutableCopy(apaxVar);
                        }
                        aoyj.addAll(arrayList3, aonmVar.c);
                        aozy createBuilder5 = aonl.a.createBuilder();
                        long j = aixvVar.a;
                        if (!createBuilder5.b.isMutable()) {
                            createBuilder5.u();
                        }
                        aonl aonlVar = (aonl) createBuilder5.b;
                        aonlVar.b = 1;
                        aonlVar.c = Long.valueOf(j);
                        aonl aonlVar2 = (aonl) createBuilder5.s();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        aonm aonmVar2 = (aonm) createBuilder3.b;
                        aonlVar2.getClass();
                        aonmVar2.d = aonlVar2;
                        aonmVar2.b |= 1;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        aonn aonnVar4 = (aonn) createBuilder2.b;
                        aonm aonmVar3 = (aonm) createBuilder3.s();
                        aonmVar3.getClass();
                        apax apaxVar2 = aonnVar4.e;
                        if (!apaxVar2.c()) {
                            aonnVar4.e = apag.mutableCopy(apaxVar2);
                        }
                        aonnVar4.e.add(aonmVar3);
                        arrayList2 = arrayList5;
                        size = i7;
                    }
                    arrayList = arrayList2;
                    i2 = size;
                    aonnVar = (aonn) createBuilder2.s();
                }
                if (aonnVar != null) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aldx aldxVar = (aldx) createBuilder.b;
                    apax apaxVar3 = aldxVar.b;
                    if (!apaxVar3.c()) {
                        aldxVar.b = apag.mutableCopy(apaxVar3);
                    }
                    aldxVar.b.add(aonnVar);
                }
                i4++;
                arrayList2 = arrayList;
                size = i2;
                i = 0;
            } else {
                aldx aldxVar2 = (aldx) createBuilder.s();
                if (aldxVar2.b.size() != 0) {
                    abnqVar = ((abnr) agcpVar.a).g(aldxVar2);
                    abnqVar.j = (String) agcpVar.c;
                    Iterator it2 = ((CopyOnWriteArrayList) agcpVar.b).iterator();
                    while (it2.hasNext()) {
                        abnqVar.g((String) it2.next());
                    }
                }
                if (abnqVar != null) {
                    abnqVar.c();
                    return;
                }
                return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.e) {
            b();
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
