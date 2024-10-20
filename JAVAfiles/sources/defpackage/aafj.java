package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafj extends hxj {
    final /* synthetic */ SuggestionData b;
    final /* synthetic */ ImageView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafj(ImageView imageView, SuggestionData suggestionData, ImageView imageView2) {
        super(imageView);
        this.b = suggestionData;
        this.c = imageView2;
    }

    @Override // defpackage.hxq
    public final void a(Drawable drawable) {
        aafk.k.m("Suggestion icon failed to load for suggestion: ".concat(String.valueOf(yyb.bh(this.b.toString()))));
    }

    @Override // defpackage.hxq
    public final /* bridge */ /* synthetic */ void b(Object obj, hxz hxzVar) {
        this.c.setImageDrawable((Drawable) obj);
    }
}
