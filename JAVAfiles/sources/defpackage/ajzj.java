package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajzj implements ancr {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajzj(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ancr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        if (this.c != 0) {
            Object obj = this.b;
            kkg kkgVar = (kkg) obj;
            if (this.a <= ((AtomicLong) kkgVar.a).get()) {
                return aktp.ae();
            }
            Object obj2 = kkgVar.c;
            return akul.g(kkgVar.e.a()).h(new tti(obj, ((AtomicLong) obj2).get(), 1), andi.a);
        }
        Object obj3 = this.b;
        ajzk ajzkVar = (ajzk) obj3;
        boolean isEmpty = alpt.o(((ansy) ajzkVar.c.b()).y().values()).isEmpty();
        long j = this.a;
        if (isEmpty) {
            return ajzkVar.b(j);
        }
        ansy ansyVar = (ansy) ajzkVar.c.b();
        alor y = ansyVar.y();
        ArrayList arrayList = new ArrayList();
        aluq listIterator = y.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            arrayList.add(ansyVar.E((String) entry.getKey(), (akec) entry.getValue()));
        }
        return ancj.g(ancj.g(anee.o(ansyVar.z(arrayList)), akto.d(new ahce(obj3, 20)), ajzkVar.g), akto.d(new mfj(obj3, j, 11)), ajzkVar.g);
    }
}
