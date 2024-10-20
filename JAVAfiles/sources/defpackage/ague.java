package defpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ague implements agsx {
    private final /* synthetic */ int a;

    public ague(int i) {
        this.a = i;
    }

    @Override // defpackage.agsx
    public final /* synthetic */ Object a(InputStream inputStream) {
        if (this.a != 0) {
            return aguf.a(inputStream);
        }
        alob alobVar = new alob();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    alobVar.h(readLine);
                } else {
                    bufferedReader.close();
                    return alobVar.g();
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agsx
    public final /* synthetic */ void b(OutputStream outputStream, Object obj) {
        BufferedWriter bufferedWriter;
        if (this.a != 0) {
            gvf.bd("BundledEmojiListLoader.saveToCacheFile");
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                try {
                    alur it = ((alog) obj).iterator();
                    while (it.hasNext()) {
                        agun agunVar = (agun) it.next();
                        bufferedWriter.write(agunVar.a);
                        alur it2 = agunVar.b.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (str != null) {
                                bufferedWriter.write(44);
                                bufferedWriter.write(str);
                            }
                        }
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                    return;
                } finally {
                }
            } finally {
            }
        }
        gvf.bd("BundledEmojiListLoader.saveToBinaryStringCacheFile");
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            try {
                alur it3 = ((alog) obj).iterator();
                while (it3.hasNext()) {
                    bufferedWriter.write((String) it3.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } finally {
                try {
                    bufferedWriter.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } finally {
        }
    }
}
