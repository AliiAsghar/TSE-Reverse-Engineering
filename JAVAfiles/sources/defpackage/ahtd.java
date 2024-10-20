package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtd extends ahtp {
    public ahtd(ahtn ahtnVar, String str, Long l, boolean z) {
        super(ahtnVar, str, l, z);
    }

    @Override // defpackage.ahtp
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", ahtn.l(obj, this, "Invalid long value for "));
        return null;
    }
}
