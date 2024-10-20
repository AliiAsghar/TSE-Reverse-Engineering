package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class een implements artx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public een(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, arqv] */
    @Override // defpackage.artx
    public final Iterator a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return this.a;
                        }
                        return arrn.b(this.a);
                    }
                    return this.a.iterator();
                }
                return arrj.a((Object[]) this.a);
            }
            return new eem((ViewGroup) this.a);
        }
        return new edo(new een(this.a, 1).a(), rp.d);
    }
}
