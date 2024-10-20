package defpackage;

import android.os.Build;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aecb implements aecd {
    private final aece a;
    private final aeby b;
    private final Optional c;
    private final Optional d;
    private final List e;

    public aecb(aece aeceVar, aeby aebyVar, Optional optional, Optional optional2) {
        this.a = aeceVar;
        this.b = aebyVar;
        this.c = optional;
        this.d = optional2;
        aecd[] aecdVarArr = new aecd[2];
        aecdVarArr[0] = (Build.VERSION.SDK_INT < 30 || !((Boolean) arsd.j(optional, false)).booleanValue()) ? null : aeceVar;
        aecdVarArr[1] = true != ((Boolean) arsd.j(optional2, true)).booleanValue() ? null : aebyVar;
        this.e = aqil.o(aecdVarArr);
    }

    @Override // defpackage.aecd
    public final void a(aecj aecjVar, aozb aozbVar, iak iakVar) {
        aecjVar.getClass();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aecd) it.next()).a(aecjVar, aozbVar, iakVar);
        }
    }

    @Override // defpackage.aecd
    public final void b(aecj aecjVar, aozb aozbVar, ial ialVar) {
        aecjVar.getClass();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aecd) it.next()).b(aecjVar, aozbVar, ialVar);
        }
    }

    @Override // defpackage.aecd
    public final void c(aecj aecjVar, long j, aozb aozbVar, int i) {
        if (i != 0) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((aecd) it.next()).c(aecjVar, j, aozbVar, i);
            }
            return;
        }
        throw null;
    }

    @Override // defpackage.aecd
    public final void d(aecj aecjVar, aedm aedmVar) {
        aedmVar.getClass();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aecd) it.next()).d(aecjVar, aedmVar);
        }
    }
}
