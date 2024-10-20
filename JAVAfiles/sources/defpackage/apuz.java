package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apuz implements apus {
    private final String a;
    private final apus b;
    private apvg c;
    private apvg d;
    private apvg e;
    private final long h;
    private boolean i;
    private int j = 1;
    private long f = 0;
    private long g = 0;

    public apuz(String str, String str2, apuu apuuVar, apus apusVar) {
        this.a = str;
        this.b = apusVar;
        this.c = new apvg("--" + str + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + VCardBuilder.VCARD_END_OF_LINE);
        StringBuilder sb = new StringBuilder("--");
        sb.append(str);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        for (String str3 : apuuVar.c()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(apuuVar.a(str3));
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        if (this.b.e() >= 0 && apuuVar.b("content-length").isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.b.e());
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        this.d = new apvg(sb.toString());
        if (apusVar.e() != -1) {
            this.e = j();
            this.h = this.c.e() + this.d.e() + apusVar.e() + this.e.e();
        } else {
            this.h = -1L;
        }
    }

    private final apvg j() {
        StringBuilder sb = new StringBuilder("\r\n--");
        sb.append(this.a);
        aovp.o();
        sb.append("--");
        return new apvg(sb.toString());
    }

    @Override // defpackage.apus
    public final int a(byte[] bArr, int i, int i2) {
        boolean z;
        if (!this.i) {
            if (65536 - i >= i2) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "Buffer length must be greater than or equal to desired number of bytes.");
            if (i2 != 0) {
                long j = this.f;
                while (true) {
                    long j2 = this.f;
                    if (j2 == j) {
                        int i3 = this.j;
                        int i4 = i3 - 1;
                        apus apusVar = null;
                        if (i3 != 0) {
                            if (i4 != 0) {
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        if (i4 != 3) {
                                            if (i4 == 4) {
                                                break;
                                            }
                                        } else {
                                            if (this.e == null) {
                                                this.e = j();
                                            }
                                            apusVar = this.e;
                                            i3 = 5;
                                        }
                                    } else {
                                        apusVar = this.b;
                                        i3 = 4;
                                    }
                                } else {
                                    apusVar = this.d;
                                    i3 = 3;
                                }
                            } else {
                                apusVar = this.c;
                                i3 = 2;
                            }
                            this.f += apusVar.a(bArr, i, i2);
                            if (apusVar.c() < Long.MAX_VALUE) {
                                apusVar.g();
                            }
                            if (!apusVar.i()) {
                                this.j = i3;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        return (int) (j2 - j);
                    }
                }
            }
            return 0;
        }
        throw new IOException("Trying to read from an already-closed stream.");
    }

    @Override // defpackage.apus
    public final long b() {
        return this.g;
    }

    @Override // defpackage.apus
    public final long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.apus, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
        this.b.close();
    }

    @Override // defpackage.apus
    public final long d() {
        return this.f;
    }

    @Override // defpackage.apus
    public final long e() {
        return this.h;
    }

    @Override // defpackage.apus
    public final long f(long j) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }

    @Override // defpackage.apus
    public final void g() {
        this.g = this.f;
    }

    @Override // defpackage.apus
    public final void h() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }

    @Override // defpackage.apus
    public final boolean i() {
        if (this.j != 5) {
            return true;
        }
        return false;
    }
}
