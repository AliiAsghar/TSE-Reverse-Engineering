package com.google.android.apps.messaging.shared.audio.attachment.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.nhq;
import defpackage.xnv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PausableChronometer extends nhq {
    public xnv a;
    public long b;

    public PausableChronometer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0L;
    }

    public final void c(long j) {
        this.b = j;
        setBase(this.a.a() - this.b);
    }
}
