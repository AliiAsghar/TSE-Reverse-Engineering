package org.bouncycastle.asn1;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConstructedBitStream extends InputStream implements InputStreamRetargetInterface {
    private final ASN1StreamParser b;
    private ASN1BitStringParser d;
    private InputStream e;
    private boolean c = true;
    public int a = 0;

    public ConstructedBitStream(ASN1StreamParser aSN1StreamParser) {
        this.b = aSN1StreamParser;
    }

    private final ASN1BitStringParser a() {
        ASN1Encodable b = this.b.b();
        if (b == null) {
            return null;
        }
        if (b instanceof ASN1BitStringParser) {
            if (this.a == 0) {
                return (ASN1BitStringParser) b;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(b.getClass()))));
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.e == null) {
            if (this.c) {
                ASN1BitStringParser a = a();
                this.d = a;
                if (a != null) {
                    this.c = false;
                    this.e = a.g();
                }
            }
            return -1;
        }
        while (true) {
            int read = this.e.read();
            if (read >= 0) {
                return read;
            }
            this.a = this.d.f();
            ASN1BitStringParser a2 = a();
            this.d = a2;
            if (a2 == null) {
                this.e = null;
                return -1;
            }
            this.e = a2.g();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (this.e == null) {
            if (!this.c) {
                return -1;
            }
            ASN1BitStringParser a = a();
            this.d = a;
            if (a == null) {
                return -1;
            }
            this.c = false;
            this.e = a.g();
        }
        while (true) {
            int read = this.e.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.a = this.d.f();
                ASN1BitStringParser a2 = a();
                this.d = a2;
                if (a2 == null) {
                    this.e = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.e = a2.g();
            }
        }
    }
}
