package defpackage;

import android.app.Activity;
import android.os.MessageQueue;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akjs implements MessageQueue.IdleHandler {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akjs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Set, java.lang.Object] */
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (this.b != 0) {
            Object obj = this.a;
            ((ahjz) obj).a.schedule(new aaze(obj, 19), 7000L, TimeUnit.MILLISECONDS);
            return false;
        }
        Object obj2 = this.a;
        akju akjuVar = (akju) obj2;
        if (!akjuVar.a && akjuVar.c.isEmpty()) {
            akrh e = aktp.e("Recreating all activities");
            try {
                if (((akju) obj2).a()) {
                    ((akju) obj2).a = true;
                    aiut.e(akto.j(new akhg(obj2, 7)));
                    Iterator it = ((akju) obj2).b.iterator();
                    while (it.hasNext()) {
                        dxz.a((Activity) it.next());
                    }
                    aiut.e(new akhg(obj2, 8));
                }
                armd.i(e, null);
            } finally {
            }
        }
        return false;
    }
}
