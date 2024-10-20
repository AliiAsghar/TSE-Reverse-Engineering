package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuh {
    public static final aeuh a;
    public static final aeuh b;
    public static final aeuh c;
    public static final aeuh d;
    private static final /* synthetic */ aeuh[] e;

    static {
        aeuh aeuhVar = new aeuh("SINGLE", 0);
        a = aeuhVar;
        aeuh aeuhVar2 = new aeuh("TOP", 1);
        b = aeuhVar2;
        aeuh aeuhVar3 = new aeuh("MIDDLE", 2);
        c = aeuhVar3;
        aeuh aeuhVar4 = new aeuh("BOTTOM", 3);
        d = aeuhVar4;
        aeuh[] aeuhVarArr = {aeuhVar, aeuhVar2, aeuhVar3, aeuhVar4};
        e = aeuhVarArr;
        arhi.f(aeuhVarArr);
    }

    private aeuh(String str, int i) {
    }

    public static aeuh[] values() {
        return (aeuh[]) e.clone();
    }
}
