package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpn {
    public static final wpn a;

    @armg
    public static final wpn b;
    public static final wpn c;
    public static final wpn d;
    public static final wpn e;
    public static final wpn f;
    private static final /* synthetic */ wpn[] g;

    static {
        wpn wpnVar = new wpn("UNKNOWN", 0);
        a = wpnVar;
        wpn wpnVar2 = new wpn("ON_SATELLITE", 1);
        b = wpnVar2;
        wpn wpnVar3 = new wpn("ON_SATELLITE_AUTO_CONNECT", 2);
        c = wpnVar3;
        wpn wpnVar4 = new wpn("ON_SATELLITE_MANUAL_CONNECT", 3);
        d = wpnVar4;
        wpn wpnVar5 = new wpn("SATELLITE_MANUAL_ELIGIBLE", 4);
        e = wpnVar5;
        wpn wpnVar6 = new wpn("OFF_SATELLITE", 5);
        f = wpnVar6;
        wpn[] wpnVarArr = {wpnVar, wpnVar2, wpnVar3, wpnVar4, wpnVar5, wpnVar6};
        g = wpnVarArr;
        arhi.f(wpnVarArr);
    }

    private wpn(String str, int i) {
    }

    public static wpn[] values() {
        return (wpn[]) g.clone();
    }

    @armg
    public final boolean a() {
        if (this == b) {
            return true;
        }
        return false;
    }
}
