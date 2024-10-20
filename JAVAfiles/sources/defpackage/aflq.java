package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflq {
    public static final arml a;
    public static final aflq b;
    public static final aflq c;
    public static final aflq d;
    private static final /* synthetic */ aflq[] g;
    public final afnc e;
    public final afnc f;

    static {
        aflq aflqVar = new aflq("NEUTRAL", 0, null, new afnc(129489));
        b = aflqVar;
        aflq aflqVar2 = new aflq("FEMALE", 1, new afnc(9792), new afnc(128105));
        c = aflqVar2;
        aflq aflqVar3 = new aflq("MALE", 2, new afnc(9794), new afnc(128104));
        d = aflqVar3;
        aflq[] aflqVarArr = {aflqVar, aflqVar2, aflqVar3};
        g = aflqVarArr;
        arhi.f(aflqVarArr);
        a = armd.a(aezo.m);
    }

    private aflq(String str, int i, afnc afncVar, afnc afncVar2) {
        this.e = afncVar;
        this.f = afncVar2;
    }

    public static aflq[] values() {
        return (aflq[]) g.clone();
    }
}
