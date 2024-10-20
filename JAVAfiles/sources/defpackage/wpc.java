package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpc {
    public static final wpc a;
    public static final wpc b;
    public static final wpc c;
    public static final wpc d;
    public static final wpc e;
    private static final /* synthetic */ wpc[] f;

    static {
        wpc wpcVar = new wpc("UNKNOWN", 0);
        a = wpcVar;
        wpc wpcVar2 = new wpc("SATELLITE", 1);
        b = wpcVar2;
        wpc wpcVar3 = new wpc("TERRESTRIAL", 2);
        c = wpcVar3;
        wpc wpcVar4 = new wpc("NO_CONNECTION", 3);
        d = wpcVar4;
        wpc wpcVar5 = new wpc(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER, 4);
        e = wpcVar5;
        wpc[] wpcVarArr = {wpcVar, wpcVar2, wpcVar3, wpcVar4, wpcVar5};
        f = wpcVarArr;
        arhi.f(wpcVarArr);
    }

    private wpc(String str, int i) {
    }

    public static wpc[] values() {
        return (wpc[]) f.clone();
    }
}
