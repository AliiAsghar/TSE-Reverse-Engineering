package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alsr implements Comparator {
    public static alsr b(Comparator comparator) {
        if (comparator instanceof alsr) {
            return (alsr) comparator;
        }
        return new almg(comparator);
    }

    public alsr a() {
        return new altj(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
