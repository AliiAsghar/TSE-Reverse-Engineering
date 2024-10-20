package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahth extends ahtp {
    public ahth(ahtn ahtnVar, String str, Float f) {
        super(ahtnVar, str, f, false);
    }

    @Override // defpackage.ahtp
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Double) {
            return Float.valueOf(((Double) obj).floatValue());
        }
        if (obj instanceof String) {
            try {
                return Float.valueOf(Float.parseFloat((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", ahtn.l(obj, this, "Invalid float value for "));
        return null;
    }
}
