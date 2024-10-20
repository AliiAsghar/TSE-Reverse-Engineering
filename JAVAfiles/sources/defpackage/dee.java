package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dee implements Comparator<armo<? extends cjp, ? extends List<dhe>>> {
    public static final dee a = new dee();

    private dee() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(armo<? extends cjp, ? extends List<dhe>> armoVar, armo<? extends cjp, ? extends List<dhe>> armoVar2) {
        armo<? extends cjp, ? extends List<dhe>> armoVar3 = armoVar;
        armo<? extends cjp, ? extends List<dhe>> armoVar4 = armoVar2;
        int compare = Float.compare(((cjp) armoVar3.a).c, ((cjp) armoVar4.a).c);
        if (compare != 0) {
            return compare;
        }
        return Float.compare(((cjp) armoVar3.a).e, ((cjp) armoVar4.a).e);
    }
}
