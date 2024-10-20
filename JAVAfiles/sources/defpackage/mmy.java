package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmy {
    public static final mmy a;
    public static final mmy b;
    public static final mmy c;
    private static final /* synthetic */ mmy[] d;

    static {
        mmy mmyVar = new mmy("UNKNOWN", 0);
        a = mmyVar;
        mmy mmyVar2 = new mmy("APPROVED", 1);
        b = mmyVar2;
        mmy mmyVar3 = new mmy("NOT_APPROVED", 2);
        c = mmyVar3;
        mmy[] mmyVarArr = {mmyVar, mmyVar2, mmyVar3};
        d = mmyVarArr;
        arhi.f(mmyVarArr);
    }

    private mmy(String str, int i) {
    }

    public static mmy[] values() {
        return (mmy[]) d.clone();
    }
}
