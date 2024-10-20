package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tja {
    public static final tja a;
    public static final tja b;
    private static final /* synthetic */ tja[] c;

    static {
        tja tjaVar = new tja("DATABASE", 0);
        a = tjaVar;
        tja tjaVar2 = new tja("ATTACHMENT", 1);
        b = tjaVar2;
        tja[] tjaVarArr = {tjaVar, tjaVar2};
        c = tjaVarArr;
        arhi.f(tjaVarArr);
    }

    private tja(String str, int i) {
    }

    public static tja[] values() {
        return (tja[]) c.clone();
    }
}
