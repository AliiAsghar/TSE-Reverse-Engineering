package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knz {
    public final Context a;
    public final armf b;
    public MessageCoreData c;
    public MessageCoreData e;
    public MessageCoreData g;
    public final ContentObserver h;
    public final jxv i;
    public final CountDownLatch d = new CountDownLatch(1);
    public final CountDownLatch f = new CountDownLatch(1);

    public knz(jxv jxvVar, Context context, armf armfVar) {
        this.i = jxvVar;
        this.a = context;
        this.b = armfVar;
        this.h = new kny(this, context, jxvVar);
    }

    public final Optional a() {
        return Optional.ofNullable(this.g);
    }

    public final Optional b() {
        return Optional.ofNullable(this.e);
    }

    public final void c() {
        this.a.getContentResolver().unregisterContentObserver(this.h);
    }
}
