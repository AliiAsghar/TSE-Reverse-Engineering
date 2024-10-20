package defpackage;

import android.content.res.Resources;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jza {
    public static final jza a;
    public static final jza b;
    public static final /* synthetic */ arpx d;
    private static final /* synthetic */ jza[] e;
    public final int c;

    static {
        jza jzaVar = new jza("HALF_SCREEN", 0, Resources.getSystem().getDisplayMetrics().heightPixels / 2);
        a = jzaVar;
        jza jzaVar2 = new jza("FULL_SCREEN", 1, Resources.getSystem().getDisplayMetrics().heightPixels);
        b = jzaVar2;
        jza[] jzaVarArr = {jzaVar, jzaVar2};
        e = jzaVarArr;
        d = arhi.f(jzaVarArr);
    }

    private jza(String str, int i, int i2) {
        this.c = i2;
    }

    public static jza[] values() {
        return (jza[]) e.clone();
    }
}
