package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class urt {
    public static final urt a;
    public static final urt b;
    private static final /* synthetic */ urt[] c;

    static {
        urt urtVar = new urt("WORK_MANAGER", 0);
        a = urtVar;
        urt urtVar2 = new urt("EAGER_EVALUATION", 1);
        b = urtVar2;
        urt[] urtVarArr = {urtVar, urtVar2};
        c = urtVarArr;
        arhi.f(urtVarArr);
    }

    private urt(String str, int i) {
    }

    public static urt[] values() {
        return (urt[]) c.clone();
    }
}
