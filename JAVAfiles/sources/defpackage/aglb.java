package defpackage;

import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aglb {
    private static final alvi a = alvi.m("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");

    public static aglc a(File file) {
        aglc aglcVar;
        FileInputStream fileInputStream;
        if (file.isDirectory()) {
            return aglc.a;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        byte[] bArr = new byte[62];
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (IOException | ParseException e) {
                ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).t("Failed to read SchedStat for thread %s", file.getName());
                aglcVar = aglc.a;
            }
            try {
                aglcVar = agkx.b(bArr, amcp.d(fileInputStream, bArr, 62));
                fileInputStream.close();
                return aglcVar;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static List b(List list) {
        aglc aglcVar;
        FileInputStream fileInputStream;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList(list.size());
        byte[] bArr = new byte[62];
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    fileInputStream = new FileInputStream(new File("/proc/self/task/" + ((Integer) it.next()).intValue() + "/schedstat"));
                } catch (IOException | ParseException unused) {
                    aglcVar = aglc.a;
                }
                try {
                    aglcVar = agkx.b(bArr, amcp.d(fileInputStream, bArr, 62));
                    fileInputStream.close();
                    arrayList.add(aglcVar);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            }
            return arrayList;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
