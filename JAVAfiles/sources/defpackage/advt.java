package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
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
/* loaded from: classes.dex */
public final class advt extends advv {
    public FileHandler a;
    private final int b;
    private final int c;
    private final String d;
    private Logger e;
    private final ExecutorService f = Executors.newSingleThreadExecutor();
    private Context g;

    public advt(Context context, int i, int i2) {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        this.g = context;
        if (i <= 0) {
            advr.u("setSize <= 0", new Object[0]);
        }
        if (i2 <= 0) {
            advr.u("fileLimitBytes <= 0", new Object[0]);
        }
        if (TextUtils.isEmpty("carrier_services")) {
            advr.u("fileNamePrefix is empty", new Object[0]);
        }
        this.b = i;
        this.c = i2;
        this.d = "carrier_services";
        Logger logger = Logger.getLogger("LogSaver");
        this.e = logger;
        if (logger == null) {
            advr.u("logger is null", new Object[0]);
        }
        for (Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
        }
        this.e.setUseParentHandlers(false);
        try {
            this.a = new FileHandler(String.valueOf(this.g.getDir("logs", 0)) + "/" + this.d + "%g.log", this.c, this.b, true);
            this.a.setFormatter(new advs());
            this.a.setLevel(Level.ALL);
            Logger logger2 = this.e;
            logger2.getClass();
            logger2.addHandler(this.a);
        } catch (Exception e) {
            Log.e("LogSaver", "LogSaver: fail to init disk logger", e);
        }
    }

    @Override // defpackage.advv
    public final void a(PrintWriter printWriter) {
        File file;
        int i = this.b;
        while (true) {
            i--;
            if (i >= 0) {
                String str = String.valueOf(this.g.getDir("logs", 0)) + "/carrier_services" + i + ".log";
                BufferedReader bufferedReader = null;
                try {
                    try {
                        file = new File(str);
                    } catch (FileNotFoundException unused) {
                    } catch (IOException e) {
                        e = e;
                    }
                    if (!file.exists()) {
                        agkx.aa(bufferedReader);
                    } else {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    printWriter.println(readLine.trim());
                                }
                            } catch (FileNotFoundException unused2) {
                                bufferedReader = bufferedReader2;
                                Log.w("LogSaver", a.cp(str, "LogSaver: can not find log file "));
                                agkx.aa(bufferedReader);
                            } catch (IOException e2) {
                                e = e2;
                                bufferedReader = bufferedReader2;
                                Log.w("LogSaver", "LogSaver: can not read log file", e);
                                agkx.aa(bufferedReader);
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                agkx.aa(bufferedReader);
                                throw th;
                            }
                        }
                        agkx.aa(bufferedReader2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.execute(new aefw(this, 1));
        this.f.shutdown();
    }
}
