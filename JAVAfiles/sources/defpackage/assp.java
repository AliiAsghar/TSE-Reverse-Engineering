package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class assp extends assl {
    private final File a;
    private final String b;
    private final String c;

    public assp(File file) {
        this(file, "application/octet-stream");
    }

    @Override // defpackage.asso
    public long a() {
        return this.a.length();
    }

    @Override // defpackage.asso
    public String e() {
        return this.c;
    }

    @Override // defpackage.assn
    public String f() {
        return this.b;
    }

    @Override // defpackage.asso
    public String g() {
        return assi.e;
    }

    @Override // defpackage.assn
    public void h(OutputStream outputStream) {
        if (outputStream != null) {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        return;
                    }
                }
            } finally {
                fileInputStream.close();
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    public File i() {
        return this.a;
    }

    public InputStream j() {
        return new FileInputStream(this.a);
    }

    public assp(File file, String str) {
        this(file, str, null);
    }

    public assp(File file, String str, String str2) {
        this(file, null, str, str2);
    }

    public assp(File file, String str, String str2, String str3) {
        super(str2);
        if (file != null) {
            this.a = file;
            if (str != null) {
                this.b = str;
            } else {
                this.b = file.getName();
            }
            this.c = str3;
            return;
        }
        throw new IllegalArgumentException("File may not be null");
    }
}
