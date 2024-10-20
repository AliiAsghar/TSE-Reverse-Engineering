package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yif {
    public static final yif a;
    public static final yif b;
    public static final yif c;
    public static final yif d;
    public static final yif e;
    public static final yif f;
    private static final /* synthetic */ yif[] g;

    static {
        yif yifVar = new yif("NONE", 0);
        a = yifVar;
        yif yifVar2 = new yif("TEXT", 1);
        b = yifVar2;
        yif yifVar3 = new yif(VCardConstants.PARAM_PHONE_EXTRA_TYPE_ASSISTANT, 2);
        c = yifVar3;
        yif yifVar4 = new yif("REMINDER", 3);
        d = yifVar4;
        yif yifVar5 = new yif("STICKER", 4);
        e = yifVar5;
        yif yifVar6 = new yif("CALENDAR", 5);
        f = yifVar6;
        yif[] yifVarArr = {yifVar, yifVar2, yifVar3, yifVar4, yifVar5, yifVar6};
        g = yifVarArr;
        arhi.f(yifVarArr);
    }

    private yif(String str, int i) {
    }

    public static yif[] values() {
        return (yif[]) g.clone();
    }
}
