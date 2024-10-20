package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlf extends ContextWrapper {
    static final hlt a = new hkx();
    public final List b;
    public final Map c;
    public final hpf d;
    public final int e;
    public final hqh f;
    public final hwr g;
    public final hgj h;
    private final hyp i;
    private final hky j;
    private hxc k;

    public hlf(Context context, hqh hqhVar, hyp hypVar, hwr hwrVar, hky hkyVar, Map map, List list, hpf hpfVar, hgj hgjVar) {
        super(context.getApplicationContext());
        this.f = hqhVar;
        this.g = hwrVar;
        this.j = hkyVar;
        this.b = list;
        this.c = map;
        this.d = hpfVar;
        this.h = hgjVar;
        this.e = 4;
        this.i = new hyo(hypVar);
    }

    public final synchronized hxc a() {
        if (this.k == null) {
            hxc a2 = this.j.a();
            a2.ad();
            this.k = a2;
        }
        return this.k;
    }

    public final mgu b() {
        return (mgu) this.i.a();
    }
}
