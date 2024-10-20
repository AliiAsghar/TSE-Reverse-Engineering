package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CategoryCustomizationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqr extends rg {
    final /* synthetic */ CategoryCustomizationActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaqr(CategoryCustomizationActivity categoryCustomizationActivity) {
        super(true);
        this.a = categoryCustomizationActivity;
    }

    @Override // defpackage.rg
    public final void b() {
        Intent intent = new Intent();
        CategoryCustomizationActivity categoryCustomizationActivity = this.a;
        intent.putExtra("customization_model", categoryCustomizationActivity.H);
        categoryCustomizationActivity.setResult(-1, intent);
        categoryCustomizationActivity.K(amqd.UNKNOWN_CLOSING_SOURCE);
        categoryCustomizationActivity.finish();
    }
}
