package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abtn<T> implements abto<T> {
    protected final DataHolder a;

    /* JADX INFO: Access modifiers changed from: protected */
    public abtn(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.abrk
    public final void b() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // defpackage.abto
    public int c() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new atda(this, 1);
    }
}
