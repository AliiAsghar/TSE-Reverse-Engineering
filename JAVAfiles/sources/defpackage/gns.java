package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gns {
    public enk a;
    public ViewPager2 b;
    final /* synthetic */ gnt c;
    public nq d;
    public gvf e;
    private long f = -1;

    public gns(gnt gntVar) {
        this.c = gntVar;
    }

    public static final ViewPager2 b(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        Objects.toString(parent);
        throw new IllegalStateException("Expected ViewPager2 instance. Got: ".concat(String.valueOf(parent)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        cg cgVar;
        boolean z2;
        if (!this.c.J() && this.b.b() == 0 && !this.c.e.k()) {
            this.c.b();
            int i = this.b.b;
            if (i < this.c.b()) {
                long j = i;
                if ((j != this.f || z) && (cgVar = (cg) this.c.e.d(j)) != null && cgVar.aw()) {
                    this.f = j;
                    bd bdVar = new bd(this.c.d);
                    ArrayList arrayList = new ArrayList();
                    cg cgVar2 = null;
                    for (int i2 = 0; i2 < this.c.e.b(); i2++) {
                        gnt gntVar = this.c;
                        long c = gntVar.e.c(i2);
                        cg cgVar3 = (cg) gntVar.e.e(i2);
                        if (cgVar3.aw()) {
                            if (c != this.f) {
                                bdVar.o(cgVar3, eng.STARTED);
                                arrayList.add(this.c.g.u());
                            } else {
                                cgVar2 = cgVar3;
                            }
                            if (c == this.f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            cgVar3.ao(z2);
                        }
                    }
                    if (cgVar2 != null) {
                        bdVar.o(cgVar2, eng.RESUMED);
                        arrayList.add(this.c.g.u());
                    }
                    if (!bdVar.h()) {
                        bdVar.b();
                        Collections.reverse(arrayList);
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            hgi.v((List) arrayList.get(i3));
                        }
                    }
                }
            }
        }
    }
}
