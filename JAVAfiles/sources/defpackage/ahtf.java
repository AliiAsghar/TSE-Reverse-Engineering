package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtf extends ahtp {
    public ahtf(ahtn ahtnVar, String str, Boolean bool, boolean z) {
        super(ahtnVar, str, bool, z);
    }

    @Override // defpackage.ahtp
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (acme.c.matcher(str).matches()) {
                return true;
            }
            if (acme.d.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", ahtn.l(obj, this, "Invalid boolean value for "));
        return null;
    }
}
