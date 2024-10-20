package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapf implements aapw {
    private aapu b;
    private final ContentGridView e;
    private final List c = new ArrayList();
    private boolean d = false;
    public final List a = new ArrayList();

    private aapf(ContentGridView contentGridView) {
        this.e = contentGridView;
    }

    public static aapf g(ContentGridView contentGridView) {
        aapf aapfVar = new aapf(contentGridView);
        contentGridView.ac = new aape(aapfVar);
        contentGridView.ag(contentGridView.ac);
        contentGridView.v(new aapg());
        aape aapeVar = contentGridView.ac;
        int i = contentGridView.ab;
        aapeVar.m();
        return aapfVar;
    }

    private static void j(Iterable iterable, aapu aapuVar) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((aaqd) it.next()).q(aapuVar);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final aaqd b(int i) {
        return (aaqd) this.a.get(i);
    }

    public final void c(List list) {
        if (!list.isEmpty()) {
            aapu aapuVar = this.b;
            if (aapuVar != null) {
                j(list, aapuVar);
            }
            List list2 = this.a;
            int size = list2.size();
            list2.addAll(list);
            int size2 = list.size();
            no noVar = this.e.l;
            if (noVar != null) {
                noVar.u(size, size2);
            }
        }
    }

    @Override // defpackage.aapw
    public final void d(AttachmentQueueState attachmentQueueState) {
        e();
    }

    public final void e() {
        if (!this.d && !this.c.isEmpty()) {
            try {
                this.d = true;
                for (aaas aaasVar : this.c) {
                    for (aaqd aaqdVar : this.a) {
                        if (aaqdVar.d().contains(Integer.valueOf(aaasVar.a))) {
                            aaqdVar.l(aaasVar);
                        }
                    }
                }
                this.c.clear();
            } finally {
                this.d = false;
            }
        }
    }

    public final void f(aapu aapuVar) {
        this.b = aapuVar;
        j(this.a, aapuVar);
    }

    public final void i(aaas aaasVar) {
        this.c.add(aaasVar);
    }

    @Override // defpackage.aapw
    public final /* synthetic */ void h() {
    }
}
