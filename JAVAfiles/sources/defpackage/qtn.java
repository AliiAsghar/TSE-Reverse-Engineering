package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qtn {
    public static final qtn a;
    public static final qtn b;
    public static final qtn c;
    public static final qtn d;
    private static final /* synthetic */ qtn[] e;

    static {
        qtn qtnVar = new qtn("NOT_SYNCED", 0);
        a = qtnVar;
        qtn qtnVar2 = new qtn("CREATING", 1);
        b = qtnVar2;
        qtn qtnVar3 = new qtn(VCardConstants.PROPERTY_MEMBER, 2);
        c = qtnVar3;
        qtn qtnVar4 = new qtn("NOT_MEMBER", 3);
        d = qtnVar4;
        qtn[] qtnVarArr = {qtnVar, qtnVar2, qtnVar3, qtnVar4};
        e = qtnVarArr;
        arhi.f(qtnVarArr);
    }

    private qtn(String str, int i) {
    }

    public static qtn[] values() {
        return (qtn[]) e.clone();
    }
}
