package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface mzt extends AutoCloseable, mjg {
    mjb A(MessageId messageId, Instant instant);

    akul D(int i, int i2);

    Instant E(MessageId messageId);

    void G();

    adlx I();

    @Override // java.lang.AutoCloseable
    void close();
}
