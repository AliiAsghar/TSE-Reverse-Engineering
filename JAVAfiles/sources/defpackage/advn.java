package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advn extends ConcurrentHashMap {
    private static final long serialVersionUID = 1;

    public final void a(Object obj, Object obj2) {
        obj.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) get(obj);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            put(obj, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(obj2);
    }
}
