package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class buz {
    public static final buz a;
    public static final buz b;
    public static final buz c;
    public static final buz d;
    public static final buz e;
    public static final buz f;
    private static final /* synthetic */ buz[] g;

    static {
        buz buzVar = new buz("DefaultSpatial", 0);
        a = buzVar;
        buz buzVar2 = new buz("FastSpatial", 1);
        b = buzVar2;
        buz buzVar3 = new buz("SlowSpatial", 2);
        c = buzVar3;
        buz buzVar4 = new buz("DefaultEffects", 3);
        d = buzVar4;
        buz buzVar5 = new buz("FastEffects", 4);
        e = buzVar5;
        buz buzVar6 = new buz("SlowEffects", 5);
        f = buzVar6;
        buz[] buzVarArr = {buzVar, buzVar2, buzVar3, buzVar4, buzVar5, buzVar6};
        g = buzVarArr;
        arhi.f(buzVarArr);
    }

    private buz(String str, int i) {
    }

    public static buz[] values() {
        return (buz[]) g.clone();
    }
}
