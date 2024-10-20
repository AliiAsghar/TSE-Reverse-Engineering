package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahte extends ahtp {
    public ahte(ahtn ahtnVar, String str, Integer num) {
        super(ahtnVar, str, num, false);
    }

    @Override // defpackage.ahtp
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", ahtn.l(obj, this, "Invalid int value for "));
        return null;
    }
}
