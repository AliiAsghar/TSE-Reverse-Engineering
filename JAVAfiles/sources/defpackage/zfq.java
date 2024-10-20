package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfq {
    public static final zfq a;
    public static final zfq b;
    private static final /* synthetic */ zfq[] c;

    static {
        zfq zfqVar = new zfq("BUGLE_THEME_CONVERSATION", 0);
        a = zfqVar;
        zfq zfqVar2 = new zfq("BUGLE_THEME_TOOLBAR", 1);
        b = zfqVar2;
        zfq[] zfqVarArr = {zfqVar, zfqVar2};
        c = zfqVarArr;
        arhi.f(zfqVarArr);
    }

    private zfq(String str, int i) {
    }

    public static zfq[] values() {
        return (zfq[]) c.clone();
    }
}
