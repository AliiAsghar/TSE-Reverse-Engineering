package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usr implements uns {
    final /* synthetic */ uss a;

    public usr(uss ussVar) {
        this.a = ussVar;
    }

    @Override // defpackage.uns
    public final unu a() {
        return unu.a("WorkQueueTikTokWorker", alzz.aZ(this.a.c));
    }

    @Override // defpackage.uns
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // defpackage.uns
    public final boolean c() {
        boolean z;
        artb artbVar = new artb(0, this.a.c.size());
        ArrayList arrayList = new ArrayList(aqjn.J(artbVar, 10));
        arob it = artbVar.iterator();
        while (it.a) {
            upr uprVar = (upr) aqjn.aa(this.a.c, it.a());
            if (uprVar != null) {
                if (uprVar.h() <= this.a.a.a().e) {
                    z = true;
                    arrayList.add(Boolean.valueOf(z));
                }
            }
            z = false;
            arrayList.add(Boolean.valueOf(z));
        }
        return aqjn.aG(arrayList);
    }
}
