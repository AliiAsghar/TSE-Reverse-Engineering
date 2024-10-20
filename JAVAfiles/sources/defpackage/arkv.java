package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arkv extends InputStream implements InputStreamRetargetInterface, aqtl {
    public apbt a;
    public final apca b;
    public ByteArrayInputStream c;

    public arkv(apbt apbtVar, apca apcaVar) {
        this.a = apbtVar;
        this.b = apcaVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        apbt apbtVar = this.a;
        if (apbtVar != null) {
            return apbtVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        apbt apbtVar = this.a;
        if (apbtVar != null) {
            this.c = new ByteArrayInputStream(apbtVar.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        apbt apbtVar = this.a;
        if (apbtVar != null) {
            int serializedSize = apbtVar.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                aozj aozjVar = new aozj(bArr, i, serializedSize);
                this.a.writeTo(aozjVar);
                aozjVar.ah();
                this.a = null;
                this.c = null;
                return serializedSize;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
