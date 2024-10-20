package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgm {
    public static final bgm a;
    public static final bgm b;
    private static final /* synthetic */ bgm[] c;

    static {
        bgm bgmVar = new bgm("Closed", 0);
        a = bgmVar;
        bgm bgmVar2 = new bgm("Open", 1);
        b = bgmVar2;
        bgm[] bgmVarArr = {bgmVar, bgmVar2};
        c = bgmVarArr;
        arhi.f(bgmVarArr);
    }

    private bgm(String str, int i) {
    }

    public static bgm[] values() {
        return (bgm[]) c.clone();
    }
}
