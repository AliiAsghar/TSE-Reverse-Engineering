package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface acth extends AutoCloseable {
    ListenableFuture a();

    void b(String str, String str2);

    void c(String str, String str2, long j);

    @Override // java.lang.AutoCloseable
    void close();
}
