package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wvf implements wvi {
    private final armf a;
    private final /* synthetic */ int b;

    public wvf(armf armfVar, int i) {
        this.b = i;
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.wvi
    public final void a(Set set) {
        if (this.b != 0) {
            set.getClass();
            quu quuVar = (quu) this.a.b();
            int i = quu.f;
            if (quuVar.c.a()) {
                qvb qvbVar = (qvb) quuVar.a.b();
                ArrayList arrayList = new ArrayList(aqjn.J(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    wxb wxbVar = (wxb) it.next();
                    msk mskVar = quuVar.b;
                    wxbVar.getClass();
                    int i2 = wxbVar.d;
                    String str = wxbVar.n;
                    str.getClass();
                    msh t = mskVar.t(wxbVar.g, i2);
                    String str2 = wxbVar.u;
                    str2.getClass();
                    String str3 = wxbVar.c;
                    str3.getClass();
                    arrayList.add(new qxc(i2, str, t, str2, str3));
                }
                qvbVar.a(arrayList);
                qjh.l(quuVar.d, null, new qrr(quuVar, (arpe) null, 5, (char[]) null), 3);
                return;
            }
            return;
        }
        set.getClass();
        akrh e = aktp.e("SelfParticipantsRefreshActionScheduler#handleSimLoaded");
        try {
            ((rft) this.a.b()).b().J();
            armd.i(e, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    public wvf(Context context, armf armfVar, int i) {
        this.b = i;
        context.getClass();
        armfVar.getClass();
        this.a = armfVar;
    }
}
