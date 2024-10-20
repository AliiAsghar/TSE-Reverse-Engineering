package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypi {
    public static final ypi a;
    public static final ypi b;
    public static final ypi c;
    public static final ypi d;
    public static final ypi e;
    public static final ypi f;
    public static final ypi g;
    public static final ypi h;
    public static final ypi i;
    public static final ypi j;
    public static final ypi k;
    public static final /* synthetic */ arpx m;
    private static final Set n;
    private static final /* synthetic */ ypi[] o;
    public final int l;

    static {
        ypi ypiVar = new ypi("UNKNOWN", 0, 0);
        a = ypiVar;
        ypi ypiVar2 = new ypi("USER", 1, 2);
        b = ypiVar2;
        ypi ypiVar3 = new ypi("SCOOBY", 2, 4);
        c = ypiVar3;
        ypi ypiVar4 = new ypi("RCS_ENFORCEMENT", 3, 8);
        d = ypiVar4;
        ypi ypiVar5 = new ypi("LINGUA", 4, 16);
        e = ypiVar5;
        ypi ypiVar6 = new ypi("STRANGER_DANGER", 5, 32);
        f = ypiVar6;
        ypi ypiVar7 = new ypi("SAFE_URL", 6, 64);
        g = ypiVar7;
        ypi ypiVar8 = new ypi("HADES_REGEX_AND_MODELS", 7, 128);
        h = ypiVar8;
        ypi ypiVar9 = new ypi("ON_DEVICE_STRANGER_DANGER", 8, 256);
        i = ypiVar9;
        ypi ypiVar10 = new ypi("IN_APK_FUZZY_MATCHING", 9, 512);
        j = ypiVar10;
        ypi ypiVar11 = new ypi("PENPAL", 10, 1024);
        k = ypiVar11;
        ypi[] ypiVarArr = {ypiVar, ypiVar2, ypiVar3, ypiVar4, ypiVar5, ypiVar6, ypiVar7, ypiVar8, ypiVar9, ypiVar10, ypiVar11};
        o = ypiVarArr;
        arpx f2 = arhi.f(ypiVarArr);
        m = f2;
        ArrayList arrayList = new ArrayList();
        arng arngVar = new arng(f2);
        while (arngVar.hasNext()) {
            Object next = arngVar.next();
            ypi ypiVar12 = (ypi) next;
            if (!ypiVar12.c() && ypiVar12 != a) {
                arrayList.add(next);
            }
        }
        n = aqjn.aE(arrayList);
    }

    private ypi(String str, int i2, int i3) {
        this.l = i3;
    }

    public static ypi[] values() {
        return (ypi[]) o.clone();
    }

    public final amzn a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 2:
                    return amzn.SCOOBY;
                case 3:
                    return amzn.RCS_ENFORCEMENT;
                case 4:
                    return amzn.LINGUA;
                case 5:
                    return amzn.STRANGER_DANGER;
                case 6:
                    return amzn.SAFE_URL;
                case 7:
                    return amzn.HADES_REGEX_AND_MODELS;
                case 8:
                    return amzn.ON_DEVICE_STRANGER_DANGER;
                case 9:
                    return amzn.IN_APK_FUZZY_MATCHING;
                case 10:
                    return amzn.PENPAL;
                default:
                    toString();
                    throw new IllegalStateException(toString().concat(" unsupported for Spam.ClassificationSource"));
            }
        }
        return amzn.UNKNOWN_CLASSIFICATION_SOURCE;
    }

    public final boolean b() {
        return n.contains(this);
    }

    public final boolean c() {
        if (this == b) {
            return true;
        }
        return false;
    }
}
