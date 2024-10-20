package defpackage;

import android.database.Cursor;
import defpackage.aglz;
import defpackage.agmh;
import defpackage.agmq;
import defpackage.agoz;
import defpackage.agpc;
import j$.util.stream.Stream;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface agmq<C extends agmq<C, Q, B, D, CR>, Q extends agoz<C, Q, B, D, CR>, B extends agpc<C, Q, B, D, CR>, D extends aglz<C, Q, B, D, CR>, CR extends agmh<CR>> extends Closeable {
    Cursor a();

    aglz cM();

    agmq cQ(String str);

    alog cR();

    alog cS(agmo agmoVar);

    Stream cT();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void dw(akkw akkwVar, alog alogVar, boolean z);

    int getCount();

    int getPosition();

    boolean isClosed();

    boolean moveToNext();
}
