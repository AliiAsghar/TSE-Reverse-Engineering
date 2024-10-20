package defpackage;

import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afds {
    public static final afds a;
    public static final afds b;
    public static final afds c;
    public static final afds d;
    public static final afds e;
    public static final afds f;
    public static final afds g;
    public static final afds h;
    public static final afds i;
    public static final afds j;
    private static final /* synthetic */ afds[] l;
    public final String k;
    private final int m;

    static {
        afds afdsVar = new afds("ID", 0, "_id", 1);
        a = afdsVar;
        afds afdsVar2 = new afds("MIME_TYPE", 1, "mime_type", 1);
        b = afdsVar2;
        afds afdsVar3 = new afds("SIZE", 2, "_size", 1);
        c = afdsVar3;
        afds afdsVar4 = new afds("DISPLAY_NAME", 3, "_display_name", 1);
        d = afdsVar4;
        afds afdsVar5 = new afds("DATE_MODIFIED", 4, "date_modified", 1);
        e = afdsVar5;
        afds afdsVar6 = new afds("DATE_ADDED", 5, "date_added", 1);
        f = afdsVar6;
        afds afdsVar7 = new afds("WIDTH", 6, "width", 16);
        g = afdsVar7;
        afds afdsVar8 = new afds("HEIGHT", 7, "height", 16);
        h = afdsVar8;
        afds afdsVar9 = new afds("DURATION", 8, "duration", 29);
        i = afdsVar9;
        afds afdsVar10 = new afds("ORIENTATION", 9, "orientation", 29);
        j = afdsVar10;
        afds[] afdsVarArr = {afdsVar, afdsVar2, afdsVar3, afdsVar4, afdsVar5, afdsVar6, afdsVar7, afdsVar8, afdsVar9, afdsVar10};
        l = afdsVarArr;
        arhi.f(afdsVarArr);
    }

    private afds(String str, int i2, String str2, int i3) {
        this.m = i3;
        this.k = Build.VERSION.SDK_INT < i3 ? null : str2;
    }

    public static afds[] values() {
        return (afds[]) l.clone();
    }
}
