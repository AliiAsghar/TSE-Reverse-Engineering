package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class koe implements knm {
    public final Context a;
    public final yjy b;
    public final yjr c;
    public final jxv d;
    private final xyt e;

    public koe(jxv jxvVar, Context context, yjy yjyVar, xyt xytVar, yjr yjrVar) {
        this.d = jxvVar;
        this.a = context;
        this.b = yjyVar;
        this.e = xytVar;
        this.c = yjrVar;
    }

    @Override // defpackage.knm
    public final boolean a() {
        throw null;
    }

    public final void b(List list, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a = ((ykb) it.next()).a();
            if (((yaq) this.e.a()).a(i, a) == yay.AVAILABLE) {
                sb.append(a);
                sb.append(" ");
            } else {
                sb2.append(a);
                sb2.append(" ");
            }
        }
        jxv jxvVar = this.d;
        if (1 != i) {
            str = "[SMS]";
        } else {
            str = "[MMS]";
        }
        knl h = jxvVar.h();
        h.H(str);
        h.z("availableSubIds", sb);
        h.z("unavailableSubIds", sb2);
        h.q();
    }
}
