package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbt implements kkl {
    public final Context a;
    public final arwe b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final aksr j;
    public SharedPreferences.OnSharedPreferenceChangeListener k;
    public final ascv l;
    private final armf m;
    private final armf n;
    private final asai o;
    private final asai p;

    public jbt(Context context, arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, aksr aksrVar) {
        List arrayList;
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        aksrVar.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = armfVar3;
        this.m = armfVar4;
        this.d = armfVar5;
        this.e = armfVar6;
        this.f = armfVar8;
        this.g = armfVar9;
        this.h = armfVar10;
        this.i = armfVar11;
        this.n = armfVar12;
        this.j = aksrVar;
        Optional optional = (Optional) ((apxx) armfVar12).a;
        if (!((Boolean) yig.am.e()).booleanValue() && !((Boolean) yig.ao.e()).booleanValue()) {
            arrayList = arnv.a;
        } else {
            arrayList = new ArrayList();
            if (((Boolean) yig.am.e()).booleanValue()) {
                arrayList.add(Integer.valueOf((int) ((Number) yig.an.e()).longValue()));
            }
            if (((Boolean) yig.ao.e()).booleanValue()) {
                arrayList.add(Integer.valueOf((int) ((Number) yig.ap.e()).longValue()));
            }
        }
        asai a = asar.a(new asaa(new gbz(optional, arrayList, (arpe) null, 4)));
        int i = ascp.a;
        ascv T = arrn.T(a, arweVar, asco.b, null);
        this.o = T;
        ascv T2 = arrn.T(asar.a(new asac(new eig(this, (arpe) null, 15))), arweVar, asco.b, null);
        this.p = T2;
        this.l = arrn.T(asar.a(new akee(new jdn(T, T2, new igb(this, (arpe) null, 2), 17, null), new gau(this, (arpe) null, 12), 10)), arweVar, asco.b, false);
    }

    public final void a() {
        if (yig.b() && !((Optional) ((apxx) this.c).a).isEmpty() && !((Optional) ((apxx) this.m).a).isEmpty() && !((Optional) ((apxx) this.d).a).isEmpty()) {
            ((Optional) ((apxx) this.f).a).ifPresent(new ixj(jbs.a, 4));
            ((jcd) ((Optional) ((apxx) this.d).a).get()).a();
            ((jbu) ((Optional) ((apxx) this.c).a).get()).a();
        }
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        ((Optional) ((apxx) this.f).a).ifPresent(new ixj(jbs.b, 5));
    }
}
