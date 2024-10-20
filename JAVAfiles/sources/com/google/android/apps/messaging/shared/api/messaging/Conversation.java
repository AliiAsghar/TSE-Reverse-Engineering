package com.google.android.apps.messaging.shared.api.messaging;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.lfx;
import defpackage.mja;
import defpackage.mjg;
import defpackage.ncq;
import defpackage.uvn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface Conversation extends Parcelable, AutoCloseable {
    mja a();

    mjg b();

    ConversationId c();

    @Override // java.lang.AutoCloseable
    void close();

    ncq d();

    ncq e();

    ncq f();

    uvn g();

    void h();

    lfx i();
}
