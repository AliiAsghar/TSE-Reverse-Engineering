package defpackage;

import android.view.View;
import android.view.Window;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abax implements emx {
    public final cg a;
    public Window b;
    public int c;
    public boolean d;
    public boolean e;
    private final int f;

    public abax(cg cgVar, enh enhVar, int i) {
        this.a = cgVar;
        this.f = i;
        enhVar.c(this);
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        this.b.addFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        this.b.setNavigationBarColor(this.f);
        View decorView = this.b.getDecorView();
        if (this.e) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        }
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        if (this.d) {
            this.b.addFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        } else {
            this.b.clearFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        }
        this.b.setNavigationBarColor(this.c);
        View decorView = this.b.getDecorView();
        if (this.e) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }
}
