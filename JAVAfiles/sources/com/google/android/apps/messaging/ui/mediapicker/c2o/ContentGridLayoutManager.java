package com.google.android.apps.messaging.ui.mediapicker.c2o;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContentGridLayoutManager extends LinearLayoutManager {
    private final boolean a;

    public ContentGridLayoutManager() {
        super(1);
        this.a = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final boolean ah() {
        if (!this.a) {
            return false;
        }
        return super.ah();
    }
}
