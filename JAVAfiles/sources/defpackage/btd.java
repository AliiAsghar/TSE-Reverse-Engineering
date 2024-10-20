package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class btd {
    public static final btd a;
    public static final btd b;
    public static final btd c;
    private static final /* synthetic */ btd[] d;

    static {
        btd btdVar = new btd("Focused", 0);
        a = btdVar;
        btd btdVar2 = new btd("UnfocusedEmpty", 1);
        b = btdVar2;
        btd btdVar3 = new btd("UnfocusedNotEmpty", 2);
        c = btdVar3;
        btd[] btdVarArr = {btdVar, btdVar2, btdVar3};
        d = btdVarArr;
        arhi.f(btdVarArr);
    }

    private btd(String str, int i) {
    }

    public static btd[] values() {
        return (btd[]) d.clone();
    }
}
