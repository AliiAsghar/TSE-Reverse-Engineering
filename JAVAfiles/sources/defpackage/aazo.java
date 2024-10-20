package defpackage;

import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aazo extends zgv {
    private boolean G = false;

    public aazo() {
        u(new aazn(this, 0));
    }

    @Override // defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            CountryCodePickerActivity countryCodePickerActivity = (CountryCodePickerActivity) this;
            kqj kqjVar = (kqj) aS();
            countryCodePickerActivity.t = (xnv) kqjVar.b.bV.b();
            countryCodePickerActivity.w = (zas) kqjVar.d.b();
            countryCodePickerActivity.u = kqjVar.f;
            countryCodePickerActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            countryCodePickerActivity.s = krvVar.vt;
            countryCodePickerActivity.x = krvVar.hA;
            countryCodePickerActivity.y = krvVar.bU;
            countryCodePickerActivity.z = kqjVar.h;
            countryCodePickerActivity.A = (aksr) krvVar.at.b();
            countryCodePickerActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) countryCodePickerActivity).D = krvVar2.zb;
            ((zgv) countryCodePickerActivity).E = krvVar2.zh;
            countryCodePickerActivity.F = (cj) kqjVar.e.b();
        }
    }
}
