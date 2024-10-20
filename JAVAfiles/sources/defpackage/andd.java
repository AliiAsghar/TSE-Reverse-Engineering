package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andd extends ancm {
    private List b;

    public andd(alnu alnuVar, boolean z) {
        super(alnuVar, z, true);
        List aq;
        if (alnuVar.isEmpty()) {
            aq = Collections.emptyList();
        } else {
            aq = alzz.aq(alnuVar.size());
        }
        for (int i = 0; i < alnuVar.size(); i++) {
            aq.add(null);
        }
        this.b = aq;
        o();
    }

    @Override // defpackage.ancm
    public final void e(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new ahmn(obj));
        }
    }

    @Override // defpackage.ancm
    public final void g() {
        Object obj;
        List<ahmn> list = this.b;
        if (list != null) {
            ArrayList aq = alzz.aq(list.size());
            for (ahmn ahmnVar : list) {
                if (ahmnVar != null) {
                    obj = ahmnVar.a;
                } else {
                    obj = null;
                }
                aq.add(obj);
            }
            set(DesugarCollections.unmodifiableList(aq));
        }
    }

    @Override // defpackage.ancm
    public final void q(int i) {
        super.q(i);
        this.b = null;
    }
}
