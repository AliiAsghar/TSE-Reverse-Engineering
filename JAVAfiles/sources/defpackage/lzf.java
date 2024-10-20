package defpackage;

import android.R;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lzf extends lzi {
    protected abstract Integer D();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgv, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        setContentView(z());
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        getWindow().setStatusBarColor(0);
        viewGroup.setSystemUiVisibility(1792);
        int i = 1;
        viewGroup.setOnApplyWindowInsetsListener(new abbl(new lze(1)));
        en j = j();
        if (j != null) {
            j.setDisplayHomeAsUpEnabled(true);
        }
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(com.google.android.apps.messaging.R.id.toolbar);
        if (toolbar != null) {
            toolbar.s(new uai(this, i));
        }
        Integer D = D();
        if (D != null) {
            View findViewById2 = findViewById(D.intValue());
            findViewById2.setOnApplyWindowInsetsListener(new abbl(new lze(0)));
            if (lga.q(this, false)) {
                abbu.o(this, findViewById2);
                return;
            }
            return;
        }
        if (lga.q(this, false) && (findViewById = viewGroup.findViewById(com.google.android.apps.messaging.R.id.fragment_container)) != null) {
            abbu.o(this, findViewById);
        }
    }

    protected int z() {
        return com.google.android.apps.messaging.R.layout.base_toolbar_settings_activity_gm3;
    }
}
