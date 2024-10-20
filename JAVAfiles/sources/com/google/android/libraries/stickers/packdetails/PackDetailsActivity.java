package com.google.android.libraries.stickers.packdetails;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.abbh;
import defpackage.ahmc;
import defpackage.airh;
import defpackage.airp;
import defpackage.airr;
import defpackage.aoda;
import defpackage.aour;
import defpackage.aova;
import defpackage.apag;
import defpackage.apba;
import defpackage.ex;
import defpackage.hkz;
import defpackage.hls;
import defpackage.huz;
import defpackage.hxc;
import defpackage.ivf;
import defpackage.ja;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PackDetailsActivity extends ex {
    private int n;
    private airr o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z = false;
        this.n = getIntent().getIntExtra("theme_mode", 0);
        if (y()) {
            setTheme(R.style.StickerDarkTheme);
        }
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            try {
                aova aovaVar = (aova) apag.parseFrom(aova.a, extras.getByteArray("sticker_pack"));
                airr airrVar = new airr(this, this);
                this.o = airrVar;
                setContentView(airrVar);
                airr airrVar2 = this.o;
                airrVar2.k = aovaVar;
                airrVar2.m = airrVar2.n.k(aovaVar.b);
                airrVar2.b();
                airrVar2.e.setText(aovaVar.e);
                airrVar2.f.setText(aovaVar.g);
                airrVar2.g.setText(aovaVar.f);
                int aK = a.aK(((aoda) airrVar2.n.c).b);
                if (aK == 0 || aK != 5) {
                    z = true;
                }
                airrVar2.l = new airp(aovaVar, z, airrVar2.o);
                airrVar2.i.ag(airrVar2.l);
                Resources resources = airrVar2.d.getContext().getResources();
                hls d = hkz.d(airrVar2);
                aour aourVar = aovaVar.d;
                if (aourVar == null) {
                    aourVar = aour.a;
                }
                d.g(aourVar.b).p(new hxc().E(ahmc.K(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), airrVar2.d, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).o(huz.b()).t(airrVar2.d);
                airrVar2.i.getViewTreeObserver().addOnGlobalLayoutListener(new ja(airrVar2, 11));
                airrVar2.h.setOnClickListener(new abbh(airrVar2, aovaVar, 16, null));
                if (airrVar2.isAttachedToWindow()) {
                    ((airh) airrVar2.n.g).e(aovaVar.b);
                }
                if (Build.VERSION.SDK_INT < 27) {
                    return;
                }
                ((LinearLayout) findViewById(R.id.action_bar_root).getParent().getParent()).setSystemUiVisibility(1280);
                getWindow().getDecorView().setOnApplyWindowInsetsListener(new ivf(18));
                this.o.setOnApplyWindowInsetsListener(new ivf(19));
                return;
            } catch (apba e) {
                throw new RuntimeException("Failed to parse sticker pack from intent.", e);
            }
        }
        throw new IllegalStateException("Missing extras. Did you launch the activity using PackDetailsActivity#launchActivity()?");
    }

    public final boolean y() {
        return ahmc.N(this.n);
    }
}
