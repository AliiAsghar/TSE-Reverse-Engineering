package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class wv {
    public static final wv a;
    public static final wv b;
    public static final wv c;
    private static final /* synthetic */ wv[] d;

    static {
        wv wvVar = new wv("PreEnter", 0);
        a = wvVar;
        wv wvVar2 = new wv("Visible", 1);
        b = wvVar2;
        wv wvVar3 = new wv("PostExit", 2);
        c = wvVar3;
        wv[] wvVarArr = {wvVar, wvVar2, wvVar3};
        d = wvVarArr;
        arhi.f(wvVarArr);
    }

    private wv(String str, int i) {
    }

    public static wv[] values() {
        return (wv[]) d.clone();
    }
}
