package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiok {
    private static final byte[] f = new byte[0];
    public byte[] a;
    public String b;
    public String c;
    public String d;
    public String e;

    public aiok() {
        this.a = f;
    }

    public static aiok[] d(String str, String str2) {
        if (str == null) {
            return new aiok[0];
        }
        return e(str.getBytes("utf-8"), str2);
    }

    public static aiok[] e(byte[] bArr, String str) {
        if (str != null) {
            if (bArr != null && bArr.length != 0) {
                if (str.startsWith("multipart/")) {
                    ArrayList arrayList = new ArrayList();
                    String i = adcx.i(str);
                    if (i != null) {
                        try {
                            adcx.j(new ByteArrayInputStream(bArr), i, new aioj(arrayList));
                            return (aiok[]) arrayList.toArray(new aiok[arrayList.size()]);
                        } catch (adag e) {
                            throw new IOException(e.getMessage());
                        }
                    }
                    throw new IllegalArgumentException("No boundary specified in content type header");
                }
                return new aiok[]{new aiok(bArr, str)};
            }
            return new aiok[0];
        }
        throw new IllegalArgumentException("Content-Type MUST not be null");
    }

    public final InputStream a() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return new ByteArrayInputStream(f);
        }
        return new ByteArrayInputStream(bArr);
    }

    public final String b() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public final String c() {
        String str;
        int i;
        byte[] bArr = this.a;
        if (bArr != null) {
            boolean equalsIgnoreCase = this.b.equalsIgnoreCase("application/sdp");
            i = bArr.length;
            if (equalsIgnoreCase) {
                Scanner scanner = new Scanner(new String(this.a));
                StringBuilder sb = new StringBuilder();
                while (scanner.hasNextLine()) {
                    String nextLine = scanner.nextLine();
                    if (nextLine.startsWith("o=") || nextLine.startsWith("c=") || nextLine.startsWith("a=path")) {
                        nextLine = "(redacted)";
                    }
                    sb.append(nextLine);
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                scanner.close();
                str = sb.toString();
            } else {
                str = this.e;
                if (str == null) {
                    str = advq.GENERIC.c(new String(this.a));
                }
            }
        } else {
            str = "Null";
            i = 0;
        }
        return "Content ID: " + this.d + "\r\nContent disposition: " + this.c + "\r\nContent type: " + this.b + "\r\nContent length " + i + "\r\nContent: " + str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aiok)) {
            return false;
        }
        aiok aiokVar = (aiok) obj;
        if (!TextUtils.equals(this.c, aiokVar.c) || !TextUtils.equals(this.d, aiokVar.d) || !TextUtils.equals(this.b, aiokVar.b) || !Arrays.equals(this.a, aiokVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.b, this.a});
    }

    public final String toString() {
        int i;
        byte[] bArr = this.a;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        return "Content ID: " + this.d + ", content disposition: " + this.c + ", content type: " + this.b + ", content length " + i;
    }

    public aiok(byte[] bArr) {
        this.a = bArr;
        this.b = "application/resource-lists+xml";
        this.c = "recipient-list";
    }

    public aiok(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    public aiok(String str, String str2) {
        this.a = f;
        try {
            this.a = str.getBytes("utf-8");
            this.b = str2;
        } catch (UnsupportedEncodingException unused) {
        }
    }
}
