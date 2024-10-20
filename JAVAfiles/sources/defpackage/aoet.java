package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoet implements aoeo, aofw {
    private static final aohf c = new aofd(1);
    private final List f;
    private final aoey h;
    private final aoeq i;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private Set g = new HashSet();
    public final AtomicReference b = new AtomicReference();

    public aoet(Executor executor, Iterable iterable, Collection collection, aoeq aoeqVar) {
        byte[] bArr;
        aoey aoeyVar = new aoey(executor);
        this.h = aoeyVar;
        this.i = aoeqVar;
        ArrayList<aoen> arrayList = new ArrayList();
        int i = 0;
        arrayList.add(aoen.e(aoeyVar, aoey.class, aogn.class, aogm.class));
        arrayList.add(aoen.e(this, aofw.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aoen aoenVar = (aoen) it.next();
            if (aoenVar != null) {
                arrayList.add(aoenVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((aohf) it3.next()).a();
                    if (componentRegistrar != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (aoen<?> aoenVar2 : componentRegistrar.getComponents()) {
                            String str = aoenVar2.a;
                            if (str != null) {
                                aoenVar2 = new aoen<>(str, aoenVar2.b, aoenVar2.c, aoenVar2.d, aoenVar2.e, new aojo(str, aoenVar2, 0), aoenVar2.g);
                            }
                            arrayList4.add(aoenVar2);
                        }
                        arrayList.addAll(arrayList4);
                        it3.remove();
                    }
                } catch (aoez e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((aoen) it4.next()).b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.g.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.g.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                aode.ar(arrayList);
            } else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList);
                aode.ar(arrayList5);
            }
            for (aoen aoenVar3 : arrayList) {
                this.a.put(aoenVar3, new aofa(new aoer(this, aoenVar3, i)));
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (true) {
                bArr = null;
                if (!it5.hasNext()) {
                    break;
                }
                aoen aoenVar4 = (aoen) it5.next();
                if (aoenVar4.f()) {
                    aohf aohfVar = (aohf) this.a.get(aoenVar4);
                    for (aofg aofgVar : aoenVar4.b) {
                        if (!this.d.containsKey(aofgVar)) {
                            this.d.put(aofgVar, aohfVar);
                        } else {
                            arrayList6.add(new ajnt((aofe) ((aohf) this.d.get(aofgVar)), aohfVar, 19, bArr));
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                aoen aoenVar5 = (aoen) entry.getKey();
                if (!aoenVar5.f()) {
                    aohf aohfVar2 = (aohf) entry.getValue();
                    for (aofg aofgVar2 : aoenVar5.b) {
                        if (!hashMap.containsKey(aofgVar2)) {
                            hashMap.put(aofgVar2, new HashSet());
                        }
                        ((Set) hashMap.get(aofgVar2)).add(aohfVar2);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!this.e.containsKey(entry2.getKey())) {
                    this.e.put((aofg) entry2.getKey(), aofb.b((Collection) entry2.getValue()));
                } else {
                    aofb aofbVar = (aofb) this.e.get(entry2.getKey());
                    Iterator it6 = ((Set) entry2.getValue()).iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(new ajnt(aofbVar, (aohf) it6.next(), 20, bArr));
                    }
                }
            }
            arrayList3.addAll(arrayList7);
            for (aoen aoenVar6 : this.a.keySet()) {
                for (aoev aoevVar : aoenVar6.c) {
                    if (aoevVar.b() && !this.e.containsKey(aoevVar.a)) {
                        this.e.put(aoevVar.a, aofb.b(Collections.emptySet()));
                    } else if (this.d.containsKey(aoevVar.a)) {
                        continue;
                    } else if (aoevVar.b != 1) {
                        if (!aoevVar.b()) {
                            this.d.put(aoevVar.a, new aofe(aofe.a));
                        }
                    } else {
                        throw new aofc(String.format("Unsatisfied dependency for component %s: %s", aoenVar6, aoevVar.a));
                    }
                }
            }
        }
        int size = arrayList3.size();
        while (i < size) {
            ((Runnable) arrayList3.get(i)).run();
            i++;
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            Map map = this.a;
            bool.booleanValue();
            f(map);
        }
    }

    @Override // defpackage.aoeo
    public final synchronized aohf a(aofg aofgVar) {
        return (aohf) this.d.get(aofgVar);
    }

    @Override // defpackage.aoeo
    public final /* synthetic */ aohf b(Class cls) {
        return aode.i(this, cls);
    }

    @Override // defpackage.aoeo
    public final synchronized aohf c(aofg aofgVar) {
        aofb aofbVar = (aofb) this.e.get(aofgVar);
        if (aofbVar != null) {
            return aofbVar;
        }
        return c;
    }

    @Override // defpackage.aoeo
    public final /* synthetic */ Object d(aofg aofgVar) {
        throw null;
    }

    @Override // defpackage.aoeo
    public final /* synthetic */ Object e(Class cls) {
        return aode.k(this, cls);
    }

    public final void f(Map map) {
        Queue<aogl> queue;
        for (Map.Entry entry : map.entrySet()) {
            aoen aoenVar = (aoen) entry.getKey();
            aohf aohfVar = (aohf) entry.getValue();
            if (aoenVar.d == 1) {
                aohfVar.a();
            }
        }
        aoey aoeyVar = this.h;
        synchronized (aoeyVar) {
            queue = aoeyVar.a;
            if (queue != null) {
                aoeyVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (aogl aoglVar : queue) {
                aode.aq(aoglVar);
                synchronized (aoeyVar) {
                    Queue queue2 = aoeyVar.a;
                    if (queue2 != null) {
                        queue2.add(aoglVar);
                    } else {
                        for (Map.Entry entry2 : aoeyVar.a()) {
                            ((Executor) entry2.getValue()).execute(new akwm(entry2, 10));
                        }
                    }
                }
            }
        }
    }
}
