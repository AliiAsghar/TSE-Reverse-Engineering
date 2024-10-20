package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abj {
    public static final abj a;
    public static final abj b;
    private static final /* synthetic */ abj[] c;

    static {
        abj abjVar = new abj("Restart", 0);
        a = abjVar;
        abj abjVar2 = new abj("Reverse", 1);
        b = abjVar2;
        abj[] abjVarArr = {abjVar, abjVar2};
        c = abjVarArr;
        arhi.f(abjVarArr);
    }

    private abj(String str, int i) {
    }

    public static abj[] values() {
        return (abj[]) c.clone();
    }
}
