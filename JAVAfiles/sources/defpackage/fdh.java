package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdh extends Handler {
    final /* synthetic */ fdj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdh(fdj fdjVar, Looper looper) {
        super(looper);
        this.a = fdjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                this.a.g(obj, obj2);
                return;
            }
            return;
        }
        fdj fdjVar = this.a;
        if (obj == fdjVar.i) {
            if (fdjVar.e == 2 || fdjVar.j()) {
                fdjVar.i = null;
                if (obj2 instanceof Exception) {
                    fdjVar.g.c((Exception) obj2, false);
                    return;
                }
                try {
                    fdjVar.b.f((byte[]) obj2);
                    fez fezVar = fdjVar.g;
                    fezVar.b = null;
                    Set set = fezVar.a;
                    alog n = alog.n(set);
                    set.clear();
                    int size = n.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        fdj fdjVar2 = (fdj) n.get(i2);
                        if (fdjVar2.k()) {
                            fdjVar2.e(true);
                        }
                    }
                } catch (Exception e) {
                    fdjVar.g.c(e, true);
                }
            }
        }
    }
}
