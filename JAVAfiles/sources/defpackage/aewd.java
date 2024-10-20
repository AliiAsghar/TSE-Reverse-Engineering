package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewd {
    public static final aewd a;
    public static final aewd b;
    public static final aewd c;
    private static final /* synthetic */ aewd[] d;

    static {
        aewd aewdVar = new aewd("CIRCLE", 0);
        a = aewdVar;
        aewd aewdVar2 = new aewd("RECTANGLE", 1);
        b = aewdVar2;
        aewd aewdVar3 = new aewd("ROUNDED_RECTANGLE", 2);
        c = aewdVar3;
        aewd[] aewdVarArr = {aewdVar, aewdVar2, aewdVar3};
        d = aewdVarArr;
        arhi.f(aewdVarArr);
    }

    private aewd(String str, int i) {
    }

    public static aewd[] values() {
        return (aewd[]) d.clone();
    }
}
