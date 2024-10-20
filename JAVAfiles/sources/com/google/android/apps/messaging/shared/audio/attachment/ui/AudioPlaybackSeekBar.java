package com.google.android.apps.messaging.shared.audio.attachment.ui;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.nhp;
import defpackage.xnv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AudioPlaybackSeekBar extends nhp {
    public static final /* synthetic */ int h = 0;
    public xnv a;
    public long b;
    public TimeAnimator c;
    public long d;
    public long e;
    public Drawable f;
    public Drawable g;

    public AudioPlaybackSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0L;
        this.e = 0L;
    }

    public final void a() {
        this.d = (this.b * getProgress()) / 100;
    }
}
