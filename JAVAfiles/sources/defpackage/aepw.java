package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class aepw {
    public static final aepw a;
    public static final aepw b;
    private static final /* synthetic */ aepw[] c;

    static {
        aepw aepwVar = new aepw("PICKING_DATE", 0);
        a = aepwVar;
        aepw aepwVar2 = new aepw("PICKING_TIME", 1);
        b = aepwVar2;
        aepw[] aepwVarArr = {aepwVar, aepwVar2};
        c = aepwVarArr;
        arhi.f(aepwVarArr);
    }

    private aepw(String str, int i) {
    }

    public static aepw[] values() {
        return (aepw[]) c.clone();
    }
}
