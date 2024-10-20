package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ascm {
    public static final ascm a;
    public static final ascm b;
    public static final ascm c;
    private static final /* synthetic */ ascm[] d;

    static {
        ascm ascmVar = new ascm("START", 0);
        a = ascmVar;
        ascm ascmVar2 = new ascm("STOP", 1);
        b = ascmVar2;
        ascm ascmVar3 = new ascm("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = ascmVar3;
        ascm[] ascmVarArr = {ascmVar, ascmVar2, ascmVar3};
        d = ascmVarArr;
        arhi.f(ascmVarArr);
    }

    private ascm(String str, int i) {
    }

    public static ascm[] values() {
        return (ascm[]) d.clone();
    }
}
