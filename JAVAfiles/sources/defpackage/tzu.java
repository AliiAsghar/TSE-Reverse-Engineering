package defpackage;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzu {
    public static final arml a;
    public static final tzu b;
    public static final tzu c;
    public static final tzu d;
    public static final tzu e;
    public static final tzu f;
    public static final tzu g;
    private static final /* synthetic */ tzu[] k;
    public final tzk h;
    public final tzk i;
    public final int j;

    static {
        tzu tzuVar = new tzu("ONE_ON_ONE_TEXT_TO_RCS", 0, tzk.a, tzk.b, 215);
        b = tzuVar;
        tzu tzuVar2 = new tzu("ONE_ON_ONE_TEXT_TO_E2EE", 1, tzk.a, tzk.c, 235);
        c = tzuVar2;
        tzu tzuVar3 = new tzu("ONE_ON_ONE_RCS_TO_E2EE", 2, tzk.b, tzk.c, 237);
        d = tzuVar3;
        tzu tzuVar4 = new tzu("ONE_ON_ONE_E2EE_TO_RCS", 3, tzk.c, tzk.b, 238);
        e = tzuVar4;
        tzu tzuVar5 = new tzu("ONE_ON_ONE_E2EE_TO_TEXT", 4, tzk.c, tzk.a, 236);
        f = tzuVar5;
        tzu tzuVar6 = new tzu("ONE_ON_ONE_RCS_TO_TEXT", 5, tzk.b, tzk.a, 214);
        g = tzuVar6;
        tzu[] tzuVarArr = {tzuVar, tzuVar2, tzuVar3, tzuVar4, tzuVar5, tzuVar6};
        k = tzuVarArr;
        arhi.f(tzuVarArr);
        a = armd.a(tzt.a);
    }

    private tzu(String str, int i, tzk tzkVar, tzk tzkVar2, int i2) {
        this.h = tzkVar;
        this.i = tzkVar2;
        this.j = i2;
    }

    public static final tzu a(tzk tzkVar, tzk tzkVar2) {
        tzkVar.getClass();
        tzkVar2.getClass();
        tzu tzuVar = (tzu) ((Map) a.a()).get(new armo(tzkVar, tzkVar2));
        if (tzuVar != null) {
            return tzuVar;
        }
        throw new IllegalArgumentException(a.ce(tzkVar2, tzkVar, "Invalid input protocols (from = ", ", to = ", "."));
    }

    public static tzu[] values() {
        return (tzu[]) k.clone();
    }
}
