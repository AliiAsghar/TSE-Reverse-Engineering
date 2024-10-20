package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqj {
    public static final lqj a;
    public static final lqj b;
    public static final lqj c;
    public static final lqj d;
    public static final lqj e;
    public static final lqj f;
    public static final lqj g;
    public static final lqj h;
    public static final lqj i;
    private static final /* synthetic */ lqj[] j;

    static {
        lqj lqjVar = new lqj("NOT_GAIA_SIGNED_IN", 0);
        a = lqjVar;
        lqj lqjVar2 = new lqj("NON_G1_MEMBER", 1);
        b = lqjVar2;
        lqj lqjVar3 = new lqj("UNDER_AGE", 2);
        c = lqjVar3;
        lqj lqjVar4 = new lqj("AGE_CHECK_FAILED", 3);
        d = lqjVar4;
        lqj lqjVar5 = new lqj("IS_DASHER", 4);
        e = lqjVar5;
        lqj lqjVar6 = new lqj("DASHER_CHECK_FAILED", 5);
        f = lqjVar6;
        lqj lqjVar7 = new lqj("FEATURES_UNAVAILABLE", 6);
        g = lqjVar7;
        lqj lqjVar8 = new lqj("SENSITIVE_CLASSIFIER_UNAVAILABLE", 7);
        h = lqjVar8;
        lqj lqjVar9 = new lqj("IS_ON_SATELLITE", 8);
        i = lqjVar9;
        lqj[] lqjVarArr = {lqjVar, lqjVar2, lqjVar3, lqjVar4, lqjVar5, lqjVar6, lqjVar7, lqjVar8, lqjVar9};
        j = lqjVarArr;
        arhi.f(lqjVarArr);
    }

    private lqj(String str, int i2) {
    }

    public static lqj[] values() {
        return (lqj[]) j.clone();
    }
}
