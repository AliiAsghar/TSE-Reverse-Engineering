package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgx {
    public static final afgx a;
    public static final afgx b;
    public static final afgx c;
    public static final afgx d;
    private static final /* synthetic */ afgx[] f;
    public final boolean e;

    static {
        afgx afgxVar = new afgx("PORTRAIT", 0, true);
        a = afgxVar;
        afgx afgxVar2 = new afgx("LANDSCAPE_RIGHT", 1, false);
        b = afgxVar2;
        afgx afgxVar3 = new afgx("PORTRAIT_UPSIDE_DOWN", 2, true);
        c = afgxVar3;
        afgx afgxVar4 = new afgx("LANDSCAPE_LEFT", 3, false);
        d = afgxVar4;
        afgx[] afgxVarArr = {afgxVar, afgxVar2, afgxVar3, afgxVar4};
        f = afgxVarArr;
        arhi.f(afgxVarArr);
    }

    private afgx(String str, int i, boolean z) {
        this.e = z;
    }

    public static afgx[] values() {
        return (afgx[]) f.clone();
    }

    public final boolean a() {
        if (!this.e) {
            return true;
        }
        return false;
    }
}
