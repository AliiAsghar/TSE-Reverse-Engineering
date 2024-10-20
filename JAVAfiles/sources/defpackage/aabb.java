package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabb extends xzs {
    final /* synthetic */ zxy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aabb(zxy zxyVar) {
        super("Bugle.Async.RecentItemBuffer.ReadFromShared.Duration");
        this.a = zxyVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        zxy zxyVar = this.a;
        String f = ((ykw) zxyVar.b).f((String) zxyVar.e, null);
        ((CopyOnWriteArrayList) zxyVar.d).clear();
        if (f != null) {
            Iterator it = anna.e(',').a(f).iterator();
            while (it.hasNext()) {
                ((CopyOnWriteArrayList) this.a.d).add((String) it.next());
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((aabc) it.next()).K(this.a);
        }
    }
}
