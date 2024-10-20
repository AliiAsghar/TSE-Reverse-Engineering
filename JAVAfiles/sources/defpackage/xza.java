package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xza implements Closeable {
    public Logger a;
    public final ExecutorService b;
    public final SimpleDateFormat c;
    public FileHandler d;
    private final int e;
    private final int f;
    private final String g;
    private final Context h;

    protected xza() {
        throw null;
    }

    public static xza a(Context context, yep yepVar, String str, String str2) {
        return new xza(context, yepVar.b("bugle_persistent_logsaver_rotation_set_size", 8), yepVar.b("bugle_persistent_logsaver_file_limit", 262144), str, str2);
    }

    private final void c(PrintWriter printWriter, String str) {
        FileReader fileReader;
        int i = this.e;
        while (true) {
            i--;
            if (i >= 0) {
                String str2 = String.valueOf(this.h.getDir("logs", 0)) + "/" + str + i + ".log";
                File file = new File(str2);
                try {
                    fileReader = new FileReader(file);
                } catch (FileNotFoundException unused) {
                    Log.w("Bugle", "LogSaver: can not find log file ".concat(str2));
                } catch (IOException e) {
                    Log.w("Bugle", "LogSaver: can not read log file", e);
                }
                try {
                    if (file.exists()) {
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    printWriter.println(readLine.trim());
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                                break;
                            }
                        }
                        bufferedReader.close();
                    }
                    fileReader.close();
                } catch (Throwable th3) {
                    try {
                        fileReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                    break;
                }
            } else {
                return;
            }
        }
    }

    public final void b(PrintWriter printWriter, xzc xzcVar) {
        if (xzcVar == xzc.DIAGNOSTICS) {
            c(printWriter, this.g);
        } else {
            c(printWriter, xzcVar.d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.execute(new wuo(this, 15));
        this.b.shutdown();
    }

    public xza(Context context, int i, int i2, String str, String str2) {
        this.b = Executors.newFixedThreadPool(1, new ahkg("DiskLogSaver", 1, (byte[]) null));
        this.c = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        this.h = context;
        albo.T(i > 0);
        albo.T(i2 > 0);
        albo.T(str != null);
        albo.T(str.length() > 0);
        this.e = i;
        this.f = i2;
        this.g = str;
        Logger logger = Logger.getLogger(str2);
        this.a = logger;
        logger.getClass();
        for (Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
        }
        this.a.setUseParentHandlers(false);
        try {
            this.d = new FileHandler(String.valueOf(this.h.getDir("logs", 0)) + "/" + this.g + "%g.log", this.f, this.e, true);
            this.d.setFormatter(new xyz());
            this.d.setLevel(Level.ALL);
            this.a.addHandler(this.d);
        } catch (Exception e) {
            Log.e("Bugle", "LogSaver: fail to init disk logger", e);
        }
    }
}
