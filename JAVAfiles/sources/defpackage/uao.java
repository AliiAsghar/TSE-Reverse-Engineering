package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uao {
    public static final uao a;
    public static final uao b;
    public static final uao c;
    private static final /* synthetic */ uao[] d;

    static {
        uao uaoVar = new uao("NONE", 0);
        a = uaoVar;
        uao uaoVar2 = new uao("ONE_ON_ONE", 1);
        b = uaoVar2;
        uao uaoVar3 = new uao("GROUP", 2);
        c = uaoVar3;
        uao[] uaoVarArr = {uaoVar, uaoVar2, uaoVar3};
        d = uaoVarArr;
        arhi.f(uaoVarArr);
    }

    private uao(String str, int i) {
    }

    public static uao[] values() {
        return (uao[]) d.clone();
    }
}
