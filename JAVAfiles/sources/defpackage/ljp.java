package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljp {
    public final armf a;
    public final armf b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public ljp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.g = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.i = armfVar6;
        armfVar7.getClass();
        this.j = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.k = armfVar9;
        armfVar10.getClass();
        this.a = armfVar10;
        armfVar11.getClass();
        this.d = armfVar11;
    }

    public final aehz a() {
        Object obj = this.c;
        aerb aerbVar = aerb.n;
        String string = ((Context) obj).getString(R.string.multi_share_top_app_bar_back);
        string.getClass();
        return new aehz(string, aerbVar, false, false, false, false, null, null, new lhb(this, 11), 1020);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [asai, java.lang.Object] */
    public ljp(Context context, arwe arweVar, lkd lkdVar, lih lihVar, armf armfVar, lxe lxeVar, ljh ljhVar, armf armfVar2) {
        context.getClass();
        arweVar.getClass();
        lkdVar.getClass();
        lihVar.getClass();
        armfVar.getClass();
        lxeVar.getClass();
        ljhVar.getClass();
        armfVar2.getClass();
        this.c = context;
        this.d = arweVar;
        this.k = lkdVar;
        this.e = lihVar;
        this.a = armfVar;
        this.b = armfVar2;
        ascd a = ascy.a(false);
        this.f = a;
        String string = context.getString(R.string.search_action);
        string.getClass();
        aehz aehzVar = new aehz(string, aerb.cG, false, false, true, false, null, null, new lhb(this, 12), 996);
        this.g = aehzVar;
        List y = aqjn.y(aehzVar);
        aehz a2 = a();
        String string2 = context.getString(R.string.multi_share_top_app_bar_title);
        string2.getClass();
        boolean z = false;
        arqr arqrVar = null;
        afaw afawVar = new afaw(new afas(string2, null, null, false, null, null, null, 254), a2, y, z, arqrVar, null, 112);
        this.h = afawVar;
        ljq ljqVar = new ljq(afawVar, new lix(0 == true ? 1 : 0), arnv.a);
        this.i = ljqVar;
        asai Q = arrn.Q(lihVar.b(), lxeVar.b, ljhVar.m, a, new kkf(this, (arpe) null, 2));
        int i = ascp.a;
        this.j = arrn.T(Q, arweVar, asco.a(0L, 3), ljqVar);
    }
}
