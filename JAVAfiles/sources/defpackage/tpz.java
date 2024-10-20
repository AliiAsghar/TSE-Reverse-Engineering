package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tpz {
    public static final tpz a;
    public static final tpz b;
    private static final /* synthetic */ tpz[] c;

    static {
        tpz tpzVar = new tpz("BUGLE_DB", 0);
        a = tpzVar;
        tpz tpzVar2 = new tpz("BACKUP_DB", 1);
        b = tpzVar2;
        tpz[] tpzVarArr = {tpzVar, tpzVar2};
        c = tpzVarArr;
        arhi.f(tpzVarArr);
    }

    private tpz(String str, int i) {
    }

    public static tpz[] values() {
        return (tpz[]) c.clone();
    }
}
