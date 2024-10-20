package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhq {
    public static final jhq a;
    public static final jhq b;
    public static final jhq c;
    private static final /* synthetic */ jhq[] d;

    static {
        jhq jhqVar = new jhq("CONVERSATION", 0);
        a = jhqVar;
        jhq jhqVar2 = new jhq("MULTI_SHARE", 1);
        b = jhqVar2;
        jhq jhqVar3 = new jhq("EMERGENCY", 2);
        c = jhqVar3;
        jhq[] jhqVarArr = {jhqVar, jhqVar2, jhqVar3};
        d = jhqVarArr;
        arhi.f(jhqVarArr);
    }

    private jhq(String str, int i) {
    }

    public static jhq[] values() {
        return (jhq[]) d.clone();
    }
}
