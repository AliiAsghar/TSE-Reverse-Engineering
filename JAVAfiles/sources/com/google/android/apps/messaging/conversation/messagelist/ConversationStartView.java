package com.google.android.apps.messaging.conversation.messagelist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.amho;
import defpackage.armf;
import defpackage.irj;
import defpackage.mho;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationStartView extends irj {
    public static final xze a = xze.g("Bugle", "ConversationStartView");
    public armf b;
    public mho c;
    public armf d;
    public ContactIconView e;
    public TextView f;
    public ImageView g;
    public LinearLayout h;
    public Space i;

    public ConversationStartView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        inflate(getContext(), R.layout.conversation_start_view, this);
        this.e = (ContactIconView) findViewById(R.id.contact_icon);
        this.f = (TextView) findViewById(R.id.description_text);
        this.h = (LinearLayout) findViewById(R.id.verification_row_layout);
        this.g = (ImageView) findViewById(R.id.verification_avatar_badge);
        this.i = (Space) findViewById(R.id.conversation_start_content_spacer);
        this.e.p = amho.BIZINFO_SOURCE_CONVERSATION_START;
    }

    public final void a() {
        this.h.setVisibility(8);
        this.g.setVisibility(8);
        this.i.setVisibility(0);
    }

    public final void b() {
        this.g.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setVisibility(0);
    }

    public ConversationStartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public ConversationStartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }
}
