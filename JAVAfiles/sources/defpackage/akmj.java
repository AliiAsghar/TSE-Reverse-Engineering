package defpackage;

import android.content.Context;
import android.os.Process;
import android.text.format.DateFormat;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akmj extends alxy implements aiev {
    public final akmq a;
    public final akmn b;
    public final Context c;

    public akmj(Context context, anen anenVar, akmn akmnVar) {
        super("FileLoggerBackend");
        this.c = context;
        this.b = akmnVar;
        this.a = new akmq(new ahsz(this, 19), akmnVar.d(), akmnVar.c(), new anew(anenVar));
    }

    @Override // defpackage.aiev
    public final ListenableFuture a() {
        akmq akmqVar = this.a;
        return albo.bN(new akdj(akmqVar, 13), akmqVar.e);
    }

    @Override // defpackage.alww
    public final void b(alwv alwvVar) {
        alxa alxaVar;
        String str;
        alxa f = alxu.f();
        if (this.b.h()) {
            alxaVar = alwvVar.i();
        } else {
            alxaVar = alwz.a;
        }
        alxr g = alxr.g(f, alxaVar);
        String str2 = (String) alwvVar.i().d(alwp.a);
        int intValue = alwvVar.m().intValue();
        if (intValue >= 1000) {
            str = "E ";
        } else if (intValue >= 900) {
            str = "W ";
        } else if (intValue >= 800) {
            str = "I ";
        } else {
            str = "D ";
        }
        if (str2 == null) {
            str2 = alwvVar.l();
        }
        alvz[] alvzVarArr = {alwp.a};
        HashSet hashSet = new HashSet(alxw.a);
        Collections.addAll(hashSet, alvzVarArr);
        String a = new alxv(hashSet).a(alwvVar, g);
        Throwable th = (Throwable) alwvVar.i().d(alvm.a);
        long millis = TimeUnit.NANOSECONDS.toMillis(alwvVar.d());
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                stringWriter.append((CharSequence) str).append((CharSequence) str2).append((CharSequence) ": ").append((CharSequence) a);
                if (th != null) {
                    stringWriter.append((CharSequence) " ").append((CharSequence) th.toString());
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        th.printStackTrace(printWriter);
                        printWriter.close();
                    } finally {
                    }
                }
                akmq akmqVar = this.a;
                String stringWriter2 = stringWriter.toString();
                int myPid = Process.myPid();
                int myTid = Process.myTid();
                if (stringWriter2 != null) {
                    akmqVar.e.execute(new ajnt(akmqVar, String.format(Locale.US, "%s.%03d %d %d %s", DateFormat.format("MM-dd HH:mm:ss", millis), Long.valueOf(millis % 1000), Integer.valueOf(myPid), Integer.valueOf(myTid), stringWriter2), 15, (byte[]) null));
                }
                stringWriter.close();
            } finally {
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.alww
    public final boolean c(Level level) {
        return this.b.i(level);
    }
}
