package defpackage;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiuv extends aivt {
    private final List a;

    public aiuv(OutputStream outputStream, List list) {
        super(outputStream);
        this.a = list;
        ahmc.af(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (ahix ahixVar : this.a) {
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahix) it.next()).a(1);
        }
    }

    @Override // defpackage.aivt, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.out.write(bArr);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahix) it.next()).a(bArr.length);
        }
    }

    @Override // defpackage.aivt, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahix) it.next()).a(i2);
        }
    }
}
