package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdw {
    public static final afdw a;
    public static final afdw b;
    public static final afdw c;
    public static final afdw d;
    public static final afdw e;
    public static final afdw f;
    public static final afdw g;
    public static final /* synthetic */ arpx j;
    private static final /* synthetic */ afdw[] k;
    public final alpt h;
    public final alpt i;

    static {
        altx altxVar = new altx(afds.a);
        afdw afdwVar = new afdw("ID", 0, altxVar, altxVar);
        a = afdwVar;
        altx altxVar2 = new altx(afds.b);
        afdw afdwVar2 = new afdw("MIME_TYPE", 1, altxVar2, altxVar2);
        b = afdwVar2;
        altx altxVar3 = new altx(afds.c);
        afdw afdwVar3 = new afdw("SIZE_BYTES", 2, altxVar3, altxVar3);
        c = afdwVar3;
        altx altxVar4 = new altx(afds.d);
        afdw afdwVar4 = new afdw("DISPLAY_NAME", 3, altxVar4, altxVar4);
        d = afdwVar4;
        altx altxVar5 = new altx(afds.e);
        alpt r = alpt.r(afds.e, afds.f);
        r.getClass();
        afdw afdwVar5 = new afdw("DATE_MODIFIED", 4, altxVar5, r);
        e = afdwVar5;
        alpt s = alpt.s(afds.g, afds.h, afds.j);
        s.getClass();
        afdw afdwVar6 = new afdw("DIMENSIONS", 5, s, s);
        f = afdwVar6;
        altx altxVar6 = new altx(afds.i);
        afdw afdwVar7 = new afdw("DURATION", 6, altxVar6, altxVar6);
        g = afdwVar7;
        afdw[] afdwVarArr = {afdwVar, afdwVar2, afdwVar3, afdwVar4, afdwVar5, afdwVar6, afdwVar7};
        k = afdwVarArr;
        j = arhi.f(afdwVarArr);
    }

    private afdw(String str, int i, alpt alptVar, alpt alptVar2) {
        this.h = alptVar;
        this.i = alptVar2;
        if (alptVar2.containsAll(alptVar)) {
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static afdw[] values() {
        return (afdw[]) k.clone();
    }
}
