package com.google.android.apps.messaging.ui.mediapicker.c2o.customization;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.aaqr;
import defpackage.aaqy;
import defpackage.aaqz;
import defpackage.amqf;
import defpackage.amqh;
import defpackage.en;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CategoryCustomizationActivity extends aaqz {
    public CustomizationModel H;
    private CustomizationRecyclerView I;
    private aaqy J;

    @Override // defpackage.aapj
    protected final amqh I() {
        return amqh.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
    }

    @Override // defpackage.aapj
    protected final Class J() {
        return MediaContentItem.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapj, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.compose2o_customization_activity);
        setTitle(R.string.c2o_customization_activity_title);
        en j = j();
        if (j != null) {
            j.setHomeAsUpIndicator(0);
        }
        this.I = (CustomizationRecyclerView) findViewById(R.id.customization_recycler_view);
        this.H = (CustomizationModel) getIntent().getParcelableExtra("customization_model");
        aaqy aaqyVar = new aaqy(this, this.H);
        this.J = aaqyVar;
        this.I.ag(aaqyVar);
        aaqy aaqyVar2 = this.J;
        aaqyVar2.d.W(this.I);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ae(1);
        this.I.aj(linearLayoutManager);
        c().b(this, new aaqr(this));
        L(amqf.LOADED);
    }
}
