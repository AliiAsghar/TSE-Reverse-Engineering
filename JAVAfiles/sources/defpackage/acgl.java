package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.internal.IPhenotypeService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgl extends abrc {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new acex(), actx.s(null));
    }

    public acgl(Context context) {
        super(context, acge.a, abqy.q, abrb.a);
    }

    public static acir a() {
        return actx.r(new abra(new Status(16)));
    }

    public final acir b(String str) {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abot(str, 11);
        return g(ajxpVar.b());
    }

    public final acir c(final String str, final int i, final String[] strArr, final byte[] bArr) {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abtf() { // from class: acgf
            @Override // defpackage.abtf
            public final void a(Object obj, Object obj2) {
                ((IPhenotypeService) ((acgq) obj).w()).register(new acgk((acit) obj2), str, i, strArr, bArr);
            }
        };
        return g(ajxpVar.b());
    }

    public final acir d(String str, aocv aocvVar) {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new acdk(str, aocvVar, 6);
        ajxpVar.d = new Feature[]{acgb.h};
        ajxpVar.c();
        return g(ajxpVar.b());
    }

    public final boolean w(int i) {
        if (abqb.d.h(this.c, i) == 0) {
            return true;
        }
        return false;
    }

    public final void x(int[] iArr, String str) {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new acgg(str, iArr, 0);
        g(ajxpVar.b());
    }

    public final acir y(String str, String str2) {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new acdk(str, str2, 2, null);
        return g(ajxpVar.b());
    }
}
