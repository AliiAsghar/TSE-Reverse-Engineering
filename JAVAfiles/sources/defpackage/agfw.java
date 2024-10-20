package defpackage;

import com.google.android.libraries.compose.ui.views.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfw extends arsm {
    final /* synthetic */ RoundedImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agfw(RoundedImageView roundedImageView) {
        super(null);
        this.a = roundedImageView;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        this.a.requestLayout();
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
