package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kch implements mjl {
    final /* synthetic */ kci a;
    private final /* synthetic */ mjl b;

    public kch(miz mizVar, kci kciVar) {
        this.a = kciVar;
        mje c = mizVar.c();
        c.getClass();
        this.b = (mjl) c;
    }

    @Override // defpackage.mjm
    public final mix a() {
        Object obj;
        int i;
        List list = this.a.a;
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mje c = ((miz) it.next()).c();
            c.getClass();
            arrayList.add(((mjl) c).a());
        }
        List B = aqjn.B(mix.SENT, mix.DELIVERED, mix.SEEN);
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            Object next = it2.next();
            if (it2.hasNext()) {
                int indexOf = B.indexOf((mix) next);
                while (true) {
                    Object next2 = it2.next();
                    int indexOf2 = B.indexOf((mix) next2);
                    if (indexOf > indexOf2) {
                        i = indexOf2;
                    } else {
                        i = indexOf;
                    }
                    if (indexOf > indexOf2) {
                        next = next2;
                    }
                    if (!it2.hasNext()) {
                        break;
                    }
                    indexOf = i;
                }
            }
            obj = next;
        }
        return (mix) obj;
    }

    @Override // defpackage.mjm
    public final mjp b() {
        return this.b.b();
    }

    @Override // defpackage.mjl
    public final nfw c() {
        return this.b.c();
    }

    @Override // defpackage.mje
    public final /* synthetic */ int d() {
        return 2;
    }
}
