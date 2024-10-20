package defpackage;

import io.grpc.Status;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aren {
    public arhv b;
    public final arhw f;
    public final arhn g;
    public boolean h;
    public int i;
    public long k;
    private final arem l;
    public int a = -1;
    public aqsa c = aqry.a;
    public final arel d = new arel(this);
    public final ByteBuffer e = ByteBuffer.allocate(5);
    public int j = -1;

    public aren(arem aremVar, arhw arhwVar, arhn arhnVar) {
        this.l = aremVar;
        this.f = arhwVar;
        this.g = arhnVar;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        arkv arkvVar = (arkv) inputStream;
        apbt apbtVar = arkvVar.a;
        if (apbtVar != null) {
            int serializedSize = apbtVar.getSerializedSize();
            arkvVar.a.writeTo(outputStream);
            arkvVar.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = arkvVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        aozs aozsVar = arkx.a;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i = (int) j;
                arkvVar.c = null;
                return i;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public final void b(boolean z, boolean z2) {
        arhv arhvVar = this.b;
        this.b = null;
        this.l.u(arhvVar, z, z2, this.i);
        this.i = 0;
    }

    public final void c(arek arekVar, boolean z) {
        Iterator it = arekVar.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((arhv) it.next()).a();
        }
        int i2 = this.a;
        if (i2 >= 0 && i > i2) {
            throw new aqwb(Status.j.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.a))));
        }
        this.e.clear();
        this.e.put(z ? (byte) 1 : (byte) 0).putInt(i);
        arhw arhwVar = this.f;
        ByteBuffer byteBuffer = this.e;
        arhv a = arhwVar.a(5);
        a.d(byteBuffer.array(), 0, byteBuffer.position());
        if (i == 0) {
            this.b = a;
            return;
        }
        this.l.u(a, false, false, this.i - 1);
        this.i = 1;
        List list = arekVar.a;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.l.u((arhv) list.get(i3), false, false, 0);
        }
        this.b = (arhv) list.get(list.size() - 1);
        this.k = i;
    }

    public final void d(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            arhv arhvVar = this.b;
            if (arhvVar != null && arhvVar.b() == 0) {
                b(false, false);
            }
            if (this.b == null) {
                this.b = this.f.a(i2);
            }
            int min = Math.min(i2, this.b.b());
            this.b.d(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
