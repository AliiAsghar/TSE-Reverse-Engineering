package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import android.database.CursorWindow;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.internal.IKidsCallbacks;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class AbstractKidsCallbacks extends IKidsCallbacks.Stub {
    @Override // com.google.android.gms.kids.internal.IKidsCallbacks
    public void onBoolean(Status status, boolean z) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.kids.internal.IKidsCallbacks
    public void onBooleanList(Status status, List<Boolean> list) {
        status.getClass();
        list.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.kids.internal.IKidsCallbacks
    public void onCursorWindow(Status status, CursorWindow cursorWindow) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.kids.internal.IKidsCallbacks
    public void onPendingIntent(Status status, PendingIntent pendingIntent) {
        status.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.kids.internal.IKidsCallbacks
    public void onStatus(Status status) {
        status.getClass();
        throw new UnsupportedOperationException();
    }
}
