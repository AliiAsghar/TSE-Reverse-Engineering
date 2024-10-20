package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acst extends FilterOutputStream {
    static final acyz a = aczd.a(177202284);
    private final long b;
    private final int c;
    private final acrm d;
    private final String e;
    private int f;
    private int g;

    public acst(long j, int i, int i2, OutputStream outputStream, acrm acrmVar, String str) {
        this(j, i2, outputStream, acrmVar, str);
        this.f = i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        FileTransferEvent fileTransferEvent;
        long i = FileTransferEvent.i(this.f, this.c);
        if (((Boolean) a.a()).booleanValue()) {
            fileTransferEvent = new FileTransferEvent(20012, this.b, i, this.e);
        } else {
            fileTransferEvent = new FileTransferEvent(20012, this.b, i);
        }
        this.d.b(fileTransferEvent, advy.FILE_TRANSFER_PROGRESS_OUTPUT_STREAM);
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f += i2;
        int i3 = this.g + i2;
        this.g = i3;
        if (i3 > 20480) {
            this.g = i3 - 20480;
            flush();
        }
        super.write(bArr, i, i2);
    }

    public acst(long j, int i, OutputStream outputStream, acrm acrmVar, String str) {
        super(outputStream);
        this.b = j;
        this.c = i;
        this.d = acrmVar;
        this.e = str;
    }
}
