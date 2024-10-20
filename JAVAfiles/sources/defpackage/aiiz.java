package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiiz implements Iterator {
    final ByteBuffer a;
    long b = 0;
    final InputStream c;
    final long d;
    final boolean e;
    boolean f;
    final /* synthetic */ aiiu g;
    final /* synthetic */ atal h;

    public aiiz(atal atalVar, aiiu aiiuVar) {
        boolean z;
        this.g = aiiuVar;
        this.h = atalVar;
        this.a = ByteBuffer.wrap(new byte[atalVar.a + 4000]);
        this.c = aiiuVar.c.b();
        long a = aiiuVar.c.a();
        this.d = a;
        if (a > 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = true;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ByteBuffer next() {
        String str;
        long j;
        long j2;
        boolean z;
        int i;
        try {
            boolean z2 = this.g.k;
            int min = (int) Math.min(this.d - this.b, this.h.a);
            byte[] bArr = new byte[8];
            ((SecureRandom) this.h.b).nextBytes(bArr);
            StringBuilder sb = new StringBuilder();
            boolean z3 = false;
            for (int i2 = 0; i2 < 8; i2++) {
                sb.append(String.format("%02x", Byte.valueOf(bArr[i2])));
            }
            String sb2 = sb.toString();
            this.g.d.add(sb2);
            this.a.rewind();
            ByteBuffer byteBuffer = this.a;
            int i3 = this.g.p;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        str = "null";
                    } else {
                        str = "REPORT";
                    }
                } else {
                    str = "SEND";
                }
            } else {
                str = "UNKNOWN";
            }
            if (i3 != 0) {
                atal.g(byteBuffer, sb2, str);
                ahlp ahlpVar = this.g.r;
                ByteBuffer byteBuffer2 = this.a;
                for (Map.Entry entry : ((LinkedHashMap) ahlpVar.a).entrySet()) {
                    byteBuffer2.put(((String) entry.getKey()).getBytes());
                    byteBuffer2.put(aiin.e);
                    byteBuffer2.put(((String) entry.getValue()).getBytes());
                    byteBuffer2.put(aiin.b);
                }
                aiiu aiiuVar = this.g;
                if (aiiuVar.p == 3) {
                    j = aiiuVar.f;
                    j2 = j;
                } else {
                    j = this.b + min;
                    j2 = this.d;
                }
                atal.f(this.a, aiin.f, (Long.toString(this.b + 1) + "-" + j + "/" + j2).getBytes());
                if (this.e) {
                    String str2 = this.g.g;
                    if (str2 != null) {
                        atal.f(this.a, aiin.h, str2.getBytes());
                        this.a.put(aiin.b);
                        int i4 = min;
                        while (i4 > 0) {
                            int read = this.c.read(this.a.array(), this.a.arrayOffset() + this.a.position(), i4);
                            i4 -= read;
                            ByteBuffer byteBuffer3 = this.a;
                            byteBuffer3.position(byteBuffer3.position() + read);
                        }
                        this.a.put(aiin.b);
                    } else {
                        throw new IllegalStateException("expected non-null contents");
                    }
                }
                if (this.g.p == 3) {
                    atal.f(this.a, aiin.g, aiin.k);
                }
                long j3 = this.b + min;
                this.b = j3;
                if (j3 < this.d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    i = 35;
                } else if (z) {
                    i = 43;
                } else {
                    i = 36;
                }
                atal.e(this.a, sb2, i);
                if (z && !z2) {
                    z3 = true;
                }
                this.f = z3;
                return this.a;
            }
            throw null;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }
}
