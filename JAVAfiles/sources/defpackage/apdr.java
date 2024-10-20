package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apdr implements Comparator, Serializable {
    public static final apdr a;
    private static final /* synthetic */ apdr[] b;

    static {
        apdr apdrVar = new apdr();
        a = apdrVar;
        b = new apdr[]{apdrVar};
    }

    private apdr() {
    }

    public static final int a(apct apctVar, apct apctVar2) {
        apds.f(apctVar);
        apds.f(apctVar2);
        int compare = Long.compare(apctVar.b, apctVar2.b);
        if (compare != 0) {
            return compare;
        }
        return Integer.compare(apctVar.c, apctVar2.c);
    }

    public static apdr[] values() {
        return (apdr[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((apct) obj, (apct) obj2);
    }
}
