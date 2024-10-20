package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrx {
    public static final lrx a;
    public static final lrx b;
    public static final lrx c;
    public static final lrx d;
    public static final lrx e;
    private static final /* synthetic */ lrx[] f;

    static {
        lrx lrxVar = new lrx("ELIGIBLE_TO_SHOW_SETTING", 0);
        a = lrxVar;
        lrx lrxVar2 = new lrx("ELIGIBLE_TO_ONBOARD_PROFILE_DISCOVERY", 1);
        b = lrxVar2;
        lrx lrxVar3 = new lrx("INELIGIBLE_FOR_PROFILE_DISCOVERY", 2);
        c = lrxVar3;
        lrx lrxVar4 = new lrx("MISSING_PROFILE_ELIGIBILITY_CHECKER", 3);
        d = lrxVar4;
        lrx lrxVar5 = new lrx("PROFILE_FLAG_OFF", 4);
        e = lrxVar5;
        lrx[] lrxVarArr = {lrxVar, lrxVar2, lrxVar3, lrxVar4, lrxVar5};
        f = lrxVarArr;
        arhi.f(lrxVarArr);
    }

    private lrx(String str, int i) {
    }

    public static lrx[] values() {
        return (lrx[]) f.clone();
    }
}
