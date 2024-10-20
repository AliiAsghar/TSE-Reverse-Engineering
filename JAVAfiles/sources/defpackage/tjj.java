package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjj {
    public static final tjj a;
    public static final tjj b;
    public static final tjj c;
    private static final /* synthetic */ tjj[] d;

    static {
        tjj tjjVar = new tjj("TIMESTAMP_SECONDS_DUPLICATE_KEY", 0);
        a = tjjVar;
        tjj tjjVar2 = new tjj("TEXT_AND_TIMESTAMP_SECONDS_DUPLICATE_KEY", 1);
        b = tjjVar2;
        tjj tjjVar3 = new tjj("SENDER_AND_TIMESTAMP_SECONDS_DUPLICATE_KEY", 2);
        c = tjjVar3;
        tjj[] tjjVarArr = {tjjVar, tjjVar2, tjjVar3};
        d = tjjVarArr;
        arhi.f(tjjVarArr);
    }

    private tjj(String str, int i) {
    }

    public static tjj[] values() {
        return (tjj[]) d.clone();
    }
}
