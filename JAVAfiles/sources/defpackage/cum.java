package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class cum {
    public static final cum a;
    public static final cum b;
    private static final /* synthetic */ cum[] c;

    static {
        cum cumVar = new cum("Width", 0);
        a = cumVar;
        cum cumVar2 = new cum("Height", 1);
        b = cumVar2;
        cum[] cumVarArr = {cumVar, cumVar2};
        c = cumVarArr;
        arhi.f(cumVarArr);
    }

    private cum(String str, int i) {
    }

    public static cum[] values() {
        return (cum[]) c.clone();
    }
}
