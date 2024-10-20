package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uvt {
    public static final uvt a;
    public static final uvt b;
    public static final uvt c;
    private static final /* synthetic */ uvt[] d;

    static {
        uvt uvtVar = new uvt("YES", 0);
        a = uvtVar;
        uvt uvtVar2 = new uvt("NO", 1);
        b = uvtVar2;
        uvt uvtVar3 = new uvt("UNKNOWN", 2);
        c = uvtVar3;
        uvt[] uvtVarArr = {uvtVar, uvtVar2, uvtVar3};
        d = uvtVarArr;
        arhi.f(uvtVarArr);
    }

    private uvt(String str, int i) {
    }

    public static uvt[] values() {
        return (uvt[]) d.clone();
    }
}
