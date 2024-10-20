package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akic {
    public static final akic a;
    public static final akic b;
    public static final akic c;
    public static final akic d;
    private static final /* synthetic */ akic[] e;

    static {
        akic akicVar = new akic("DEVICE", 0);
        a = akicVar;
        akic akicVar2 = new akic("USER", 1);
        b = akicVar2;
        akic akicVar3 = new akic("UI_DEVICE", 2);
        c = akicVar3;
        akic akicVar4 = new akic("UI_USER", 3);
        d = akicVar4;
        akic[] akicVarArr = {akicVar, akicVar2, akicVar3, akicVar4};
        e = akicVarArr;
        arhi.f(akicVarArr);
    }

    private akic(String str, int i) {
    }

    public static akic[] values() {
        return (akic[]) e.clone();
    }
}
