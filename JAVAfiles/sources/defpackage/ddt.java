package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddt implements Comparator<dhe> {
    public static final ddt a = new ddt();

    private ddt() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dhe dheVar, dhe dheVar2) {
        cjp c = dheVar.c();
        cjp c2 = dheVar2.c();
        int compare = Float.compare(c2.d, c.d);
        if (compare != 0 || (compare = Float.compare(c.c, c2.c)) != 0 || (compare = Float.compare(c.e, c2.e)) != 0) {
            return compare;
        }
        return Float.compare(c2.b, c.b);
    }
}
