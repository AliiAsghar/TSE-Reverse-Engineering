package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazw extends se {
    final /* synthetic */ aazt a;

    public aazw(aazt aaztVar) {
        this.a = aaztVar;
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        byte[] byteArray;
        Intent intent = new Intent(this.a.d.F(), (Class<?>) CountryCodePickerActivity.class);
        ajcb ajcbVar = this.a.s;
        if (ajcbVar == null) {
            byteArray = null;
        } else {
            byteArray = ajcbVar.toByteArray();
        }
        intent.putExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED", byteArray);
        return intent;
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i == -1 && intent != null) {
            try {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED");
                if (byteArrayExtra != null) {
                    return (ajcb) apag.parseFrom(ajcb.a, byteArrayExtra, aozs.a());
                }
            } catch (apba unused) {
            }
        }
        return this.a.f();
    }
}
