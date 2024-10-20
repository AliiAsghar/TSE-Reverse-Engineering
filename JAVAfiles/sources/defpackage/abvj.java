package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvj {
    private static String a;
    private static int b;

    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (a == null) {
            if (Build.VERSION.SDK_INT < 28) {
                int i = b;
                if (i == 0) {
                    i = Process.myPid();
                    b = i;
                }
                String str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        String cb = a.cb(i, "/proc/", "/cmdline");
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(cb));
                            try {
                                String readLine = bufferedReader.readLine();
                                abhg.m(readLine);
                                str = readLine.trim();
                                d.q(bufferedReader);
                            } catch (IOException unused) {
                                d.q(bufferedReader);
                                a = str;
                                return a;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                d.q(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                a = str;
            } else {
                processName = Application.getProcessName();
                a = processName;
            }
        }
        return a;
    }
}
