package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qam {
    public static final qam a;
    public static final qam b;
    private static final /* synthetic */ qam[] c;

    static {
        qam qamVar = new qam("FULL_FILE", 0);
        a = qamVar;
        qam qamVar2 = new qam("THUMBNAIL", 1);
        b = qamVar2;
        qam[] qamVarArr = {qamVar, qamVar2};
        c = qamVarArr;
        arhi.f(qamVarArr);
    }

    private qam(String str, int i) {
    }

    public static qam[] values() {
        return (qam[]) c.clone();
    }
}
