package com.google.android.apps.messaging.conversation.simpicker;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.jak;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SimIconView extends ContactIconView {
    public SimIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOutlineProvider(new jak());
    }
}
