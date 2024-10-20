package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xva {
    public static final xva a;
    public static final xva b;
    private static final /* synthetic */ xva[] d;
    public final String c;

    static {
        xva xvaVar = new xva("THUMBNAIL", 0, "t");
        a = xvaVar;
        xva xvaVar2 = new xva("DISPLAY", 1, "d");
        b = xvaVar2;
        xva[] xvaVarArr = {xvaVar, xvaVar2};
        d = xvaVarArr;
        arhi.f(xvaVarArr);
    }

    private xva(String str, int i, String str2) {
        this.c = str2;
    }

    public static xva[] values() {
        return (xva[]) d.clone();
    }
}
