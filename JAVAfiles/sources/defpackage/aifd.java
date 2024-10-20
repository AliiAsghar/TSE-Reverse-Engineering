package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aifd {
    public static final acyz a = aczd.a(184631359);
    private static int d = 1;
    public byte[] c;
    private final SortedMap e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final SortedMap b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final SortedMap f = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final Map g = new HashMap();

    public aifd(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str = str + "; charset=" + str2;
        }
        k(assi.a, str);
    }

    public static aifd b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        aifd aifdVar = new aifd("unknown", "");
        ahji.t(byteArrayInputStream, new aidg(aifdVar, 5));
        ahji.t(byteArrayInputStream, new aidg(aifdVar, 4));
        String d2 = aifdVar.d("Content-Length");
        int i = 0;
        if (!TextUtils.isEmpty(d2) && TextUtils.isDigitsOnly(d2)) {
            int parseInt = Integer.parseInt(d2);
            byte[] bArr2 = new byte[parseInt];
            do {
                int read = byteArrayInputStream.read(bArr2, i, parseInt - i);
                if (read >= 0) {
                    i += read;
                } else {
                    throw new advm(a.cb(parseInt, "Stream closed before receiving ", " bytes!"));
                }
            } while (i < parseInt);
            aifdVar.j(bArr2);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            byte[] bArr3 = new byte[1024];
            for (int read2 = byteArrayInputStream.read(bArr3); read2 >= 0; read2 = byteArrayInputStream.read(bArr3)) {
                byteArrayOutputStream.write(bArr3, 0, read2);
            }
            aifdVar.j(byteArrayOutputStream.toByteArray());
        }
        return aifdVar;
    }

    private static void u(Writer writer, String str, String str2) {
        writer.write(str);
        if (TextUtils.isEmpty(str) || !str.contains(";lang")) {
            writer.write(":");
        }
        writer.write(" ");
        writer.write(str2);
        writer.write(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final long a() {
        long currentTimeMillis = System.currentTimeMillis();
        String t = t();
        if (t != null) {
            return advi.c(t).a;
        }
        return currentTimeMillis;
    }

    public final apwq c() {
        aozy createBuilder = apwq.a.createBuilder();
        for (Map.Entry entry : this.g.entrySet()) {
            String str = (String) entry.getKey();
            if (!albo.ar(str, "urn:ietf:params:imdn") && (((Boolean) a.a()).booleanValue() || !albo.ar(str, "http://id.messages.google.com"))) {
                String valueOf = String.valueOf((String) entry.getValue());
                aozy createBuilder2 = apws.a.createBuilder();
                for (Map.Entry entry2 : this.b.entrySet()) {
                    String concat = valueOf.concat(".");
                    String str2 = (String) entry2.getKey();
                    if (str2.startsWith(concat)) {
                        createBuilder2.bJ(str2.substring(concat.length()), (String) entry2.getValue());
                    }
                }
                if (DesugarCollections.unmodifiableMap(((apws) createBuilder2.b).b).size() > 0) {
                    createBuilder.bH((String) entry.getKey(), (apws) createBuilder2.s());
                }
            }
        }
        return (apwq) createBuilder.s();
    }

    public final String d(String str) {
        return (String) this.f.get(str);
    }

    public final String e() {
        String d2 = d(assi.a);
        if (!Objects.isNull(d2) && !TextUtils.isEmpty(d2)) {
            int indexOf = d2.indexOf(";");
            if (indexOf != -1) {
                return d2.substring(0, indexOf).trim();
            }
            return d2;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aifd)) {
            return false;
        }
        aifd aifdVar = (aifd) obj;
        byte[] bArr = this.c;
        if (bArr == null && aifdVar.c != null) {
            return false;
        }
        if ((bArr != null && aifdVar.c == null) || !Arrays.equals(bArr, aifdVar.c) || !this.g.equals(aifdVar.g) || !this.f.equals(aifdVar.f) || !this.b.equals(aifdVar.b) || !this.e.equals(aifdVar.e)) {
            return false;
        }
        return true;
    }

    public final String f() {
        return (String) this.b.get("From");
    }

    public final String g(String str, String str2) {
        String str3 = (String) this.g.get(str);
        if (!Objects.isNull(str3) && !"".equals(str3)) {
            return (String) this.b.get(a.co(str2, str3, "."));
        }
        return (String) this.b.get(str2);
    }

    public final String h() {
        if ("multipart/mixed".equals(e())) {
            String d2 = d(assi.a);
            if (!Objects.isNull(d2)) {
                return adcx.i(d2);
            }
            return null;
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.g, this.f, this.b, this.e});
    }

    public final String i() {
        return (String) this.b.get("To");
    }

    public final void j(byte[] bArr) {
        this.c = bArr;
        this.f.put("Content-Length", Integer.toString(bArr.length));
    }

    public final void k(String str, String str2) {
        this.f.put(str, str2);
    }

    public final void l(String str) {
        this.b.put("From", aife.a(str).toString());
    }

    public final void m(String str, String str2) {
        this.b.put(str, str2);
    }

    public final void n(String str, String str2, String str3) {
        String str4 = (String) this.g.get(str);
        if (Objects.isNull(str4) || "".equals(str4)) {
            int i = d;
            d = i + 1;
            str4 = "n" + i;
            o(str4, str);
        }
    }

    public final void o(String str, String str2) {
        this.g.put(str2, str);
    }

    public final void p(String str) {
        this.b.put("To", aife.a(str).toString());
    }

    public final void q(OutputStream outputStream) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "utf-8");
        if (!this.e.isEmpty()) {
            for (Map.Entry entry : this.e.entrySet()) {
                u(outputStreamWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            String str = (String) entry2.getKey();
            u(outputStreamWriter, "NS", ((String) entry2.getValue()) + " <" + str + ">");
        }
        for (Map.Entry entry3 : this.b.entrySet()) {
            u(outputStreamWriter, (String) entry3.getKey(), (String) entry3.getValue());
        }
        outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        for (Map.Entry entry4 : this.f.entrySet()) {
            u(outputStreamWriter, (String) entry4.getKey(), (String) entry4.getValue());
        }
        outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        outputStreamWriter.flush();
        outputStream.write(this.c);
    }

    public final boolean r() {
        String e = e();
        if (Objects.isNull(e)) {
            return false;
        }
        return agkx.af(e, "multipart/mixed");
    }

    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            q(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public final String t() {
        return (String) this.b.get("DateTime");
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            q(byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
