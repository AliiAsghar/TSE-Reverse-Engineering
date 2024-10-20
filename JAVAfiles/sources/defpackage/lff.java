package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lff implements ancx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lff(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.ancx
    public final Object a(ahmn ahmnVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            InputStream e = albo.e((alcs) this.a);
                            ahmnVar.x(e, andi.a);
                            return e;
                        }
                        String str = akmq.a;
                        InputStream inputStream = (InputStream) this.a.call();
                        ahmnVar.x(inputStream, andi.a);
                        return inputStream;
                    }
                    for (int i2 = 0; i2 <= 0; i2++) {
                        ahmnVar.x(((Closeable[]) this.a)[i2], andi.a);
                    }
                    return null;
                }
                agmq n = ((agoz) this.a).n();
                ahmnVar.x(n, andi.a);
                return n;
            }
            int i3 = kws.m;
            lbz lbzVar = (lbz) ((agoz) this.a).n();
            ahmnVar.x(lbzVar, andi.a);
            return lbzVar;
        }
        lbz lbzVar2 = (lbz) ((agoz) this.a).n();
        ahmnVar.x(lbzVar2, andi.a);
        return lbzVar2;
    }
}
