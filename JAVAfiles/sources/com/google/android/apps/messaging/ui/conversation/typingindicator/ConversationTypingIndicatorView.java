package com.google.android.apps.messaging.ui.conversation.typingindicator;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.aacv;
import defpackage.aaht;
import defpackage.aahu;
import defpackage.armf;
import defpackage.gmm;
import defpackage.gmq;
import defpackage.qya;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationTypingIndicatorView extends aahu implements aacv<ConversationTypingIndicatorView> {
    public final List a;
    public LinearLayout b;
    public Drawable c;
    gmm d;
    public qya e;
    public armf f;

    public ConversationTypingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList(5);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (LinearLayout) findViewById(R.id.typer_region);
        this.c = ((ImageView) findViewById(R.id.typing_dots)).getDrawable();
        aaht aahtVar = new aaht(this);
        this.d = aahtVar;
        Drawable drawable = this.c;
        if (drawable != null && (drawable instanceof Animatable)) {
            gmq.a((AnimatedVectorDrawable) drawable, aahtVar);
        }
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.aacv
    public final void b() {
    }
}
