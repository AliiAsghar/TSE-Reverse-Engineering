package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddf implements Comparator<dhe> {
    public static final ddf a = new ddf();

    private ddf() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dhe dheVar, dhe dheVar2) {
        cjp c = dheVar.c();
        cjp c2 = dheVar2.c();
        int compare = Float.compare(c.b, c2.b);
        if (compare != 0 || (compare = Float.compare(c.c, c2.c)) != 0 || (compare = Float.compare(c.e, c2.e)) != 0) {
            return compare;
        }
        return Float.compare(c.d, c2.d);
    }
}
