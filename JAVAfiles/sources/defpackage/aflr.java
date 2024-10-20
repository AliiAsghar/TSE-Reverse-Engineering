package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflr {
    public static final arml a;
    public static final aflr b;
    public static final aflr c;
    public static final aflr d;
    public static final aflr e;
    public static final aflr f;
    public static final aflr g;
    private static final /* synthetic */ aflr[] i;
    public final afnc h;

    static {
        aflr aflrVar = new aflr("NEUTRAL", 0, null);
        b = aflrVar;
        aflr aflrVar2 = new aflr("LIGHT", 1, new afnc(127995));
        c = aflrVar2;
        aflr aflrVar3 = new aflr("MEDIUM_LIGHT", 2, new afnc(127996));
        d = aflrVar3;
        aflr aflrVar4 = new aflr("MEDIUM", 3, new afnc(127997));
        e = aflrVar4;
        aflr aflrVar5 = new aflr("MEDIUM_DARK", 4, new afnc(127998));
        f = aflrVar5;
        aflr aflrVar6 = new aflr("DARK", 5, new afnc(127999));
        g = aflrVar6;
        aflr[] aflrVarArr = {aflrVar, aflrVar2, aflrVar3, aflrVar4, aflrVar5, aflrVar6};
        i = aflrVarArr;
        arhi.f(aflrVarArr);
        a = armd.a(aezo.n);
    }

    private aflr(String str, int i2, afnc afncVar) {
        this.h = afncVar;
    }

    public static aflr[] values() {
        return (aflr[]) i.clone();
    }
}
