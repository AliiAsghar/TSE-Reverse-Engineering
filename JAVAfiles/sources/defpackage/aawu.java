package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawu extends dh {
    public alog h;
    private final SparseArray i;
    private final Optional j;

    public aawu(da daVar, Optional optional) {
        super(daVar);
        this.i = new SparseArray();
        this.j = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dh
    public final cg b(int i) {
        cg g;
        if (this.i.get(i) != null) {
            return (cg) this.i.get(i);
        }
        String g2 = ((MediaViewerItem) this.h.get(i)).g();
        if (gh.z(g2)) {
            aaxt aaxtVar = (aaxt) this.j.get();
            ((MediaViewerItem) this.h.get(i)).b();
            this.h.size();
            g = aaxtVar.a();
        } else {
            g = aawt.g(((MediaViewerItem) this.h.get(i)).b(), g2, 1);
        }
        this.i.put(i, g);
        return g;
    }

    @Override // defpackage.gnd
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        cf cfVar;
        this.i.remove(i);
        cg cgVar = (cg) obj;
        if (this.b == null) {
            this.b = new bd(this.a);
        }
        while (this.c.size() <= i) {
            this.c.add(null);
        }
        ArrayList arrayList = this.c;
        if (cgVar.aw()) {
            cfVar = this.a.b(cgVar);
        } else {
            cfVar = null;
        }
        arrayList.set(i, cfVar);
        this.d.set(i, null);
        this.b.n(cgVar);
        if (cgVar.equals(this.e)) {
            this.e = null;
        }
    }

    @Override // defpackage.gnd
    public final int j() {
        alog alogVar = this.h;
        if (alogVar != null) {
            return alogVar.size();
        }
        return 0;
    }
}
