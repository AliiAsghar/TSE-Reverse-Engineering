package com.google.android.libraries.inputmethod.emoji.picker;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EmojiPickerLayoutManager extends GridLayoutManager {
    public boolean J;

    public EmojiPickerLayoutManager(int i) {
        super(i, 1);
        this.J = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final boolean ag() {
        if (this.J && super.ag()) {
            return true;
        }
        return false;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final boolean ah() {
        if (this.J && super.ah()) {
            return true;
        }
        return false;
    }
}
