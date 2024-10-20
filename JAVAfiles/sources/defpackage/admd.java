package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class admd {
    public static final admd a;
    public static final admd b;
    public static final admd c;
    private static final /* synthetic */ admd[] d;

    static {
        admd admdVar = new admd("NOT_INITIALIZED", 0);
        a = admdVar;
        admd admdVar2 = new admd("INITIALIZING", 1);
        b = admdVar2;
        admd admdVar3 = new admd("INITIALIZED", 2);
        c = admdVar3;
        admd[] admdVarArr = {admdVar, admdVar2, admdVar3};
        d = admdVarArr;
        arhi.f(admdVarArr);
    }

    private admd(String str, int i) {
    }

    public static admd[] values() {
        return (admd[]) d.clone();
    }
}
