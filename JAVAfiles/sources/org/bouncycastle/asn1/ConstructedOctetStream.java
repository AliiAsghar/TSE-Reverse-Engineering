package org.bouncycastle.asn1;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConstructedOctetStream extends InputStream implements InputStreamRetargetInterface {
    private final ASN1StreamParser a;
    private boolean b = true;
    private InputStream c;

    public ConstructedOctetStream(ASN1StreamParser aSN1StreamParser) {
        this.a = aSN1StreamParser;
    }

    private final ASN1OctetStringParser a() {
        ASN1Encodable b = this.a.b();
        if (b == null) {
            return null;
        }
        if (b instanceof ASN1OctetStringParser) {
            return (ASN1OctetStringParser) b;
        }
        throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(b.getClass()))));
    }

    @Override // java.io.InputStream
    public final int read() {
        ASN1OctetStringParser a;
        if (this.c == null) {
            if (!this.b || (a = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = a.e();
        }
        while (true) {
            int read = this.c.read();
            if (read >= 0) {
                return read;
            }
            ASN1OctetStringParser a2 = a();
            if (a2 == null) {
                this.c = null;
                return -1;
            }
            this.c = a2.e();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ASN1OctetStringParser a;
        int i3 = 0;
        if (this.c == null) {
            if (!this.b || (a = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = a.e();
        }
        while (true) {
            int read = this.c.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                ASN1OctetStringParser a2 = a();
                if (a2 == null) {
                    this.c = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.c = a2.e();
            }
        }
    }
}
